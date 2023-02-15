package com.senaictti.view;

import com.formdev.flatlaf.FlatLightLaf;
import com.senaictti.controller.ClienteController;
import com.senaictti.model.Cliente;
import com.senaictti.model.exception.DatabaseException;
import java.awt.Color;
import java.awt.Cursor;
import java.util.List;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class TelaCliente extends javax.swing.JFrame {

     ClienteController cc = new ClienteController();
     List<Cliente> c1 = cc.listarTodosClientesAtivos();
     List<Cliente> c2 = cc.listarTodosClientesDesativados();
     Locale ptBr = new Locale("pt", "BR");
       
    public TelaCliente() {
        initComponents();
        atualizarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaCadastrarFuncionario1 = new com.senaictti.view.TelaCadastrarFuncionario();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuVoltar = new javax.swing.JMenu();
        menuCadastrar = new javax.swing.JMenu();
        menuOpcoes = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CLIENTE");
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

        jButton2.setText("ATUALIZAR CLIENTE");
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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 150, 40));

        jButton3.setText("EXCLUIR CLIENTE");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 150, 40));

        jButton4.setBackground(new java.awt.Color(0, 102, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("PESQUISAR");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 150, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("PESQUISAR CLIENTE PELO NOME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, 52));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 400, 40));

        jToggleButton1.setText("ATIVAR CLIENTE");
        jToggleButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseEntered(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 140, 150, 40));

        jToggleButton2.setText("DESATIVAR CLIENTE");
        jToggleButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseEntered(evt);
            }
        });
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 210, 150, 40));

        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTable1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "ID", "NOME", "CPF", "TELEFONE", "EMAIL", "MUNICIPIO", "ESTADO", "PLANO", "SITUAÇÃO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 1190, 260));

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 330, 50, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/bgCliente.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 700));

        menuVoltar.setText("Voltar");
        menuVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVoltarMouseClicked(evt);
            }
        });
        menuVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVoltarActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuVoltar);

        menuCadastrar.setText("Cadastrar");
        menuCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCadastrarMouseClicked(evt);
            }
        });
        menuCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuCadastrar);

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

        setSize(new java.awt.Dimension(1195, 718));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Integer row = jTable1.getSelectedRow();
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Selecione a linha do cliente que será excluído na tabela.");
        }
        else{
            Integer id = (Integer) jTable1.getValueAt(row, 0);
            int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esse cliente? ", "Atenção", JOptionPane.YES_NO_OPTION);
            if(sair == JOptionPane.YES_OPTION){
                try{
                    cc.apagarCliente(id);
                    atualizarTabela();
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Atenção! Esse cliente está atribuído em um ou mais agendamentos. Para apagá-lo, é necessário apagar o(s) agendamento(s) em questão.");
                }
            }
        } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Integer row = jTable1.getSelectedRow();
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Selecione a linha do cliente que será alterado na tabela.");           
        }
        else{
            Integer id = (Integer) jTable1.getValueAt(row, 0);
            Cliente c1 = cc.listarporId(id);
            if(c1.getAtivo() == 0){
                JOptionPane.showMessageDialog(null, "Não é possível alterar o cadastro de um cliente desativado.");
            }
            else{
                Cliente c3 = cc.listarporId(id);
                TelaAlterarCliente tac = new TelaAlterarCliente();
                tac.idcliente = id;
                tac.nomeCliente.setText(c3.getNomec());
                tac.cpfCliente.setText(c3.getCpfc());
                tac.estadoCliente.getModel().setSelectedItem(c3.getEstado());
                tac.municipioCliente.setText(c3.getMunicipio());
                tac.cepCliente.setText(c3.getCep());
                tac.bairroCliente.setText(c3.getBairro());
                tac.enderecoCliente.setText(c3.getEndereco());
                tac.celularCliente.setText(c3.getCelularc());
                tac.emailCliente.setText(c3.getEmailc());
                tac.complementoCliente.setText(c3.getComplemento());
                tac.numeroCasaCliente.setText(c3.getNumero());
                tac.senha1Cliente.setText(c3.getSenhac());
                if(c3.getPlano() == null){
                    String plano = "NENHUM";
                    tac.planoCliente.getModel().setSelectedItem(plano);
                }
                else{
                    tac.planoCliente.getModel().setSelectedItem(c3.getPlano());
                }
                tac.setVisible(true);
            }
        }    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        List<Cliente> c2 = cc.listarClientePorNome(jTextField1.getText());

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        for(Cliente obj : c2){
            String situacao;
            if(obj.getAtivo() == 1){
                situacao = "ATIVO";
            }
            else{
                situacao = "DESATIVADO";
            }
              model.addRow(new Object[]{obj.getIdcliente(), obj.getNomec(), obj.getCpfc(), obj.getCelularc(), obj.getEmailc(), obj.getMunicipio(), obj.getEstado(), obj.getPlano(), situacao});
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Integer row = jTable1.getSelectedRow();
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Selecione a linha do cliente que será ativado na tabela.");
        }
        else{
            Integer id = (Integer) jTable1.getValueAt(row, 0);       
            Cliente cliente = cc.listarporId(id);
            if(cliente.getAtivo() == 1){
                JOptionPane.showMessageDialog(null, "Esse cliente já está ativado.");
            }
            else{
                try{
                    cliente.setAtivo(1);
                    cc.alterarCliente(id, cliente);
                    JOptionPane.showMessageDialog(null, "Status alterado com sucesso!");
                    atualizarTabela();
                }
                catch(Exception e){
                    throw new DatabaseException("Ocorreu um erro ao ativar o cliente!");
                }          
            }
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        Integer row = jTable1.getSelectedRow();
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Selecione a linha do cliente que será desativado na tabela.");
        }
        else{
            Integer id = (Integer) jTable1.getValueAt(row, 0);       
            Cliente cliente = cc.listarporId(id);
            if(cliente.getAtivo() == 0){
                JOptionPane.showMessageDialog(null, "Esse cliente já está desativado.");
            }
            else{
                try{
                    cliente.setAtivo(0);
                    cliente.setPlano(null);
                    cliente.setCvv(null);
                    cliente.setCartaoc(null);
                    cliente.setPlano(null);
                    cliente.setValidade(null);
                    cliente.setTitular(null);
                    cc.alterarCliente(id, cliente);
                    JOptionPane.showMessageDialog(null, "Status alterado com sucesso!");
                    atualizarTabela();
                }
                catch(Exception e){
                    throw new DatabaseException("Erro ao desativar o cliente");
                }
            }
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do sistema? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarActionPerformed
        
    }//GEN-LAST:event_menuCadastrarActionPerformed

    private void menuVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVoltarActionPerformed
        
    }//GEN-LAST:event_menuVoltarActionPerformed

    private void menuCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCadastrarMouseClicked
        TelaCadastrarCliente tcf = new TelaCadastrarCliente();
        tcf.setVisible(true); 
    }//GEN-LAST:event_menuCadastrarMouseClicked

    private void menuVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVoltarMouseClicked
        dispose();
    }//GEN-LAST:event_menuVoltarMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        atualizarTabela();
        JOptionPane.showMessageDialog(null, "Tabela Atualizada com Sucesso!");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        jTextField1.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        jTextField1.setBorder(BorderFactory.createCompoundBorder(jTextField1.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        jTextField1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        jTextField1.setBorder(BorderFactory.createCompoundBorder(jTextField1.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_jTextField1FocusLost

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        jTextField1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
    }//GEN-LAST:event_formWindowActivated

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton4MouseEntered

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
       
    }//GEN-LAST:event_formWindowClosed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jToggleButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseEntered
        jToggleButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jToggleButton1MouseEntered

    private void jToggleButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseEntered
        jToggleButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jToggleButton2MouseEntered

    public void atualizarTabela(){
        c1.clear();
        c2.clear();
        c1 = cc.listarTodosClientesAtivos();
        c2 = cc.listarTodosClientesDesativados();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        String situacao;
        String situacao2;
        String plano;
        String plano2;
        for(Cliente obj : c1){
            situacao = "ATIVO";
            plano = obj.getPlano();
            if(plano == null){
                plano = "NÃO POSSUI";
            }
            model.addRow(new Object[]{obj.getIdcliente(), obj.getNomec(), obj.getCpfc(), obj.getCelularc(), obj.getEmailc(), obj.getMunicipio(), obj.getEstado(), plano, situacao});
        }
        for(Cliente obj1 : c2){
            situacao2 = "DESATIVADO";
            plano2 = obj1.getPlano();
             if(plano2 == null){
                plano2 = "NÃO POSSUI";
            }
            model.addRow(new Object[]{obj1.getIdcliente(), obj1.getNomec(), obj1.getCpfc(), obj1.getCelularc(), obj1.getEmailc(), obj1.getMunicipio(), obj1.getEstado(), plano2, situacao2});
        }
    }
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch(UnsupportedLookAndFeelException ex) {
            System.err.println( "Failed to initialize LaF");
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenu menuVoltar;
    private com.senaictti.view.TelaCadastrarFuncionario telaCadastrarFuncionario1;
    // End of variables declaration//GEN-END:variables
}
