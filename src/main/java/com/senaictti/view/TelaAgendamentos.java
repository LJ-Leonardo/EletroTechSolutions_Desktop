package com.senaictti.view;

import com.formdev.flatlaf.FlatLightLaf;
import com.senaictti.controller.AgendaController;
import com.senaictti.controller.ClienteController;
import com.senaictti.controller.FuncionarioController;
import com.senaictti.model.Agenda;
import com.senaictti.model.Cliente;
import com.senaictti.model.Funcionario;
import java.awt.Color;
import java.awt.Cursor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class TelaAgendamentos extends javax.swing.JFrame {

    AgendaController ac = new AgendaController();
    ClienteController cc = new ClienteController();
    FuncionarioController fc = new FuncionarioController();
    List<Agenda> a1 = ac.listarTodasAgendasPendentes();
    List<Agenda> a2 = ac.listarTodasAgendasConcluidas();
    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
  
    public TelaAgendamentos() {
        initComponents();
        atualizarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        alterarAgendamento = new javax.swing.JButton();
        botaoPesquisarNomeFuncionario = new javax.swing.JButton();
        pesquisaNomeFuncionario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botaoPesquisarNomeCliente = new javax.swing.JButton();
        pesquisaNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botaoPesquisarAgendaData = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pesquisaData = new javax.swing.JFormattedTextField();
        excluirAgendamento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuVoltar = new javax.swing.JMenu();
        menuVisualizar = new javax.swing.JMenu();
        todosServicos = new javax.swing.JMenuItem();
        servicosPendentes = new javax.swing.JMenuItem();
        servicosConcluidos = new javax.swing.JMenuItem();
        ordemServico = new javax.swing.JMenuItem();
        menuOpcoes = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        alterarAgendamento.setText("ALTERAR AGENDAMENTO");
        alterarAgendamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alterarAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                alterarAgendamentoMouseEntered(evt);
            }
        });
        alterarAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarAgendamentoActionPerformed(evt);
            }
        });
        getContentPane().add(alterarAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, 45));

        botaoPesquisarNomeFuncionario.setBackground(new java.awt.Color(0, 102, 255));
        botaoPesquisarNomeFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoPesquisarNomeFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        botaoPesquisarNomeFuncionario.setText("PESQUISAR");
        botaoPesquisarNomeFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPesquisarNomeFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPesquisarNomeFuncionarioMouseEntered(evt);
            }
        });
        botaoPesquisarNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarNomeFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPesquisarNomeFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 161, 34));

        pesquisaNomeFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pesquisaNomeFuncionario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pesquisaNomeFuncionarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pesquisaNomeFuncionarioFocusLost(evt);
            }
        });
        pesquisaNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaNomeFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisaNomeFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 252, 34));

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
                "ID_AGENDAMENTO","ID_FUNCIONARIO", "NOME_FUNCIONARIO", "ID_CLIENTE", "NOME_CLIENTE", "DIA_MARCADO", "HORA_MARCADA", "DESCRICAO", "PRECO", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 1200, 280));

        botaoPesquisarNomeCliente.setBackground(new java.awt.Color(0, 102, 255));
        botaoPesquisarNomeCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoPesquisarNomeCliente.setForeground(new java.awt.Color(255, 255, 255));
        botaoPesquisarNomeCliente.setText("PESQUISAR");
        botaoPesquisarNomeCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPesquisarNomeCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPesquisarNomeClienteMouseEntered(evt);
            }
        });
        botaoPesquisarNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarNomeClienteActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPesquisarNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, 161, 34));

        pesquisaNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pesquisaNomeCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pesquisaNomeClienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pesquisaNomeClienteFocusLost(evt);
            }
        });
        pesquisaNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaNomeClienteActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisaNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 210, 252, 34));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PESQUISA POR NOME (CLIENTE)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 180, 225, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PESQUISA POR NOME (FUNCIONÁRIO)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 277, 24));

        botaoPesquisarAgendaData.setBackground(new java.awt.Color(0, 102, 255));
        botaoPesquisarAgendaData.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoPesquisarAgendaData.setForeground(new java.awt.Color(255, 255, 255));
        botaoPesquisarAgendaData.setText("PESQUISAR");
        botaoPesquisarAgendaData.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoPesquisarAgendaData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoPesquisarAgendaDataMouseEntered(evt);
            }
        });
        botaoPesquisarAgendaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarAgendaDataActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPesquisarAgendaData, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 161, 34));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PESQUISA POR DATA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 277, 20));

        try {
            pesquisaData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pesquisaData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pesquisaData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pesquisaDataFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pesquisaDataFocusLost(evt);
            }
        });
        pesquisaData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaDataActionPerformed(evt);
            }
        });
        getContentPane().add(pesquisaData, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 140, 34));

        excluirAgendamento.setText("EXCLUIR AGENDAMENTO");
        excluirAgendamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        excluirAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                excluirAgendamentoMouseEntered(evt);
            }
        });
        excluirAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirAgendamentoActionPerformed(evt);
            }
        });
        getContentPane().add(excluirAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 50, -1, 45));

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 330, 30, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/bgAgendamento.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

        menuVisualizar.setText("Visualizar");
        menuVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVisualizarActionPerformed(evt);
            }
        });

        todosServicos.setText("Todos Serviços");
        todosServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosServicosActionPerformed(evt);
            }
        });
        menuVisualizar.add(todosServicos);

        servicosPendentes.setText("Serviços Pendentes");
        servicosPendentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicosPendentesActionPerformed(evt);
            }
        });
        menuVisualizar.add(servicosPendentes);

        servicosConcluidos.setText("Serviços Concluídos");
        servicosConcluidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicosConcluidosActionPerformed(evt);
            }
        });
        menuVisualizar.add(servicosConcluidos);

        ordemServico.setText("Ordem de Serviço");
        ordemServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordemServicoActionPerformed(evt);
            }
        });
        menuVisualizar.add(ordemServico);

        jMenuBar1.add(menuVisualizar);

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

        setSize(new java.awt.Dimension(1215, 731));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void alterarAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarAgendamentoActionPerformed
       Integer row = jTable1.getSelectedRow();
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Selecione a agenda na tabela para que a mesma possa ser alterada.");
        }
        else{
            Integer id = (Integer) jTable1.getValueAt(row, 0);
            Agenda a1 = ac.listarporId(id);
            Cliente c = cc.listarporId(a1.getIdcliente());
            Funcionario f = fc.listarporId(a1.getIdfun());
            if(!a1.getStatus().equals("CONCLUIDO")){
                TelaAlterarAgendamento tos = new TelaAlterarAgendamento();
                tos.nomeCliente.setText(c.getNomec());
                tos.celularCliente.setText(c.getCelularc());
                tos.cepCliente.setText(c.getCep());
                tos.enderecoCliente.setText(c.getEndereco());
                tos.numeroCliente.setText(c.getNumero().toString());
                tos.complementoCliente.setText(c.getComplemento());
                tos.bairroCliente.setText(c.getBairro());
                tos.municipioCliente.setText(c.getMunicipio());
                tos.estadoCliente.setText(c.getEstado());
                tos.dataVisita.setText(a1.getDia().format(formatoData));
                tos.horarioVisita.setText(a1.getHora());
                tos.descricaoServico.setText(a1.getDescricao());
                tos.situacaoAgendamento.setText(a1.getStatus());
                tos.idAgendamento.setText(a1.getIdagenda().toString());

                tos.idagenda = a1.getIdagenda();
                tos.idcliente = c.getIdcliente();
                tos.idfun = f.getIdfun();
                tos.preco = a1.getPreco();
                tos.horario = a1.getHora();
                tos.data = a1.getDia();

                List<Funcionario> f1 = fc.listarTodosFuncionariosAtivos();
                for(Funcionario obj : f1){  
                    tos.funcionarioResponsavel.addItem(obj.getNomef() + " - " + obj.getEspecialidade());
                }
                Funcionario ff = fc.listarporId(f.getIdfun());
                tos.funcionarioResponsavel.getModel().setSelectedItem(ff.getNomef() + " - " + ff.getEspecialidade());
                tos.escolha = ff.getNomef() + " - " + ff.getEspecialidade();

                tos.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Essa agenda já foi concluída, não é possível alterá-la.");
            } 
        }
    }//GEN-LAST:event_alterarAgendamentoActionPerformed

    private void botaoPesquisarNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarNomeFuncionarioActionPerformed
        a1.clear();
        a2.clear();
        
        List<Funcionario> f1 = fc.listarFuncionarioPorNome(pesquisaNomeFuncionario.getText());
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        
        for(Funcionario obj : f1){
            List<Agenda> a1 = ac.listarTodasAgendasIdFuncionarioPendente(obj.getIdfun());
            List<Agenda> a2 = ac.listarTodasAgendasIdFuncionarioConcluido(obj.getIdfun());
        
            for(Agenda obj1 : a1){
                Integer idCliente = obj1.getIdcliente();
                Integer idFuncionario = obj1.getIdfun();
                Cliente c1 = cc.listarporId(idCliente);
                Funcionario f2 = fc.listarporId(idFuncionario);
                model.addRow(new Object[]{obj1.getIdagenda(), obj1.getIdfun(), f2.getNomef(), obj1.getIdcliente(), c1.getNomec(), obj1.getDia().format(formatoData), obj1.getHora(),obj1.getDescricao(),obj1.getPreco(),obj1.getStatus()});
            } 
            
            for(Agenda obj2 : a2){
                Integer idCliente = obj2.getIdcliente();
                Integer idFuncionario = obj2.getIdfun();
                Cliente c2 = cc.listarporId(idCliente);
                Funcionario f2 = fc.listarporId(idFuncionario);
                model.addRow(new Object[]{obj2.getIdagenda(), obj2.getIdfun(), f2.getNomef(), obj2.getIdcliente(), c2.getNomec(), obj2.getDia().format(formatoData), obj2.getHora(),obj2.getDescricao(),obj2.getPreco(),obj2.getStatus()});
            } 
        }     
    }//GEN-LAST:event_botaoPesquisarNomeFuncionarioActionPerformed

    private void pesquisaNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaNomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaNomeFuncionarioActionPerformed

    private void botaoPesquisarNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarNomeClienteActionPerformed
        a1.clear();
        a2.clear();
        List<Cliente> c = cc.listarClientePorNome(pesquisaNomeCliente.getText());
   
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
  
         for(Cliente obj : c){
            List<Agenda> a1 = ac.listarTodasAgendasIdClientePendente(obj.getIdcliente());
            List<Agenda> a2 = ac.listarTodasAgendasIdClienteConcluido(obj.getIdcliente());
        
                for(Agenda obj1 : a1){
                    Integer idCliente = obj1.getIdcliente();
                    Integer idFuncionario = obj1.getIdfun();
                    Cliente c1 = cc.listarporId(idCliente);
                    Funcionario f1 = fc.listarporId(idFuncionario);
                    model.addRow(new Object[]{obj1.getIdagenda(), obj1.getIdfun(), f1.getNomef(), obj1.getIdcliente(), c1.getNomec(), obj1.getDia().format(formatoData), obj1.getHora(),obj1.getDescricao(),obj1.getPreco(),obj1.getStatus()});
                }  

                for(Agenda obj2 : a2){
                    Integer idCliente = obj2.getIdcliente();
                    Integer idFuncionario = obj2.getIdfun();
                    Cliente c2 = cc.listarporId(idCliente);
                    Funcionario f2 = fc.listarporId(idFuncionario);
                    model.addRow(new Object[]{obj2.getIdagenda(), obj2.getIdfun(), f2.getNomef(), obj2.getIdcliente(), c2.getNomec(), obj2.getDia().format(formatoData), obj2.getHora(),obj2.getDescricao(),obj2.getPreco(),obj2.getStatus()});
                }
        }
    }//GEN-LAST:event_botaoPesquisarNomeClienteActionPerformed

    private void pesquisaNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisaNomeClienteActionPerformed

    private void botaoPesquisarAgendaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarAgendaDataActionPerformed
        a1.clear();
        a2.clear();
        try{
            if(pesquisaData.getText().substring(6).equals("    ")){
                JOptionPane.showMessageDialog(null, "Informe um valor válido para o campo das datas!");
            }
            else{
                String dia = pesquisaData.getText().substring(0, 2);
                String mes = pesquisaData.getText().substring(3, 5);
                String ano = pesquisaData.getText().substring( 6);

                String dataBanco = ano + "-" + mes + "-" + dia;
                LocalDate data1 = LocalDate.parse(dataBanco);
                a1 = ac.listarTodasAgendasDataPendente(data1);
                a2 = ac.listarTodasAgendasDataConcluido(data1);

                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setNumRows(0);

                for(Agenda obj : a1){
                    Integer idCliente = obj.getIdcliente();
                    Integer idFuncionario = obj.getIdfun();
                    Cliente c = cc.listarporId(idCliente);
                    Funcionario f = fc.listarporId(idFuncionario);
                    model.addRow(new Object[]{obj.getIdagenda(), obj.getIdfun(), f.getNomef(), obj.getIdcliente(), c.getNomec(), obj.getDia().format(formatoData), obj.getHora(),obj.getDescricao(),obj.getPreco(),obj.getStatus()});
                }  

                for(Agenda obj : a2){
                    Integer idCliente = obj.getIdcliente();
                    Integer idFuncionario = obj.getIdfun();
                    Cliente c = cc.listarporId(idCliente);
                    Funcionario f = fc.listarporId(idFuncionario);
                    model.addRow(new Object[]{obj.getIdagenda(), obj.getIdfun(), f.getNomef(), obj.getIdcliente(), c.getNomec(), obj.getDia().format(formatoData), obj.getHora(),obj.getDescricao(),obj.getPreco(),obj.getStatus()});
                }
            }
         } catch(Exception e){
             JOptionPane.showMessageDialog(null, "Informe um valor válido para o campo das datas!");
         }
    }//GEN-LAST:event_botaoPesquisarAgendaDataActionPerformed

    private void pesquisaDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaDataActionPerformed
        
    }//GEN-LAST:event_pesquisaDataActionPerformed

    private void menuVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVoltarActionPerformed
        
    }//GEN-LAST:event_menuVoltarActionPerformed

    private void menuVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVisualizarActionPerformed
        
    }//GEN-LAST:event_menuVisualizarActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair do sistema? ", "Atenção", JOptionPane.YES_NO_OPTION);
        if(sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_menuSairActionPerformed

    private void ordemServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordemServicoActionPerformed
        Integer row = jTable1.getSelectedRow();
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Selecione a agenda na tabela para que a sua ordem de serviço possa ser exibida.");
        }
        else{
            Integer id = (Integer) jTable1.getValueAt(row, 0);
            Agenda a1 = ac.listarporId(id);
            Cliente c = cc.listarporId(a1.getIdcliente());
            Funcionario f = fc.listarporId(a1.getIdfun());
            TelaOrdemServico tos = new TelaOrdemServico();
            tos.nomeCliente.setText(c.getNomec());
            tos.celularCliente.setText(c.getCelularc());
            tos.cepCliente.setText(c.getCep());
            tos.enderecoCliente.setText(c.getEndereco());
            tos.numeroCliente.setText(c.getNumero().toString());
            tos.complementoCliente.setText(c.getComplemento());
            tos.bairroCliente.setText(c.getBairro());
            tos.municipioCliente.setText(c.getMunicipio());
            tos.estadoCliente.setText(c.getEndereco());
            tos.dataVisita.setText(a1.getDia().format(formatoData));
            tos.horarioVisita.setText(a1.getHora());
            tos.descricaoServico.setText(a1.getDescricao());
            tos.situacaoAgendamento.setText(a1.getStatus());
            tos.nomeFuncionario.setText(f.getNomef());
            tos.celularFuncionario.setText(f.getCelularf());
            tos.descricaoSolucao.setText(a1.getFormf());
            tos.idagenda = a1.getIdagenda();
            tos.setVisible(true);
        }
    }//GEN-LAST:event_ordemServicoActionPerformed

    private void servicosConcluidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicosConcluidosActionPerformed
        a2.clear();
        a2 = ac.listarTodasAgendasConcluidas();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);

        for(Agenda obj1 : a2){
            Integer idCliente = obj1.getIdcliente();
            Integer idFuncionario = obj1.getIdfun();
            Cliente c1 = cc.listarporId(idCliente);
            Funcionario f1 = fc.listarporId(idFuncionario);
            model.addRow(new Object[]{obj1.getIdagenda(), obj1.getIdfun(), f1.getNomef(), obj1.getIdcliente(), c1.getNomec(), obj1.getDia().format(formatoData), obj1.getHora(),obj1.getDescricao(),obj1.getPreco(),obj1.getStatus()});
        }
    }//GEN-LAST:event_servicosConcluidosActionPerformed

    private void servicosPendentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicosPendentesActionPerformed
        a1.clear();
        a1 = ac.listarTodasAgendasPendentes();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);

        for(Agenda obj : a1){
            Integer idCliente = obj.getIdcliente();
            Integer idFuncionario = obj.getIdfun();
            Cliente c = cc.listarporId(idCliente);
            Funcionario f = fc.listarporId(idFuncionario);
            model.addRow(new Object[]{obj.getIdagenda(), obj.getIdfun(), f.getNomef(), obj.getIdcliente(), c.getNomec(), obj.getDia().format(formatoData), obj.getHora(),obj.getDescricao(),obj.getPreco(),obj.getStatus()});
        }
    }//GEN-LAST:event_servicosPendentesActionPerformed

    private void todosServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosServicosActionPerformed
        a1.clear();
        a2.clear();
        a1 = ac.listarTodasAgendasPendentes();
        a2 = ac.listarTodasAgendasConcluidas();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);

        for(Agenda obj : a1){
            Integer idCliente = obj.getIdcliente();
            Integer idFuncionario = obj.getIdfun();
            Cliente c = cc.listarporId(idCliente);
            Funcionario f = fc.listarporId(idFuncionario);
            model.addRow(new Object[]{obj.getIdagenda(), obj.getIdfun(), f.getNomef(), obj.getIdcliente(), c.getNomec(), obj.getDia().format(formatoData), obj.getHora(),obj.getDescricao(),obj.getPreco(),obj.getStatus()});
        }
        for(Agenda obj1 : a2){
            Integer idCliente = obj1.getIdcliente();
            Integer idFuncionario = obj1.getIdfun();
            Cliente c1 = cc.listarporId(idCliente);
            Funcionario f1 = fc.listarporId(idFuncionario);
            model.addRow(new Object[]{obj1.getIdagenda(), obj1.getIdfun(), f1.getNomef(), obj1.getIdcliente(), c1.getNomec(), obj1.getDia().format(formatoData), obj1.getHora(),obj1.getDescricao(),obj1.getPreco(),obj1.getStatus()});
        }
    }//GEN-LAST:event_todosServicosActionPerformed

    private void menuVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVoltarMouseClicked
        dispose();
    }//GEN-LAST:event_menuVoltarMouseClicked

    private void excluirAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirAgendamentoActionPerformed
        Integer row = jTable1.getSelectedRow();
        if(row < 0){
            JOptionPane.showMessageDialog(null, "Selecione a agenda na tabela para que a mesma possa ser excluída.");
        }
        else{
            Integer id = (Integer) jTable1.getValueAt(row, 0);
            int sair = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar esse agendamento?", "Atenção", JOptionPane.YES_NO_OPTION);
            if(sair == JOptionPane.YES_OPTION){
                ac.apagarAgenda(id);
                JOptionPane.showMessageDialog(null, "Agendamento apagado com sucesso!");
                atualizarTabela();
            }
        } 
    }//GEN-LAST:event_excluirAgendamentoActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        atualizarTabela();
        JOptionPane.showMessageDialog(null, "Tabela Atualizada com Sucesso!");
    }//GEN-LAST:event_jLabel1MouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void botaoPesquisarNomeFuncionarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPesquisarNomeFuncionarioMouseEntered
        botaoPesquisarNomeFuncionario.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botaoPesquisarNomeFuncionarioMouseEntered

    private void botaoPesquisarAgendaDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPesquisarAgendaDataMouseEntered
        botaoPesquisarAgendaData.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botaoPesquisarAgendaDataMouseEntered

    private void botaoPesquisarNomeClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoPesquisarNomeClienteMouseEntered
        botaoPesquisarNomeCliente.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_botaoPesquisarNomeClienteMouseEntered

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void excluirAgendamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_excluirAgendamentoMouseEntered
        excluirAgendamento.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_excluirAgendamentoMouseEntered

    private void alterarAgendamentoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alterarAgendamentoMouseEntered
        alterarAgendamento.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_alterarAgendamentoMouseEntered

    private void pesquisaNomeFuncionarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pesquisaNomeFuncionarioFocusGained
        pesquisaNomeFuncionario.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        pesquisaNomeFuncionario.setBorder(BorderFactory.createCompoundBorder(pesquisaNomeFuncionario.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        pesquisaData.setText("");
        pesquisaNomeCliente.setText("");
    }//GEN-LAST:event_pesquisaNomeFuncionarioFocusGained

    private void pesquisaNomeFuncionarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pesquisaNomeFuncionarioFocusLost
        pesquisaNomeFuncionario.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        pesquisaNomeFuncionario.setBorder(BorderFactory.createCompoundBorder(pesquisaNomeFuncionario.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_pesquisaNomeFuncionarioFocusLost

    private void pesquisaDataFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pesquisaDataFocusGained
        pesquisaData.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        pesquisaData.setBorder(BorderFactory.createCompoundBorder(pesquisaData.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        pesquisaNomeFuncionario.setText("");
        pesquisaNomeCliente.setText("");
    }//GEN-LAST:event_pesquisaDataFocusGained

    private void pesquisaDataFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pesquisaDataFocusLost
        pesquisaData.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        pesquisaData.setBorder(BorderFactory.createCompoundBorder(pesquisaData.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_pesquisaDataFocusLost

    private void pesquisaNomeClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pesquisaNomeClienteFocusGained
        pesquisaNomeCliente.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        pesquisaNomeCliente.setBorder(BorderFactory.createCompoundBorder(pesquisaNomeCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        pesquisaNomeFuncionario.setText("");
        pesquisaData.setText("");
    }//GEN-LAST:event_pesquisaNomeClienteFocusGained

    private void pesquisaNomeClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pesquisaNomeClienteFocusLost
        pesquisaNomeCliente.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        pesquisaNomeCliente.setBorder(BorderFactory.createCompoundBorder(pesquisaNomeCliente.getBorder(), BorderFactory.createEmptyBorder(5, 5, 5, 5)));
    }//GEN-LAST:event_pesquisaNomeClienteFocusLost

    public void atualizarTabela(){
        a1.clear();
        a2.clear();
        a1 = ac.listarTodasAgendasPendentes();
        a2 = ac.listarTodasAgendasConcluidas();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
   
        for(Agenda obj : a1){
            Integer idCliente = obj.getIdcliente();
            Integer idFuncionario = obj.getIdfun();
            Cliente c = cc.listarporId(idCliente);
            Funcionario f = fc.listarporId(idFuncionario);
            model.addRow(new Object[]{obj.getIdagenda(), obj.getIdfun(), f.getNomef(), obj.getIdcliente(), c.getNomec(), obj.getDia().format(formatoData), obj.getHora(),obj.getDescricao(),obj.getPreco(),obj.getStatus()});
        }  
        for(Agenda obj1 : a2){
            Integer idCliente = obj1.getIdcliente();
            Integer idFuncionario = obj1.getIdfun();
            Cliente c1 = cc.listarporId(idCliente);
            Funcionario f1 = fc.listarporId(idFuncionario);
            model.addRow(new Object[]{obj1.getIdagenda(), obj1.getIdfun(), f1.getNomef(), obj1.getIdcliente(), c1.getNomec(), obj1.getDia().format(formatoData), obj1.getHora(),obj1.getDescricao(),obj1.getPreco(),obj1.getStatus()});
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
                new TelaAgendamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarAgendamento;
    private javax.swing.JButton botaoPesquisarAgendaData;
    private javax.swing.JButton botaoPesquisarNomeCliente;
    private javax.swing.JButton botaoPesquisarNomeFuncionario;
    private javax.swing.JButton excluirAgendamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTable jTable1;
    private javax.swing.JMenu menuOpcoes;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenu menuVisualizar;
    private javax.swing.JMenu menuVoltar;
    private javax.swing.JMenuItem ordemServico;
    private javax.swing.JFormattedTextField pesquisaData;
    private javax.swing.JTextField pesquisaNomeCliente;
    private javax.swing.JTextField pesquisaNomeFuncionario;
    private javax.swing.JMenuItem servicosConcluidos;
    private javax.swing.JMenuItem servicosPendentes;
    private javax.swing.JMenuItem todosServicos;
    // End of variables declaration//GEN-END:variables
}
