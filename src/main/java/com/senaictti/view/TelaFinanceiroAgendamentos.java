package com.senaictti.view;

import com.formdev.flatlaf.FlatLightLaf;
import com.senaictti.controller.AgendaController;
import com.senaictti.controller.FuncionarioController;
import java.awt.Color;
import java.awt.Cursor;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaFinanceiroAgendamentos extends javax.swing.JFrame {

    FuncionarioController fc = new FuncionarioController();
    AgendaController ac = new AgendaController();
    Locale ptBr = new Locale("pt", "BR");
    
    public TelaFinanceiroAgendamentos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dataFim = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dataInicio = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("INFORME O PERÍODO QUE SERÁ ANALISADO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 410, -1));

        try {
            dataFim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataFim.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dataFim.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dataFim.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataFimFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataFimFocusLost(evt);
            }
        });
        getContentPane().add(dataFim, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 210, 42));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("INÍCIO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("FIM");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        try {
            dataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dataInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dataInicio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dataInicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dataInicioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dataInicioFocusLost(evt);
            }
        });
        getContentPane().add(dataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 210, 42));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("CALCULAR");
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 210, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 26)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(fc.contarFuncionarios().toString());
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 160, 102));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Quantidade de Agendamentos");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, 280, 102));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Renda gerada");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setText("Quantidade de Funcionários");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, 160, 91));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 220, 40));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setText(" Média Salarial");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 130, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 510, 220, 40));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setText("Despesas Totais");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 440, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/bgFinanceiro2.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("Voltar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opções");

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1214, 729));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do sistema? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jLabel10.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(fc.mediaSalarial())));
        jLabel12.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(fc.totalSalarios())));
        
        dataInicio.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        dataFim.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        try{
            if(dataInicio.getText().substring(6).equals("    ")){
                JOptionPane.showMessageDialog(null, "Informe um valor válido para o campo das datas!");
            }
            else if(dataFim.getText().substring(6).equals("    ")){
                JOptionPane.showMessageDialog(null, "Informe um valor válido para o campo das datas!");
            }
            else{
                String dia = dataInicio.getText().substring(0, 2);
                String mes = dataInicio.getText().substring(3, 5);
                String ano = dataInicio.getText().substring( 6);
                String dataBanco1 = ano + "-" + mes + "-" + dia;
                LocalDate data1 = LocalDate.parse(dataBanco1);
                
                String dia2 = dataFim.getText().substring(0, 2);
                String mes2 = dataFim.getText().substring(3, 5);
                String ano2 = dataFim.getText().substring( 6);
                String dataBanco2 = ano2 + "-" + mes2 + "-" + dia2;
                LocalDate data2 = LocalDate.parse(dataBanco2);
        
                if(data1.compareTo(data2) <= 0){
                    jLabel9.setText(Long.toString(ac.contarAgendamentos(data1, data2)));
                    if(ac.contarDinheiro(data1, data2) == null){
                        jLabel6.setText("R$ 0,00");
                    }
                    else{
                        jLabel6.setText(NumberFormat.getCurrencyInstance(ptBr).format(ac.contarDinheiro(data1, data2)));
                    } 
                }
                else{
                    JOptionPane.showMessageDialog(null, "Atenção! A segunda data deve ser maior que a primeira data.");
                } 
            }
         } catch(Exception e){
             JOptionPane.showMessageDialog(null, "Informe um valor válido para o campo das data!");
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dataInicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataInicioFocusGained
        dataInicio.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        dataInicio.setBorder(BorderFactory.createCompoundBorder(dataInicio.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_dataInicioFocusGained

    private void dataInicioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataInicioFocusLost
        dataInicio.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        dataInicio.setBorder(BorderFactory.createCompoundBorder(dataInicio.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_dataInicioFocusLost

    private void dataFimFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataFimFocusGained
        dataFim.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        dataFim.setBorder(BorderFactory.createCompoundBorder(dataFim.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_dataFimFocusGained

    private void dataFimFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataFimFocusLost
        dataFim.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        dataFim.setBorder(BorderFactory.createCompoundBorder(dataFim.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_dataFimFocusLost

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
                new TelaFinanceiroAgendamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField dataFim;
    private javax.swing.JFormattedTextField dataInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
