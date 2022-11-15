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
public class EntityHeavyAirBomber extends EntityAirBomber {
    /// <summary>
    /// Дополнительный цвет
    /// </summary>
    private Color DopColor;
    /// <summary>
    /// Признак наличия бомб
    /// </summary>
    private boolean bombs;
    /// <summary>
    /// Признак наличия топливных баков
    /// </summary>
    private boolean fuelTank;
    /// <summary>
    /// Признак наличия полосы на хвосте
    /// </summary>
    private boolean tailLine;

    public Color getDopColor() {
        return DopColor;
    }
    
    public boolean getBombs(){
        return bombs;
    }
    
    public boolean getFuelTank(){
        return fuelTank;
    }
    
    public boolean getTailLine(){
        return tailLine;
    }
    
    public void setDopColor(Color newColor){
        DopColor = newColor;
    }
    
    /// <summary>
    /// Инициализация свойств
    /// </summary>
    /// <param name="speed">Скорость</param>
    /// <param name="weight">Вес бомбардировщика</param>
    /// <param name="bodyColor">Цвет корпуса</param>
    /// <param name="dopColor">Дополнительный цвет</param>
    /// <param name="bombs">Признак наличия обвеса</param>
    /// <param name="fuelTank">Признак наличия антикрыла</param>
    /// <param name="tailLine">Признак наличия гоночной полосы</param>
    public EntityHeavyAirBomber(int speed, float weight, Color bodyColor, Color dopColor, boolean bombs, boolean fuelTank, boolean tailLine)
    {
        super(speed, weight, bodyColor);
        DopColor = dopColor;
        this.bombs = bombs;
        this.fuelTank = fuelTank;
        this.tailLine = tailLine;
    }
}
