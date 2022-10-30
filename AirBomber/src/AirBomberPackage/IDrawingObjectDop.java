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
public interface IDrawingObjectDop {
    public int getNumberOfEngines();
    void setNumberOfEngines(int numberOfEngines);
    void drawEngine(Graphics2D g, int startPosX, int startPosY, int yOffset, Color bodyColor);
    void drawEngines(Graphics2D g, int startPosX, int startPosY, Color bodyColor);
}
