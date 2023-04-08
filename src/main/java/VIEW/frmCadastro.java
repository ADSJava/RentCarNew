/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.ClienteDAO;
import DAO.ConexaoDAO;
import DTO.ClienteDTO;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author igora
 */
public class frmCadastro extends JDialog {

    /**
     * Creates new form PrincipalVIEW
     */
    public frmCadastro() {
        initComponents();
        listarClientes();
        //setExtendedState(MAXIMIZED_BOTH);
        this.setModal(true);
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
        labelCadastro = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        labelEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        labelUF = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        labelTelefone = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        txtCpf = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCl = new javax.swing.JTable();
        btnCarregar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");

        jPanel1.setBackground(new java.awt.Color(60, 0, 90));

        labelCadastro.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        labelCadastro.setForeground(new java.awt.Color(255, 255, 255));
        labelCadastro.setText("Cadastro de Cliente");

        jPanel2.setBackground(new java.awt.Color(60, 0, 90));
        jPanel2.setForeground(new java.awt.Color(58, 0, 90));

        labelNome.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        labelNome.setForeground(new java.awt.Color(255, 255, 255));
        labelNome.setText("Nome:");

        labelEndereco.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        labelEndereco.setForeground(new java.awt.Color(255, 255, 255));
        labelEndereco.setText("Endereço:");

        labelUF.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        labelUF.setForeground(new java.awt.Color(255, 255, 255));
        labelUF.setText("UF:");

        labelCPF.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        labelCPF.setForeground(new java.awt.Color(255, 255, 255));
        labelCPF.setText("CPF:");

        labelEmail.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setText("E-mail:");

        labelTelefone.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        labelTelefone.setForeground(new java.awt.Color(255, 255, 255));
        labelTelefone.setText("Telefone:");

        btnCadastrar.setBackground(new java.awt.Color(223, 255, 223));
        btnCadastrar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(63, 125, 63));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseExited(evt);
            }
        });
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(223, 255, 223));
        btnAlterar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(63, 125, 63));
        btnAlterar.setText("Alterar");
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlterarMouseExited(evt);
            }
        });
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEndereco)
                            .addComponent(labelNome)
                            .addComponent(labelCPF)
                            .addComponent(labelEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNome)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelUF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162)
                                .addComponent(jButton1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(199, 199, 199)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEndereco)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelUF)
                            .addComponent(txtUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(1, 1, 1)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCPF)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tabelaCl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Endereço", "UF", "Telefone", "CPF", "E-mail"
            }
        ));
        jScrollPane1.setViewportView(tabelaCl);

        btnCarregar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCarregar.setText("Carregar");
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 331, Short.MAX_VALUE)
                .addComponent(labelCadastro)
                .addContainerGap(336, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(709, Short.MAX_VALUE)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelCadastro)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarregar)
                    .addComponent(btnLimpar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (txtNome.getText().equals("") || txtEndereco.getText().equals("")
                || txtUf.getText().equals("") || txtCpf.getText().equals("")
                || txtTelefone.getText().equals("")
                || txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            Cadastrar();
            listarClientes();
            LimparCampo();
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimparCampo();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        CarregarDados();
        listarClientes();
    }//GEN-LAST:event_btnCarregarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        AlterarCliente();
        listarClientes();
        LimparCampo();
    }//GEN-LAST:event_btnAlterarActionPerformed

    //----------------------------------------------
    // INTERAÇÃO DE CORES (BOTÕES)
    //----------------------------------------------
    private void btnCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseEntered
        btnCadastrar.setForeground(Color.decode("#FFFFFF"));
        btnCadastrar.setBackground(Color.decode("#005a00"));
    }//GEN-LAST:event_btnCadastrarMouseEntered

    private void btnCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseExited
        btnCadastrar.setBackground(Color.decode("#DFFFDF"));
        btnCadastrar.setForeground(Color.decode("#3F7D3F"));
    }//GEN-LAST:event_btnCadastrarMouseExited

    private void btnAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseEntered
        btnAlterar.setForeground(Color.decode("#FFFFFF"));
        btnAlterar.setBackground(Color.decode("#005a00"));
    }//GEN-LAST:event_btnAlterarMouseEntered

    private void btnAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseExited
        btnAlterar.setBackground(Color.decode("#DFFFDF"));
        btnAlterar.setForeground(Color.decode("#3F7D3F"));
    }//GEN-LAST:event_btnAlterarMouseExited

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCadastro;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelUF;
    private javax.swing.JTable tabelaCl;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables

    private void Cadastrar() {
        String nome, endereco, uf, cpf, telefone, email;
        nome = txtNome.getText();
        endereco = txtEndereco.getText();
        uf = txtUf.getText();
        cpf = txtCpf.getText();
        telefone = txtTelefone.getText();
        email = txtEmail.getText();

        ClienteDTO clientedto = new ClienteDTO();
        clientedto.setNomeCliente(nome);
        clientedto.setEndereco(endereco);
        clientedto.setUf(uf);
        clientedto.setCpf(cpf);
        clientedto.setTelefone(telefone);
        clientedto.setEmail(email);

        ClienteDAO clientedao = new ClienteDAO();
        clientedao.cadastrarFuncionario(clientedto);
    }

    private void listarClientes() {
        try {

            ClienteDAO userdao = new ClienteDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaCl.getModel();
            model.setNumRows(0);

            ArrayList<ClienteDTO> lista = userdao.PesquisarCliente();

            for (int rows = 0; rows < lista.size(); rows++) {
                model.addRow(new Object[]{
                    lista.get(rows).getId(),
                    lista.get(rows).getNomeCliente(),
                    lista.get(rows).getEndereco(),
                    lista.get(rows).getUf(),
                    lista.get(rows).getCpf(),
                    lista.get(rows).getTelefone(),
                    lista.get(rows).getEmail()

                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Usuarios View" + erro);
        }

    }

    public void LimparCampo() {

        txtNome.setText("");
        txtEndereco.setText("");
        txtUf.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtNome.requestFocus();
    }

    public void CarregarDados() {
        int setar = tabelaCl.getSelectedRow();
        txtNome.setText(tabelaCl.getModel().getValueAt(setar, 1).toString());
        txtEndereco.setText(tabelaCl.getModel().getValueAt(setar, 2).toString());
        txtUf.setText(tabelaCl.getModel().getValueAt(setar, 3).toString());
        txtCpf.setText(tabelaCl.getModel().getValueAt(setar, 4).toString());
        txtTelefone.setText(tabelaCl.getModel().getValueAt(setar, 5).toString());
        txtEmail.setText(tabelaCl.getModel().getValueAt(setar, 6).toString());

    }

    private void AlterarCliente() {

        String nomeCliente, endereco, uf, telefone, cpf, email;

        nomeCliente = txtNome.getText();
        endereco = txtEndereco.getText();
        uf = txtUf.getText();
        telefone = txtTelefone.getText();
        cpf = txtCpf.getText();
        email = txtEmail.getText();

        ClienteDTO cldto = new ClienteDTO();
        cldto.setNomeCliente(nomeCliente);
        cldto.setEndereco(endereco);
        cldto.setUf(uf);
        cldto.setTelefone(telefone);
        cldto.setCpf(cpf);
        cldto.setEmail(email);

        ClienteDAO cldao = new ClienteDAO();
        cldao.alterarCliente(cldto);

    }

}
