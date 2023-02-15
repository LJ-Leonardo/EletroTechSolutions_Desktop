package com.senaictti.view;

import com.formdev.flatlaf.FlatLightLaf;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Cursor;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TelaOrdemServico extends javax.swing.JFrame {

    protected Integer idagenda;
    
    public TelaOrdemServico() {
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
        nomeFuncionario = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        celularFuncionario = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        descricaoSolucao = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        situacaoAgendamento = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ORDEM DE SERVIÇO");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORDEM DE SERVIÇO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 800, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nome cliente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        nomeCliente.setEditable(false);
        nomeCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeClienteActionPerformed(evt);
            }
        });
        getContentPane().add(nomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 330, 34));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Celular cliente:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        celularCliente.setEditable(false);
        celularCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        celularCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularClienteActionPerformed(evt);
            }
        });
        getContentPane().add(celularCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 178, 34));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("CEP: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, -1, -1));

        cepCliente.setEditable(false);
        cepCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cepCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepClienteActionPerformed(evt);
            }
        });
        getContentPane().add(cepCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 130, 34));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Endereço:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        enderecoCliente.setEditable(false);
        enderecoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        enderecoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(enderecoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 420, 34));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Número:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        numeroCliente.setEditable(false);
        numeroCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        numeroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroClienteActionPerformed(evt);
            }
        });
        getContentPane().add(numeroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 89, 34));

        bairroCliente.setEditable(false);
        bairroCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bairroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroClienteActionPerformed(evt);
            }
        });
        getContentPane().add(bairroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 198, 34));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Bairro:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        municipioCliente.setEditable(false);
        municipioCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        municipioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                municipioClienteActionPerformed(evt);
            }
        });
        getContentPane().add(municipioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 217, 34));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Município:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        estadoCliente.setEditable(false);
        estadoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        estadoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(estadoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 91, 34));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Estado: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        complementoCliente.setEditable(false);
        complementoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        complementoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complementoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(complementoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 130, 34));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Complemento: ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, -1));

        horarioVisita.setEditable(false);
        horarioVisita.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        horarioVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horarioVisitaActionPerformed(evt);
            }
        });
        getContentPane().add(horarioVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 121, 34));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Horário visita:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        dataVisita.setEditable(false);
        dataVisita.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        dataVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataVisitaActionPerformed(evt);
            }
        });
        getContentPane().add(dataVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 121, 34));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Data visita: ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        descricaoServico.setEditable(false);
        descricaoServico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        descricaoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoServicoActionPerformed(evt);
            }
        });
        getContentPane().add(descricaoServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 227, 34));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Descrição do serviço:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Nome funcionário:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        nomeFuncionario.setEditable(false);
        nomeFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(nomeFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 410, 34));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Celular funcionário:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        celularFuncionario.setEditable(false);
        celularFuncionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        celularFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(celularFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 178, 34));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Descrição da Solução:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, -1));

        descricaoSolucao.setEditable(false);
        descricaoSolucao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        descricaoSolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descricaoSolucaoActionPerformed(evt);
            }
        });
        getContentPane().add(descricaoSolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 680, 163));

        jButton1.setText("VOLTAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, 95, 36));

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SALVAR COMO PDF");
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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 670, 161, 37));

        situacaoAgendamento.setEditable(false);
        situacaoAgendamento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        situacaoAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                situacaoAgendamentoActionPerformed(evt);
            }
        });
        getContentPane().add(situacaoAgendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 150, 34));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("Situação agendamento:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/bgOrdem.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        setSize(new java.awt.Dimension(814, 754));
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

    private void nomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeFuncionarioActionPerformed

    private void celularFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celularFuncionarioActionPerformed

    private void descricaoSolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoSolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoSolucaoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Document doc = new Document();
        String pdf = "OrderServico "+idagenda+".pdf";
        try{
            PdfWriter.getInstance(doc, new FileOutputStream(pdf));
            doc.open();
            doc.setPageSize(PageSize.A4);
            
            Paragraph p = new Paragraph(new Phrase(16F, "ORDEM DE SERVIÇO - ID: " + idagenda, FontFactory.getFont(FontFactory.HELVETICA, 16f, Font.BOLD)));
            p.setAlignment(1);
            doc.add(p);
            p = new Paragraph(" ");
            doc.add(p);
            p = new Paragraph(" ");
            doc.add(p);
            p = new Paragraph(" ");
            doc.add(p);
          
            PdfPTable table1 = new PdfPTable(4);
      
            PdfPCell cel1 = new PdfPCell(new Paragraph(new Phrase(12F, "Nome Cliente:", FontFactory.getFont(FontFactory.HELVETICA, 12f, Font.BOLD))));
            cel1.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel2 = new PdfPCell(new Paragraph(new Phrase(12F, "Telefone Cliente:", FontFactory.getFont(FontFactory.HELVETICA, 12f, Font.BOLD))));
            cel2.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel17 = new PdfPCell(new Paragraph(" "));
            cel17.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel18 = new PdfPCell(new Paragraph(" "));
            cel18.setBorder(Rectangle.NO_BORDER);
            table1.addCell(cel1);
            table1.addCell(cel17);
            table1.addCell(cel18);
            table1.addCell(cel2);
            
            cel1 = new PdfPCell(new Paragraph(nomeCliente.getText()));
            cel1.setBorder(Rectangle.NO_BORDER);
            cel2 = new PdfPCell(new Paragraph(celularCliente.getText()));    
            cel2.setBorder(Rectangle.NO_BORDER);
            cel17 = new PdfPCell(new Paragraph(" "));
            cel17.setBorder(Rectangle.NO_BORDER);
            cel18 = new PdfPCell(new Paragraph(" "));
            cel18.setBorder(Rectangle.NO_BORDER);
            
            table1.addCell(cel1);
            table1.addCell(cel17);
            table1.addCell(cel18);
            table1.addCell(cel2);

            doc.add(table1);
            
            p = new Paragraph(" ");
            doc.add(p);
            p = new Paragraph(" ");
            doc.add(p);
            p = new Paragraph(" ");
            doc.add(p);
            
            PdfPTable table2 = new PdfPTable(4);
            PdfPCell cel3 = new PdfPCell(new Paragraph(new Phrase(12F, "Endereço:", FontFactory.getFont(FontFactory.HELVETICA, 12f, Font.BOLD))));
            cel3.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel4 = new PdfPCell(new Paragraph(new Phrase(12F, "CEP:", FontFactory.getFont(FontFactory.HELVETICA, 12f, Font.BOLD))));
            cel4.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel5 = new PdfPCell(new Paragraph(new Phrase(12F, "Número:", FontFactory.getFont(FontFactory.HELVETICA, 12f, Font.BOLD))));
            cel5.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel19 = new PdfPCell(new Paragraph(" "));
            cel19.setBorder(Rectangle.NO_BORDER);
            table2.addCell(cel3);
            table2.addCell(cel19);
            table2.addCell(cel4);
            table2.addCell(cel5);
       
            cel3 = new PdfPCell(new Paragraph(enderecoCliente.getText()));
            cel3.setBorder(Rectangle.NO_BORDER);
            cel4 = new PdfPCell(new Paragraph(cepCliente.getText()));
            cel4.setBorder(Rectangle.NO_BORDER);
            cel5 = new PdfPCell(new Paragraph(numeroCliente.getText()));
            cel5.setBorder(Rectangle.NO_BORDER);
            cel19 = new PdfPCell(new Paragraph(" "));
            cel19.setBorder(Rectangle.NO_BORDER);
            table2.addCell(cel3);
            table2.addCell(cel19);
            table2.addCell(cel4);
            table2.addCell(cel5);
       
            doc.add(table2);
            
            p = new Paragraph(" ");
            doc.add(p);
            p = new Paragraph(" ");
            doc.add(p);
            p = new Paragraph(" ");
            doc.add(p);
            
            PdfPTable table3 = new PdfPTable(4);
            PdfPCell cel6 = new PdfPCell(new Paragraph(new Phrase(12F, "Complemento:", FontFactory.getFont(FontFactory.HELVETICA, 12f, Font.BOLD))));
            cel6.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel7 = new PdfPCell(new Paragraph(new Phrase(12F, "Bairro:", FontFactory.getFont(FontFactory.HELVETICA, 12f, Font.BOLD))));
            cel7.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel8 = new PdfPCell(new Paragraph(new Phrase(12F, "Município:", FontFactory.getFont(FontFactory.HELVETICA, 12f, Font.BOLD))));
            cel8.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel9 = new PdfPCell(new Paragraph(new Phrase(12F, "Estado:", FontFactory.getFont(FontFactory.HELVETICA, 12f, Font.BOLD))));
            cel9.setBorder(Rectangle.NO_BORDER);
            table3.addCell(cel6);
            table3.addCell(cel7);
            table3.addCell(cel8);
            table3.addCell(cel9);
            cel6 = new PdfPCell(new Paragraph(complementoCliente.getText()));
            cel6.setBorder(Rectangle.NO_BORDER);
            cel7 = new PdfPCell(new Paragraph(bairroCliente.getText()));
            cel7.setBorder(Rectangle.NO_BORDER);
            cel8 = new PdfPCell(new Paragraph(municipioCliente.getText()));
            cel8.setBorder(Rectangle.NO_BORDER);
            cel9 = new PdfPCell(new Paragraph(estadoCliente.getText()));
            cel9.setBorder(Rectangle.NO_BORDER);
            table3.addCell(cel6);
            table3.addCell(cel7);
            table3.addCell(cel8);
            table3.addCell(cel9);
            doc.add(table3);
            
            p = new Paragraph(" ");
            doc.add(p);
            p = new Paragraph(" ");
            doc.add(p);
            p = new Paragraph(" ");
            doc.add(p);
            
            PdfPTable table4 = new PdfPTable(4);
            PdfPCell cel10 = new PdfPCell(new Paragraph(new Phrase(12F, "Data:", FontFactory.getFont(FontFactory.HELVETICA, 12f, Font.BOLD))));
            cel10.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel11 = new PdfPCell(new Paragraph(new Phrase(12F, "Horário:", FontFactory.getFont(FontFactory.HELVETICA, 12f, Font.BOLD))));
            cel11.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel12 = new PdfPCell(new Paragraph(new Phrase(12F, "Descrição do Problema:", FontFactory.getFont(FontFactory.HELVETICA, 12f, Font.BOLD))));
            cel12.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel13 = new PdfPCell(new Paragraph(new Phrase(12F, "Situação:", FontFactory.getFont(FontFactory.HELVETICA, 12f, Font.BOLD))));
            cel13.setBorder(Rectangle.NO_BORDER);
            table4.addCell(cel10);
            table4.addCell(cel11);
            table4.addCell(cel12);
            table4.addCell(cel13);
            cel10 = new PdfPCell(new Paragraph(dataVisita.getText()));
            cel10.setBorder(Rectangle.NO_BORDER);
            cel11 = new PdfPCell(new Paragraph(horarioVisita.getText()));
            cel11.setBorder(Rectangle.NO_BORDER);
            cel12 = new PdfPCell(new Paragraph(descricaoServico.getText()));
            cel12.setBorder(Rectangle.NO_BORDER);
            cel13 = new PdfPCell(new Paragraph(situacaoAgendamento.getText()));
            cel13.setBorder(Rectangle.NO_BORDER);
            table4.addCell(cel10);
            table4.addCell(cel11);
            table4.addCell(cel12);
            table4.addCell(cel13);
            doc.add(table4);
            
            p = new Paragraph(" ");
            doc.add(p);
            p = new Paragraph(" ");
            doc.add(p);
            p = new Paragraph(" ");
            doc.add(p);
            p = new Paragraph(" ");
            doc.add(p);
            p = new Paragraph(" ");
            doc.add(p);
            p = new Paragraph(" ");
            doc.add(p);
            
            PdfPTable table5 = new PdfPTable(4);
           
            PdfPCell cel14 = new PdfPCell(new Paragraph(new Phrase(12F, "Funcionário Responsável:", FontFactory.getFont(FontFactory.HELVETICA, 12f, Font.BOLD))));
            cel14.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel15 = new PdfPCell(new Paragraph(new Phrase(12F, "Telefone:", FontFactory.getFont(FontFactory.HELVETICA, 12f, Font.BOLD))));
            cel15.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel20 = new PdfPCell(new Paragraph(" "));
            cel20.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel21 = new PdfPCell(new Paragraph(" "));
            cel21.setBorder(Rectangle.NO_BORDER);
            table5.addCell(cel14);
            table5.addCell(cel20);
            table5.addCell(cel21);
            table5.addCell(cel15);

            cel14 = new PdfPCell(new Paragraph(nomeFuncionario.getText()));
            cel14.setBorder(Rectangle.NO_BORDER);
            cel15 = new PdfPCell(new Paragraph(celularFuncionario.getText()));
            cel15.setBorder(Rectangle.NO_BORDER);
            cel20 = new PdfPCell(new Paragraph(" "));
            cel20.setBorder(Rectangle.NO_BORDER);
            cel21 = new PdfPCell(new Paragraph(" "));
            cel21.setBorder(Rectangle.NO_BORDER);
            table5.addCell(cel14);
            table5.addCell(cel20);
            table5.addCell(cel21);
            table5.addCell(cel15);
    
            doc.add(table5);
            
            p = new Paragraph(" ");
            doc.add(p);
            p = new Paragraph(" ");
            doc.add(p);
            
            
            PdfPTable table6 = new PdfPTable(4);
           
            PdfPCell cel16 = new PdfPCell(new Paragraph(new Phrase(12F, "Descrição da Solução:", FontFactory.getFont(FontFactory.HELVETICA, 12f, Font.BOLD))));
            cel16.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel22 = new PdfPCell(new Paragraph(" "));
            cel22.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel23 = new PdfPCell(new Paragraph(" "));
            cel23.setBorder(Rectangle.NO_BORDER);
            PdfPCell cel24 = new PdfPCell(new Paragraph(" "));
            cel24.setBorder(Rectangle.NO_BORDER);
            table6.addCell(cel16);
            table6.addCell(cel22);
            table6.addCell(cel23);
            table6.addCell(cel24);
        
            cel16 = new PdfPCell(new Paragraph(descricaoSolucao.getText()));
            cel16.setBorder(Rectangle.NO_BORDER);
            cel22 = new PdfPCell(new Paragraph(" "));
            cel22.setBorder(Rectangle.NO_BORDER);
            cel23 = new PdfPCell(new Paragraph(" "));
            cel23.setBorder(Rectangle.NO_BORDER);
            cel24 = new PdfPCell(new Paragraph(" "));
            cel24.setBorder(Rectangle.NO_BORDER);
            table6.addCell(cel16);
            table6.addCell(cel22);
            table6.addCell(cel23);
            table6.addCell(cel24);
            doc.add(table6);
            
            p = new Paragraph(" ");
            doc.add(p);
            p = new Paragraph(" ");
            doc.add(p);
            
            doc.close();
            Desktop.getDesktop().open(new File(pdf));
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void situacaoAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_situacaoAgendamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_situacaoAgendamentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jButton2MouseEntered

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch(UnsupportedLookAndFeelException ex) {
            System.err.println( "Failed to initialize LaF");
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOrdemServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField bairroCliente;
    protected javax.swing.JTextField celularCliente;
    protected javax.swing.JTextField celularFuncionario;
    protected javax.swing.JTextField cepCliente;
    protected javax.swing.JTextField complementoCliente;
    protected javax.swing.JTextField dataVisita;
    protected javax.swing.JTextField descricaoServico;
    protected javax.swing.JTextField descricaoSolucao;
    protected javax.swing.JTextField enderecoCliente;
    protected javax.swing.JTextField estadoCliente;
    protected javax.swing.JTextField horarioVisita;
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
    protected javax.swing.JTextField nomeFuncionario;
    protected javax.swing.JTextField numeroCliente;
    protected javax.swing.JTextField situacaoAgendamento;
    // End of variables declaration//GEN-END:variables
}
