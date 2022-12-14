/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirBomberPackage;

/**
 *
 * @author Андрей
 */
public class StorageOverflowException extends Exception {
    public StorageOverflowException(int count){
        super("В наборе превышено допустимое количество: " + count);
    } 
}
