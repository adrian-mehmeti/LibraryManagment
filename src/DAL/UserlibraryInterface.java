/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAL;

import BLL.Userlibrary;
import java.util.List;

/**
 *
 * @author CyberTech
 */
public interface UserlibraryInterface {
    void create(Userlibrary u) throws CrudFormException;
    void edit(Userlibrary u) throws CrudFormException;
    void delete(Userlibrary u) throws CrudFormException;
    List<Userlibrary> findAll() throws CrudFormException;
    Userlibrary findByID(Integer ID) throws CrudFormException;
    Userlibrary logInByUsernameAndPassword(String u,String p)throws CrudFormException;
}
