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
@Table(name = "borrowedbook")
@NamedQueries({
    @NamedQuery(name = "Borrowedbook.findAll", query = "SELECT b FROM Borrowedbook b"),
    @NamedQuery(name = "Borrowedbook.findByBorrowedBookId", query = "SELECT b FROM Borrowedbook b WHERE b.borrowedBookId = :borrowedBookId"),
    @NamedQuery(name = "Borrowedbook.findByDateOfReceipt", query = "SELECT b FROM Borrowedbook b WHERE b.dateOfReceipt = :dateOfReceipt"),
    @NamedQuery(name = "Borrowedbook.findByDateofReturn", query = "SELECT b FROM Borrowedbook b WHERE b.dateofReturn = :dateofReturn")})
public class Borrowedbook implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "borrowedBookId")
    private Integer borrowedBookId;
    @Column(name = "dateOfReceipt")
    @Temporal(TemporalType.DATE)
    private Date dateOfReceipt;
    @Column(name = "dateofReturn")
    @Temporal(TemporalType.DATE)
    private Date dateofReturn;
    @JoinColumn(name = "bookId", referencedColumnName = "bookId")
    @ManyToOne
    private Book bookId;
    @JoinColumn(name = "consumatorId", referencedColumnName = "consumatorId")
    @ManyToOne
    private Consumator consumatorId;

    public Borrowedbook() {
    }

    public Borrowedbook(Integer borrowedBookId) {
        this.borrowedBookId = borrowedBookId;
    }

    public Integer getBorrowedBookId() {
        return borrowedBookId;
    }

    public void setBorrowedBookId(Integer borrowedBookId) {
        this.borrowedBookId = borrowedBookId;
    }

    public Date getDateOfReceipt() {
        return dateOfReceipt;
    }

    public void setDateOfReceipt(Date dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }

    public Date getDateofReturn() {
        return dateofReturn;
    }

    public void setDateofReturn(Date dateofReturn) {
        this.dateofReturn = dateofReturn;
    }

    public Book getBookId() {
        return bookId;
    }

    public void setBookId(Book bookId) {
        this.bookId = bookId;
    }

    public Consumator getConsumatorId() {
        return consumatorId;
    }

    public void setConsumatorId(Consumator consumatorId) {
        this.consumatorId = consumatorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (borrowedBookId != null ? borrowedBookId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Borrowedbook)) {
            return false;
        }
        Borrowedbook other = (Borrowedbook) object;
        if ((this.borrowedBookId == null && other.borrowedBookId != null) || (this.borrowedBookId != null && !this.borrowedBookId.equals(other.borrowedBookId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BLL.Borrowedbook[ borrowedBookId=" + borrowedBookId + " ]";
    }
    
}
