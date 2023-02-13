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
@Table(name = "book")
@NamedQueries({
    @NamedQuery(name = "Book.findAll", query = "SELECT b FROM Book b"),
    @NamedQuery(name = "Book.findByBookId", query = "SELECT b FROM Book b WHERE b.bookId = :bookId"),
    @NamedQuery(name = "Book.findByBookName", query = "SELECT b FROM Book b WHERE b.bookName = :bookName"),
    @NamedQuery(name = "Book.findByAutor", query = "SELECT b FROM Book b WHERE b.autor = :autor"),
    @NamedQuery(name = "Book.findByPublicationDate", query = "SELECT b FROM Book b WHERE b.publicationDate = :publicationDate"),
    @NamedQuery(name = "Book.findByLanguageWriten", query = "SELECT b FROM Book b WHERE b.languageWriten = :languageWriten"),
    @NamedQuery(name = "Book.findByPageLength", query = "SELECT b FROM Book b WHERE b.pageLength = :pageLength"),
    @NamedQuery(name = "Book.findByIsbn", query = "SELECT b FROM Book b WHERE b.isbn = :isbn")})
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bookId")
    private Integer bookId;
    @Column(name = "bookName")
    private String bookName;
    @Column(name = "autor")
    private String autor;
    @Column(name = "publicationDate")
    @Temporal(TemporalType.DATE)
    private Date publicationDate;
    @Column(name = "LanguageWriten")
    private String languageWriten;
    @Column(name = "pageLength")
    private Integer pageLength;
    @Column(name = "isbn")
    private Integer isbn;
    @OneToMany(mappedBy = "bookId")
    private Collection<Borrowedbook> borrowedbookCollection;

    public Book() {
    }

    public Book(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getLanguageWriten() {
        return languageWriten;
    }

    public void setLanguageWriten(String languageWriten) {
        this.languageWriten = languageWriten;
    }

    public Integer getPageLength() {
        return pageLength;
    }

    public void setPageLength(Integer pageLength) {
        this.pageLength = pageLength;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
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
        hash += (bookId != null ? bookId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Book)) {
            return false;
        }
        Book other = (Book) object;
        if ((this.bookId == null && other.bookId != null) || (this.bookId != null && !this.bookId.equals(other.bookId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return isbn+":"+bookName;
    }
    
}
