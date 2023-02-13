/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIMODEL;

import BLL.Book;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author CyberTech
 */
public class BookComboBoxModel extends AbstractListModel<Book> implements ComboBoxModel<Book>{
    
    private List<Book> data;
    private Book selectedItem;
    
    public BookComboBoxModel(){}
    
    public BookComboBoxModel(List<Book> data){
        this.data = data;
    }
    
    public void addList(List<Book> data){
        this.data = data;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Book getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Book)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
    
}
