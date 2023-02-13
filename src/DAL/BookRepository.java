/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import BLL.Book;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author CyberTech
 */
public class BookRepository extends EntMngClass implements BookInterface {

    @Override
    public void create(Book o) throws CrudFormException{
        try {
            em.getTransaction().begin();
            em.persist(o);
            em.getTransaction().commit();
            
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+e.getMessage());
        }
    }

    @Override
    public void edit(Book o)throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.merge(o);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg \n"+e.getMessage());
        }
    }

    @Override
    public void delete(Book o) throws CrudFormException  {
        try {
            em.getTransaction().begin();
            em.remove(o);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg\n "+e.getMessage());
        }
    }

    @Override
    public List<Book> findAll() throws CrudFormException {
        try {
            return em.createNamedQuery("Book.findAll").getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg\n "+e.getMessage());
        }
    }

    @Override
    public Book findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT b from Book b WHERE b.bookId = :id");
            query.setParameter(":id", ID);
            return (Book)query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg\n "+e.getMessage());
        }
    }
    
}
