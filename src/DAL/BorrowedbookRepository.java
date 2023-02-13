/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import BLL.Borrowedbook;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author CyberTech
 */
public class BorrowedbookRepository extends EntMngClass implements BorrowedbookInterface {

    @Override
    public void create(Borrowedbook bb) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.persist(bb);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException();
        }
    }

    @Override
    public void edit(Borrowedbook bb) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.merge(bb);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg\n"+e.getMessage());
        }

    }

    @Override
    public void delete(Borrowedbook bb) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.remove(bb);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg\n"+e.getMessage());
        }
    }

    @Override
    public List<Borrowedbook> findAll() throws CrudFormException {
        try {
            return em.createNamedQuery("Borrowedbook.findAll").getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg\n"+e.getMessage());
        }
    }

    @Override
    public Borrowedbook findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT bb FROM Borrowedbook bb WHERE bb.borrowedBookId = :id");
            query.setParameter(":id", ID);
            return (Borrowedbook)query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg\n"+e.getMessage());
        }
    }

}
