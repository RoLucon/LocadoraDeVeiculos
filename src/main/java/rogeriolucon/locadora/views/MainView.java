/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.views;

import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import rogeriolucon.locadora.model.Vehicle;
import rogeriolucon.locadora.service.VehicleService;

/**
 *
 * @author rolucon
 */
public class MainView extends javax.swing.JFrame {
    private VehicleService vehicleService = new VehicleService();
    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
        setupComponents(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parent = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bttPDVPanel = new javax.swing.JPanel();
        selected01 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bttVehicleRegistrationPanel = new javax.swing.JPanel();
        selected2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        bttReportPanel = new javax.swing.JPanel();
        selected3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanelRegister = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        registerComboBoxCategory = new javax.swing.JComboBox<>();
        registerComboBoxBrand = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        registerComboBoxModel = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        registerTextFieldPlates = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        registerTextFieldKm = new javax.swing.JTextField();
        registerComboBoxTank = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        registerButtonSave = new javax.swing.JButton();
        registerButtonCancel = new javax.swing.JButton();
        buttonConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 800));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(680, 500));

        sidePanel.setBackground(new java.awt.Color(51, 153, 255));
        sidePanel.setMaximumSize(new java.awt.Dimension(280, 32767));
        sidePanel.setMinimumSize(new java.awt.Dimension(280, 300));

        jLabel1.setFont(new java.awt.Font(".SF NS Text", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TADS");

        jLabel3.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Venda e Locaçao de Veiculos");

        bttPDVPanel.setMaximumSize(new java.awt.Dimension(32767, 64));

        selected01.setBackground(new java.awt.Color(0, 0, 0));
        selected01.setMaximumSize(new java.awt.Dimension(8, 64));
        selected01.setMinimumSize(new java.awt.Dimension(8, 64));

        javax.swing.GroupLayout selected01Layout = new javax.swing.GroupLayout(selected01);
        selected01.setLayout(selected01Layout);
        selected01Layout.setHorizontalGroup(
            selected01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        selected01Layout.setVerticalGroup(
            selected01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ponto de Venda");

        javax.swing.GroupLayout bttPDVPanelLayout = new javax.swing.GroupLayout(bttPDVPanel);
        bttPDVPanel.setLayout(bttPDVPanelLayout);
        bttPDVPanelLayout.setHorizontalGroup(
            bttPDVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bttPDVPanelLayout.createSequentialGroup()
                .addComponent(selected01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bttPDVPanelLayout.setVerticalGroup(
            bttPDVPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selected01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bttPDVPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bttVehicleRegistrationPanel.setMaximumSize(new java.awt.Dimension(32767, 64));

        selected2.setBackground(new java.awt.Color(0, 0, 0));
        selected2.setMaximumSize(new java.awt.Dimension(8, 64));
        selected2.setMinimumSize(new java.awt.Dimension(8, 64));

        javax.swing.GroupLayout selected2Layout = new javax.swing.GroupLayout(selected2);
        selected2.setLayout(selected2Layout);
        selected2Layout.setHorizontalGroup(
            selected2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        selected2Layout.setVerticalGroup(
            selected2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel4.setText("Cadastrar Veiculo");

        javax.swing.GroupLayout bttVehicleRegistrationPanelLayout = new javax.swing.GroupLayout(bttVehicleRegistrationPanel);
        bttVehicleRegistrationPanel.setLayout(bttVehicleRegistrationPanelLayout);
        bttVehicleRegistrationPanelLayout.setHorizontalGroup(
            bttVehicleRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bttVehicleRegistrationPanelLayout.createSequentialGroup()
                .addComponent(selected2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bttVehicleRegistrationPanelLayout.setVerticalGroup(
            bttVehicleRegistrationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selected2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bttVehicleRegistrationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bttReportPanel.setMaximumSize(new java.awt.Dimension(32767, 64));

        selected3.setBackground(new java.awt.Color(0, 0, 0));
        selected3.setMaximumSize(new java.awt.Dimension(8, 64));
        selected3.setMinimumSize(new java.awt.Dimension(8, 64));

        javax.swing.GroupLayout selected3Layout = new javax.swing.GroupLayout(selected3);
        selected3.setLayout(selected3Layout);
        selected3Layout.setHorizontalGroup(
            selected3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        selected3Layout.setVerticalGroup(
            selected3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel5.setText("Relatorio de Operações");

        javax.swing.GroupLayout bttReportPanelLayout = new javax.swing.GroupLayout(bttReportPanel);
        bttReportPanel.setLayout(bttReportPanelLayout);
        bttReportPanelLayout.setHorizontalGroup(
            bttReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bttReportPanelLayout.createSequentialGroup()
                .addComponent(selected3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bttReportPanelLayout.setVerticalGroup(
            bttReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bttReportPanelLayout.createSequentialGroup()
                .addComponent(selected3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bttReportPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font(".SF NS Text", 2, 10)); // NOI18N
        jLabel7.setText("By Rogerio Lucon");

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(bttPDVPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bttVehicleRegistrationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bttReportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(bttPDVPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bttVehicleRegistrationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bttReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelRegister.setBackground(new java.awt.Color(218, 230, 242));

        jLabel6.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        jLabel6.setText("TADS | Gestao de Veiculos");

        jLabel8.setFont(new java.awt.Font(".SF NS Text", 0, 22)); // NOI18N
        jLabel8.setText("Cadastrar Veiculo");

        jLabel9.setText("Categoria:");

        jLabel10.setText("Marca:");

        registerComboBoxCategory.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        registerComboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        registerComboBoxCategory.setMinimumSize(new java.awt.Dimension(100, 23));
        registerComboBoxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerComboBoxCategoryActionPerformed(evt);
            }
        });

        registerComboBoxBrand.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        registerComboBoxBrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Modelo:");

        registerComboBoxModel.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        registerComboBoxModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setText("Placa:");

        registerTextFieldPlates.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        registerTextFieldPlates.setText("xxx-####");
        registerTextFieldPlates.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                registerTextFieldPlatesFocusGained(evt);
            }
        });

        jLabel13.setText("Kilometrgem:");

        registerTextFieldKm.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        registerTextFieldKm.setText("0KM");
        registerTextFieldKm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                registerTextFieldKmFocusGained(evt);
            }
        });
        registerTextFieldKm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                registerTextFieldKmKeyTyped(evt);
            }
        });

        registerComboBoxTank.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        registerComboBoxTank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setText("Tanque:");

        registerButtonSave.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        registerButtonSave.setText("Salvar");
        registerButtonSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonSaveActionPerformed(evt);
            }
        });

        registerButtonCancel.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        registerButtonCancel.setText("Cancelar");
        registerButtonCancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerButtonCancelMouseClicked(evt);
            }
        });
        registerButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonCancelActionPerformed(evt);
            }
        });

        buttonConsultar.setFont(new java.awt.Font(".SF NS Text", 0, 14)); // NOI18N
        buttonConsultar.setText("Consultar Veiculos");
        buttonConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegisterLayout = new javax.swing.GroupLayout(jPanelRegister);
        jPanelRegister.setLayout(jPanelRegisterLayout);
        jPanelRegisterLayout.setHorizontalGroup(
            jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(buttonConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addGap(115, 115, 115))
            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegisterLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelRegisterLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegisterLayout.createSequentialGroup()
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(registerComboBoxModel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelRegisterLayout.createSequentialGroup()
                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(registerComboBoxCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registerComboBoxBrand, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10)))
                            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(126, 126, 126))
                            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                .addComponent(registerButtonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(68, 68, 68)
                                .addComponent(registerButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(registerTextFieldPlates))
                                .addGap(25, 25, 25)
                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registerTextFieldKm)
                                    .addComponent(jLabel13))
                                .addGap(25, 25, 25)
                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(registerComboBoxTank, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(32, 32, 32))))
        );
        jPanelRegisterLayout.setVerticalGroup(
            jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel8)
                .addGap(32, 32, 32)
                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerComboBoxBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerComboBoxModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerTextFieldPlates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerTextFieldKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerComboBoxTank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButtonSave)
                    .addComponent(registerButtonCancel))
                .addGap(32, 32, 32)
                .addComponent(buttonConsultar)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout parentLayout = new javax.swing.GroupLayout(parent);
        parent.setLayout(parentLayout);
        parentLayout.setHorizontalGroup(
            parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parentLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        parentLayout.setVerticalGroup(
            parentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerComboBoxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerComboBoxCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerComboBoxCategoryActionPerformed

    private void registerButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonSaveActionPerformed
        String error = "";
        
        if(String.valueOf(registerComboBoxModel.getSelectedItem()).contains("<")){
            error = "- Modelo deve ser selecionado\n";
        }
        if(String.valueOf(registerComboBoxCategory.getSelectedItem()).contains("<")){
            error += "- Categoria deve ser selecionada\n";
        }
        if(String.valueOf(registerComboBoxBrand.getSelectedItem()).contains("<")){
            error += "- Marca deve ser selecionada\n";
        }
        if(registerTextFieldKm.getText().trim().isEmpty() ){
            error += "- Valor de Kilometragem invalido\n";
        }
//                && registerTextFieldKm.getText().trim().isEmpty()
        if(!error.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, error);
            return;
        }
        Vehicle vehicle = new Vehicle();
        vehicle.setModel(String.valueOf(registerComboBoxModel.getSelectedItem()));
        vehicle.setCategory((Vehicle.Category)registerComboBoxCategory.getSelectedItem());
        vehicle.setBrand((Vehicle.Brand)(registerComboBoxBrand.getSelectedItem()));
        vehicle.setKm(Integer.parseInt(registerTextFieldKm.getText()));
//        vehicle.setPrice(Integer.parseInt(registerTextField.getText()));
        if(vehicleService.addVehicle(vehicle)){
            JOptionPane.showMessageDialog(this, "Adicionado com sucesso");
            registerClear();
        } else {
            JOptionPane.showMessageDialog(this, "Falha ao adicionar");
        }
        
    }//GEN-LAST:event_registerButtonSaveActionPerformed

    private void registerButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonCancelActionPerformed
        registerClear();
    }//GEN-LAST:event_registerButtonCancelActionPerformed

    private void buttonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConsultarActionPerformed
        //Abre a view com a tabela de veiculos
        BuscaVeiculoView view = new BuscaVeiculoView();
        view.setVisible(true);
        view.setList(vehicleService.list);
    }//GEN-LAST:event_buttonConsultarActionPerformed

    private void registerTextFieldKmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registerTextFieldKmKeyTyped
        char c = evt.getKeyChar();
        if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_registerTextFieldKmKeyTyped

    private void registerTextFieldKmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registerTextFieldKmFocusGained
        if(registerTextFieldKm.getText().equalsIgnoreCase("0Km")){
            registerTextFieldKm.setText("");
        }
    }//GEN-LAST:event_registerTextFieldKmFocusGained

    private void registerButtonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerButtonCancelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_registerButtonCancelMouseClicked

    private void registerTextFieldPlatesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registerTextFieldPlatesFocusGained
        if(registerTextFieldPlates.getText().equalsIgnoreCase("xxx-####")){
            registerTextFieldPlates.setText("");
        }
    }//GEN-LAST:event_registerTextFieldPlatesFocusGained
    
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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bttPDVPanel;
    private javax.swing.JPanel bttReportPanel;
    private javax.swing.JPanel bttVehicleRegistrationPanel;
    private javax.swing.JButton buttonConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelRegister;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel parent;
    private javax.swing.JButton registerButtonCancel;
    private javax.swing.JButton registerButtonSave;
    private javax.swing.JComboBox<String> registerComboBoxBrand;
    private javax.swing.JComboBox<String> registerComboBoxCategory;
    private javax.swing.JComboBox<String> registerComboBoxModel;
    private javax.swing.JComboBox<String> registerComboBoxTank;
    private javax.swing.JTextField registerTextFieldKm;
    private javax.swing.JTextField registerTextFieldPlates;
    private javax.swing.JPanel selected01;
    private javax.swing.JPanel selected2;
    private javax.swing.JPanel selected3;
    private javax.swing.JPanel sidePanel;
    // End of variables declaration//GEN-END:variables

    private void setupComponents() {
        setupComponentsRegister();
    }
    
    private void setupComponentsRegister(){
        registerComboBoxBrand.setModel(new DefaultComboBoxModel(Vehicle.Brand.values()));
        registerComboBoxBrand.addItem("<Marca>");
        registerComboBoxBrand.setSelectedItem("<Marca>");
        
        registerComboBoxCategory.setModel(new DefaultComboBoxModel(Vehicle.Category.values()));
        registerComboBoxCategory.addItem("<Categoria>");
        registerComboBoxCategory.setSelectedItem("<Categoria>");
        
        registerComboBoxTank.setModel(new DefaultComboBoxModel(Vehicle.Tank.values()));
        registerComboBoxTank.addItem("<Tank>");
        registerComboBoxTank.setSelectedItem("<Tank>");
    }
    
    private void registerClear() {
        registerComboBoxBrand.setSelectedItem("<Marca>");
        registerComboBoxCategory.setSelectedItem("<Categoria>");
        registerComboBoxTank.setSelectedItem("<Tank>");
        registerTextFieldKm.setText("0Km");
        registerTextFieldPlates.setText("xxx-####");
    }
}
