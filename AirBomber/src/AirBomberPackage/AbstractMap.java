/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirBomberPackage;
import java.util.Random;
import java.awt.*;
import java.awt.image.BufferedImage;
/**
 *
 * @author Андрей
 */
public abstract class AbstractMap {
    private IDrawingObject _drawningObject = null;
    protected int[][] _map = null;
    protected int _width;
    protected int _height;
    protected int _size_x;
    protected int _size_y;
    protected final Random _random = new Random();
    protected final int _freeRoad = 0;
    protected final int _barrier = 1;

    public BufferedImage CreateMap(int width, int height, IDrawingObject drawningObject)
    {
        _width = width;
        _height = height;
        _drawningObject = drawningObject;
        GenerateMap();
        while (!SetObjectOnMap())
        {
            GenerateMap();
        }
        return DrawMapWithObject();
    }
    public BufferedImage MoveObject(Direction direction)
    {
        if (_drawningObject == null) return DrawMapWithObject();
        boolean canMove = true;
        switch (direction)
        {
            case LEFT:
                if (!checkForBarriers(0, -1 * _drawningObject.getStep(), -1 * _drawningObject.getStep(), 0)) canMove = false;
                break;
            case RIGHT:
                if (!checkForBarriers(0, _drawningObject.getStep(), _drawningObject.getStep(), 0)) canMove = false;
                break;
            case UP:
                if (!checkForBarriers(-1 * _drawningObject.getStep(), 0, 0, -1 * _drawningObject.getStep())) canMove = false;
                break;
            case DOWN:
                if (!checkForBarriers(_drawningObject.getStep(), 0, 0, _drawningObject.getStep())) canMove = false;
                break;
        }
        if (canMove)
        {
            _drawningObject.MoveObject(direction);
        }
        return DrawMapWithObject();
    }
    private boolean SetObjectOnMap()
    {
        if (_drawningObject == null || _map == null)
        {
            return false;
        }
        int x = _random.nextInt(0, 10);
        int y = _random.nextInt(0, 10);
        _drawningObject.SetObject(x, y, _width, _height);
        if (!checkForBarriers(0,0,0,0)) return false;
        return true;
    }
    private BufferedImage DrawMapWithObject()
    {
        BufferedImage bmp = new BufferedImage(_width, _height, BufferedImage.TYPE_INT_ARGB);
        if (_drawningObject == null || _map == null)
        {
            return bmp;
        }
        Graphics2D gr = bmp.createGraphics();
        for (int i = 0; i < _map.length; ++i)
        {
            for (int j = 0; j < _map[i].length; ++j)
            {
                if (_map[i][j] == _freeRoad)
                {
                    DrawRoadPart(gr, i, j);
                }
                else if (_map[i][j] == _barrier)
                {
                    DrawBarrierPart(gr, i, j);
                }
            }
        }
        _drawningObject.DrawingObject(gr);
        return bmp;
    }

    private boolean checkForBarriers(float topOffset, float rightOffset, float leftOffset, float bottomOffset)
    {
        float[] position = _drawningObject.GetCurrentPosition();
        int top = (int)((position[1] + topOffset) / _size_y);
        int right = (int)((position[2] + rightOffset) / _size_x);
        int left = (int)((position[0] + leftOffset) / _size_x);
        int bottom = (int)((position[3] + bottomOffset) / _size_y);
        if (top < 0 || left < 0 || right >= _map[0].length || bottom >= _map.length) return false;
        for (int i = top; i <= bottom; i++)
        {
            for (int j = left; j <= right; j++)
            {
                if (_map[j][i] == 1) return false;
            }
        }
        return true;
    }

    protected abstract void GenerateMap();
    protected abstract void DrawRoadPart(Graphics g, int i, int j);
    protected abstract void DrawBarrierPart(Graphics g, int i, int j);
}
