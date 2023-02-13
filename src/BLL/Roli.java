/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "roli")
@NamedQueries({
    @NamedQuery(name = "Roli.findAll", query = "SELECT r FROM Roli r"),
    @NamedQuery(name = "Roli.findByRoliId", query = "SELECT r FROM Roli r WHERE r.roliId = :roliId"),
    @NamedQuery(name = "Roli.findByNameRoli", query = "SELECT r FROM Roli r WHERE r.nameRoli = :nameRoli")})
public class Roli implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "roliId")
    private Integer roliId;
    @Column(name = "nameRoli")
    private String nameRoli;
    @OneToMany(mappedBy = "roliId")
    private Collection<Userlibrary> userlibraryCollection;

    public Roli() {
    }

    public Roli(Integer roliId) {
        this.roliId = roliId;
    }

    public Integer getRoliId() {
        return roliId;
    }

    public void setRoliId(Integer roliId) {
        this.roliId = roliId;
    }

    public String getNameRoli() {
        return nameRoli;
    }

    public void setNameRoli(String nameRoli) {
        this.nameRoli = nameRoli;
    }

    public Collection<Userlibrary> getUserlibraryCollection() {
        return userlibraryCollection;
    }

    public void setUserlibraryCollection(Collection<Userlibrary> userlibraryCollection) {
        this.userlibraryCollection = userlibraryCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roliId != null ? roliId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roli)) {
            return false;
        }
        Roli other = (Roli) object;
        if ((this.roliId == null && other.roliId != null) || (this.roliId != null && !this.roliId.equals(other.roliId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Roli[ roliId=" + roliId + " ]";
    }
    
}
