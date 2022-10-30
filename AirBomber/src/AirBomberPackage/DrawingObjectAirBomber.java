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
public class DrawingObjectAirBomber implements IDrawingObject {
    private DrawingAirBomber _airBomber = null;

    public DrawingObjectAirBomber(DrawingAirBomber airBomber)
    {
        _airBomber = airBomber;
        Step = _airBomber.AirBomber.Step;
    }

    public float Step;
    @Override
    public float getStep(){
        return Step;
    }
    
    @Override
    public float[] GetCurrentPosition()
    {
        if (_airBomber == null) return null;
        return _airBomber.GetCurrentPosition();
    }
    @Override
    public void MoveObject(Direction direction)
    {
        _airBomber.MoveTransport(direction);
    }
    @Override
    public void SetObject(int x, int y, int width, int height)
    {
        _airBomber.SetPosition(x, y, width, height);
    }
    
    @Override
    public void DrawingObject(Graphics2D g)
    {
        if (_airBomber == null) return;
        if (_airBomber instanceof DrawingHeavyAirBomber heavyAirBomber)
        {
            heavyAirBomber.DrawTransport(g);
        }
        else
        {
            _airBomber.DrawTransport(g);
        }
    }
}
