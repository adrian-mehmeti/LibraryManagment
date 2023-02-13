/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import BLL.Consumator;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author CyberTech
 */
public class ConsumatorRepository extends EntMngClass implements ConsumatorInterface{

    @Override
    public void create(Consumator c) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg\n"+e.getMessage());
        }
    }

    @Override
    public void edit(Consumator c) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.merge(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg\n"+e.getMessage());
        }
    }

    @Override
    public void delete(Consumator c) throws CrudFormException {
        try {
            em.getTransaction().begin();
            em.remove(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new CrudFormException("Msg\n"+e.getMessage());
        }
    }

    @Override
    public List<Consumator> findAll() throws CrudFormException {
        try {
            return em.createNamedQuery("Consumator.findAll").getResultList();
        } catch (Exception e) {
            throw new CrudFormException("Msg\n" +e.getMessage());
        }
    }

    @Override
    public Consumator findById(Integer ID) throws CrudFormException {
        try {
            Query query = em.createQuery("SELECT c FROM Consumator c WHERE c.consumatorId = :id");
            query.setParameter(":id", ID);
            return (Consumator)query.getSingleResult();
        } catch (Exception e) {
            throw new CrudFormException("Msg\n "+e.getMessage());
        }
    }
    
}
