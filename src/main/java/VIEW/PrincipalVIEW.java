package VIEW;

import DAO.ClienteDAO;
import DAO.VeiculoDAO;
import DTO.ClienteDTO;
import DTO.VeiculoDTO;
import DTO.AluguelDTO;
import DAO.AluguelDAO;
import java.awt.Color;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PrincipalVIEW extends javax.swing.JFrame {

    SimpleDateFormat form = new SimpleDateFormat("dd-MM-yyyy"); //TRANSFORMAR A DATA PARA O FORMATO QUE CONHECEMOS.

    /**
     * Creates new form PrincipalVIEW
     */
    public PrincipalVIEW() {
        initComponents();
        listarAluguel();
        listarStatus();

        //-----------------------------------
        //INICIALIZA A PÁGINA MAXIMIZADA
        //-----------------------------------
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAlu = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaEntregue = new javax.swing.JTable();
        btnAlugar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        IdBuscaC = new javax.swing.JLabel();
        IdBuscaV = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPesqPer = new javax.swing.JButton();
        txtP1D = new javax.swing.JComboBox<>();
        txtP1M = new javax.swing.JComboBox<>();
        txtP1A = new javax.swing.JComboBox<>();
        txtP2D = new javax.swing.JComboBox<>();
        txtP2M = new javax.swing.JComboBox<>();
        txtP2A = new javax.swing.JComboBox<>();
        cbStatus = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCliente = new javax.swing.JMenu();
        mnVeiculo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");

        jPanel1.setBackground(new java.awt.Color(239, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelaAlu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome Cliente", "Modelo", "Data do Aluguel", "Valor do Aluguel"
            }
        ));
        tabelaAlu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAluMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAlu);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 510, 290));

        tabelaEntregue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Modelo", "Data do Aluguel", "Data da Entrega", "Entregue"
            }
        ));
        tabelaEntregue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEntregueMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaEntregue);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 460, 290));

        btnAlugar.setBackground(new java.awt.Color(60, 0, 90));
        btnAlugar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnAlugar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlugar.setText("Alugar");
        btnAlugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlugarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlugarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlugarMouseExited(evt);
            }
        });
        btnAlugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlugarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAlugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, 160, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/20230402_202120_0000.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, -130, -1, -1));

        IdBuscaC.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        IdBuscaC.setForeground(new java.awt.Color(60, 0, 90));
        IdBuscaC.setText("Período:");
        jPanel1.add(IdBuscaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 20));

        IdBuscaV.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        IdBuscaV.setForeground(new java.awt.Color(60, 0, 90));
        IdBuscaV.setText("Status:");
        jPanel1.add(IdBuscaV, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 230, 130, 20));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        jLabel2.setText("até");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 50, 30));

        btnPesqPer.setBackground(new java.awt.Color(60, 0, 90));
        btnPesqPer.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnPesqPer.setForeground(new java.awt.Color(255, 255, 255));
        btnPesqPer.setText("Pesquisar");
        btnPesqPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqPerActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesqPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 120, -1));

        txtP1D.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(txtP1D, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, -1));

        txtP1M.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        txtP1M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtP1MActionPerformed(evt);
            }
        });
        jPanel1.add(txtP1M, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 50, -1));

        txtP1A.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        jPanel1.add(txtP1A, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 60, -1));

        txtP2D.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel1.add(txtP2D, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 50, -1));

        txtP2M.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jPanel1.add(txtP2M, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 50, -1));

        txtP2A.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        jPanel1.add(txtP2A, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 60, -1));

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "S", "N" }));
        cbStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbStatusItemStateChanged(evt);
            }
        });
        jPanel1.add(cbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 250, -1, -1));

        jMenuBar1.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N

        mnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8-usuário-masculino-tipo-de-pele-com-círculo-1-2.gif"))); // NOI18N
        mnCliente.setText("Cliente");
        mnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnCliente.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        mnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnClienteMouseClicked(evt);
            }
        });
        mnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnClienteActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnCliente);

        mnVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/car_telPrinc.gif"))); // NOI18N
        mnVeiculo.setText("Veículo");
        mnVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnVeiculo.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        mnVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnVeiculoMouseClicked(evt);
            }
        });
        mnVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnVeiculoActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnVeiculo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnClienteActionPerformed

    }//GEN-LAST:event_mnClienteActionPerformed

    private void mnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnClienteMouseClicked
        frmCliente fClien = new frmCliente();
        fClien.setVisible(true);
    }//GEN-LAST:event_mnClienteMouseClicked

    private void mnVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnVeiculoActionPerformed

    }//GEN-LAST:event_mnVeiculoActionPerformed

    private void mnVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnVeiculoMouseClicked
        frmVeiculo fVei = new frmVeiculo();
        fVei.setVisible(true);
    }//GEN-LAST:event_mnVeiculoMouseClicked

    private void btnAlugarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlugarMouseEntered
        btnAlugar.setForeground(Color.decode("#3C005A"));
        btnAlugar.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnAlugarMouseEntered

    private void btnAlugarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlugarMouseExited
        btnAlugar.setBackground(Color.decode("#3C005A"));
        btnAlugar.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnAlugarMouseExited

    private void tabelaAluMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAluMouseClicked

    }//GEN-LAST:event_tabelaAluMouseClicked

    private void btnAlugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlugarActionPerformed
        frmAluguel frmAlu = new frmAluguel();
        frmAlu.setVisible(true);
        /*
        frmAlu.txtModelo.setText(tabelaPV.getValueAt(tabelaPC.getSelectedRow(), 0).toString());
        frmAlu.txtNomeC.setText(tabelaPC.getValueAt(tabelaPC.getSelectedRow(), 0).toString());
        frmAlu.txtPlaca.setText(tabelaPC.getValueAt(tabelaPV.getSelectedRow(), 2).toString());
        frmAlu.txtCpf.setText(tabelaPC.getValueAt(tabelaPC.getSelectedRow(), 1).toString());
        /* txtModelo.setText(tabelaCl.getValueAt(tabelaCl.getSelectedRow(), 0).toString());
            txtEndereco.setText(tabelaCl.getValueAt(tabelaCl.getSelectedRow(), 1).toString());
            cbUF.setSelectedItem(tabelaCl.getValueAt(tabelaCl.getSelectedRow(), 2).toString());
            txtCpf.setText(tabelaCl.getValueAt(tabelaCl.getSelectedRow(), 3).toString());
            txtTelefone.setText(tabelaCl.getValueAt(tabelaCl.getSelectedRow(), 4).toString());
            txtEmail.setText(tabelaCl.getValueAt(tabelaCl.getSelectedRow(), 5).toString());
            txtId.setText(tabelaCl.getValueAt(tabelaCl.getSelectedRow(), 6).toString()); */
    }//GEN-LAST:event_btnAlugarActionPerformed

    private void btnAlugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlugarMouseClicked

    }//GEN-LAST:event_btnAlugarMouseClicked

    private void tabelaEntregueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEntregueMouseClicked

    }//GEN-LAST:event_tabelaEntregueMouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        listarAluguel();
    }//GEN-LAST:event_jPanel1MouseClicked

    private void btnPesqPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqPerActionPerformed
        //RECEBE A DATA INICIAL DO PERIODO
        String dataAl1 = txtP1A.getSelectedItem() + "-" + txtP1M.getSelectedItem() + "-" + txtP1D.getSelectedItem();  
        //RECEBE A DATA FINAL DO PERIODO
        String dataAl2 = txtP2A.getSelectedItem() + "-" + txtP2M.getSelectedItem() + "-" + txtP2D.getSelectedItem();

        // CRIAÇÃO DO OBJ E DA LISTA QUE TERÁ O RETORNO DO DADOS.
        AluguelDAO obj = new AluguelDAO();
        ArrayList<AluguelDTO> lista = obj.buscarAluguel(dataAl1, dataAl2);
        DefaultTableModel dados = (DefaultTableModel) tabelaAlu.getModel(); // INSTANCIANDO O MODO PADRÃO DA TABELA
        dados.setNumRows(0);

        for (AluguelDTO a : lista) {
            dados.addRow(new Object[]{ // A CADA REGISTRO NO BANCO DE DADOS, ELE SERÁ SETADO OS DADOS.
                a.getNomeCliente(),
                a.getModelo(),
                a.getDataAluguel(),
                a.getValor()
            });
        }
    }//GEN-LAST:event_btnPesqPerActionPerformed

    private void txtP1MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtP1MActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtP1MActionPerformed

    private void cbStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbStatusItemStateChanged

        String opt = cbStatus.getSelectedItem().toString(); // SEGURANDO A ESCOLHA NO COMBOBOX DO STATUS

        if (opt == "Todos") {            // IF PARA CADA ESCOLHA.
            listarStatus();            
        } else if (opt == "S") {
            AluguelDAO dao = new AluguelDAO();
            buscarStatus(opt);
        } else if (opt == "N") {
            AluguelDAO dao = new AluguelDAO();
            buscarStatus(opt);
        }
    }//GEN-LAST:event_cbStatusItemStateChanged

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
            java.util.logging.Logger.getLogger(PrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalVIEW().setVisible(true);
            }
        });
    }

    /*private void listarClientes() {
        try {
            ClienteDAO userdao = new ClienteDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaAlu.getModel();
            model.setNumRows(0);

            ArrayList<ClienteDTO> lista = userdao.PesquisarCliente();

            for (int rows = 0; rows < lista.size(); rows++) {
                model.addRow(new Object[]{
                    lista.get(rows).getNomeCliente(),
                    lista.get(rows).getCpf(),
                    lista.get(rows).getEmail(),
                    lista.get(rows).getTelefone()
                });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Usuarios View" + erro);
        }

    }
    
    
    private void listarVeiculos() {
        try {
            VeiculoDAO userdao = new VeiculoDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaEntregue.getModel();
            model.setNumRows(0);
            ArrayList<VeiculoDTO> lista = userdao.pesquisarVeiculo();

            for (int rows = 0; rows < lista.size(); rows++) {
                model.addRow(new Object[]{
                    lista.get(rows).getNome(),
                    lista.get(rows).getNumero(),
                    lista.get(rows).getPlaca(),
                    lista.get(rows).getQtdPortas()
                });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Usuarios View" + erro);
        }
    }
    */
    
    // LISTA DE VEICULOS ALUGADOS
    public void listarAluguel() { //TABELA DA ESQUERDA

        AluguelDAO obj = new AluguelDAO();
        List<AluguelDTO> lista = obj.pesquisarAluguel();
        DefaultTableModel dados = (DefaultTableModel) tabelaAlu.getModel(); // INSTANCIANDO O MODO PADRÃO DA TABELA
        dados.setNumRows(0);

        for (AluguelDTO a : lista) {
            dados.addRow(new Object[]{ // A CADA REGISTRO NO BANCO DE DADOS, ELE SERÁ SETADO OS DADOS.
                a.getNomeCliente(),
                a.getModelo(),
                a.getDataAluguel(),
                a.getValor()
            });
        }
    }
    // LISTA DO STATUS DE CADA ALUGUEL
    public void listarStatus() { //LISTA DA DIREITA
        
        AluguelDAO obj = new AluguelDAO();
        List<AluguelDTO> lista = obj.pesquisarAluguel();
        DefaultTableModel dados = (DefaultTableModel) tabelaEntregue.getModel(); // INSTANCIANDO O MODO PADRÃO DA TABELA
        dados.setNumRows(0);

        for (AluguelDTO a : lista) {
            dados.addRow(new Object[]{ // A CADA REGISTRO NO BANCO DE DADOS, ELE SERÁ SETADO OS DADOS.
                a.getModelo(),
                a.getDataAluguel(),
                a.getDataEntrega(),
                a.getEntregue()
            }
            );
        }
    }
    // METODO DE BUSCA PELO COMBOBOX, RECEBENDO A ESCOLHA E RETORNANDO A LISTA.
    public void buscarStatus(String opt) { 
        AluguelDAO obj = new AluguelDAO();
        List<AluguelDTO> lista = obj.buscarAluguel(opt);
        DefaultTableModel dados = (DefaultTableModel) tabelaEntregue.getModel(); // INSTANCIANDO O MODO PADRÃO DA TABELA
        dados.setNumRows(0);

        for (AluguelDTO a : lista) {
            dados.addRow(new Object[]{ // A CADA REGISTRO NO BANCO DE DADOS, ELE SERÁ SETADO OS DADOS.
                a.getModelo(),
                a.getDataAluguel(),
                a.getDataEntrega(),
                a.getEntregue()
            }
            );
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdBuscaC;
    private javax.swing.JLabel IdBuscaV;
    private javax.swing.JButton btnAlugar;
    private javax.swing.JButton btnPesqPer;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu mnCliente;
    private javax.swing.JMenu mnVeiculo;
    private javax.swing.JTable tabelaAlu;
    private javax.swing.JTable tabelaEntregue;
    private javax.swing.JComboBox<String> txtP1A;
    private javax.swing.JComboBox<String> txtP1D;
    private javax.swing.JComboBox<String> txtP1M;
    private javax.swing.JComboBox<String> txtP2A;
    private javax.swing.JComboBox<String> txtP2D;
    private javax.swing.JComboBox<String> txtP2M;
    // End of variables declaration//GEN-END:variables
}
