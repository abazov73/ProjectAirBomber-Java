/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirBomberPackage;
import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Андрей
 */
public class EntityAirBomber {
    private int Speed;
    
    private float Weight;
    
    private Color BodyColor;
    
    public float Step;

    public int getSpeed() {
        return Speed;
    }

    public float getWeight() {
        return Weight;
    }

    public Color getBodyColor() {
        return BodyColor;
    }
    
    
    
    public void Init(int speed, float weight, Color bodyColor){
       Random rnd = new Random();
       Speed = speed <= 0 ? rnd.nextInt(50, 150) : speed;
       Weight = weight <= 0 ? rnd.nextInt(40, 70) : weight;
       Step = Speed * 100 / Weight;
       BodyColor = bodyColor;
    }
}
