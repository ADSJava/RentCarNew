package VIEW;

import DAO.AluguelDAO;
import DAO.ClienteDAO;
import DAO.VeiculoDAO;
import DTO.AluguelDTO;
import DTO.ClienteDTO;
import DTO.VeiculoDTO;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.ComboBoxModel;

public class frmAluguel extends JDialog {

    int resp;
    SimpleDateFormat form = new SimpleDateFormat("yyyy/MM/dd");   
    ArrayList<String> placa = new ArrayList<>();
    ArrayList<String> cpf = new ArrayList<>();

    public frmAluguel() {
        initComponents();
        modeloComboBox();
        nomeComboBox();
        abaDados.setSelectedIndex(0);
        this.IdVe.setVisible(false);
        this.txtIdVe.setVisible(false);
        LimparCampos();

        //BLOQUEIA A TELA DE FUNDO / SÓ PERMITE USAR FRMVEICULO
        this.setModal(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPrincipal = new javax.swing.JPanel();
        abaDados = new javax.swing.JTabbedPane();
        panDados = new javax.swing.JPanel();
        IdValor = new javax.swing.JLabel();
        IdPlaca = new javax.swing.JLabel();
        IdModelo = new javax.swing.JLabel();
        IdCpf = new javax.swing.JLabel();
        IdDataEntrega = new javax.swing.JLabel();
        IdObs = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        IdNomeC = new javax.swing.JLabel();
        btnSalvarAlu = new javax.swing.JButton();
        IdVe = new javax.swing.JLabel();
        txtIdVe = new javax.swing.JTextField();
        IdDataAluguel = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        IdEntregue = new javax.swing.JLabel();
        cbEntregue = new javax.swing.JComboBox<>();
        txtDataE = new javax.swing.JFormattedTextField();
        txtDataA = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacoes = new javax.swing.JTextArea();
        cbModelo = new javax.swing.JComboBox<>();
        cbNomeC = new javax.swing.JComboBox<>();
        panHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Veículo");
        setBackground(new java.awt.Color(0, 204, 204));
        setPreferredSize(new java.awt.Dimension(900, 550));

        panPrincipal.setPreferredSize(new java.awt.Dimension(910, 621));
        panPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abaDados.setForeground(new java.awt.Color(60, 0, 90));
        abaDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abaDados.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        panDados.setForeground(new java.awt.Color(60, 0, 90));
        panDados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panDados.setPreferredSize(new java.awt.Dimension(900, 500));

        IdValor.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdValor.setForeground(new java.awt.Color(60, 0, 90));
        IdValor.setText("Valor:");

        IdPlaca.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdPlaca.setForeground(new java.awt.Color(60, 0, 90));
        IdPlaca.setText("Placa:");

        IdModelo.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdModelo.setForeground(new java.awt.Color(60, 0, 90));
        IdModelo.setText("Modelo:");

        IdCpf.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdCpf.setForeground(new java.awt.Color(60, 0, 90));
        IdCpf.setText("CPF:");

        IdDataEntrega.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdDataEntrega.setForeground(new java.awt.Color(60, 0, 90));
        IdDataEntrega.setText("Data de entrega:");

        IdObs.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdObs.setForeground(new java.awt.Color(60, 0, 90));
        IdObs.setText("Observações:");

        txtValor.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtValor.setPreferredSize(new java.awt.Dimension(64, 19));
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        txtPlaca.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtPlaca.setPreferredSize(new java.awt.Dimension(64, 19));

        IdNomeC.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdNomeC.setForeground(new java.awt.Color(60, 0, 90));
        IdNomeC.setText("Nome:");

        btnSalvarAlu.setBackground(new java.awt.Color(60, 0, 90));
        btnSalvarAlu.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnSalvarAlu.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarAlu.setText("Salvar");
        btnSalvarAlu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarAlu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarAluMouseClicked(evt);
            }
        });
        btnSalvarAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAluActionPerformed(evt);
            }
        });

        IdVe.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdVe.setForeground(new java.awt.Color(60, 0, 90));
        IdVe.setText("Id:");

        txtIdVe.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtIdVe.setPreferredSize(new java.awt.Dimension(64, 19));
        txtIdVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdVeActionPerformed(evt);
            }
        });

        IdDataAluguel.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdDataAluguel.setForeground(new java.awt.Color(60, 0, 90));
        IdDataAluguel.setText("Data do Aluguel:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        IdEntregue.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdEntregue.setForeground(new java.awt.Color(60, 0, 90));
        IdEntregue.setText("Entregue:");

        cbEntregue.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        cbEntregue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "N" }));
        cbEntregue.setPreferredSize(new java.awt.Dimension(70, 25));

        try {
            txtDataE.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataE.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        try {
            txtDataA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataA.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtDataA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataAActionPerformed(evt);
            }
        });

        txtObservacoes.setColumns(20);
        txtObservacoes.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        txtObservacoes.setRows(5);
        jScrollPane1.setViewportView(txtObservacoes);

        cbModelo.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        cbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbModeloActionPerformed(evt);
            }
        });

        cbNomeC.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        cbNomeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNomeCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panDadosLayout = new javax.swing.GroupLayout(panDados);
        panDados.setLayout(panDadosLayout);
        panDadosLayout.setHorizontalGroup(
            panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdValor)
                            .addComponent(IdModelo)
                            .addComponent(IdCpf)
                            .addComponent(IdNomeC)
                            .addComponent(IdPlaca))
                        .addGap(37, 37, 37)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(txtCpf)
                            .addComponent(cbModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbNomeC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdDataEntrega)
                            .addComponent(IdDataAluguel)
                            .addComponent(IdEntregue)
                            .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSalvarAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(IdObs))))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addComponent(IdVe)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdVe, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbEntregue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        panDadosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCpf, txtDataA, txtDataE, txtIdVe, txtPlaca, txtValor});

        panDadosLayout.setVerticalGroup(
            panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(IdModelo)
                        .addComponent(cbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(IdDataEntrega)
                        .addComponent(txtDataE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdNomeC)
                            .addComponent(cbNomeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdPlaca, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdValor))
                        .addGap(25, 25, 25)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdVe)
                            .addComponent(txtIdVe, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(btnSalvarAlu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(173, Short.MAX_VALUE))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdDataAluguel)
                            .addComponent(txtDataA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdEntregue)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDadosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cbEntregue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panDadosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(IdObs))
                            .addGroup(panDadosLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(272, Short.MAX_VALUE))))
        );

        panDadosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCpf, txtDataA, txtDataE, txtIdVe, txtPlaca, txtValor});

        abaDados.addTab("Dados do Aluguel", panDados);

        panPrincipal.add(abaDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 930, 540));

        panHeader.setBackground(new java.awt.Color(178, 128, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 0, 63));
        jLabel1.setText("Alugar Veículo");

        javax.swing.GroupLayout panHeaderLayout = new javax.swing.GroupLayout(panHeader);
        panHeader.setLayout(panHeaderLayout);
        panHeaderLayout.setHorizontalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeaderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panHeaderLayout.setVerticalGroup(
            panHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panHeaderLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        panPrincipal.add(panHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdVeActionPerformed

    private void btnSalvarAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAluActionPerformed

        if (cbModelo.getSelectedItem().equals("") || cbNomeC.equals("") || txtPlaca.getText().equals("")
                || txtCpf.getText().equals("")
                || txtValor.getText().equals("") || cbEntregue.equals("") ||
                txtDataE.getText().equals("") || txtDataA.getText().equals("") ||
                txtObservacoes.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            try {

                /*String dE, mE, aE, dA, mA, aA;
                dE = cbDE.getSelectedItem().toString();
                mE = cbME.getSelectedItem().toString();
                aE = cbAE.getSelectedItem().toString();
                dA = cbDA.getSelectedItem().toString();
                mA = cbMA.getSelectedItem().toString();
                aA = cbAA.getSelectedItem().toString();            
                 */
                String diaE = txtDataE.getText().substring(0, 2);
                String diaA = txtDataA.getText().substring(0, 2);
                String mesE = txtDataE.getText().substring(3, 5);
                String mesA = txtDataA.getText().substring(3, 5);
                String anoE = txtDataE.getText().substring(6);
                String anoA = txtDataA.getText().substring(6);

                String dataEn = anoE + "-" + mesE + "-" + diaE;
                String dataAl = anoA + "-" + mesA + "-" + diaA;

                AluguelDTO obj = new AluguelDTO();
                obj.setModelo(cbModelo.getSelectedItem().toString());
                obj.setNomeCliente(cbNomeC.getSelectedItem().toString());
                obj.setPlacaVeiculo(txtPlaca.getText());
                obj.setCpfCliente(txtCpf.getText());
                obj.setValor(Double.parseDouble(txtValor.getText()));

                obj.setDataEntrega(dataEn);
                obj.setDataAluguel(dataAl);
                obj.setObservacao(txtObservacoes.getText());
                obj.setEntregue(cbEntregue.getSelectedItem().toString());

                AluguelDAO dao = new AluguelDAO();
                dao.cadastrarAluguel(obj);

                JOptionPane.showMessageDialog(null, "Aluguel bem sucedido!");
                LimparCampos();                
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "ERRO CAD:" + erro);
            }
        }    }//GEN-LAST:event_btnSalvarAluActionPerformed

    private void btnSalvarAluMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarAluMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarAluMouseClicked

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtDataAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataAActionPerformed

    private void cbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbModeloActionPerformed
        txtPlaca.setText(placa.get(cbModelo.getSelectedIndex()));
    }//GEN-LAST:event_cbModeloActionPerformed

    private void cbNomeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNomeCActionPerformed
        txtCpf.setText(cpf.get(cbNomeC.getSelectedIndex()));

    }//GEN-LAST:event_cbNomeCActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAluguel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAluguel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAluguel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAluguel.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAluguel().setVisible(true);
            }
        });
    }

    /*private void listarVeiculos() {
        try {
            VeiculoDAO userdao = new VeiculoDAO();

            ComboBoxModel model = cbModelo.getModel();
            model.setSelectedItem(0);
            ArrayList<VeiculoDTO> lista = userdao.pesquisarVeiculo();

            for (int item = 0; item < lista.size(); item++) {
                model.setSelectedItem(new Object[]{
                    lista.get(item).getNome(),
                    lista.get(item).getNumero(),
                    lista.get(item).getPlaca(),
                    lista.get(item).getFabricante(),
                    lista.get(item).getAnoModelo(),
                    lista.get(item).getQtdPortas(),
                    lista.get(item).getAcessorios(),
                    lista.get(item).getIdVeiculo()
                });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Usuarios View" + erro);
        }
    }
     */
    public void LimparCampos() {
        cbModelo.setSelectedItem("");
        cbNomeC.setSelectedItem("");
        txtPlaca.setText("");
        txtCpf.setText("");
        txtValor.setText("");
        txtDataE.setText("");
        txtDataA.setText("");
        txtObservacoes.setText("");
        cbEntregue.setSelectedItem(0);
    }

    public ResultSet modeloComboBox() {

        try {
            VeiculoDAO obj = new VeiculoDAO();
            ResultSet rs = obj.listarModelo();

            while (rs.next()) {
                placa.add(rs.getString(4));                
                cbModelo.addItem(rs.getString(2));
            }

        } catch (Exception e) {
        }
        return null;
    }

    public void nomeComboBox() {

        try {
            ClienteDAO obj = new ClienteDAO();
            ResultSet rs = obj.listarNomes();

            while (rs.next()) {                
                cpf.add(rs.getString(6));
                cbNomeC.addItem(rs.getString(2));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
    }

    /* public void CarregarDados() {
        int setar = tabelaVe.getSelectedRow();
        txtModelo.setText(tabelaVe.getModel().getValueAt(setar, 1).toString());
        txtNum.setText(tabelaVe.getModel().getValueAt(setar, 2).toString());
        txtPlaca.setText(tabelaVe.getModel().getValueAt(setar, 3).toString());
        txtFabricante.setText(tabelaVe.getModel().getValueAt(setar, 4).toString());
        txtAno.setText(tabelaVe.getModel().getValueAt(setar, 5).toString());
        cbQtdPortas.setSelectedItem(tabelaVe.getModel().getValueAt(setar, 6).toString());
        txtAcessorios.setText(tabelaVe.getModel().getValueAt(setar, 7).toString());
    }
     */ /*
 private void AlterarCliente() {
        VeiculoDTO obj = new VeiculoDTO();
        obj.setNome(txtNomeC.getText());
        obj.setNumero(Integer.parseInt(txtValor.getText()));
        obj.setPlaca(txtPlaca.getText());
        obj.setFabricante(txtNomeC.getText());
        obj.setAnoModelo(Integer.parseInt(txtCpf.getText()));
        obj.setQtdPortas(Integer.parseInt(cbQtdPortas.getSelectedItem().toString()));
        obj.setAcessorios(txtObs.getText());

        VeiculoDAO dao = new VeiculoDAO();
        dao.alterarVeiculo(obj);
    }
     */
    public void bloquearCampos() {
        cbModelo.setVisible(false);
        IdModelo.setVisible(false);
        cbNomeC.setVisible(false);
        IdNomeC.setVisible(false);
        txtPlaca.setVisible(false);
        IdPlaca.setVisible(false);
        txtCpf.setVisible(false);
        IdCpf.setVisible(false);
        txtValor.setVisible(false);
        IdValor.setVisible(false);
        IdDataAluguel.setVisible(false);
        IdDataEntrega.setVisible(false);
        /* cbDE.setVisible(false);
        cbME.setVisible(false);
        cbAE.setVisible(false);
        cbDA.setVisible(false);
        cbMA.setVisible(false);
        cbAA.setVisible(false); */
        txtObservacoes.setVisible(false);
        IdObs.setVisible(false);
        cbEntregue.setVisible(false);
        IdEntregue.setVisible(false);
        txtIdVe.setVisible(false);
        IdVe.setVisible(false);
        //setExtendedState(MAXIMIZED_BOTH);
        this.setModal(true);
        LimparCampos();
    }

    public void desbloquearCampos() {
        //listarClientes();
        //panBotCad.setVisible(true);
        //panBotEdit.setVisible(false);

        //TORNANDO OS CAMPOS DE DADOS VISÍVEIS
        cbModelo.setVisible(true);
        IdModelo.setVisible(true);
        cbNomeC.setVisible(true);
        IdNomeC.setVisible(true);
        txtPlaca.setVisible(true);
        IdPlaca.setVisible(true);
        txtCpf.setVisible(true);
        IdCpf.setVisible(true);
        txtValor.setVisible(true);
        IdValor.setVisible(true);
        IdDataAluguel.setVisible(true);
        IdDataEntrega.setVisible(true);
        /* cbDE.setVisible(true);
        cbME.setVisible(true);
        cbAE.setVisible(true);
        cbDA.setVisible(true);
        cbMA.setVisible(true);
        cbAA.setVisible(true); */
        txtObservacoes.setVisible(true);
        IdObs.setVisible(true);
        cbEntregue.setVisible(true);
        IdEntregue.setVisible(true);
        txtIdVe.setVisible(true);
        IdVe.setVisible(true);
        //setExtendedState(MAXIMIZED_BOTH);
        this.setModal(true);
        LimparCampos();

        //setExtendedState(MAXIMIZED_BOTH);
        this.setModal(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdCpf;
    private javax.swing.JLabel IdDataAluguel;
    private javax.swing.JLabel IdDataEntrega;
    private javax.swing.JLabel IdEntregue;
    private javax.swing.JLabel IdModelo;
    private javax.swing.JLabel IdNomeC;
    private javax.swing.JLabel IdObs;
    private javax.swing.JLabel IdPlaca;
    private javax.swing.JLabel IdValor;
    private javax.swing.JLabel IdVe;
    private javax.swing.JTabbedPane abaDados;
    private javax.swing.JButton btnSalvarAlu;
    private javax.swing.JComboBox<String> cbEntregue;
    private javax.swing.JComboBox<String> cbModelo;
    private javax.swing.JComboBox<String> cbNomeC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panDados;
    private javax.swing.JPanel panHeader;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataA;
    private javax.swing.JFormattedTextField txtDataE;
    private javax.swing.JTextField txtIdVe;
    private javax.swing.JTextArea txtObservacoes;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
