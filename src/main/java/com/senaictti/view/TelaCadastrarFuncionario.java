package com.senaictti.view;

import com.formdev.flatlaf.FlatLightLaf;
import com.senaictti.controller.FuncionarioController;
import com.senaictti.model.Funcionario;
import com.senaictti.model.exception.DatabaseException;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaCadastrarFuncionario extends javax.swing.JFrame {

    FuncionarioController fc = new FuncionarioController();
    
    public TelaCadastrarFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JFormattedTextField();
        jTextField11 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JPasswordField();
        jTextField13 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRAR FUNCIONÁRIO");
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
        jLabel1.setText("CADASTRAR FUNCIONÁRIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 21, 650, 38));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 290, 34));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nome:*");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("CPF:*");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 103, -1));

        jTextField9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(204, 204, 204));
        jTextField9.setText("Ex: 1190.90");
        jTextField9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField9FocusLost(evt);
            }
        });
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField9KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 241, 34));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Salário:*");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 115, -1));

        jTextField10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField10FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField10FocusLost(evt);
            }
        });
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField10MouseClicked(evt);
            }
        });
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField10KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 210, 34));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Especialidade:*");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Celular:*");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jTextField12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(204, 204, 204));
        jTextField12.setText("Ex: fulano@eletrotech.com");
        jTextField12.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField12FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField12FocusLost(evt);
            }
        });
        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField12MouseClicked(evt);
            }
        });
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField12KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 290, 34));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("E-mail:*");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Informe a senha:*");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CADASTRAR");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 180, 42));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 650, 140, 30));

        try {
            jTextField8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextField8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField8FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField8FocusLost(evt);
            }
        });
        jTextField8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField8MouseClicked(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 290, 33));

        try {
            jTextField11.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextField11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField11FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField11FocusLost(evt);
            }
        });
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField11MouseClicked(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 290, 34));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Confirme a senha:*");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, -1));

        jTextField14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField14FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField14FocusLost(evt);
            }
        });
        jTextField14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField14MouseClicked(evt);
            }
        });
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField14KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 182, 34));

        jTextField13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField13FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField13FocusLost(evt);
            }
        });
        jTextField13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField13MouseClicked(evt);
            }
        });
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField13KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 210, 34));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 344, 22));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Dados empresariais");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 170, 38));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Dados pessoais");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 140, 38));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Senha");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 170, 38));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/bgCadastro.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(675, 729));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String email = jTextField12.getText();
        String cpf = jTextField8.getText();
        Funcionario ff = new Funcionario();

        if(jTextField1.getText().isEmpty()){
            jTextField1.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        else if(jTextField8.getText().substring(0, 1).equals(" ")){
            jTextField8.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        else if(jTextField9.getText().isEmpty()){
            jTextField9.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        else if(jTextField10.getText().isEmpty()){
            jTextField10.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        else if(jTextField11.getText().substring(13, 14).equals(" ")){
            jTextField11.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            jLabel10.setText("Informe um número de celular válido!");
        }
        else if(jTextField12.getText().isEmpty()){
            jTextField12.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        else if(jTextField13.getText().isEmpty()){
            jTextField13.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        else if(jTextField14.getText().isEmpty()){
            jTextField14.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
        }
        else {  
            if(!jTextField13.getText().equals(jTextField14.getText())){
                jLabel10.setText("As senhas não conferem.");
                jTextField14.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else if(!ff.validaSenha(jTextField13.getText())){
                jTextField13.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                jTextField14.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                JOptionPane.showMessageDialog(null, "Atenção! Sua senha deve possuir: \n. No mínimo 10 caracteres. \n. No mínimo uma letra maiúscula. \n. No mínimo uma letra minúscula. \n. No mínimo 1 número. \n. No mínimo 1 caractere especial (!@#$%¨&*).");
            }
            else if(!ff.validaCpf(cpf)){
                jLabel10.setText("Informe um CPF válido!");
                jTextField8.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else if(!fc.verificaCelular(jTextField11.getText())){
                jLabel10.setText("O celular fornecido já foi cadastrado.");
                jTextField11.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else if(!fc.verificaEmail(email)){
                jLabel10.setText("O e-mail fornecido já foi cadastrado.");
                jTextField12.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            else if(!fc.verificaCpf(cpf)){
                jLabel10.setText("O CPF fornecido já foi cadastrado.");
                jTextField8.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            
            else {
                try{
                    String senha1 = ff.criptografaSenha(jTextField13.getText());
                    Funcionario f = new Funcionario(null, jTextField1.getText(), jTextField8.getText(), jTextField10.getText(), senha1, jTextField12.getText(), jTextField11.getText(), Double.valueOf(jTextField9.getText()), 1);
                    fc.cadastrarFuncionario(f);
                    JOptionPane.showMessageDialog(null, "Cadastrado com Sucesso!");
                    JOptionPane.showMessageDialog(null, "Atualize a tabela para que o novo Funcionário possa ser visualizado.");
                    dispose();
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Preecha o campo salário como nesse exemplo: '1190.90'");
                }
               
            }  
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
      
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
    
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
    
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField8MouseClicked
  
    }//GEN-LAST:event_jTextField8MouseClicked

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
      
    }//GEN-LAST:event_jTextField9MouseClicked

    private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClicked
      
    }//GEN-LAST:event_jTextField10MouseClicked

    private void jTextField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseClicked
 
    }//GEN-LAST:event_jTextField11MouseClicked
   
    private void jTextField12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MouseClicked
       
    }//GEN-LAST:event_jTextField12MouseClicked
    
    private void jTextField13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField13MouseClicked
     
    }//GEN-LAST:event_jTextField13MouseClicked

    private void jTextField14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField14MouseClicked
    
    }//GEN-LAST:event_jTextField14MouseClicked

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
       
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped
 
    }//GEN-LAST:event_jTextField8KeyTyped
    
    private void jTextField9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyTyped
   
    }//GEN-LAST:event_jTextField9KeyTyped

    private void jTextField10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyTyped
       
    }//GEN-LAST:event_jTextField10KeyTyped

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped
     
    }//GEN-LAST:event_jTextField11KeyTyped

    private void jTextField12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyTyped

    }//GEN-LAST:event_jTextField12KeyTyped

    private void jTextField13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyTyped
  
    }//GEN-LAST:event_jTextField13KeyTyped

    private void jTextField14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyTyped
     
    }//GEN-LAST:event_jTextField14KeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jTextField1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        jTextField8.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        jTextField9.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        jTextField10.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        jTextField11.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        jTextField12.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        jTextField13.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        jTextField14.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
    }//GEN-LAST:event_formWindowActivated
    Integer click3 = 0;
    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
         if(click3 == 0){
            jTextField1.setText("");
            jTextField1.setForeground(Color.BLACK);
            click3 = 5; 
        }
        jTextField1.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        jTextField1.setBorder(BorderFactory.createCompoundBorder(jTextField1.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        jTextField1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        jTextField1.setBorder(BorderFactory.createCompoundBorder(jTextField1.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField8FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusGained
        jTextField8.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        jTextField8.setBorder(BorderFactory.createCompoundBorder(jTextField8.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        jLabel10.setText("");
    }//GEN-LAST:event_jTextField8FocusGained

    private void jTextField8FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField8FocusLost
        jTextField8.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        jTextField8.setBorder(BorderFactory.createCompoundBorder(jTextField8.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_jTextField8FocusLost
    Integer click1 = 0;
    private void jTextField9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusGained
        if(click1 == 0){
            jTextField9.setText("");
            jTextField9.setForeground(Color.BLACK);
            click1 = 5; 
        }
        jTextField9.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        jTextField9.setBorder(BorderFactory.createCompoundBorder(jTextField9.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_jTextField9FocusGained

    private void jTextField9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField9FocusLost
        jTextField9.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        jTextField9.setBorder(BorderFactory.createCompoundBorder(jTextField9.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_jTextField9FocusLost

    private void jTextField10FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusGained
        jTextField10.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        jTextField10.setBorder(BorderFactory.createCompoundBorder(jTextField10.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_jTextField10FocusGained

    private void jTextField10FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField10FocusLost
        jTextField10.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        jTextField10.setBorder(BorderFactory.createCompoundBorder(jTextField10.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_jTextField10FocusLost

    private void jTextField11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusGained
        jTextField11.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        jTextField11.setBorder(BorderFactory.createCompoundBorder(jTextField11.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        jLabel10.setText("");
    }//GEN-LAST:event_jTextField11FocusGained

    private void jTextField11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusLost
        jTextField11.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        jTextField11.setBorder(BorderFactory.createCompoundBorder(jTextField11.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_jTextField11FocusLost
    Integer click2 = 0;
    private void jTextField12FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField12FocusGained
        if(click2 == 0){
            jTextField12.setText("");
            jTextField12.setForeground(Color.BLACK);
            click2 = 5;
        }
        jTextField12.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        jTextField12.setBorder(BorderFactory.createCompoundBorder(jTextField12.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        jLabel10.setText("");
    }//GEN-LAST:event_jTextField12FocusGained

    private void jTextField12FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField12FocusLost
        jTextField12.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        jTextField12.setBorder(BorderFactory.createCompoundBorder(jTextField12.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_jTextField12FocusLost

    private void jTextField13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusGained
        jTextField13.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        jTextField13.setBorder(BorderFactory.createCompoundBorder(jTextField13.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        jLabel10.setText("");
    }//GEN-LAST:event_jTextField13FocusGained

    private void jTextField13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusLost
        jTextField13.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        jTextField13.setBorder(BorderFactory.createCompoundBorder(jTextField13.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_jTextField13FocusLost

    private void jTextField14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusGained
        jTextField14.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        jTextField14.setBorder(BorderFactory.createCompoundBorder(jTextField14.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        jLabel10.setText("");
    }//GEN-LAST:event_jTextField14FocusGained

    private void jTextField14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusLost
        jTextField14.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        jTextField14.setBorder(BorderFactory.createCompoundBorder(jTextField14.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_jTextField14FocusLost

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton1MouseEntered

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch(UnsupportedLookAndFeelException ex) {
            System.err.println( "Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JFormattedTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JPasswordField jTextField13;
    private javax.swing.JPasswordField jTextField14;
    private javax.swing.JFormattedTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
