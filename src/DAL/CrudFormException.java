/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

/**
 *
 * @author CyberTech
 */
public class CrudFormException extends Exception {
    public CrudFormException(){}
    
    public CrudFormException(String msg){
        super(msg);
    }
}
