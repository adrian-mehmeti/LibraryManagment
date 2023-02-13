/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "consumator")
@NamedQueries({
    @NamedQuery(name = "Consumator.findAll", query = "SELECT c FROM Consumator c"),
    @NamedQuery(name = "Consumator.findByConsumatorId", query = "SELECT c FROM Consumator c WHERE c.consumatorId = :consumatorId"),
    @NamedQuery(name = "Consumator.findByFirstName", query = "SELECT c FROM Consumator c WHERE c.firstName = :firstName"),
    @NamedQuery(name = "Consumator.findByLastName", query = "SELECT c FROM Consumator c WHERE c.lastName = :lastName"),
    @NamedQuery(name = "Consumator.findByBirthday", query = "SELECT c FROM Consumator c WHERE c.birthday = :birthday"),
    @NamedQuery(name = "Consumator.findByAdress", query = "SELECT c FROM Consumator c WHERE c.adress = :adress"),
    @NamedQuery(name = "Consumator.findByCity", query = "SELECT c FROM Consumator c WHERE c.city = :city"),
    @NamedQuery(name = "Consumator.findByTelefonNumber", query = "SELECT c FROM Consumator c WHERE c.telefonNumber = :telefonNumber")})
public class Consumator implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "consumatorId")
    private Integer consumatorId;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "birthday")
    @Temporal(TemporalType.DATE)
    private Date birthday;
    @Column(name = "adress")
    private String adress;
    @Column(name = "city")
    private String city;
    @Column(name = "telefonNumber")
    private String telefonNumber;
    @OneToMany(mappedBy = "consumatorId")
    private Collection<Borrowedbook> borrowedbookCollection;

    public Consumator() {
    }

    public Consumator(Integer consumatorId) {
        this.consumatorId = consumatorId;
    }

    public Integer getConsumatorId() {
        return consumatorId;
    }

    public void setConsumatorId(Integer consumatorId) {
        this.consumatorId = consumatorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelefonNumber() {
        return telefonNumber;
    }

    public void setTelefonNumber(String telefonNumber) {
        this.telefonNumber = telefonNumber;
    }

    public Collection<Borrowedbook> getBorrowedbookCollection() {
        return borrowedbookCollection;
    }

    public void setBorrowedbookCollection(Collection<Borrowedbook> borrowedbookCollection) {
        this.borrowedbookCollection = borrowedbookCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (consumatorId != null ? consumatorId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consumator)) {
            return false;
        }
        Consumator other = (Consumator) object;
        if ((this.consumatorId == null && other.consumatorId != null) || (this.consumatorId != null && !this.consumatorId.equals(other.consumatorId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return firstName+" : "+lastName;
    }
    
}
