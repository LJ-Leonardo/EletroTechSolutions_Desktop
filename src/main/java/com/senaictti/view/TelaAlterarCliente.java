package com.senaictti.view;

import com.formdev.flatlaf.FlatLightLaf;
import com.senaictti.controller.ClienteController;
import com.senaictti.model.Cliente;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaAlterarCliente extends javax.swing.JFrame {

    ClienteController cc = new ClienteController();
    protected Integer idcliente;
    
    public TelaAlterarCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nomeCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        municipioCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bairroCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        enderecoCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        emailCliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        estadoCliente = new javax.swing.JComboBox<>();
        planoCliente = new javax.swing.JComboBox<>();
        celularCliente = new javax.swing.JFormattedTextField();
        cepCliente = new javax.swing.JFormattedTextField();
        cpfCliente = new javax.swing.JFormattedTextField();
        senha1Cliente = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        numeroCasaCliente = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        complementoCliente = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ALTERAR CLIENTE");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALTERAR CLIENTE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 660, 38));

        nomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nomeCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeClienteFocusLost(evt);
            }
        });
        nomeCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nomeClienteMouseClicked(evt);
            }
        });
        nomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeClienteActionPerformed(evt);
            }
        });
        nomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomeClienteKeyTyped(evt);
            }
        });
        getContentPane().add(nomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 300, 34));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nome do Cliente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("CPF:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 34, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("CEP:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Estado:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        municipioCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        municipioCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                municipioClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                municipioClienteFocusLost(evt);
            }
        });
        municipioCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                municipioClienteMouseClicked(evt);
            }
        });
        municipioCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                municipioClienteKeyTyped(evt);
            }
        });
        getContentPane().add(municipioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 110, 34));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Município:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Bairro:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        bairroCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bairroCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bairroClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bairroClienteFocusLost(evt);
            }
        });
        bairroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bairroClienteMouseClicked(evt);
            }
        });
        bairroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroClienteActionPerformed(evt);
            }
        });
        bairroCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bairroClienteKeyTyped(evt);
            }
        });
        getContentPane().add(bairroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 240, 34));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Celular:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ALTERAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 610, 180, 40));

        jButton2.setText("LIMPAR CAMPOS");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 660, -1, 30));

        enderecoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        enderecoCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enderecoClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enderecoClienteFocusLost(evt);
            }
        });
        enderecoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enderecoClienteMouseClicked(evt);
            }
        });
        enderecoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoClienteActionPerformed(evt);
            }
        });
        enderecoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                enderecoClienteKeyTyped(evt);
            }
        });
        getContentPane().add(enderecoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 380, 34));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Endereço:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("E-mail:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        emailCliente.setEditable(false);
        emailCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailClienteMouseClicked(evt);
            }
        });
        emailCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailClienteActionPerformed(evt);
            }
        });
        emailCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailClienteKeyTyped(evt);
            }
        });
        getContentPane().add(emailCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 300, 34));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Senha:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("PLANO ESCOLHIDO PELO CLIENTE");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 660, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Selecione o plano:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 520, 130, -1));

        estadoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        estadoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- selecione --", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RS", "SC", "SE", "SP", "TO" }));
        estadoCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                estadoClienteItemStateChanged(evt);
            }
        });
        estadoCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                estadoClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                estadoClienteFocusLost(evt);
            }
        });
        estadoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estadoClienteMouseClicked(evt);
            }
        });
        estadoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                estadoClienteKeyTyped(evt);
            }
        });
        getContentPane().add(estadoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, 33));

        planoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        planoCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<< Selecione >>", "NENHUM", "BRONZE MENSAL", "SILVER SEMESTRAL", "GOLD ANUAL", " " }));
        planoCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                planoClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                planoClienteFocusLost(evt);
            }
        });
        planoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                planoClienteMouseClicked(evt);
            }
        });
        planoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(planoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, 163, 33));

        try {
            celularCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        celularCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        celularCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                celularClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                celularClienteFocusLost(evt);
            }
        });
        celularCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                celularClienteMouseClicked(evt);
            }
        });
        celularCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                celularClienteKeyTyped(evt);
            }
        });
        getContentPane().add(celularCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 300, 34));

        try {
            cepCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cepCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cepCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cepClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cepClienteFocusLost(evt);
            }
        });
        cepCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cepClienteMouseClicked(evt);
            }
        });
        cepCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cepClienteKeyTyped(evt);
            }
        });
        getContentPane().add(cepCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 100, 34));

        cpfCliente.setEditable(false);
        try {
            cpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpfCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cpfCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpfClienteMouseClicked(evt);
            }
        });
        cpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfClienteActionPerformed(evt);
            }
        });
        cpfCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpfClienteKeyTyped(evt);
            }
        });
        getContentPane().add(cpfCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 300, 34));

        senha1Cliente.setEditable(false);
        senha1Cliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        senha1Cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                senha1ClienteMouseClicked(evt);
            }
        });
        senha1Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senha1ClienteActionPerformed(evt);
            }
        });
        senha1Cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                senha1ClienteKeyTyped(evt);
            }
        });
        getContentPane().add(senha1Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 246, 29));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("N°");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        numeroCasaCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numeroCasaCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                numeroCasaClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                numeroCasaClienteFocusLost(evt);
            }
        });
        numeroCasaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numeroCasaClienteMouseClicked(evt);
            }
        });
        numeroCasaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroCasaClienteActionPerformed(evt);
            }
        });
        numeroCasaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroCasaClienteKeyTyped(evt);
            }
        });
        getContentPane().add(numeroCasaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 110, 34));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("Complemento");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 34));

        complementoCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        complementoCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                complementoClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                complementoClienteFocusLost(evt);
            }
        });
        complementoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                complementoClienteMouseClicked(evt);
            }
        });
        complementoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoClienteActionPerformed(evt);
            }
        });
        complementoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                complementoClienteKeyTyped(evt);
            }
        });
        getContentPane().add(complementoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 100, 34));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Dados pessoais");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 140, 38));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Dados pessoais");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 140, 38));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/bgCadastro.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(676, 751));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try{
        
            String cpf = cpfCliente.getText();
            String estado = estadoCliente.getSelectedItem().toString();
            String plano = planoCliente.getSelectedItem().toString();
            Cliente cc1 = new Cliente();

            if(nomeCliente.getText().isEmpty()){
                nomeCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else if(cpfCliente.getText().isEmpty()){
                cpfCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else if(cpfCliente.getText().substring(13).equals(" ")){
                cpfCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else if(estadoCliente.getSelectedIndex() == 0){
                estadoCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else if(municipioCliente.getText().isEmpty()){
                municipioCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else if(cepCliente.getText().isEmpty()){
                cepCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else if(bairroCliente.getText().isEmpty()){
                bairroCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else if(enderecoCliente.getText().isEmpty()){
                enderecoCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else if(celularCliente.getText().isEmpty()){
                celularCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else if(celularCliente.getText().substring(14).equals(" ")){
                celularCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else if(emailCliente.getText().isEmpty()){
                emailCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else if(senha1Cliente.getText().isEmpty()){
                senha1Cliente.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else if(planoCliente.getSelectedIndex() == 0){
                planoCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else if(numeroCasaCliente.getText().isEmpty()) {
                numeroCasaCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else{
                if(plano.equals("NENHUM")){
                    plano = null;
                    Cliente c = new Cliente(null, nomeCliente.getText(), cpfCliente.getText(), emailCliente.getText(), senha1Cliente.getText(), celularCliente.getText(), enderecoCliente.getText(), cepCliente.getText(), bairroCliente.getText(), municipioCliente.getText(), estado, complementoCliente.getText(), numeroCasaCliente.getText(), 1, plano);
                    cc.alterarCliente(idcliente,c);
                    JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");
                    JOptionPane.showMessageDialog(null, "Atualize a tabela para que as alterações possam ser visualizadas.");
                    dispose();
                }
                else if(!cc.verificaCadastroFinanceiro(idcliente)){
                    planoCliente.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                    JOptionPane.showMessageDialog(null, "Esse cliente não possui cadastro financeiro. Não é possível alterar seu plano.");
                }
                else{
                    Cliente c = new Cliente(null, nomeCliente.getText(), cpfCliente.getText(), emailCliente.getText(), senha1Cliente.getText(), celularCliente.getText(), enderecoCliente.getText(), cepCliente.getText(), bairroCliente.getText(), municipioCliente.getText(), estado, complementoCliente.getText(), numeroCasaCliente.getText(), 1, plano);
                    cc.alterarCliente(idcliente,c);
                    JOptionPane.showMessageDialog(null, "Alterado com Sucesso!");
                    JOptionPane.showMessageDialog(null, "Atualize a tabela para que as alterações possam ser visualizadas.");
                    dispose();
                }
            }   
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao alterar esse Cliente! Preecha os campos corretamente e tente novamente.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        nomeCliente.setText("");
        estadoCliente.getModel().setSelectedItem("");
        municipioCliente.setText("");
        cepCliente.setText("");
        bairroCliente.setText("");
        enderecoCliente.setText("");
        celularCliente.setText("");
        complementoCliente.setText("");
        numeroCasaCliente.setText("");
        planoCliente.getModel().setSelectedItem("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void nomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeClienteActionPerformed
     
    }//GEN-LAST:event_nomeClienteActionPerformed

    private void bairroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroClienteActionPerformed
    
    }//GEN-LAST:event_bairroClienteActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
  
    }//GEN-LAST:event_formWindowClosed

    private void enderecoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoClienteActionPerformed

    }//GEN-LAST:event_enderecoClienteActionPerformed

    private void emailClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailClienteActionPerformed
     
    }//GEN-LAST:event_emailClienteActionPerformed

    private void estadoClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_estadoClienteItemStateChanged

    }//GEN-LAST:event_estadoClienteItemStateChanged

    private void cpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfClienteActionPerformed
 
    }//GEN-LAST:event_cpfClienteActionPerformed

    private void nomeClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomeClienteMouseClicked
   
    }//GEN-LAST:event_nomeClienteMouseClicked

    private void nomeClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeClienteKeyTyped
       
    }//GEN-LAST:event_nomeClienteKeyTyped

    private void cpfClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpfClienteMouseClicked

    }//GEN-LAST:event_cpfClienteMouseClicked

    private void cpfClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfClienteKeyTyped
    
    }//GEN-LAST:event_cpfClienteKeyTyped

    private void estadoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estadoClienteMouseClicked

    }//GEN-LAST:event_estadoClienteMouseClicked

    private void estadoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estadoClienteKeyTyped

    }//GEN-LAST:event_estadoClienteKeyTyped

    private void municipioClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_municipioClienteKeyTyped
        
    }//GEN-LAST:event_municipioClienteKeyTyped

    private void municipioClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_municipioClienteMouseClicked

    }//GEN-LAST:event_municipioClienteMouseClicked

    private void cepClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cepClienteMouseClicked

    }//GEN-LAST:event_cepClienteMouseClicked

    private void cepClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cepClienteKeyTyped
 
    }//GEN-LAST:event_cepClienteKeyTyped

    private void bairroClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bairroClienteMouseClicked

    }//GEN-LAST:event_bairroClienteMouseClicked

    private void bairroClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bairroClienteKeyTyped
    
    }//GEN-LAST:event_bairroClienteKeyTyped

    private void enderecoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_enderecoClienteKeyTyped

    }//GEN-LAST:event_enderecoClienteKeyTyped

    private void enderecoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enderecoClienteMouseClicked
      
    }//GEN-LAST:event_enderecoClienteMouseClicked

    private void celularClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_celularClienteMouseClicked

    }//GEN-LAST:event_celularClienteMouseClicked

    private void celularClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_celularClienteKeyTyped
 
    }//GEN-LAST:event_celularClienteKeyTyped

    private void emailClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailClienteKeyTyped

    }//GEN-LAST:event_emailClienteKeyTyped

    private void emailClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailClienteMouseClicked

    }//GEN-LAST:event_emailClienteMouseClicked

    private void planoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planoClienteMouseClicked

    }//GEN-LAST:event_planoClienteMouseClicked

    private void numeroCasaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroCasaClienteActionPerformed
     
    }//GEN-LAST:event_numeroCasaClienteActionPerformed

    private void complementoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoClienteActionPerformed

    }//GEN-LAST:event_complementoClienteActionPerformed

    private void numeroCasaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numeroCasaClienteMouseClicked
   
    }//GEN-LAST:event_numeroCasaClienteMouseClicked

    private void numeroCasaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroCasaClienteKeyTyped
      
    }//GEN-LAST:event_numeroCasaClienteKeyTyped

    private void complementoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_complementoClienteMouseClicked

    }//GEN-LAST:event_complementoClienteMouseClicked

    private void complementoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_complementoClienteKeyTyped
    
    }//GEN-LAST:event_complementoClienteKeyTyped

    private void senha1ClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senha1ClienteKeyTyped
    
    }//GEN-LAST:event_senha1ClienteKeyTyped

    private void senha1ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senha1ClienteActionPerformed
  
    }//GEN-LAST:event_senha1ClienteActionPerformed

    private void senha1ClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_senha1ClienteMouseClicked
    
    }//GEN-LAST:event_senha1ClienteMouseClicked

    private void nomeClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeClienteFocusGained
        nomeCliente.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        nomeCliente.setBorder(BorderFactory.createCompoundBorder(nomeCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_nomeClienteFocusGained

    private void nomeClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeClienteFocusLost
        nomeCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        nomeCliente.setBorder(BorderFactory.createCompoundBorder(nomeCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_nomeClienteFocusLost

    private void celularClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_celularClienteFocusGained
        celularCliente.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        celularCliente.setBorder(BorderFactory.createCompoundBorder(celularCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_celularClienteFocusGained

    private void celularClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_celularClienteFocusLost
        celularCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        celularCliente.setBorder(BorderFactory.createCompoundBorder(celularCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_celularClienteFocusLost

    private void estadoClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_estadoClienteFocusGained
        estadoCliente.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        estadoCliente.setBorder(BorderFactory.createCompoundBorder(estadoCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_estadoClienteFocusGained

    private void estadoClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_estadoClienteFocusLost
        estadoCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        estadoCliente.setBorder(BorderFactory.createCompoundBorder(estadoCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_estadoClienteFocusLost

    private void municipioClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_municipioClienteFocusGained
        municipioCliente.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        municipioCliente.setBorder(BorderFactory.createCompoundBorder(municipioCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_municipioClienteFocusGained

    private void municipioClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_municipioClienteFocusLost
        municipioCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        municipioCliente.setBorder(BorderFactory.createCompoundBorder(municipioCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_municipioClienteFocusLost

    private void cepClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cepClienteFocusGained
        cepCliente.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        cepCliente.setBorder(BorderFactory.createCompoundBorder(cepCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_cepClienteFocusGained

    private void cepClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cepClienteFocusLost
        cepCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        cepCliente.setBorder(BorderFactory.createCompoundBorder(cepCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_cepClienteFocusLost

    private void bairroClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bairroClienteFocusGained
        bairroCliente.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        bairroCliente.setBorder(BorderFactory.createCompoundBorder(bairroCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_bairroClienteFocusGained

    private void bairroClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bairroClienteFocusLost
        bairroCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        bairroCliente.setBorder(BorderFactory.createCompoundBorder(bairroCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_bairroClienteFocusLost

    private void complementoClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_complementoClienteFocusGained
        complementoCliente.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        complementoCliente.setBorder(BorderFactory.createCompoundBorder(complementoCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_complementoClienteFocusGained

    private void complementoClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_complementoClienteFocusLost
        complementoCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        complementoCliente.setBorder(BorderFactory.createCompoundBorder(complementoCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_complementoClienteFocusLost

    private void enderecoClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enderecoClienteFocusGained
        enderecoCliente.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        enderecoCliente.setBorder(BorderFactory.createCompoundBorder(enderecoCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_enderecoClienteFocusGained

    private void enderecoClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enderecoClienteFocusLost
        enderecoCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        enderecoCliente.setBorder(BorderFactory.createCompoundBorder(enderecoCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_enderecoClienteFocusLost

    private void numeroCasaClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroCasaClienteFocusGained
        numeroCasaCliente.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        numeroCasaCliente.setBorder(BorderFactory.createCompoundBorder(numeroCasaCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_numeroCasaClienteFocusGained

    private void numeroCasaClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroCasaClienteFocusLost
        numeroCasaCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        numeroCasaCliente.setBorder(BorderFactory.createCompoundBorder(numeroCasaCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_numeroCasaClienteFocusLost

    private void planoClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_planoClienteFocusGained
        planoCliente.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        planoCliente.setBorder(BorderFactory.createCompoundBorder(planoCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_planoClienteFocusGained

    private void planoClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_planoClienteFocusLost
        planoCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        planoCliente.setBorder(BorderFactory.createCompoundBorder(planoCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_planoClienteFocusLost

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        nomeCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        cpfCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        estadoCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        municipioCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        cepCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        bairroCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        enderecoCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        celularCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        complementoCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        numeroCasaCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        senha1Cliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        emailCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1)); 
        
        cpfCliente.setBorder(BorderFactory.createCompoundBorder(cpfCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        emailCliente.setBorder(BorderFactory.createCompoundBorder(cpfCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        senha1Cliente.setBorder(BorderFactory.createCompoundBorder(cpfCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        nomeCliente.setBorder(BorderFactory.createCompoundBorder(nomeCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        estadoCliente.setBorder(BorderFactory.createCompoundBorder(estadoCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        municipioCliente.setBorder(BorderFactory.createCompoundBorder(municipioCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        cepCliente.setBorder(BorderFactory.createCompoundBorder(cepCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        bairroCliente.setBorder(BorderFactory.createCompoundBorder(bairroCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        enderecoCliente.setBorder(BorderFactory.createCompoundBorder(enderecoCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        celularCliente.setBorder(BorderFactory.createCompoundBorder(celularCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        complementoCliente.setBorder(BorderFactory.createCompoundBorder(complementoCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        numeroCasaCliente.setBorder(BorderFactory.createCompoundBorder(numeroCasaCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_formWindowActivated

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton2MouseEntered

    private void planoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planoClienteActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch(UnsupportedLookAndFeelException ex) {
            System.err.println( "Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlterarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField bairroCliente;
    protected javax.swing.JFormattedTextField celularCliente;
    protected javax.swing.JFormattedTextField cepCliente;
    protected javax.swing.JTextField complementoCliente;
    protected javax.swing.JFormattedTextField cpfCliente;
    protected javax.swing.JTextField emailCliente;
    protected javax.swing.JTextField enderecoCliente;
    protected javax.swing.JComboBox<String> estadoCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    protected javax.swing.JTextField municipioCliente;
    protected javax.swing.JTextField nomeCliente;
    protected javax.swing.JTextField numeroCasaCliente;
    protected javax.swing.JComboBox<String> planoCliente;
    protected javax.swing.JPasswordField senha1Cliente;
    // End of variables declaration//GEN-END:variables
}
