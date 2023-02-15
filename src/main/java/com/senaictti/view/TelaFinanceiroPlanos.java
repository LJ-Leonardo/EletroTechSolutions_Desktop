package com.senaictti.view;

import com.formdev.flatlaf.FlatLightLaf;
import com.senaictti.controller.ClienteController;
import com.senaictti.model.Cliente;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;


public class TelaFinanceiroPlanos extends javax.swing.JFrame {

    ClienteController cc = new ClienteController();
    Cliente c = new Cliente();
    Locale ptBr = new Locale("pt", "BR");
    List<Cliente> c1 = cc.listarClientePorPlanoBronze();
    List<Cliente> c2 = cc.listarClientePorPlanoSilver();
    List<Cliente> c3 = cc.listarClientePorPlanoGold();
    List<Cliente> c4 = cc.listarClienteSemPlano();
    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public TelaFinanceiroPlanos() {
        initComponents();
        atualizarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFinanceiro = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuVisualizar = new javax.swing.JMenu();
        listarTodos = new javax.swing.JMenuItem();
        clientesSemPlano = new javax.swing.JMenuItem();
        clientesBronze = new javax.swing.JMenuItem();
        clientesSilver = new javax.swing.JMenuItem();
        clientesGold = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Financeiro");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dinheiro Mensal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 250, 70));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dinheiro Anual");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 270, 60));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dinheiro Semestral");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 120, 250, 60));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Silver Semestral");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 80, 236, 33));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ASSINANTES");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 273, 24));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ASSINANTES");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 250, 240, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 413, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Bronze Mensal");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 236, 44));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Gold Anual");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 236, 32));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ASSINANTES");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 240, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText(Long.toString(cc.contarClientesGold()));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 240, 60));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(Long.toString(cc.contarClientesSilver()));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 240, 50));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText(Long.toString(cc.contarClientesBronze()));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 230, 70));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("*calculado pelo período de um mês.");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("*calculado pelo período de um ano.");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("um semestre");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, -1, 20));

        tabelaFinanceiro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabelaFinanceiro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "EMAIL", "TELEFONE", "MUNICÍPIO", "ESTADO", "PLANO", "DATA_ASSINATURA"
            }
        ));
        jScrollPane1.setViewportView(tabelaFinanceiro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 1200, 260));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel18.setText("*calculado pelo período de");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/bgFinanceiro.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("Voltar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        menuVisualizar.setText("Visualizar");
        menuVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVisualizarActionPerformed(evt);
            }
        });

        listarTodos.setText("Listar Todos");
        listarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarTodosActionPerformed(evt);
            }
        });
        menuVisualizar.add(listarTodos);

        clientesSemPlano.setText("Clientes sem Plano");
        clientesSemPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesSemPlanoActionPerformed(evt);
            }
        });
        menuVisualizar.add(clientesSemPlano);

        clientesBronze.setText("Clientes Bronze");
        clientesBronze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesBronzeActionPerformed(evt);
            }
        });
        menuVisualizar.add(clientesBronze);

        clientesSilver.setText("Clientes Silver");
        clientesSilver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesSilverActionPerformed(evt);
            }
        });
        menuVisualizar.add(clientesSilver);

        clientesGold.setText("Clientes Gold");
        clientesGold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesGoldActionPerformed(evt);
            }
        });
        menuVisualizar.add(clientesGold);

        jMenuBar1.add(menuVisualizar);

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

        setSize(new java.awt.Dimension(1216, 730));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Integer p1 = cc.contarClientesBronze().intValue();
        Integer p2 = cc.contarClientesSilver().intValue();
        Integer p3 = cc.contarClientesGold().intValue();
        
        if(c.valorPlanoMensal(p1) != null){
            jLabel2.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(c.valorPlanoMensal(p1))));  
        } 
        else {
            jLabel2.setText("R$ 0,00");
        }
        if(c.valorPlanoAnual(p3) != null){
            jLabel3.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(c.valorPlanoAnual(p3))));
        }
        else{
            jLabel2.setText("R$ 0,00");
        }
        if(c.valorPlanoSemestral(p2) != null){
            jLabel4.setText(String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(c.valorPlanoSemestral(p2))));
        }
        else{
            jLabel2.setText("R$ 0,00");
        }        
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do sistema? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void clientesSilverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesSilverActionPerformed
        c2.clear();
        c2 = cc.listarClientePorPlanoSilver();
        
        DefaultTableModel model = (DefaultTableModel) tabelaFinanceiro.getModel();
        model.setNumRows(0);
        
        for(Cliente cc1 : c2){
            if(cc1.getDataAssinatura() != null){
                String plano = "SILVER SEMESTRAL";
                model.addRow(new Object[]{cc1.getIdcliente(), cc1.getNomec(), cc1.getEmailc(), cc1.getCelularc(), cc1.getMunicipio(), cc1.getEstado(), plano, cc1.getDataAssinatura().format(formatoData)});
            }
            else{
                String plano = "SILVER SEMESTRAL";
                String data = "NÃO POSSUI";
                model.addRow(new Object[]{cc1.getIdcliente(), cc1.getNomec(), cc1.getEmailc(), cc1.getCelularc(), cc1.getMunicipio(), cc1.getEstado(), plano, data});  
            }
        }
    }//GEN-LAST:event_clientesSilverActionPerformed

    private void clientesSemPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesSemPlanoActionPerformed
        c4.clear();
        c4 = cc.listarClienteSemPlano();
        
        DefaultTableModel model = (DefaultTableModel) tabelaFinanceiro.getModel();
        model.setNumRows(0);
        
        for(Cliente cc1 : c4){
            String plano = "NÃO POSSUI";
            String data = "NÃO POSSUI";
            model.addRow(new Object[]{cc1.getIdcliente(), cc1.getNomec(), cc1.getEmailc(), cc1.getCelularc(), cc1.getMunicipio(), cc1.getEstado(), plano, data});
        }
    }//GEN-LAST:event_clientesSemPlanoActionPerformed

    private void clientesBronzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesBronzeActionPerformed
        c1.clear();
        c1 = cc.listarClientePorPlanoBronze();
         
        DefaultTableModel model = (DefaultTableModel) tabelaFinanceiro.getModel();
        model.setNumRows(0);
        
        for(Cliente cc1 : c1){
            if(cc1.getDataAssinatura() != null){
                String plano = "BRONZE MENSAL";
                model.addRow(new Object[]{cc1.getIdcliente(), cc1.getNomec(), cc1.getEmailc(), cc1.getCelularc(), cc1.getMunicipio(), cc1.getEstado(), plano, cc1.getDataAssinatura().format(formatoData)});
            }
            else{
                String plano = "BRONZE MENSAL";
                String data = "NÃO POSSUI";
                model.addRow(new Object[]{cc1.getIdcliente(), cc1.getNomec(), cc1.getEmailc(), cc1.getCelularc(), cc1.getMunicipio(), cc1.getEstado(), plano, data});
            }
        }
    }//GEN-LAST:event_clientesBronzeActionPerformed

    private void clientesGoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesGoldActionPerformed
        c3.clear();
        c3 = cc.listarClientePorPlanoGold();
        
        DefaultTableModel model = (DefaultTableModel) tabelaFinanceiro.getModel();
        model.setNumRows(0);
       
        for(Cliente cc1 : c3){
            if(cc1.getDataAssinatura() != null){
                String plano = "GOLD ANUAL";
                model.addRow(new Object[]{cc1.getIdcliente(), cc1.getNomec(), cc1.getEmailc(), cc1.getCelularc(), cc1.getMunicipio(), cc1.getEstado(), plano, cc1.getDataAssinatura().format(formatoData)});
            }
            else{
                String plano = "GOLD ANUAL";
                String data = "NÃO POSSUI";
                model.addRow(new Object[]{cc1.getIdcliente(), cc1.getNomec(), cc1.getEmailc(), cc1.getCelularc(), cc1.getMunicipio(), cc1.getEstado(), plano, data});  
            }
        }
    }//GEN-LAST:event_clientesGoldActionPerformed

    private void listarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarTodosActionPerformed
       atualizarTabela();
    }//GEN-LAST:event_listarTodosActionPerformed

    private void menuVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVisualizarActionPerformed
       
    }//GEN-LAST:event_menuVisualizarActionPerformed

    private void atualizarTabela(){
        c1.clear();
        c2.clear();
        c3.clear();
        c4.clear();
        c1 = cc.listarClientePorPlanoBronze();
        c2 = cc.listarClientePorPlanoSilver();
        c3 = cc.listarClientePorPlanoGold();
        c4 = cc.listarClienteSemPlano();
        
        DefaultTableModel model = (DefaultTableModel) tabelaFinanceiro.getModel();
        model.setNumRows(0);
        
        for(Cliente cc1 : c3){
            if(cc1.getDataAssinatura() != null){
                String plano = "GOLD ANUAL";
                model.addRow(new Object[]{cc1.getIdcliente(), cc1.getNomec(), cc1.getEmailc(), cc1.getCelularc(), cc1.getMunicipio(), cc1.getEstado(), plano, cc1.getDataAssinatura().format(formatoData)});
            }
            else{
                String plano = "GOLD ANUAL";
                String data = "NÃO POSSUI";
                model.addRow(new Object[]{cc1.getIdcliente(), cc1.getNomec(), cc1.getEmailc(), cc1.getCelularc(), cc1.getMunicipio(), cc1.getEstado(), plano, data});  
            }
        }
        for(Cliente cc1 : c2){
            if(cc1.getDataAssinatura() != null){
                String plano = "SILVER SEMESTRAL";
                model.addRow(new Object[]{cc1.getIdcliente(), cc1.getNomec(), cc1.getEmailc(), cc1.getCelularc(), cc1.getMunicipio(), cc1.getEstado(), plano, cc1.getDataAssinatura().format(formatoData)});
            }
            else{
                String plano = "SILVER SEMESTRAL";
                String data = "NÃO POSSUI";
                model.addRow(new Object[]{cc1.getIdcliente(), cc1.getNomec(), cc1.getEmailc(), cc1.getCelularc(), cc1.getMunicipio(), cc1.getEstado(), plano, data});  
            }
        }
        for(Cliente cc1 : c1){
            if(cc1.getDataAssinatura() != null){
                String plano = "BRONZE MENSAL";
                model.addRow(new Object[]{cc1.getIdcliente(), cc1.getNomec(), cc1.getEmailc(), cc1.getCelularc(), cc1.getMunicipio(), cc1.getEstado(), plano, cc1.getDataAssinatura().format(formatoData)});
            }
            else{
                String plano = "BRONZE MENSAL";
                String data = "NÃO POSSUI";
                model.addRow(new Object[]{cc1.getIdcliente(), cc1.getNomec(), cc1.getEmailc(), cc1.getCelularc(), cc1.getMunicipio(), cc1.getEstado(), plano, data});
            }
        }
        for(Cliente cc1 : c4){
            String data = "NÃO POSSUI";
            String plano = "NÃO POSSUI";
            model.addRow(new Object[]{cc1.getIdcliente(), cc1.getNomec(), cc1.getEmailc(), cc1.getCelularc(), cc1.getMunicipio(), cc1.getEstado(), plano, data});
        }
    }
    
    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch(UnsupportedLookAndFeelException ex) {
            System.err.println( "Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFinanceiroPlanos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem clientesBronze;
    private javax.swing.JMenuItem clientesGold;
    private javax.swing.JMenuItem clientesSemPlano;
    private javax.swing.JMenuItem clientesSilver;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem listarTodos;
    private javax.swing.JMenu menuVisualizar;
    private javax.swing.JTable tabelaFinanceiro;
    // End of variables declaration//GEN-END:variables
}
