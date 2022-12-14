/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirBomberPackage;

/**
 *
 * @author Андрей
 */
public class AirBomberNotFoundException extends Exception {
    public AirBomberNotFoundException(int i){
        super("Не найден объект по позиции " + i);
    }
}
