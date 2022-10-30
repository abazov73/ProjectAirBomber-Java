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
public class DrawingEnginesOval implements IDrawingObjectDop {
    private Engines engines = null;
    private int numberOfEngines;
    @Override
    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    @Override
    public void setNumberOfEngines(int numberOfEngines) {
        if (numberOfEngines != 2 && numberOfEngines != 4 && numberOfEngines != 6) return;
        this.numberOfEngines = numberOfEngines;
        switch (this.numberOfEngines) {
            case 2:
                engines = Engines.TWO;
                break;
            case 4:
                engines = Engines.FOUR;
                break;
            case 6:
                engines = Engines.SIX;
                break;
        }
    }

    @Override
    public void drawEngine(Graphics2D g, int startPosX, int startPosY, int yOffset, Color bodyColor) {
        g.setColor(bodyColor);
        g.fillOval(startPosX + 45, startPosY + 40 + yOffset, 5, 5);
        g.setColor(Color.BLACK);
        g.drawOval(startPosX + 45, startPosY + 40 + yOffset, 5, 5);
    }

    @Override
    public void drawEngines(Graphics2D g, int startPosX, int startPosY, Color bodyColor) {
        if (engines == null) return;
        
        switch (engines) {
            case SIX:
                drawEngine(g, startPosX, startPosY, -5 - 5 - 20, bodyColor);
                drawEngine(g, startPosX, startPosY, 20 + 5 + 20, bodyColor);
            case FOUR:
                drawEngine(g, startPosX, startPosY, -5 - 5 - 10, bodyColor);
                drawEngine(g, startPosX, startPosY, 20 + 5 + 10, bodyColor);
            case TWO:
                drawEngine(g, startPosX, startPosY, -5 - 5, bodyColor);
                drawEngine(g, startPosX, startPosY, 20 + 5, bodyColor);
                break;
        }
    }
    
}
