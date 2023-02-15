package com.senaictti.view;

import com.formdev.flatlaf.FlatLightLaf;
import com.senaictti.controller.FuncionarioController;
import com.senaictti.model.Funcionario;
import com.senaictti.model.exception.DatabaseException;
import java.awt.Cursor;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class TelaFuncionario extends javax.swing.JFrame {

     FuncionarioController fc = new FuncionarioController();
     List<Funcionario> f1 = fc.listarTodosFuncionariosAtivos();
     List<Funcionario> f2 = fc.listarTodosFuncionariosDesativados();
     Locale ptBr = new Locale("pt", "BR");
       
    public TelaFuncionario() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuVoltar = new javax.swing.JMenu();
        menuCadastrar = new javax.swing.JMenu();
        menuOpcoes = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("FUNCIONÁRIO");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("ATUALIZAR FUNCIONÁRIO");
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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 180, 40));

        jButton3.setText("EXCLUIR FUNCIONÁRIO");
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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 180, 40));

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
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 161, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("PESQUISAR FUNCIONÁRIO PELO NOME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, 52));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 410, 40));

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
                "ID", "NOME", "CPF", "ESPECIALIDADE", "TELEFONE", "EMAIL", "SALÁRIO", "SITUAÇÃO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 1190, 260));

        jButton6.setText("DESATIVAR FUNCIONÁRIO");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, 180, 40));

        jButton7.setText("ATIVAR FUNCIONÁRIO");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 180, 40));

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/bgFuncionario.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        menuVoltar.setText("Voltar");
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

        menuSair.setText("Sair");
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
            JOptionPane.showMessageDialog(null, "Selecione a linha do funcionário que será excluído na tabela.");
        }
        else{
            Integer id = (Integer) jTable1.getValueAt(row, 0);
            int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esse funcionário? ", "Atenção", JOptionPane.YES_NO_OPTION);
            if(sair == JOptionPane.YES_OPTION){
                try{
                     fc.apagarFuncionario(id);
                     atualizarTabela();
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Atenção! Esse funcionário já está atríbuido em um ou mais agendamentos. Para apagá-lo, é necessário excluir o(s) agendamento(s) em questão.");
                }
            }
        } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Integer row = jTable1.getSelectedRow();
        
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Selecione a linha do funcionário que será alterado na tabela.");
        }
        else {
            Integer id = (Integer) jTable1.getValueAt(row, 0);  
            Funcionario f1 = fc.listarporId(id);
            if(f1.getAtivo() == 0){
                JOptionPane.showMessageDialog(null, "Não é possível alterar o cadastro de um funcionário desativado.");
            }
            else{
                TelaAlterarFuncionario taf = new TelaAlterarFuncionario();
                taf.idfun = id;
                Funcionario fun = fc.listarporId(id);

                taf.jTextField1.setText(fun.getNomef());
                taf.jTextField8.setText(fun.getCpff());
                taf.jTextField9.setText(fun.getSalario().toString());
                taf.jTextField10.setText(fun.getEspecialidade());
                taf.jTextField11.setText(fun.getCelularf());
                taf.jTextField12.setText(fun.getEmailf());
                taf.jTextField13.setText(fun.getSenhaf());
                taf.jTextField13.setText(fun.getSenhaf());
                taf.jTextField14.setText(fun.getSenhaf());
                taf.setVisible(true);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        List<Funcionario> f1 = fc.listarFuncionarioPorNome(jTextField1.getText());
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        for(Funcionario obj : f1){
              model.addRow(new Object[]{obj.getIdfun(), obj.getNomef(), obj.getCpff(), obj.getEspecialidade(), obj.getCelularf(), obj.getEmailf(), String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(obj.getSalario()))});
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Integer row = jTable1.getSelectedRow();
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Selecione a linha do funcionário que será desativado na tabela.");
        }
        else{
            Integer id = (Integer) jTable1.getValueAt(row, 0);       
            Funcionario fun = fc.listarporId(id);
            if(fun.getAtivo() == 0){
                JOptionPane.showMessageDialog(null, "Esse funcionário já está desativado.");
            }
            else{
                try{
                    fun.setAtivo(0);
                    fun.setSalario(0.0);
                    fc.alterarFuncionario(id, fun);
                    JOptionPane.showMessageDialog(null, "Status alterado com sucesso!");
                    atualizarTabela();
                }
                catch(Exception e){
                    throw new DatabaseException("Erro ao desativar o funcionário");
                }
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Integer row = jTable1.getSelectedRow();
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Selecione a linha do funcionário que será ativado na tabela.");
        }
        else{
            Integer id = (Integer) jTable1.getValueAt(row, 0);       
            Funcionario fun = fc.listarporId(id);
            if(fun.getAtivo() == 1){
                JOptionPane.showMessageDialog(null, "Esse funcionário já está ativado.");
            }
            else{
                try{
                    fun.setAtivo(1);
                    Double salario = Double.valueOf(JOptionPane.showInputDialog("Informe o salário desse funcionário: "));
                    fun.setSalario(salario);
                    fc.alterarFuncionario(id, fun);
                    JOptionPane.showMessageDialog(null, "Status alterado com sucesso!");
                    atualizarTabela();
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Preecha o campo salário como nesse exemplo: '1190.90'");
                }          
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void menuVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVoltarActionPerformed
        
    }//GEN-LAST:event_menuVoltarActionPerformed

    private void menuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarActionPerformed
        
    }//GEN-LAST:event_menuCadastrarActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do sistema? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCadastrarMouseClicked
        TelaCadastrarFuncionario tcf = new TelaCadastrarFuncionario();
        tcf.setVisible(true);
    }//GEN-LAST:event_menuCadastrarMouseClicked

    private void menuVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVoltarMouseClicked
        dispose();
    }//GEN-LAST:event_menuVoltarMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        atualizarTabela();
        JOptionPane.showMessageDialog(null, "Tabela Atualizada com Sucesso!");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        jButton7.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        jButton6.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton6MouseEntered

    private void atualizarTabela(){
        f1.clear();
        f2.clear();
        f1 = fc.listarTodosFuncionariosAtivos();
        f2 = fc.listarTodosFuncionariosDesativados();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        for(Funcionario obj : f1){
            String ativo = "ATIVO";
            model.addRow(new Object[]{obj.getIdfun(), obj.getNomef(), obj.getCpff(), obj.getEspecialidade(), obj.getCelularf(), obj.getEmailf(), String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(obj.getSalario())), ativo});
        }
        for(Funcionario obj : f2){
            String ativo = "DESATIVADO";
            model.addRow(new Object[]{obj.getIdfun(), obj.getNomef(), obj.getCpff(), obj.getEspecialidade(), obj.getCelularf(), obj.getEmailf(), String.valueOf(NumberFormat.getCurrencyInstance(ptBr).format(obj.getSalario())), ativo});
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
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JMenu menuCadastrar;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenu menuVoltar;
    private com.senaictti.view.TelaCadastrarFuncionario telaCadastrarFuncionario1;
    // End of variables declaration//GEN-END:variables
}
