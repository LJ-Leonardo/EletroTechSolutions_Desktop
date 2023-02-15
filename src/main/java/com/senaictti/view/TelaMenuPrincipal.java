package com.senaictti.view;

import com.formdev.flatlaf.FlatLightLaf;
import com.senaictti.controller.AgendaController;
import com.senaictti.controller.ClienteController;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaMenuPrincipal extends javax.swing.JFrame {

    ClienteController cc = new ClienteController();
    AgendaController ac = new AgendaController();
    
    public TelaMenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        menuClientes = new javax.swing.JMenuItem();
        menuFuncionarios = new javax.swing.JMenuItem();
        menuServicos = new javax.swing.JMenu();
        menuAgendamentos = new javax.swing.JMenuItem();
        menuFinancas = new javax.swing.JMenu();
        controlePlanos = new javax.swing.JMenuItem();
        controleAgendamentos = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();
        menuOpcoes = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PRINCIPAL");
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

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(Long.toString(ac.contarSolicitacaoConcluida()));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(821, 420, 160, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText(Long.toString(cc.contarClientes()));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 420, 160, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(Long.toString(ac.contarSolicitacaoPendente()));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 420, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        menuCadastro.setText("Cadastros");
        menuCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuClientes.setText("Clientes");
        menuClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClientesActionPerformed(evt);
            }
        });
        menuCadastro.add(menuClientes);

        menuFuncionarios.setText("Funcionários");
        menuFuncionarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncionariosActionPerformed(evt);
            }
        });
        menuCadastro.add(menuFuncionarios);

        jMenuBar1.add(menuCadastro);

        menuServicos.setText("Serviços");
        menuServicos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuAgendamentos.setText("Agendamentos");
        menuAgendamentos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuAgendamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAgendamentosActionPerformed(evt);
            }
        });
        menuServicos.add(menuAgendamentos);

        jMenuBar1.add(menuServicos);

        menuFinancas.setText("Finanças");
        menuFinancas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        controlePlanos.setText("Controle de Planos");
        controlePlanos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        controlePlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlePlanosActionPerformed(evt);
            }
        });
        menuFinancas.add(controlePlanos);

        controleAgendamentos.setText("Controle de Agendamentos");
        controleAgendamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controleAgendamentosActionPerformed(evt);
            }
        });
        menuFinancas.add(controleAgendamentos);

        jMenuBar1.add(menuFinancas);

        menuAjuda.setText("Ajuda");
        menuAjuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAjudaActionPerformed(evt);
            }
        });

        menuSobre.setText("Sobre");
        menuSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        menuAjuda.add(menuSobre);

        jMenuBar1.add(menuAjuda);

        menuOpcoes.setText("Opções");
        menuOpcoes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menuSair.setText("Sair");
        menuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuOpcoes.add(menuSair);

        jMenuBar1.add(menuOpcoes);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1204, 708));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncionariosActionPerformed
        TelaFuncionario tf = new TelaFuncionario();
        tf.setVisible(true);
    
    }//GEN-LAST:event_menuFuncionariosActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do sistema? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }   
    }//GEN-LAST:event_menuSairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     
    }//GEN-LAST:event_formWindowActivated

    private void menuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAjudaActionPerformed
        TelaSobre ts = new TelaSobre();
        ts.setVisible(true);
    }//GEN-LAST:event_menuAjudaActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        TelaSobre ts = new TelaSobre();
        ts.setVisible(true);
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClientesActionPerformed
        TelaCliente tc = new TelaCliente();
        tc.setVisible(true);
       
    }//GEN-LAST:event_menuClientesActionPerformed

    private void menuAgendamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAgendamentosActionPerformed
        TelaAgendamentos ts = new TelaAgendamentos();
        ts.setVisible(true);
        
    }//GEN-LAST:event_menuAgendamentosActionPerformed

    private void controlePlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlePlanosActionPerformed
        TelaFinanceiroPlanos tfp = new TelaFinanceiroPlanos();
        tfp.setVisible(true);
    }//GEN-LAST:event_controlePlanosActionPerformed

    private void controleAgendamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controleAgendamentosActionPerformed
        TelaFinanceiroAgendamentos tfa = new TelaFinanceiroAgendamentos();
        tfa.setVisible(true);
    }//GEN-LAST:event_controleAgendamentosActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {
       
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch(UnsupportedLookAndFeelException ex) {
            System.err.println( "Failed to initialize LaF");
        }
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem controleAgendamentos;
    private javax.swing.JMenuItem controlePlanos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuAgendamentos;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenuItem menuClientes;
    private javax.swing.JMenu menuFinancas;
    private javax.swing.JMenuItem menuFuncionarios;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenu menuServicos;
    private javax.swing.JMenuItem menuSobre;
    // End of variables declaration//GEN-END:variables
}
