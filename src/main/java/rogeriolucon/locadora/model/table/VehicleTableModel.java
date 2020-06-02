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
    ArrayList<Vehicle> lista = new ArrayList<Vehicle>();
    
    String[] colunas = {"ID", "Categoria", "Marca", "Modelo", "Km", "Preço"};
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return lista.get(rowIndex).getId();
            case 1:
                return lista.get(rowIndex).getType();
            case 2:
                return lista.get(rowIndex).getBrand();
            case 3:
                return lista.get(rowIndex).getModel();
            case 4:
                return lista.get(rowIndex).getKm();
            case 5:
                return lista.get(rowIndex).getPrice();
        }
        return null;
    }
    
    public void atualiza(){
        fireTableDataChanged();
    }
    
    public void setList(ArrayList<Vehicle> list) {
        this.lista = list;
        atualiza();
        System.out.println("Atualiza");
        System.out.println(list.size());
    }
}
