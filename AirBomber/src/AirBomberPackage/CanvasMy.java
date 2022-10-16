/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirBomberPackage;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Андрей
 */
public class CanvasMy extends JComponent {
    public CanvasMy(){
        super();
    }
    
    private DrawingAirBomber _airBomber = null;
    
    public void setAirBomber(DrawingAirBomber _airBomber) {
        this._airBomber = _airBomber;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        if (_airBomber != null) _airBomber.DrawTransport(g2d);
    }
}
