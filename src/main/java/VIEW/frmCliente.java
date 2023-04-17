package VIEW;

import DAO.ClienteDAO;
import DAO.ConexaoDAO;
import DTO.ClienteDTO;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmCliente extends JDialog {

    public frmCliente() {
        initComponents();
        listarClientes();
        panBotCad.setVisible(false);
        panBotEdit.setVisible(false);

        //TORNANDO OS CAMPOS DE DADOS NÃO EDITAVEIS
        this.txtNomeDados.setEnabled(false);
        this.txtEndereco.setEnabled(false);
        this.txtCpf.setEnabled(false);
        this.txtTelefone.setEnabled(false);
        this.txtEmail.setEnabled(false);
        this.cbUF.setEnabled(false);

        //setExtendedState(MAXIMIZED_BOTH);
        this.setModal(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelCadastro = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        abaDados = new javax.swing.JTabbedPane();
        panConsultarClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCl = new javax.swing.JTable();
        labelNome1 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtNomeCons = new javax.swing.JTextField();
        panDadosCliente = new javax.swing.JPanel();
        labelNome = new javax.swing.JLabel();
        labelEndereco = new javax.swing.JLabel();
        txtNomeDados = new javax.swing.JTextField();
        labelCPF = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        labelTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        labelEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        labelUF = new javax.swing.JLabel();
        cbUF = new javax.swing.JComboBox<>();
        txtEndereco = new javax.swing.JTextField();
        panBotCad = new javax.swing.JPanel();
        btnCadastrar = new javax.swing.JButton();
        panBotEdit = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");
        setBackground(new java.awt.Color(221, 221, 221));

        jPanel1.setBackground(new java.awt.Color(178, 128, 255));

        labelCadastro.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        labelCadastro.setForeground(new java.awt.Color(25, 0, 63));
        labelCadastro.setText("Cadastro de Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCadastro)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelCadastro)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(58, 0, 90));

        abaDados.setBackground(new java.awt.Color(255, 255, 255));
        abaDados.setForeground(new java.awt.Color(25, 0, 63));
        abaDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        abaDados.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N

        panConsultarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        tabelaCl.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
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
                "ID", "Nome", "Endereço", "UF", "CPF", "Telefone", "E-mail"
            }
        ));
        jScrollPane1.setViewportView(tabelaCl);

        labelNome1.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        labelNome1.setForeground(new java.awt.Color(60, 0, 90));
        labelNome1.setText("Nome:");

        btnPesquisar.setBackground(new java.awt.Color(60, 0, 90));
        btnPesquisar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseExited(evt);
            }
        });
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnNovo.setBackground(new java.awt.Color(60, 0, 90));
        btnNovo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("NOVO");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNovoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNovoMouseExited(evt);
            }
        });
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(60, 0, 90));
        btnEditar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("EDITAR");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(60, 0, 90));
        btnExcluir.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("EXCLUIR");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExcluirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExcluirMouseExited(evt);
            }
        });

        txtNomeCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeConsActionPerformed(evt);
            }
        });
        txtNomeCons.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeConsKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panConsultarClientesLayout = new javax.swing.GroupLayout(panConsultarClientes);
        panConsultarClientes.setLayout(panConsultarClientesLayout);
        panConsultarClientesLayout.setHorizontalGroup(
            panConsultarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
            .addGroup(panConsultarClientesLayout.createSequentialGroup()
                .addGroup(panConsultarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panConsultarClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelNome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeCons, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar))
                    .addGroup(panConsultarClientesLayout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(btnExcluir)))
                .addContainerGap(272, Short.MAX_VALUE))
        );
        panConsultarClientesLayout.setVerticalGroup(
            panConsultarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panConsultarClientesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panConsultarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(txtNomeCons, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNome1))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panConsultarClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        abaDados.addTab("Consultar Clientes", panConsultarClientes);

        panDadosCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelNome.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        labelNome.setForeground(new java.awt.Color(60, 0, 90));
        labelNome.setText("Nome:");

        labelEndereco.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        labelEndereco.setForeground(new java.awt.Color(60, 0, 90));
        labelEndereco.setText("Endereço:");

        txtNomeDados.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtNomeDados.setPreferredSize(new java.awt.Dimension(64, 19));

        labelCPF.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        labelCPF.setForeground(new java.awt.Color(60, 0, 90));
        labelCPF.setText("CPF:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtCpf.setPreferredSize(new java.awt.Dimension(64, 19));

        labelTelefone.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        labelTelefone.setForeground(new java.awt.Color(60, 0, 90));
        labelTelefone.setText("Telefone:");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtTelefone.setPreferredSize(new java.awt.Dimension(64, 19));

        labelEmail.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(60, 0, 90));
        labelEmail.setText("E-mail:");

        txtEmail.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtEmail.setPreferredSize(new java.awt.Dimension(64, 19));

        labelUF.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        labelUF.setForeground(new java.awt.Color(60, 0, 90));
        labelUF.setText("UF:");

        cbUF.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        cbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        cbUF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtEndereco.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtEndereco.setPreferredSize(new java.awt.Dimension(64, 19));

        btnCadastrar.setBackground(new java.awt.Color(60, 0, 90));
        btnCadastrar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
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

        javax.swing.GroupLayout panBotCadLayout = new javax.swing.GroupLayout(panBotCad);
        panBotCad.setLayout(panBotCadLayout);
        panBotCadLayout.setHorizontalGroup(
            panBotCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotCadLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panBotCadLayout.setVerticalGroup(
            panBotCadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBotCadLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panBotEdit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setBackground(new java.awt.Color(60, 0, 90));
        btnCancelar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setPreferredSize(new java.awt.Dimension(95, 28));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarMouseExited(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panBotEdit.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, 44));

        btnSalvar.setBackground(new java.awt.Color(60, 0, 90));
        btnSalvar.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalvarMouseExited(evt);
            }
        });
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        panBotEdit.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 93, 44));

        javax.swing.GroupLayout panDadosClienteLayout = new javax.swing.GroupLayout(panDadosCliente);
        panDadosCliente.setLayout(panDadosClienteLayout);
        panDadosClienteLayout.setHorizontalGroup(
            panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosClienteLayout.createSequentialGroup()
                        .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panDadosClienteLayout.createSequentialGroup()
                                .addComponent(labelTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panDadosClienteLayout.createSequentialGroup()
                                .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEndereco)
                                    .addComponent(labelNome)
                                    .addComponent(labelCPF))
                                .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panDadosClienteLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNomeDados, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(panDadosClienteLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(133, 133, 133)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelUF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDadosClienteLayout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(panBotCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDadosClienteLayout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(panBotEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panDadosClienteLayout.createSequentialGroup()
                        .addComponent(labelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panDadosClienteLayout.setVerticalGroup(
            panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panDadosClienteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNome)
                    .addGroup(panDadosClienteLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelUF)
                            .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtNomeDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelEndereco)
                    .addGroup(panDadosClienteLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelCPF)
                    .addGroup(panDadosClienteLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTelefone)
                    .addGroup(panDadosClienteLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addGap(33, 33, 33)
                .addComponent(panBotCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panBotEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        abaDados.addTab("Dados Pessoais", panDadosCliente);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(abaDados)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaDados))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //---------------------------------------------------------
    // AÇOES DE BOTOES
    //---------------------------------------------------------
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed

        String nome = txtNomeDados.getText();
        ClienteDTO obj = new ClienteDTO();
        ClienteDAO dao = new ClienteDAO();
        ArrayList<ClienteDTO> lista = dao.buscarCliente(nome);

        if (obj.getNomeCliente() != null) {
            txtNomeDados.setText(obj.getNomeCliente());
            txtCpf.setText(obj.getCpf());
            txtEmail.setText(obj.getEmail());
            txtTelefone.setText(obj.getTelefone());
            txtEndereco.setText(obj.getEndereco());
            cbUF.setSelectedItem(obj.getUf());
        }

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        this.abaDados.setSelectedIndex(1);
        panBotCad.setVisible(false);
        panBotEdit.setVisible(true);

        // TORNANDO TODOS OS CAMPOS EDITAVEIS
        this.txtNomeDados.setEnabled(true);
        this.txtEndereco.setEnabled(true);
        this.txtCpf.setEnabled(true);
        this.txtTelefone.setEnabled(true);
        this.txtEmail.setEnabled(true);
        this.cbUF.setEnabled(true);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.abaDados.setSelectedIndex(1);
        panBotCad.setVisible(true);
        panBotEdit.setVisible(false);

        // TORNANDO TODOS OS CAMPOS EDITAVEIS
        this.txtNomeDados.setEnabled(true);
        this.txtEndereco.setEnabled(true);
        this.txtCpf.setEnabled(true);
        this.txtTelefone.setEnabled(true);
        this.txtEmail.setEnabled(true);
        this.cbUF.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseEntered
        btnNovo.setForeground(Color.decode("#3C005A"));
        btnNovo.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnNovoMouseEntered

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setForeground(Color.decode("#3C005A"));
        btnEditar.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseEntered
        btnExcluir.setForeground(Color.decode("#3C005A"));
        btnExcluir.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnExcluirMouseEntered

    private void btnNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseExited
        btnNovo.setBackground(Color.decode("#3C005A"));
        btnNovo.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnNovoMouseExited

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setBackground(Color.decode("#3C005A"));
        btnEditar.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseExited
        btnExcluir.setBackground(Color.decode("#3C005A"));
        btnExcluir.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnExcluirMouseExited

    private void btnPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseExited
        btnPesquisar.setBackground(Color.decode("#3C005A"));
        btnPesquisar.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnPesquisarMouseExited

    private void btnPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseEntered
        btnPesquisar.setForeground(Color.decode("#3C005A"));
        btnPesquisar.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnPesquisarMouseEntered

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        this.abaDados.setSelectedIndex(1);


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseExited
        btnSalvar.setBackground(Color.decode("#3C005A"));
        btnSalvar.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnSalvarMouseExited

    private void btnSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseEntered
        btnSalvar.setForeground(Color.decode("#3C005A"));
        btnSalvar.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnSalvarMouseEntered

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.abaDados.setSelectedIndex(1);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseExited
        btnCancelar.setBackground(Color.decode("#3C005A"));
        btnCancelar.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnCancelarMouseExited

    private void btnCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseEntered
        btnCancelar.setForeground(Color.decode("#3C005A"));
        btnCancelar.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnCancelarMouseEntered

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (txtNomeDados.getText().equals("") || txtNomeDados.getText().equals("")
                || cbUF.getSelectedItem().equals("") || txtCpf.getText().equals("")
                || txtTelefone.getText().equals("")
                || txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            //validarDados();
            Cadastrar();
            listarClientes();
            LimparCampo();
            this.abaDados.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseExited
        btnCadastrar.setBackground(Color.decode("#3C005A"));
        btnCadastrar.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnCadastrarMouseExited

    private void btnCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseEntered
        btnCadastrar.setForeground(Color.decode("#3C005A"));
        btnCadastrar.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnCadastrarMouseEntered

    private void txtNomeConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeConsActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtNomeConsActionPerformed

    private void txtNomeConsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeConsKeyPressed
        // A PESQUISA OCORRE ENQUANTO ESTÁ SENDO DIGITADO O NOME.
        
        String nome = "%" + txtNomeCons.getText() + "%"; // A PESQUISA É FEITA NO BD COM O ARGUMENTO LIKE, 
                                                         //NO METODO BUSCAR CLIENTE

        // CRIAÇÃO DO OBJ E DA LISTA QUE TERÁ O RETORNO DO DADOS.
        ClienteDAO obj = new ClienteDAO();  
        List<ClienteDTO> lista = obj.buscarCliente(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaCl.getModel(); // INSTANCIANDO O MODO PADRÃO DA TABELA
        dados.setNumRows(0);

        for (ClienteDTO c : lista) {
            dados.addRow(new Object[]{    // A CADA REGISTRO NO BANCO DE DADOS, ELE SERÁ SETADO OS DADOS.
                c.getId(),
                c.getNomeCliente(),
                c.getCpf(),
                c.getEmail(),
                c.getTelefone(),
                c.getEndereco(),
                c.getUf()
            });
        }
    }//GEN-LAST:event_txtNomeConsKeyPressed

    private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnPesquisarMouseClicked

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
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaDados;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCadastro;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNome1;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelUF;
    private javax.swing.JPanel panBotCad;
    private javax.swing.JPanel panBotEdit;
    private javax.swing.JPanel panConsultarClientes;
    private javax.swing.JPanel panDadosCliente;
    private javax.swing.JTable tabelaCl;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNomeCons;
    private javax.swing.JTextField txtNomeDados;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void Cadastrar() {
        String nome, endereco, uf, cpf, telefone, email;
        nome = txtNomeDados.getText();
        endereco = txtEndereco.getText();
        uf = cbUF.getSelectedItem().toString();
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

        txtNomeDados.setText("");
        txtEndereco.setText("");
        cbUF.setSelectedItem("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtNomeDados.requestFocus();
    }

    public void CarregarDados() {
        int setar = tabelaCl.getSelectedRow();
        txtNomeDados.setText(tabelaCl.getModel().getValueAt(setar, 1).toString());
        txtEndereco.setText(tabelaCl.getModel().getValueAt(setar, 2).toString());
        cbUF.setSelectedItem(tabelaCl.getModel().getValueAt(setar, 3).toString());
        txtCpf.setText(tabelaCl.getModel().getValueAt(setar, 4).toString());
        txtTelefone.setText(tabelaCl.getModel().getValueAt(setar, 5).toString());
        txtEmail.setText(tabelaCl.getModel().getValueAt(setar, 6).toString());

    }

    private void AlterarCliente() {

        String nomeCliente, endereco, uf, telefone, cpf, email;

        nomeCliente = txtNomeDados.getText();
        endereco = txtEndereco.getText();
        uf = cbUF.getSelectedItem().toString();
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
