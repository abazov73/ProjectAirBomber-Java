/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirBomberPackage;
import java.awt.*;
/**
 *
 * @author Андрей
 */
public class CityMap extends AbstractMap {
    /// <summary>
    /// Цвет участка закрытого
    /// </summary>
    private final Color barrierColor = Color.GRAY;
    /// <summary>
    /// Цвет участка открытого
    /// </summary>
    private final Color roadColor = Color.CYAN;
    @Override
    protected void DrawBarrierPart(Graphics g, int i, int j)
    {
        g.setColor(barrierColor);
        g.fillRect(i * _size_x, j * _size_y, _size_x, _size_y);
        g.setColor(Color.BLACK);
    }
    @Override
    protected void DrawRoadPart(Graphics g, int i, int j)
    {
        g.setColor(roadColor);
        g.fillRect(i * _size_x, j * _size_y, _size_x, _size_y);
        g.setColor(Color.BLACK);
    }
    @Override
    protected void GenerateMap()
    {
        _map = new int[100][100];
        _size_x = _width / _map.length;
        _size_y = _height / _map[0].length;
        int buildingCounter = 0;
        for (int i = 0; i < _map.length; ++i)
        {
            for (int j = 0; j < _map[0].length; ++j)
            {
                _map[i][j] = _freeRoad;
            }
        }
        while (buildingCounter < 10)
        {
            int x = _random.nextInt(0, 89);
            int y = _random.nextInt(0, 89);
            int buildingWidth = _random.nextInt(2, 10);
            int buildingHeight = _random.nextInt(2, 10);
            if (x + buildingWidth >= _map.length) x = _random.nextInt(_map.length - buildingWidth - 1, _map.length);
            if (y + buildingHeight >= _map[0].length) y = _random.nextInt(_map[0].length - buildingHeight - 1, _map[0].length);

            boolean isFreeSpace = true;
            for (int i = x; i < x + buildingWidth; i++)
            {
                for (int j = y; j < y + buildingHeight; j++)
                {
                    if (_map[i][j] != _freeRoad)
                    {
                        isFreeSpace = false;
                        break;
                    }
                }
            }
            if (isFreeSpace)
            {
                for (int i = x; i < x + buildingWidth; i++)
                {
                    for (int j = y; j < y + buildingHeight; j++)
                    {
                        _map[i][j] = _barrier;
                    }
                }
                buildingCounter++;
            }
        }
    }
}
