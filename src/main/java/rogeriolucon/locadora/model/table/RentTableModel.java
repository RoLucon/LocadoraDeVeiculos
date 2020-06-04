/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.model.table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import rogeriolucon.locadora.model.RentOperation;
import rogeriolucon.locadora.model.Vehicle;

/**
 *
 * @author rolucon
 */
public class RentTableModel extends AbstractTableModel {
    ArrayList<RentOperation> list = new ArrayList<>();
    
    String[] column = {"ID", "Categoria", "Marca", "Modelo", "Km", "Preço", "Inicio","Termino"};
    
    @Override
    public String getColumnName(int column) {
        return this.column[column];
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return column.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return list.get(rowIndex).getId();
            case 1:
                return list.get(rowIndex).getVehicle().getCategory();
            case 2:
                return list.get(rowIndex).getVehicle().getBrand();
            case 3:
                return list.get(rowIndex).getVehicle().getModel();
            case 4:
                return list.get(rowIndex).getKm();
            case 5:
                return list.get(rowIndex).getValue();
            case 6:
                return list.get(rowIndex).getDate();
            case 7:
                return list.get(rowIndex).getWaxedDate();
        }
        return null;
    }
    
    public void update(){
        fireTableDataChanged();
    }
    
    public void setList(ArrayList<RentOperation> list) {
        this.list = list;
        update();
    }
    
    public RentOperation getAtIndex(int index){
        return list.get(index);
    }
    
    public void addVehicle(RentOperation vehicle) {
        list.add(vehicle);
        update();
    }
}
