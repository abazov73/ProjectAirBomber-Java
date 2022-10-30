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
public class LineMap extends AbstractMap {
    /// <summary>
    /// Цвет участка закрытого
    /// </summary>
    private final Color barrierColor = Color.BLACK;
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
        int lineCounter = 0;
        int numOfLines = _random.nextInt(1, 4);
        for (int i = 0; i < _map.length; ++i)
        {
            for (int j = 0; j < _map[0].length; ++j)
            {
                _map[i][j] = _freeRoad;
            }
        }
        while (lineCounter < numOfLines)
        {
            int randomInt = _random.nextInt(0, 1000);
            boolean vertical = false;
            if (randomInt % 2 == 0) vertical = true;
            if (vertical)
            {
                int x = _random.nextInt(0, 89);
                int lineWidth = _random.nextInt(2, 5);
                if (x + lineWidth >= _map.length) x = _random.nextInt(_map.length - lineWidth - 1, _map.length);

                boolean isFreeSpace = true;
                for (int i = x; i < x + lineWidth; i++)
                {
                    if (_map[i][0] != _freeRoad) isFreeSpace = false;
                }
                if (isFreeSpace)
                {
                    for (int i = x; i < x + lineWidth; i++)
                    {
                        for (int j = 0; j < _map.length; j++)
                        {
                            _map[i][j] = _barrier;
                        }
                    }
                    lineCounter++;
                }
            }
            else
            {
                int y = _random.nextInt(0, 89);
                int lineHeigth = _random.nextInt(2, 5);
                if (y + lineHeigth >= _map[0].length) y = _random.nextInt(_map[0].length - lineHeigth - 1, _map[0].length);

                boolean isFreeSpace = true;
                for (int j = y; j < y + lineHeigth; j++)
                {
                    if (_map[0][j] != _freeRoad) isFreeSpace = false;
                }
                if (isFreeSpace)
                {
                    for (int j = y; j < y + lineHeigth; j++)
                    {
                        for (int i = 0; i < _map[0].length; i++)
                        {
                            _map[i][j] = _barrier;
                        }
                    }
                    lineCounter++;
                }
            }
        }
    }
}
