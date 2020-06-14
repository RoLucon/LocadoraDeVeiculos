/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.views;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;
import rogeriolucon.locadora.SliderPopupListener;
import rogeriolucon.locadora.model.Vehicle;
import rogeriolucon.locadora.model.table.VehicleTableModel;

/**
 *
 * @author rolucon
 */
public class BuscaVeiculoView extends javax.swing.JFrame {
    private ArrayList<Vehicle> mainList;
    private VehicleTableModel tableModel;
    private static final String allBrands = "TODAS";
    private MainView parent;
    private boolean selectable = false;
    /**
     * Creates new form BuscaVeiculoView
     */
    public BuscaVeiculoView(ArrayList<Vehicle> vehicleList, MainView parent, boolean selectable) {
        this.parent = parent;
        this.mainList = vehicleList;
        this.selectable = selectable;
        initComponents();
        init();
//        sliderPrice.setMaximum(100); set max value
    }
 
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        comboBoxBrand = new javax.swing.JComboBox<>();
        comboBoxCategoty = new javax.swing.JComboBox<>();
        sliderPrice = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboBoxModel = new javax.swing.JComboBox<>();
        buttonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 250));
        setPreferredSize(new java.awt.Dimension(550, 600));

        jTable1.setModel(new VehicleTableModel());
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consulta de Veiculos ");

        comboBoxBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxBrand.setMinimumSize(new java.awt.Dimension(120, 22));
        comboBoxBrand.setPreferredSize(new java.awt.Dimension(120, 22));
        comboBoxBrand.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxBrandItemStateChanged(evt);
            }
        });

        comboBoxCategoty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxCategoty.setMinimumSize(new java.awt.Dimension(160, 22));
        comboBoxCategoty.setPreferredSize(new java.awt.Dimension(160, 22));
        comboBoxCategoty.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxCategotyItemStateChanged(evt);
            }
        });

        sliderPrice.setPreferredSize(new java.awt.Dimension(160, 11));
        sliderPrice.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderPriceStateChanged(evt);
            }
        });
        sliderPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sliderPriceMouseReleased(evt);
            }
        });

        jLabel2.setText("Marca:");

        jLabel3.setText("Categoria:");

        jLabel4.setText("Preço");

        jLabel5.setText("Modelo:");

        comboBoxModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBoxModel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxModelItemStateChanged(evt);
            }
        });

        buttonClear.setText("Limpar");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comboBoxBrand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(23, 23, 23))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(132, 132, 132)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(comboBoxCategoty, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(23, 23, 23))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(165, 165, 165))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(comboBoxModel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sliderPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(buttonClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboBoxBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBoxCategoty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sliderPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonClear))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxBrandItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxBrandItemStateChanged
        String brand = comboBoxBrand.getSelectedItem().toString();
        if (!brand.equalsIgnoreCase("Todas")){
            try {
                comboBoxModel.setModel( new DefaultComboBoxModel(parent.getService().getModelByBrandName(brand).toArray()));
                comboBoxModel.addItem("Selecione um modelo");
                comboBoxModel.setSelectedItem("Selecione um modelo");
            } catch (Exception ex) {
                comboBoxModel.setModel( new DefaultComboBoxModel());
            }
        } else{
            comboBoxModel.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma Marca"}));
            comboBoxModel.setSelectedItem("Selecione uma Marca");
        }
        filter();
    }//GEN-LAST:event_comboBoxBrandItemStateChanged

    private void sliderPriceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderPriceStateChanged
        
    }//GEN-LAST:event_sliderPriceStateChanged

    private void sliderPriceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sliderPriceMouseReleased
        filter();
    }//GEN-LAST:event_sliderPriceMouseReleased

    private void comboBoxCategotyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxCategotyItemStateChanged
        filter();
    }//GEN-LAST:event_comboBoxCategotyItemStateChanged

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        comboBoxBrand.setSelectedItem(allBrands);
        comboBoxCategoty.setSelectedItem(allBrands);
        sliderPrice.setValue(sliderPrice.getMaximum());
        filter();
    }//GEN-LAST:event_buttonClearActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void comboBoxModelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxModelItemStateChanged
        filter();
    }//GEN-LAST:event_comboBoxModelItemStateChanged
    
    private void setList(ArrayList<Vehicle> list){
        tableModel.setList(list);
    }
    
    private void filter(){
        ArrayList<Vehicle> list = new ArrayList<>();
        for (Vehicle vehicle : mainList) {
            if (vehicle.getBrand().equalsIgnoreCase(comboBoxBrand.getSelectedItem().toString()) 
                    || allBrands == comboBoxBrand.getSelectedItem()) {
                if(vehicle.getCategory() == comboBoxCategoty.getSelectedItem()
                        || allBrands == comboBoxCategoty.getSelectedItem()){
                    if(vehicle.getPrice() <= sliderPrice.getValue() * 1000 || sliderPrice.getValue() == 100) {
                        if(vehicle.getModel().equalsIgnoreCase(comboBoxModel.getSelectedItem().toString())
                                || comboBoxModel.getSelectedItem().toString().startsWith("Selecione")){
                            list.add(vehicle);
                        }
                    }
                }
            }
        }
        setList(list);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscaVeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaVeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaVeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaVeiculoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscaVeiculoView(null, null, false).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JComboBox<String> comboBoxBrand;
    private javax.swing.JComboBox<String> comboBoxCategoty;
    private javax.swing.JComboBox<String> comboBoxModel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JSlider sliderPrice;
    // End of variables declaration//GEN-END:variables
    private void init(){
        this.tableModel = (VehicleTableModel) jTable1.getModel();
        this.tableModel.setList(mainList);
        //Erro quando abre pela consulta;

        comboBoxBrand.setModel(new DefaultComboBoxModel(parent.getService().getBrandNames().toArray()));
        comboBoxBrand.addItem(allBrands);
        comboBoxBrand.setSelectedItem(allBrands);
        
        comboBoxModel.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma Marca"}));
        comboBoxModel.setSelectedItem("Selecione uma Marca");
        
        comboBoxCategoty.setModel(new DefaultComboBoxModel(Vehicle.Category.values()));
        comboBoxCategoty.addItem(allBrands);
        comboBoxCategoty.setSelectedItem(allBrands);
 
       
        
        MouseAdapter ma = new SliderPopupListener();
        sliderPrice.addMouseMotionListener(ma);
        sliderPrice.addMouseListener(ma);
        sliderPrice.setMajorTickSpacing(10);
        sliderPrice.setMinorTickSpacing(5);
        sliderPrice.setPaintTicks(true);
        sliderPrice.setValue(sliderPrice.getMaximum());
        
        jTable1.setAutoCreateRowSorter(true);

        Comparator c1 = new java.util.Comparator<Double>() {

            public int compare(Double p, Double s) {
                return p-s < 0 ? -1 : 1;
            }
        }; 
        TableRowSorter rowSorter = new TableRowSorter();
        jTable1.setRowSorter(rowSorter);
        rowSorter.setModel(jTable1.getModel());
        rowSorter.setComparator(6, c1);
        rowSorter.setComparator(5, c1);
        
        jTable1.addMouseListener(new MouseAdapter() {
         public void mouseClicked(MouseEvent me) {
            if (me.getClickCount() == 2) {
                if(selectable){
                    AbstractTableModel model = (AbstractTableModel) jTable1.getModel();
                    int index = jTable1.getSelectedRow();
                    Vehicle vehicle = tableModel.getAtIndex(index);
                    parent.setSelectedVehicle(vehicle);
                    
                }
                dispose();
            }
         }
      });
    }
}
