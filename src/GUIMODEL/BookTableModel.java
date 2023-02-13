/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIMODEL;

import BLL.Book;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author CyberTech
 */
public class BookTableModel extends AbstractTableModel{
    List<Book> lists;
    String [] columns = {"ISBN","Book Name","Autor","Publication","Language","Pages"};
    SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
    
    public BookTableModel(){}
    
    public BookTableModel(List<Book> lists){
        this.lists = lists;
    }
    
    public void addListBook(List<Book> lists){
        this.lists = lists;
    }
    
    @Override
    public String getColumnName(int col){
        return columns[col];
    }

    @Override
    public int getRowCount() {
        return lists.size();
    }
    
    public void remove(int row){
        lists.remove(row);
    }
    
    public Book getBook(int index){
        return lists.get(index);
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Book b = lists.get(rowIndex);
        switch(columnIndex){
            case 0:
                return b.getIsbn();
            case 1:
                return b.getBookName();
            case 2:
                return b.getAutor();
            case 3:
                return formater.format(b.getPublicationDate());
            case 4:
                return b.getLanguageWriten();
            case 5:
                return b.getPageLength();
            default:
                return null;
        }
    }
    
    
}
