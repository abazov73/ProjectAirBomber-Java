/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirBomberPackage;
import java.awt.*;
import java.awt.image.BufferedImage;
/**
 *
 * @author Андрей
 */
public class MapWithSetAirBombersGeneric <T extends IDrawingObject, U extends AbstractMap> {
    private int _pictureWidth;
    private int _pictureHeight;
    private int _placeSizeWidth = 110;
    private int _placeSizeHeight = 100;
    private SetAirBombersGeneric<T> _setAirBombers;
    private U _map;
    public MapWithSetAirBombersGeneric(int picWidth, int picHeight, U map)
    {
        int width = picWidth / _placeSizeWidth;
        int height = picHeight / _placeSizeHeight;
        _setAirBombers = new SetAirBombersGeneric<T>(width * height);
        _pictureWidth = picWidth;
        _pictureHeight = picHeight;
        _map = map;
    }
    
    public SetAirBombersGeneric<T> getSetAirBombers(){
        return _setAirBombers;
    }
    
    public int add(T airBomber){
        return _setAirBombers.Insert(airBomber);
    }
    
    public T remove(int position){
        return _setAirBombers.Remove(position);
    }
    
    public BufferedImage ShowSet()
    {
        BufferedImage bmp = new BufferedImage(_pictureWidth, _pictureHeight, BufferedImage.TYPE_INT_ARGB);
        Graphics2D gr = bmp.createGraphics();
        DrawBackground(gr);
        DrawAirBombers(gr);
        return bmp;
    }
    
    public BufferedImage ShowOnMap()
    {
        Shaking();
        for (int i = 0; i < _setAirBombers.getCount(); i++)
        {
            var airBomber = _setAirBombers.Get(i);
            if (airBomber != null)
            {
                return _map.CreateMap(700, 700, airBomber);
            }
        }
        return new BufferedImage(_pictureWidth, _pictureHeight, BufferedImage.TYPE_INT_ARGB);
    }
    
    public BufferedImage MoveObject(Direction direction)
    {
        if (_map != null)
        {
            return _map.MoveObject(direction);
        }
        return new BufferedImage(_pictureWidth, _pictureHeight, BufferedImage.TYPE_INT_ARGB);
    }
    
    private void Shaking()
    {
        int j = _setAirBombers.getCount() - 1;
        for (int i = 0; i < _setAirBombers.getCount(); i++)
        {
            if (_setAirBombers.Get(i) == null)
            {
                for (; j > i; j--)
                {
                    var car = _setAirBombers.Get(j);
                    if (car != null)
                    {
                        _setAirBombers.Insert(car, i);
                        _setAirBombers.Remove(j);
                        break;
                    }
                }
                if (j <= i)
                {
                    return;
                }
            }
        }
    }
    
    private void DrawBackground(Graphics2D g)
    {
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, _pictureWidth, _pictureHeight);
        g.setColor(Color.WHITE);
        g.setStroke(new BasicStroke(3));
        for (int i = 0; i < _pictureWidth / _placeSizeWidth; i++)
        {
            for (int j = 0; j < _pictureHeight / _placeSizeHeight + 1; ++j)
            {//линия рамзетки места
                g.drawLine(i * _placeSizeWidth, j * _placeSizeHeight, i * _placeSizeWidth + _placeSizeWidth / 2, j * _placeSizeHeight);
            }
            g.drawLine(i * _placeSizeWidth, 0, i * _placeSizeWidth, (_pictureHeight / _placeSizeHeight) * _placeSizeHeight);
        }
        g.setStroke(new BasicStroke(1));
        g.setColor(Color.BLACK);
    }
    
    private void DrawAirBombers(Graphics2D g)
    {
        int numOfObjectsInRow = _pictureWidth / _placeSizeWidth;
        for (int i = 0; i < _setAirBombers.getCount(); i++)
        {
            if (_setAirBombers.Get(i) != null){
                _setAirBombers.Get(i).SetObject((numOfObjectsInRow - (i % numOfObjectsInRow) - 1) * _placeSizeWidth, (i / numOfObjectsInRow) * _placeSizeHeight, _pictureWidth, _pictureHeight);
                _setAirBombers.Get(i).DrawingObject(g);
            }
        }
    }
}
