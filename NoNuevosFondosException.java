/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author evert
 */
public class NoNuevosFondosException extends Exception{

    public NoNuevosFondosException() {
        super("Debe ingresar un monto a ingresar a sus fondos");
    }
    
}
