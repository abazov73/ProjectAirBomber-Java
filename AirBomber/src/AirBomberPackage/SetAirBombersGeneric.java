/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirBomberPackage;

import java.util.ArrayList;

/**
 *
 * @author Андрей
 */
public class SetAirBombersGeneric<T> {
    /// <summary>
    /// Массив объектов, которые храним
    /// </summary>
    private ArrayList<T> _places;
    /// <summary>
    /// Количество объектов в массиве
    /// </summary>
    private int _maxCount;
    /// <summary>
    /// Конструктор
    /// </summary>
    /// <param name="count"></param>
    public SetAirBombersGeneric(int count)
    {
        _places = new ArrayList<T>(count);
        _maxCount = count;
    }
    
    public int getCount(){
        return _places.size();
    }
    /// <summary>
    /// Добавление объекта в набор
    /// </summary>
    /// <param name="airBomber">Добавляемый автомобиль</param>
    /// <returns></returns>
    public int Insert(T airBomber)throws AirBomberNotFoundException, StorageOverflowException, Exception
    {
        return Insert(airBomber, 0);
    }
    /// <summary>
    /// Добавление объекта в набор на конкретную позицию
    /// </summary>
    /// <param name="airBomber">Добавляемый автомобиль</param>
    /// <param name="position">Позиция</param>
    /// <returns></returns>
    public int Insert(T airBomber, int position) throws AirBomberNotFoundException, StorageOverflowException, Exception
    {
        if (position < 0 || position > _maxCount)
        {
            throw new AirBomberNotFoundException(position);
        }
        if (_places.size() + 1 > _maxCount){
            throw new StorageOverflowException(_maxCount);
        }
        _places.add(position, airBomber);
        return position;
    }
    /// <summary>
    /// Удаление объекта из набора с конкретной позиции
    /// </summary>
    /// <param name="position"></param>
    /// <returns></returns>
    public T Remove(int position) throws AirBomberNotFoundException, Exception
    {
        if (position <0 || position > _maxCount)
        {
            throw new AirBomberNotFoundException(position);
        } 
        T removedObject = _places.get(position);
        _places.remove(position);
        return removedObject;
    }
    /// <summary>
    /// Получение объекта из набора по позиции
    /// </summary>
    /// <param name="position"></param>
    /// <returns></returns>
    public T Get(int position) 
    {
        if (position >= _maxCount || position < 0)
        {
            return null;
        }
        return _places.get(position);
    }
    
    public void Set(int position, T value){
        if (position >= _maxCount || position < 0)
        {
            return;
        }
        _places.set(position, value);
    }
    
    public ArrayList<T> GetAirBombers(){
        ArrayList<T> notNullAirBombers = new ArrayList<>();
        for(var airBomber : _places){
            if (airBomber != null){
                notNullAirBombers.add(airBomber);
            }
            else{
                break;
            }
        }
        return  notNullAirBombers;
    }
    
    public void clear(){
        _places.clear();
    }
}
