package com.senaictti.view;

import com.formdev.flatlaf.FlatLightLaf;
import com.senaictti.controller.AgendaController;
import com.senaictti.controller.FuncionarioController;
import com.senaictti.model.Agenda;
import com.senaictti.model.Funcionario;
import java.awt.Cursor;
import java.time.LocalDate;
import java.util.List;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaAlterarAgendamento extends javax.swing.JFrame {

    protected Integer idagenda;
    protected Integer idcliente;
    protected Integer idfun;
    protected Double preco;
    protected LocalDate data;
    protected String horario;
    protected String escolha;
    AgendaController ac = new AgendaController();
    FuncionarioController fc = new FuncionarioController();
    
    public TelaAlterarAgendamento() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        celularCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cepCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        enderecoCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numeroCliente = new javax.swing.JTextField();
        bairroCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        municipioCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        estadoCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        complementoCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        horarioVisita = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        dataVisita = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        descricaoServico = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        situacaoAgendamento = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        funcionarioResponsavel = new javax.swing.JComboBox<>();
        idAgendamento = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ALTERAR AGENDAMENTO");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALTERAR AGENDAMENTO - ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 31, 600, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nome cliente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        nomeCliente.setEditable(false);
        nomeCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeClienteActionPerformed(evt);
            }
        });
        getContentPane().add(nomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 350, 34));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Celular cliente:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        celularCliente.setEditable(false);
        celularCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        celularCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularClienteActionPerformed(evt);
            }
        });
        getContentPane().add(celularCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 178, 34));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("CEP: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        cepCliente.setEditable(false);
        cepCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cepCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepClienteActionPerformed(evt);
            }
        });
        getContentPane().add(cepCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 110, 34));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Endereço:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        enderecoCliente.setEditable(false);
        enderecoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        enderecoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(enderecoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 290, 34));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Número:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        numeroCliente.setEditable(false);
        numeroCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        numeroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroClienteActionPerformed(evt);
            }
        });
        getContentPane().add(numeroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 90, 34));

        bairroCliente.setEditable(false);
        bairroCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bairroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroClienteActionPerformed(evt);
            }
        });
        getContentPane().add(bairroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 198, 34));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Bairro:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        municipioCliente.setEditable(false);
        municipioCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        municipioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                municipioClienteActionPerformed(evt);
            }
        });
        getContentPane().add(municipioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 80, 34));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Município:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        estadoCliente.setEditable(false);
        estadoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        estadoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(estadoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 90, 34));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Estado: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        complementoCliente.setEditable(false);
        complementoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        complementoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(complementoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 110, 34));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Complemento: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        horarioVisita.setEditable(false);
        horarioVisita.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        horarioVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioVisitaActionPerformed(evt);
            }
        });
        getContentPane().add(horarioVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 121, 34));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Horário visita:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        dataVisita.setEditable(false);
        dataVisita.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dataVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataVisitaActionPerformed(evt);
            }
        });
        getContentPane().add(dataVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 110, 34));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Data visita: ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        descricaoServico.setEditable(false);
        descricaoServico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        descricaoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoServicoActionPerformed(evt);
            }
        });
        getContentPane().add(descricaoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 260, 34));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Descrição do serviço:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("FUNCIONÁRIO RESPONSÁVEL");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, -1));

        jButton1.setText("VOLTAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 650, 95, 30));

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("ALTERAR");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, 161, 37));

        situacaoAgendamento.setEditable(false);
        situacaoAgendamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        situacaoAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                situacaoAgendamentoActionPerformed(evt);
            }
        });
        getContentPane().add(situacaoAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 250, 34));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("Situação do Agendamento:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        funcionarioResponsavel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        funcionarioResponsavel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(funcionarioResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 320, 40));

        idAgendamento.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        idAgendamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(idAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 74, 28));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/bgCadastro.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(676, 725));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeClienteActionPerformed

    private void celularClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celularClienteActionPerformed

    private void cepClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepClienteActionPerformed

    private void enderecoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoClienteActionPerformed

    private void numeroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroClienteActionPerformed

    private void bairroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroClienteActionPerformed

    private void municipioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_municipioClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_municipioClienteActionPerformed

    private void estadoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoClienteActionPerformed

    private void complementoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complementoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_complementoClienteActionPerformed

    private void horarioVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horarioVisitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horarioVisitaActionPerformed

    private void dataVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataVisitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataVisitaActionPerformed

    private void descricaoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoServicoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String dia = dataVisita.getText().substring(0, 2);
        String mes = dataVisita.getText().substring(3, 5);
        String ano = dataVisita.getText().substring( 6);

        String dataBanco = ano + "-" + mes + "-" + dia;
        LocalDate data1 = LocalDate.parse(dataBanco);
       
        String fun = funcionarioResponsavel.getSelectedItem().toString();
        Integer fun2 = fun.indexOf(" -");
        
        Funcionario ff = fc.listarFuncionarioPorNomeIndividual(fun.substring(0, fun2));
        if(escolha.equals(funcionarioResponsavel.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "A agenda deve possuir alguma alteração para que possa ser alterada.");
        }
        else{
            if(ac.listarFuncionariosDisponiveis(ff.getIdfun(), data, horario)){
                Agenda a = new Agenda(idagenda, ff.getIdfun(), idcliente, data1, horarioVisita.getText(), descricaoServico.getText(), null, preco, situacaoAgendamento.getText());
                ac.alterarAgenda(idagenda, a);
                JOptionPane.showMessageDialog(null, "Agenda alterada com sucesso!");
                JOptionPane.showMessageDialog(null, "Atualize a tabela para que as alterações possam ser visualizadas.");
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Atenção! Esse funcionário já possui um agendamento para essa data e horário.");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void situacaoAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_situacaoAgendamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_situacaoAgendamentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        
                
    }//GEN-LAST:event_formWindowActivated

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
                new TelaAlterarAgendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField bairroCliente;
    protected javax.swing.JTextField celularCliente;
    protected javax.swing.JTextField cepCliente;
    protected javax.swing.JTextField complementoCliente;
    protected javax.swing.JTextField dataVisita;
    protected javax.swing.JTextField descricaoServico;
    protected javax.swing.JTextField enderecoCliente;
    protected javax.swing.JTextField estadoCliente;
    protected javax.swing.JComboBox<String> funcionarioResponsavel;
    protected javax.swing.JTextField horarioVisita;
    protected javax.swing.JLabel idAgendamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
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
    protected javax.swing.JTextField numeroCliente;
    protected javax.swing.JTextField situacaoAgendamento;
    // End of variables declaration//GEN-END:variables
}
