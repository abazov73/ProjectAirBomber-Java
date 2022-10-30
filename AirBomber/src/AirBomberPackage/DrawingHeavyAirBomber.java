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
public class DrawingHeavyAirBomber extends DrawingAirBomber {
    /// <summary>
    /// Инициализация свойств
    /// </summary>
    /// <param name="speed">Скорость</param>
    /// <param name="weight">Вес автомобиля</param>
    /// <param name="bodyColor">Цвет кузова</param>
    /// <param name="dopColor">Дополнительный цвет</param>
    /// <param name="bodyKit">Признак наличия обвеса</param>
    /// <param name="wing">Признак наличия антикрыла</param>
    /// <param name="sportLine">Признак наличия гоночной полосы</param>
    public DrawingHeavyAirBomber(int speed, float weight, Color bodyColor, int numberOfEngines, EnginesType enginesType, Color dopColor, boolean bodyKit, boolean wing, boolean sportLine)
    {
        super(speed, weight, bodyColor, numberOfEngines, enginesType, 110, 100);
        AirBomber = new EntityHeavyAirBomber(speed, weight, bodyColor, dopColor, bodyKit, wing, sportLine);
    }

    @Override
    public void DrawTransport(Graphics2D g)
    {
        if (!(AirBomber instanceof EntityHeavyAirBomber heavyAirBomber))
        {
            return;
        }
        if (heavyAirBomber.getBombs()) 
        {
            g.setColor(heavyAirBomber.getDopColor());
            g.fillOval(_startPosX + 45, _startPosY, 20, 10);
            g.fillOval(_startPosX + 45, _startPosY + 90, 20, 10);
            g.setColor(Color.BLACK);
            g.drawOval(_startPosX + 45, _startPosY, 20, 10);
            g.drawOval(_startPosX + 45, _startPosY + 90, 20, 10);

        }

        super.DrawTransport(g);

        if (heavyAirBomber.getTailLine()) 
        {
            g.setColor(heavyAirBomber.getDopColor());
            g.fillRect(_startPosX + 95, _startPosY + 30, 15, 5);
            g.fillRect(_startPosX + 95, _startPosY + 65, 15, 5);
            g.setColor(Color.BLACK);
        }

        if (heavyAirBomber.getFuelTank())
        {
            g.setColor(heavyAirBomber.getDopColor());
            g.fillOval(_startPosX + 23, _startPosY + 42, 25, 15);
            g.fillOval(_startPosX + 53, _startPosY + 42, 25, 15);
            g.fillOval(_startPosX + 83, _startPosY + 42, 25, 15);
            g.setColor(Color.BLACK);
            g.drawOval(_startPosX + 23, _startPosY + 42, 25, 15);
            g.drawOval(_startPosX + 53, _startPosY + 42, 25, 15);
            g.drawOval(_startPosX + 83, _startPosY + 42, 25, 15);
        }
    }
}
