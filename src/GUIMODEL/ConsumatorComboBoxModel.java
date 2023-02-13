/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUIMODEL;

import BLL.Consumator;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author CyberTech
 */
public class ConsumatorComboBoxModel extends AbstractListModel<Consumator> implements ComboBoxModel<Consumator>{
    private List<Consumator> data;
    private Consumator selectedItem;
    
    public ConsumatorComboBoxModel(){}
    
    public ConsumatorComboBoxModel(List<Consumator> data){
        this.data = data;
    }
    
    public void addList(List<Consumator> data){
        this.data = data;
    }

    @Override
    public int getSize() {
        return data.size();
    }

    @Override
    public Consumator getElementAt(int index) {
        return data.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        selectedItem = (Consumator)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
    
}
