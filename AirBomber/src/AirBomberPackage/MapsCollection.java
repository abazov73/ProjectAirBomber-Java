/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirBomberPackage;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.*;
import java.nio.file.FileSystemException;
import javax.swing.*;
/**
 *
 * @author Андрей
 */
public class MapsCollection {
    /// <summary>
    /// Словарь (хранилище) с картами
    /// </summary>
    HashMap<String, MapWithSetAirBombersGeneric<IDrawingObject, AbstractMap>> _mapStorages;
    
    private String separatorDict = "-";
    private String separatorData = ";";
    
    /// <summary>
    /// Возвращение списка названий карт
    /// </summary>
    public ArrayList<String> getKeys(){
        ArrayList<String> keys = new ArrayList<>(_mapStorages.keySet());
        return keys;
    }
    /// <summary>
    /// Ширина окна отрисовки
    /// </summary>
    private int _pictureWidth;
    /// <summary>
    /// Высота окна отрисовки
    /// </summary>
    private int _pictureHeight;
    /// <summary>
    /// Конструктор
    /// </summary>
    /// <param name="pictureWidth"></param>
    /// <param name="pictureHeight"></param>
    public MapsCollection(int pictureWidth, int pictureHeight)
    {
        _mapStorages = new HashMap<String, MapWithSetAirBombersGeneric<IDrawingObject, AbstractMap>>();
        _pictureWidth = pictureWidth;
        _pictureHeight = pictureHeight;
    }
    /// <summary>
    /// Добавление карты
    /// </summary>
    /// <param name="name">Название карты</param>
    /// <param name="map">Карта</param>
    public boolean AddMap(String name, AbstractMap map)
    {
        if (_mapStorages.containsKey(name))
        {
            return false;
        }
        _mapStorages.put(name, new MapWithSetAirBombersGeneric<IDrawingObject, AbstractMap>(_pictureWidth, _pictureHeight, map));
        return true;
    }
    /// <summary>
    /// Удаление карты
    /// </summary>
    /// <param name="name">Название карты</param>
    public void DelMap(String name)
    {
        if (_mapStorages.containsKey(name))
        {
            _mapStorages.remove(name);
        }
    }
    
    public MapWithSetAirBombersGeneric<IDrawingObject, AbstractMap> Get(String ind){
        if (_mapStorages.containsKey(ind)) return _mapStorages.get(ind);
        else return null;
    }
    
    public boolean SaveData(String filename)
    {
        File saveFile = new File(filename);
        if (saveFile.exists())
        {
            saveFile.delete();
        }

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(saveFile));
            bw.write("MapsCollection\n");
            for (var storage : _mapStorages.keySet())
            {
                bw.write(storage + separatorDict + _mapStorages.get(storage).GetData(separatorDict, separatorData) +  "\n");
            }
            bw.close();
        }
        catch (IOException ex){
            return false;
        }
        return true;
    }

    /// <summary>
    /// Загрузка нформации по автомобилям на парковках из файла
    /// </summary>
    /// <param name="filename"></param>
    /// <returns></returns>
    public boolean LoadData(String filename) throws AirBomberNotFoundException, StorageOverflowException, Exception
    {
        File loadFile = new File(filename);
        if (!loadFile.exists())
        {
            return false;
        }
        try{
            BufferedReader br = new BufferedReader(new FileReader(loadFile));
            String line;
            line = br.readLine();
            line.trim();
            if (!line.equals("MapsCollection")) return false;
           _mapStorages.clear();
            while ((line = br.readLine()) != null)
            {
                line = line.trim();
                var elem = line.split(separatorDict);
                AbstractMap map = null;
                switch (elem[1])
                {
                    case "SimpleMap":
                        map = new SimpleMap();
                        break;
                    case "CityMap":
                        map = new CityMap();
                        break;
                    case "LineMap":
                        map = new LineMap();
                        break;
                }
                _mapStorages.put(elem[0], new MapWithSetAirBombersGeneric<IDrawingObject, AbstractMap>(_pictureWidth, _pictureHeight, map));
                _mapStorages.get(elem[0]).LoadData(elem[2].split(separatorData));
            }
            br.close();
            return true;
        }
        catch (IOException ex){
            return false;
        }
    }
    
    public boolean SaveStorage(String filename, String storageKey)
    {
        File saveFile = new File(filename);
        if (saveFile.exists())
        {
            saveFile.delete();
        }

        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(saveFile));
            bw.write("Storage\n");
            bw.write(storageKey + "\n");
            String[] storageStrings =  _mapStorages.get(storageKey).GetData(separatorDict, separatorData).split(separatorDict);
            bw.write(storageStrings[0] + "\n");
            String[] bombers = storageStrings[1].split(separatorData);
            bw.write(bombers.length + "\n");
            for (String bomber : bombers ){
                bw.write(bomber + "\n");
            }
            bw.close();
        }
        catch (IOException ex){
            return false;
        }
        return true;
    }
    
    public boolean LoadStorage(String filename) throws AirBomberNotFoundException, StorageOverflowException, FileNotFoundException, FileSystemException, Exception{
        File loadFile = new File(filename);
        if (!loadFile.exists())
        {
            throw new FileNotFoundException(filename);
        }
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(loadFile));
            String line;
            line = br.readLine();
            line.trim();
            if (!line.equals("Storage")) throw new FileSystemException("Неверный формат файла!");
            
            String key = br.readLine();
            String mapType = br.readLine();
            if (_mapStorages.containsKey(key)){
                _mapStorages.get(key).clearStorage();
            }
            else{
                AbstractMap map = null;
                switch (mapType)
                {
                    case "SimpleMap":
                        map = new SimpleMap();
                        break;
                    case "CityMap":
                        map = new CityMap();
                        break;
                    case "LineMap":
                        map = new LineMap();
                        break;
                }
                _mapStorages.put(key, new MapWithSetAirBombersGeneric<IDrawingObject, AbstractMap>(_pictureWidth, _pictureHeight, map));
            }
            
            int numberOfBombers = Integer.parseInt( br.readLine());
            for (int i =0; i< numberOfBombers;i++){
                String bomber = br.readLine();
                int res = _mapStorages.get(key).add(new DrawingObjectAirBomber(ExtentionAirBomber.ExtentionedAirBomber.CreateDrawningAirBomber(bomber)));
            }
            br.close();
            return true;
        }
        catch (IOException ex){
            return false;
        }
    }
}
