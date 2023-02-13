/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIMODEL;

import BLL.Consumator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author CyberTech
 */
public class ConsumatorTableModel extends AbstractTableModel{
    List<Consumator> lists;
    String [] columns = {"First Name","Last Name","Birthday","Adress","City","Telefon Number"};
    SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
    
    public ConsumatorTableModel(){}
    
    public ConsumatorTableModel(List<Consumator> lists){
        this.lists = lists;
    }
    
    public void addListConsumator(List<Consumator> lists){
        this.lists = lists;
    }
    
    public List<Consumator> searchByName(String text){
        ArrayList<Consumator> listSearch = new ArrayList<Consumator>();
        Iterator it = lists.iterator();
        while(it.hasNext()){
            Consumator c = (Consumator)it.next();
            String firstName = c.getFirstName().toLowerCase();
            if(firstName.equals(text.toLowerCase())){
                listSearch.add(c);
            }
        }
        
        return listSearch;
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
    
    public Consumator getConsumatori(int index){
        return lists.get(index);
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Consumator c = lists.get(rowIndex);
        switch(columnIndex){
            case 0:
                return c.getFirstName();
            case 1:
                return c.getLastName();
            case 2:
                return formater.format(c.getBirthday());
            case 3:
                return c.getAdress();
            case 4:
                return c.getCity();
            case 5:
                return c.getTelefonNumber();
            default:
                return null;
        }
    }
    
}
