/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAL;

import BLL.Borrowedbook;
import java.util.List;

/**
 *
 * @author CyberTech
 */
public interface BorrowedbookInterface {
    void create(Borrowedbook bb) throws CrudFormException;
    void edit(Borrowedbook bb) throws CrudFormException;
    void delete(Borrowedbook bb) throws CrudFormException;
    List <Borrowedbook> findAll() throws CrudFormException;
    Borrowedbook findByID(Integer ID) throws CrudFormException;
    
}
