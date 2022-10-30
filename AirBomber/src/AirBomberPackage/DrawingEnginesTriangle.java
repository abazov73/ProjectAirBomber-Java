/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirBomberPackage;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Андрей
 */
public class DrawingEnginesTriangle implements IDrawingObjectDop {
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
        int[] engineX = {
            startPosX + 45,
            startPosX + 50,
            startPosX + 50,
        };
        int[] engineY = {
            startPosY + 42 + yOffset,
            startPosY + 38 + yOffset,
            startPosY + 46 + yOffset,
        };
        g.fillPolygon(engineX, engineY, engineX.length);
        g.setColor(Color.BLACK);
        g.drawPolygon(engineX, engineY, engineX.length);
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
