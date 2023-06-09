/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirBomberPackage;
import java.awt.*;
import java.util.Random;
/**
 *
 * @author Андрей
 */
public class DrawingAirBomber {
    protected EntityAirBomber AirBomber;
    public IDrawingObjectDop drawingEngines;
    public int _startPosX;
    public int _startPosY;
    private Integer _pictureWidth = null;
    private Integer _pictureHeight = null;
    private int _airBomberWidth = 110;
    private int _airBomberHeight = 100;
    
    public DrawingAirBomber(int speed, float weight, Color bodyColor, int numberOfEngines, EnginesType enginesType){
        AirBomber = new EntityAirBomber(speed, weight, bodyColor);
        switch (enginesType) {
            case RECTANGLE:
                drawingEngines = new DrawingEngines();
                break;
            case TRIANGLE:
                drawingEngines = new DrawingEnginesTriangle();
                break;
            case OVAL:
                drawingEngines = new DrawingEnginesOval();
                break;
            default:
                throw new AssertionError();
        }
        drawingEngines.setNumberOfEngines(numberOfEngines);
    }
    
    /// <summary>
    /// Инициализация свойств
    /// </summary>
    /// <param name="speed">Скорость</param>
    /// <param name="weight">Вес бомбардировщика</param>
    /// <param name="bodyColor">Цвет корпуса</param>
    /// <param name="carWidth">Ширина отрисовки бомбардировщика</param>
    /// <param name="carHeight">Высота отрисовки бомбардировщика</param>
    protected DrawingAirBomber(int speed, float weight, Color bodyColor, int numberOfEngines, EnginesType enginesType, int airBomberWidth, int airBomberHeight)
    {
        this(speed, weight, bodyColor, numberOfEngines, enginesType);
        this._airBomberWidth = airBomberWidth;
        this._airBomberHeight = airBomberHeight;
    }


    public EntityAirBomber getAirBomber() {
        return AirBomber;
    }
    
    public void SetPosition(int x, int y, int width, int height){
        _pictureWidth = width;
        _pictureHeight = height;
        if (_pictureWidth == null || _pictureHeight == null)
        {
            return;
        }
        Random rd = new Random();
        _startPosX = x + _airBomberWidth >= _pictureWidth  ? rd.nextInt(0, _pictureWidth - 1 - _airBomberWidth) : x;
        _startPosY = y + _airBomberHeight >= _pictureHeight ? rd.nextInt(0, _pictureHeight - 1 - _airBomberHeight) : y;
    }
    
    public void MoveTransport(Direction direction)
    {
        if (_pictureWidth == null || _pictureHeight == null)
        {
            return;
        }
        switch (direction)
        {
            // вправо
            case RIGHT:
                if (_startPosX + _airBomberWidth + AirBomber.Step < _pictureWidth)
                {
                    _startPosX += AirBomber.Step;
                }
                break;
            //влево
            case LEFT:
                if (_startPosX - AirBomber.Step > 0)
                {
                    _startPosX -= AirBomber.Step;
                }
                break;
            //вверх
            case UP:
                if (_startPosY - AirBomber.Step > 0)
                {
                    _startPosY -= AirBomber.Step;
                }
                break;
            //вниз
            case DOWN:
                if (_startPosY + _airBomberHeight + AirBomber.Step < _pictureHeight)
                {
                    _startPosY += AirBomber.Step;
                }
                break;
        }
    }
    
    public void DrawTransport(Graphics2D g)
    {
        if (_startPosX < 0 || _startPosY < 0
        || _pictureHeight == null || _pictureWidth == null)
        {
            return;
        }

        int _startPosXInt = (int)_startPosX;
        int _startPosYInt = (int)_startPosY;

        //отрисовка двигателей
        drawingEngines.drawEngines(g, _startPosXInt, _startPosYInt, AirBomber.getBodyColor());
        
        //отрисовка кабины
        int[] cabinX = 
        {
            _startPosXInt + 5,
            _startPosXInt + 20,
            _startPosXInt + 20
        };
        
        int[] cabinY = 
        {
            _startPosYInt + 50,
            _startPosYInt + 40,
            _startPosYInt + 60
        };
        
        g.fillPolygon(cabinX, cabinY, cabinX.length);
        g.setColor(AirBomber.getBodyColor());
        //отрисовка корпуса
        g.fillRect(_startPosXInt + 20, _startPosYInt + 40, 90, 20);
        
        //отрисовка правого крыла
        int[] rightWingX =
        {
            _startPosXInt + 50,
            _startPosXInt + 50,
            _startPosXInt + 60,
            _startPosXInt + 70
        };
        
        int[] rightWingY =
        {
            _startPosYInt + 40,
            _startPosYInt,
            _startPosYInt,
            _startPosYInt + 40
        };
        
        g.fillPolygon(rightWingX, rightWingY, rightWingX.length);
        
        //отрисовка левого крыла
        int[] leftWingX =
        {
            _startPosXInt + 50,
            _startPosXInt + 50,
            _startPosXInt + 60,
            _startPosXInt + 70
        };
        
        int[] leftWingY =
        {
            _startPosYInt + 60,
            _startPosYInt + 100,
            _startPosYInt + 100,
            _startPosYInt + 60
        };
        
        g.fillPolygon(leftWingX, leftWingY, leftWingX.length);
        
        //отрисовка хвоста (справа)
        int[] rightTailX =
        {
            _startPosXInt + 95,
            _startPosXInt + 95,
            _startPosXInt + 110,
            _startPosXInt + 110
        };
        
        int[] rightTailY =
        {
            _startPosYInt + 40,
            _startPosYInt + 30,
            _startPosYInt + 15,
            _startPosYInt + 40
        };
        
        g.fillPolygon(rightTailX, rightTailY, rightTailX.length);
        
        //отрисовка хвоста (слева)
        int[] leftTailX =
        {
            _startPosXInt + 95,
            _startPosXInt + 95,
            _startPosXInt + 110,
            _startPosXInt + 110
        };
        
        int[] leftTailY =
        {
            _startPosYInt + 60,
            _startPosYInt + 70,
            _startPosYInt + 85,
            _startPosYInt + 60
        };
        
        g.fillPolygon(leftTailX, leftTailY, leftTailX.length);
        
        g.setColor(Color.BLACK);
        
        g.drawRect(_startPosXInt + 20, _startPosYInt + 40, 90, 20);
        g.drawPolygon(rightWingX, rightWingY, rightWingX.length);
        g.drawPolygon(leftWingX, leftWingY, leftWingX.length);
        g.drawPolygon(rightTailX, rightTailY, rightTailX.length);
        g.drawPolygon(leftTailX, leftTailY, leftTailX.length);
        g.drawLine(_startPosXInt, _startPosYInt + 50, _startPosXInt + 5, _startPosYInt + 50);  
    }
    
    public float [] GetCurrentPosition()
    {
        float[] pos = new float[4];
        pos[0] = _startPosX;
        pos[1] = _startPosY;
        pos[2] = _startPosX + _airBomberWidth;
        pos[3] = _startPosY + _airBomberHeight;
        return pos;
    }
    
    public void setEngines(IDrawingObjectDop newEngines){
        drawingEngines = newEngines;
    }
    
    public void ChangeBorders(int width, int height)
    {
        _pictureWidth = width;
        _pictureHeight = height;
        if (_pictureWidth <= _airBomberWidth || _pictureHeight <= _airBomberHeight)
        {
            _pictureWidth = null;
            _pictureHeight = null;
            return;
        }
        if (_startPosX + _airBomberWidth > _pictureWidth)
        {
            _startPosX = _pictureWidth - _airBomberWidth;
        }
        if (_startPosY + _airBomberHeight > _pictureHeight)
        {
            _startPosY = _pictureHeight - _airBomberHeight;
        }
    }
}
