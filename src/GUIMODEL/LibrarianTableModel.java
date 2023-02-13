/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIMODEL;

import BLL.Userlibrary;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author CyberTech
 */
public class LibrarianTableModel extends AbstractTableModel {
    List<Userlibrary> lists;
    String [] columns = {"First Name","Last Name","UserName","Password","Date Created"};
    SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
    
    
    public LibrarianTableModel(){}
    
    public LibrarianTableModel(List<Userlibrary> list){
        List<Userlibrary> listSortedRole = new ArrayList<Userlibrary>();
        Iterator it = list.iterator();
        while(it.hasNext()){
            Userlibrary ul = (Userlibrary)it.next();
            if (ul.getRoliId().getRoliId() == 2) {
                listSortedRole.add(ul);
            }
        }
       this.lists = listSortedRole;
    }
    
    public void addListLibrarian(List<Userlibrary> list){
        List<Userlibrary> listSortedRole = new ArrayList<Userlibrary>();
        Iterator it = list.iterator();
        while(it.hasNext()){
            Userlibrary ul = (Userlibrary)it.next();
            if (ul.getRoliId().getRoliId() == 2) {
                listSortedRole.add(ul);
            }
        }
       this.lists = listSortedRole;
    }
    
    @Override
    public String getColumnName(int col){
        return columns[col];
    }
    
    public void remove(int row){
        lists.remove(row);
    }
    
    public Userlibrary getUserlibrary(int index){
        return lists.get(index);
    }

    @Override
    public int getRowCount() {
        return lists.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Userlibrary u = lists.get(rowIndex);
        switch(columnIndex){
            case 0:
                return u.getFirstName();
            case 1:
                return u.getLastName();
            case 2:
                return u.getUsername();
            case 3:
                return u.getPasword();
            case 4:
                return formater.format(u.getUserCreated());
            default: 
                    return null;
        }
        
    }
    
}
