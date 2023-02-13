/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIMODEL;

import BLL.Borrowedbook;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author CyberTech
 */
public class BorrowedbookTableModel extends AbstractTableModel {
    List<Borrowedbook> list;
    String [] columns = {"Book Name","Consumator","Date of Receipt","Date of Return","Days left"};
    SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
    
    public BorrowedbookTableModel(){}
    
    public BorrowedbookTableModel(List<Borrowedbook> list){
        this.list = list;
    }
    
    public void addList(List<Borrowedbook> list){
        this.list = list;
    }
    
    public Borrowedbook getBorrowedBook(int index){
        return list.get(index);
    }
    
    public int subtractDates(Date dateReceipts,Date dateReturns){
        long milliseconds =  dateReturns.getTime() - dateReceipts.getTime();
        int days = (int) (milliseconds / (1000*60*60*24));
        return days;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    @Override
    public String getColumnName(int col){
        return columns[col];
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Borrowedbook bb = list.get(rowIndex);
        switch(columnIndex){
            case 0:
                return bb.getBookId();
            case 1:
                return bb.getConsumatorId();
            case 2: 
                return formater.format(bb.getDateOfReceipt());
            case 3:
                return formater.format(bb.getDateofReturn());
            case 4:
                return subtractDates(bb.getDateOfReceipt(),bb.getDateofReturn());
            default:
                return null;
        }
    }
    
}
