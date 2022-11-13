/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirBomberPackage;
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author Андрей
 */
public class MapsCollection {
    /// <summary>
    /// Словарь (хранилище) с картами
    /// </summary>
    HashMap<String, MapWithSetAirBombersGeneric<DrawingObjectAirBomber, AbstractMap>> _mapStorages;
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
        _mapStorages = new HashMap<String, MapWithSetAirBombersGeneric<DrawingObjectAirBomber, AbstractMap>>();
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
        _mapStorages.put(name, new MapWithSetAirBombersGeneric<DrawingObjectAirBomber, AbstractMap>(_pictureWidth, _pictureHeight, map));
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
    
    public MapWithSetAirBombersGeneric<DrawingObjectAirBomber, AbstractMap> Get(String ind){
        if (_mapStorages.containsKey(ind)) return _mapStorages.get(ind);
        else return null;
    }
    
    public DrawingObjectAirBomber Get(String ind, int index){
        if (!_mapStorages.containsKey(ind)) return null;
        MapWithSetAirBombersGeneric<DrawingObjectAirBomber, AbstractMap> map =  _mapStorages.get(ind);
        return map.getSetAirBombers().Get(index);
    }
}
