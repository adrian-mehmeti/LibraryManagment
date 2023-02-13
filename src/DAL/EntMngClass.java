/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author CyberTech
 */
public abstract class EntMngClass {
    EntityManager em = Persistence.createEntityManagerFactory("LibrayManagmentSystemPU").createEntityManager();
}
