/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAL;

import BLL.Book;
import java.util.List;

/**
 *
 * @author CyberTech
 */
public interface BookInterface {
    void create(Book o) throws CrudFormException;
    void edit(Book o) throws CrudFormException;
    void delete(Book o)throws CrudFormException;
    List<Book> findAll() throws CrudFormException;
    Book findByID(Integer ID) throws CrudFormException;
}
