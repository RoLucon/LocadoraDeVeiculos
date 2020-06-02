/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.model.table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import rogeriolucon.locadora.model.Vehicle;

/**
 *
 * @author rolucon
 */
public class VehicleTableModel extends AbstractTableModel {
    ArrayList<Vehicle> list = new ArrayList<Vehicle>();
    
    String[] column = {"ID", "Categoria", "Marca", "Modelo", "Km", "Preço"};
    
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
                return list.get(rowIndex).getCategory();
            case 2:
                return list.get(rowIndex).getBrand();
            case 3:
                return list.get(rowIndex).getModel();
            case 4:
                return list.get(rowIndex).getKm();
            case 5:
                return list.get(rowIndex).getPrice();
        }
        return null;
    }
    
    public void update(){
        fireTableDataChanged();
    }
    
    public void setList(ArrayList<Vehicle> list) {
        this.list = list;
        update();
        System.out.println("Atualiza");
        System.out.println(list.size());
    }
    
    public void addVehicle(Vehicle vehicle) {
        list.add(vehicle);
        update();
    }
}
