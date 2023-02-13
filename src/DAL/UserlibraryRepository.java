/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import BLL.Userlibrary;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author CyberTech
 */
public class UserlibraryRepository extends EntMngClass implements UserlibraryInterface{

    @Override
    public void create(Userlibrary u) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.persist(u);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg\n"+e.getMessage());
        }
    }

    @Override
    public void edit(Userlibrary u) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.merge(u);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg\n"+e.getMessage());
        }
    }

    @Override
    public void delete(Userlibrary u) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.remove(u);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg\n"+e.getMessage());
        }
    }

    @Override
    public List<Userlibrary> findAll() throws CrudFormException {
        try {
            return em.createNamedQuery("Userlibrary.findAll").getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg\n"+e.getMessage());
        }
    }

    @Override
    public Userlibrary findByID(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT u FROM Userlibrary u WHERE u.userLibraryId = :id");
            query.setParameter(":id", ID);
            return (Userlibrary)query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException();
        }
    }

    @Override
    public Userlibrary logInByUsernameAndPassword(String u, String p) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT u FROM Userlibrary u WHERE u.username = :user AND u.pasword = :psw");
            query.setParameter("user", u);
            query.setParameter("psw", p);
            return (Userlibrary)query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException();
        }
    }
    
}
