/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirBomberPackage;

/**
 *
 * @author Андрей
 */
public class SetAirBombersGeneric<T> {
    /// <summary>
    /// Массив объектов, которые храним
    /// </summary>
    private T[] _places;
    /// <summary>
    /// Количество объектов в массиве
    /// </summary>
    public int Count;
    /// <summary>
    /// Конструктор
    /// </summary>
    /// <param name="count"></param>
    public SetAirBombersGeneric(int count)
    {
        _places = (T[]) new Object[count];
        Count = count;
    }
    /// <summary>
    /// Добавление объекта в набор
    /// </summary>
    /// <param name="airBomber">Добавляемый автомобиль</param>
    /// <returns></returns>
    public int Insert(T airBomber)
    {
        return Insert(airBomber, 0);
    }
    /// <summary>
    /// Добавление объекта в набор на конкретную позицию
    /// </summary>
    /// <param name="airBomber">Добавляемый автомобиль</param>
    /// <param name="position">Позиция</param>
    /// <returns></returns>
    public int Insert(T airBomber, int position)
    {
        if (position >= _places.length)
        {
            return -1;
        }
        if (_places[position] != null)
        {
            int indexNull = -1;
            for (int i = position; i < _places.length; i++)
            {
                if (_places[i] == null)
                {
                    indexNull = i;
                    break;
                }
            }
            if (indexNull == -1) return -1;
            for (int i = indexNull; i > position; i--)
            {
                T tmp = _places[i];
                _places[i] = _places[i - 1];
                _places[i - 1] = tmp;
            }
        }
        _places[position] = airBomber;
        return position;
    }
    /// <summary>
    /// Удаление объекта из набора с конкретной позиции
    /// </summary>
    /// <param name="position"></param>
    /// <returns></returns>
    public T Remove(int position)
    {
        if (position >= _places.length)
        {
            return null;
        }
        T removedObject = _places[position];
        _places[position] = null;
        return removedObject;
    }
    /// <summary>
    /// Получение объекта из набора по позиции
    /// </summary>
    /// <param name="position"></param>
    /// <returns></returns>
    public T Get(int position)
    {
        if (position >= _places.length)
        {
            return null;
        }
        return _places[position];
    }
}
