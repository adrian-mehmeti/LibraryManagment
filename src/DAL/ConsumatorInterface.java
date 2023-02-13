/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAL;

import BLL.Consumator;
import java.util.List;

/**
 *
 * @author CyberTech
 */
public interface ConsumatorInterface {
    void create(Consumator c) throws CrudFormException;
    void edit(Consumator c) throws CrudFormException;
    void delete(Consumator c) throws CrudFormException;
    List <Consumator> findAll() throws CrudFormException;
    Consumator findById(Integer ID) throws CrudFormException;
}
