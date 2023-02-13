/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "userlibrary")
@NamedQueries({
    @NamedQuery(name = "Userlibrary.findAll", query = "SELECT u FROM Userlibrary u"),
    @NamedQuery(name = "Userlibrary.findByUserLibraryId", query = "SELECT u FROM Userlibrary u WHERE u.userLibraryId = :userLibraryId"),
    @NamedQuery(name = "Userlibrary.findByFirstName", query = "SELECT u FROM Userlibrary u WHERE u.firstName = :firstName"),
    @NamedQuery(name = "Userlibrary.findByLastName", query = "SELECT u FROM Userlibrary u WHERE u.lastName = :lastName"),
    @NamedQuery(name = "Userlibrary.findByUsername", query = "SELECT u FROM Userlibrary u WHERE u.username = :username"),
    @NamedQuery(name = "Userlibrary.findByPasword", query = "SELECT u FROM Userlibrary u WHERE u.pasword = :pasword"),
    @NamedQuery(name = "Userlibrary.findByUserCreated", query = "SELECT u FROM Userlibrary u WHERE u.userCreated = :userCreated")})
public class Userlibrary implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userLibraryId")
    private Integer userLibraryId;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "username")
    private String username;
    @Column(name = "pasword")
    private String pasword;
    @Column(name = "userCreated")
    @Temporal(TemporalType.DATE)
    private Date userCreated;
    @JoinColumn(name = "roliId", referencedColumnName = "roliId")
    @ManyToOne
    private Roli roliId;

    public Userlibrary() {
    }

    public Userlibrary(Integer userLibraryId) {
        this.userLibraryId = userLibraryId;
    }

    public Integer getUserLibraryId() {
        return userLibraryId;
    }

    public void setUserLibraryId(Integer userLibraryId) {
        this.userLibraryId = userLibraryId;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public Date getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(Date userCreated) {
        this.userCreated = userCreated;
    }

    public Roli getRoliId() {
        return roliId;
    }

    public void setRoliId(Roli roliId) {
        this.roliId = roliId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userLibraryId != null ? userLibraryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Userlibrary)) {
            return false;
        }
        Userlibrary other = (Userlibrary) object;
        if ((this.userLibraryId == null && other.userLibraryId != null) || (this.userLibraryId != null && !this.userLibraryId.equals(other.userLibraryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Userlibrary[ userLibraryId=" + userLibraryId + " ]";
    }
    
}
