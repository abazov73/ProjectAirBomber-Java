/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirBomberPackage;

import java.awt.Graphics2D;
import java.awt.Color;

/**
 *
 * @author Андрей
 */
public class DrawingEngines {
    private Engines engines = null;
    private int numberOfEngines;

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

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
    
    private void drawEngine(Graphics2D g, int startPosX, int startPosY, int yOffset, Color bodyColor){
        g.setColor(bodyColor);
        g.fillRect(startPosX + 45, startPosY + 40 + yOffset, 5, 5);
        g.setColor(Color.BLACK);
        g.drawRect(startPosX + 45, startPosY + 40 + yOffset, 5, 5);
    }
    
    public void drawEngines(Graphics2D g, int startPosX, int startPosY, Color bodyColor){
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
