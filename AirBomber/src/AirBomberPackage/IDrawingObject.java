/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AirBomberPackage;
import java.awt.*;
/**
 *
 * @author Андрей
 */
public interface IDrawingObject {
    /// <summary>
    /// Шаг перемещения объекта
    /// </summary>
    public float getStep();
    /// <summary>
    /// Установка позиции объекта
    /// </summary>
    /// <param name="x">Координата X</param>
    /// <param name="y">Координата Y</param>
    /// <param name="width">Ширина полотна</param>
    /// <param name="height">Высота полотна</param>
    void SetObject(int x, int y, int width, int height);
    /// <summary>
    /// Изменение направления пермещения объекта
    /// </summary>
    /// <param name="direction">Направление</param>
    /// <returns></returns>
    void MoveObject(Direction direction);
    /// <summary>
    /// Отрисовка объекта
    /// </summary>
    /// <param name="g"></param>
    void DrawingObject(Graphics2D g);
    /// <summary>
    /// Получение текущей позиции объекта
    /// </summary>
    /// <returns></returns>
    float[] GetCurrentPosition();
    
    String GetInfo();
}
