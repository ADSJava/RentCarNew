package VIEW;

import DAO.VeiculoDAO;
import DTO.VeiculoDTO;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmVeiculo extends JDialog {

    int resp;

    public frmVeiculo() {
        initComponents();
        listarVeiculos();
        abaDados.setSelectedIndex(0);        
        bloquearCampos();
        
        //BLOQUEIA A TELA DE FUNDO / SÓ PERMITE USAR FRMVEICULO
        this.setModal(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panPrincipal = new javax.swing.JPanel();
        abaDados = new javax.swing.JTabbedPane();
        panCons = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVe = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnEditarCons = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtBuscaVe = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        panDados = new javax.swing.JPanel();
        IdNum = new javax.swing.JLabel();
        IdPlaca = new javax.swing.JLabel();
        IdFabricante = new javax.swing.JLabel();
        IdAno = new javax.swing.JLabel();
        IdQtdPortas = new javax.swing.JLabel();
        IdAcessorios = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        txtNum = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        txtFabricante = new javax.swing.JTextField();
        txtAcessorios = new javax.swing.JTextField();
        btnCadDados = new javax.swing.JButton();
        IdModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        btnSalvarEdit = new javax.swing.JButton();
        IdVe = new javax.swing.JLabel();
        txtIdVe = new javax.swing.JTextField();
        btnCancEdit = new javax.swing.JButton();
        btnCancCad = new javax.swing.JButton();
        cbQtdPortas = new javax.swing.JComboBox<>();
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

        panCons.setForeground(new java.awt.Color(60, 0, 90));
        panCons.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panCons.setPreferredSize(new java.awt.Dimension(900, 500));

        tabelaVe.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        tabelaVe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Modelo", "Numero", "Placa", "Fabricante", "Ano", "QtdPortas", "Acessorios", "ID"
            }
        ));
        tabelaVe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaVeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaVe);

        btnNovo.setBackground(new java.awt.Color(60, 0, 90));
        btnNovo.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
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

        btnEditarCons.setBackground(new java.awt.Color(60, 0, 90));
        btnEditarCons.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnEditarCons.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCons.setText("EDITAR");
        btnEditarCons.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarCons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarConsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarConsMouseExited(evt);
            }
        });
        btnEditarCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarConsActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(60, 0, 90));
        btnExcluir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
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
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtBuscaVe.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        txtBuscaVe.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscaVe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBuscaVeMouseClicked(evt);
            }
        });
        txtBuscaVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaVeActionPerformed(evt);
            }
        });
        txtBuscaVe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaVeKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(60, 0, 90));
        jLabel9.setText("Modelo ou Placa:");

        javax.swing.GroupLayout panConsLayout = new javax.swing.GroupLayout(panCons);
        panCons.setLayout(panConsLayout);
        panConsLayout.setHorizontalGroup(
            panConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panConsLayout.createSequentialGroup()
                .addGroup(panConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panConsLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtBuscaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panConsLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnEditarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnExcluir))
                    .addGroup(panConsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        panConsLayout.setVerticalGroup(
            panConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panConsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panConsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        abaDados.addTab("Consultar Veículos", panCons);

        panDados.setForeground(new java.awt.Color(60, 0, 90));
        panDados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panDados.setPreferredSize(new java.awt.Dimension(900, 500));

        IdNum.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdNum.setForeground(new java.awt.Color(60, 0, 90));
        IdNum.setText("Número:");

        IdPlaca.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdPlaca.setForeground(new java.awt.Color(60, 0, 90));
        IdPlaca.setText("Placa:");

        IdFabricante.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdFabricante.setForeground(new java.awt.Color(60, 0, 90));
        IdFabricante.setText("Fabricante:");

        IdAno.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdAno.setForeground(new java.awt.Color(60, 0, 90));
        IdAno.setText("Ano:");

        IdQtdPortas.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdQtdPortas.setForeground(new java.awt.Color(60, 0, 90));
        IdQtdPortas.setText("Portas:");

        IdAcessorios.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdAcessorios.setForeground(new java.awt.Color(60, 0, 90));
        IdAcessorios.setText("Acessórios:");

        txtAno.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtAno.setPreferredSize(new java.awt.Dimension(64, 19));
        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });

        txtNum.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtNum.setPreferredSize(new java.awt.Dimension(64, 19));

        txtPlaca.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtPlaca.setPreferredSize(new java.awt.Dimension(64, 19));

        txtFabricante.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtFabricante.setPreferredSize(new java.awt.Dimension(64, 19));

        txtAcessorios.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtAcessorios.setPreferredSize(new java.awt.Dimension(64, 19));
        txtAcessorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcessoriosActionPerformed(evt);
            }
        });

        btnCadDados.setBackground(new java.awt.Color(60, 0, 90));
        btnCadDados.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnCadDados.setForeground(new java.awt.Color(255, 255, 255));
        btnCadDados.setText("Cadastrar");
        btnCadDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadDadosActionPerformed(evt);
            }
        });

        IdModelo.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        IdModelo.setForeground(new java.awt.Color(60, 0, 90));
        IdModelo.setText("Modelo:");

        txtModelo.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtModelo.setPreferredSize(new java.awt.Dimension(64, 19));

        btnSalvarEdit.setBackground(new java.awt.Color(60, 0, 90));
        btnSalvarEdit.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnSalvarEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvarEdit.setText("Salvar");
        btnSalvarEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvarEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarEditMouseClicked(evt);
            }
        });
        btnSalvarEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEditActionPerformed(evt);
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

        btnCancEdit.setBackground(new java.awt.Color(60, 0, 90));
        btnCancEdit.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnCancEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnCancEdit.setText("Cancelar");
        btnCancEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancEditActionPerformed(evt);
            }
        });

        btnCancCad.setBackground(new java.awt.Color(60, 0, 90));
        btnCancCad.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btnCancCad.setForeground(new java.awt.Color(255, 255, 255));
        btnCancCad.setText("Cancelar");
        btnCancCad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancCadActionPerformed(evt);
            }
        });

        cbQtdPortas.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        cbQtdPortas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "Outros" }));
        cbQtdPortas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panDadosLayout = new javax.swing.GroupLayout(panDados);
        panDados.setLayout(panDadosLayout);
        panDadosLayout.setHorizontalGroup(
            panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosLayout.createSequentialGroup()
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panDadosLayout.createSequentialGroup()
                                .addComponent(IdFabricante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panDadosLayout.createSequentialGroup()
                                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panDadosLayout.createSequentialGroup()
                                        .addComponent(IdModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(37, 37, 37))
                                    .addGroup(panDadosLayout.createSequentialGroup()
                                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IdPlaca)
                                            .addComponent(IdAno)
                                            .addComponent(IdNum))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))))
                        .addGap(30, 30, 30)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IdQtdPortas)
                            .addComponent(IdAcessorios)
                            .addComponent(IdVe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAcessorios, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdVe, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbQtdPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalvarEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(btnCadDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancCad, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(312, Short.MAX_VALUE))
        );

        panDadosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancCad, btnCancEdit, btnSalvarEdit});

        panDadosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAcessorios, txtAno, txtFabricante, txtIdVe, txtNum, txtPlaca});

        panDadosLayout.setVerticalGroup(
            panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panDadosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdFabricante)
                            .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panDadosLayout.createSequentialGroup()
                                .addComponent(IdModelo)
                                .addGap(18, 18, 18)
                                .addComponent(IdPlaca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IdAno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IdNum)
                                .addGap(46, 46, 46))
                            .addGroup(panDadosLayout.createSequentialGroup()
                                .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panDadosLayout.createSequentialGroup()
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdQtdPortas)
                            .addComponent(cbQtdPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAcessorios, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdAcessorios))
                        .addGap(18, 18, 18)
                        .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdVe, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdVe))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalvarEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadDados, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancCad))
                .addGap(318, 318, 318))
        );

        panDadosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCadDados, btnCancCad});

        panDadosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAcessorios, txtAno, txtFabricante, txtIdVe, txtModelo, txtNum, txtPlaca});

        abaDados.addTab("Dados do Veículo", panDados);

        panPrincipal.add(abaDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 930, 540));

        panHeader.setBackground(new java.awt.Color(178, 128, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 0, 63));
        jLabel1.setText("Cadastrar Veículo");

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

        panPrincipal.add(panHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, -1));

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

    private void txtBuscaVeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscaVeMouseClicked
        txtBuscaVe.setText("");
        txtBuscaVe.setForeground(Color.black);
    }//GEN-LAST:event_txtBuscaVeMouseClicked

    private void btnCadDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadDadosActionPerformed

        if (txtModelo.getText().equals("") || txtNum.equals("") || txtPlaca.getText().equals("")
                || txtFabricante.getText().equals("")
                || txtAno.getText().equals("") || cbQtdPortas.getSelectedItem().equals("") || txtAcessorios.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            Cadastrar();
            listarVeiculos();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            LimparCampo();
            bloquearCampos();
            abaDados.setSelectedIndex(0);
        }
    }//GEN-LAST:event_btnCadDadosActionPerformed

    private void txtAcessoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcessoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcessoriosActionPerformed

    private void btnEditarConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarConsActionPerformed
        if (tabelaVe.getSelectedRow() > -1) {
            desbloquearCampos();
            abaDados.setSelectedIndex(1);
            this.btnCadDados.setVisible(false);
            this.btnCancCad.setVisible(false);
            this.btnCancEdit.setVisible(true);
            this.btnSalvarEdit.setVisible(true);
            this.IdVe.setVisible(false);
            this.txtIdVe.setVisible(false);

            txtModelo.setText(tabelaVe.getValueAt(tabelaVe.getSelectedRow(), 0).toString());
            txtNum.setText(tabelaVe.getValueAt(tabelaVe.getSelectedRow(), 1).toString());
            txtPlaca.setText(tabelaVe.getValueAt(tabelaVe.getSelectedRow(), 2).toString());
            txtFabricante.setText(tabelaVe.getValueAt(tabelaVe.getSelectedRow(), 3).toString());
            txtAno.setText(tabelaVe.getValueAt(tabelaVe.getSelectedRow(), 4).toString());
            cbQtdPortas.setSelectedItem(tabelaVe.getValueAt(tabelaVe.getSelectedRow(), 5).toString());
            txtAcessorios.setText(tabelaVe.getValueAt(tabelaVe.getSelectedRow(), 6).toString());
            txtIdVe.setText(tabelaVe.getValueAt(tabelaVe.getSelectedRow(), 7).toString());
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um veículo na tabela");
        }
    }//GEN-LAST:event_btnEditarConsActionPerformed

    private void btnSalvarEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarEditMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarEditMouseClicked

    private void btnSalvarEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEditActionPerformed

        if (txtModelo.getText().equals("") || txtNum.equals("") || txtPlaca.getText().equals("")
                || txtFabricante.getText().equals("")
                || txtAno.getText().equals("") || cbQtdPortas.getSelectedItem().equals("") || txtAcessorios.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            //validarDados();
            VeiculoDTO obj = new VeiculoDTO();                  // abastecendo os campos
            obj.setNome(txtModelo.getText());
            obj.setNumero(Integer.parseInt(txtNum.getText()));
            obj.setPlaca(txtPlaca.getText());
            obj.setFabricante(txtFabricante.getText());
            obj.setAnoModelo(Integer.parseInt(txtAno.getText()));
            obj.setQtdPortas(Integer.parseInt(cbQtdPortas.getSelectedItem().toString()));
            obj.setAcessorios(txtAcessorios.getText());
            obj.setIdVeiculo(Integer.parseInt(txtIdVe.getText()));

            VeiculoDAO dao = new VeiculoDAO();
            dao.alterarVeiculo(obj);

            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            resp = 1;
            this.abaDados.setSelectedIndex(0);
            listarVeiculos();
            LimparCampo();
            bloquearCampos();
        }
    }//GEN-LAST:event_btnSalvarEditActionPerformed

    private void tabelaVeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaVeMouseClicked
        txtModelo.setText(tabelaVe.getValueAt(tabelaVe.getSelectedRow(), 0).toString());
        txtNum.setText(tabelaVe.getValueAt(tabelaVe.getSelectedRow(), 1).toString());
        txtPlaca.setText(tabelaVe.getValueAt(tabelaVe.getSelectedRow(), 2).toString());
        txtFabricante.setText(tabelaVe.getValueAt(tabelaVe.getSelectedRow(), 3).toString());
        txtAno.setText(tabelaVe.getValueAt(tabelaVe.getSelectedRow(), 4).toString());
        cbQtdPortas.setSelectedItem(tabelaVe.getValueAt(tabelaVe.getSelectedRow(), 5).toString());
        txtAcessorios.setText(tabelaVe.getValueAt(tabelaVe.getSelectedRow(), 6).toString());
        txtIdVe.setText(tabelaVe.getValueAt(tabelaVe.getSelectedRow(), 7).toString());
    }//GEN-LAST:event_tabelaVeMouseClicked

    private void txtIdVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdVeActionPerformed

    private void txtBuscaVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaVeActionPerformed

    private void txtBuscaVeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaVeKeyPressed
        String nome = "%" + txtBuscaVe.getText() + "%"; // A PESQUISA É FEITA NO BD COM O ARGUMENTO LIKE, 
        //NO METODO BUSCAR CLIENTE
        String cpf = "%" + txtBuscaVe.getText() + "%";
        // CRIAÇÃO DO OBJ E DA LISTA QUE TERÁ O RETORNO DO DADOS.
        VeiculoDAO obj = new VeiculoDAO();
        ArrayList<VeiculoDTO> lista = obj.buscarVeiculo(nome, cpf);
        DefaultTableModel dados = (DefaultTableModel) tabelaVe.getModel(); // INSTANCIANDO O MODO PADRÃO DA TABELA
        dados.setNumRows(0);

        for (VeiculoDTO c : lista) {
            dados.addRow(new Object[]{ // A CADA REGISTRO NO BANCO DE DADOS, ELE SERÁ SETADO OS DADOS.
                c.getNome(),
                c.getNumero(),
                c.getPlaca(),
                c.getFabricante(),
                c.getAnoModelo(),
                c.getQtdPortas(),
                c.getAcessorios(),
                c.getIdVeiculo()
            });
        }
    }//GEN-LAST:event_txtBuscaVeKeyPressed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        Object[] options = {"Sim", "Não"};
        
        if (tabelaVe.getSelectedRow() > -1) {
            int resposta = JOptionPane.showOptionDialog(null,
                    "Você tem certeza que deseja excluir?", "Confirmação",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (resposta == JOptionPane.YES_OPTION) {                      // O usuário clicou em "Sim"            
                VeiculoDTO obj = new VeiculoDTO();                         // abastecendo o campo do ID
                obj.setIdVeiculo(Integer.parseInt(txtIdVe.getText()));

                VeiculoDAO dao = new VeiculoDAO();
                dao.excluirVeiculo(obj);                                   // enviando o objeto para o metodo da exclusão no ClienteDAO

                listarVeiculos();
                JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
                LimparCampo();
            } else if (resposta == JOptionPane.NO_OPTION) {
                listarVeiculos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um veiculo na tabela");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        desbloquearCampos();

        abaDados.setSelectedIndex(1);
        this.btnCadDados.setVisible(true);
        this.btnCancCad.setVisible(true);
        this.btnCancEdit.setVisible(false);
        this.btnSalvarEdit.setVisible(false);

        this.txtModelo.setEnabled(true);
        this.txtNum.setEnabled(true);
        this.txtPlaca.setEnabled(true);
        this.txtFabricante.setEnabled(true);
        this.txtAno.setEnabled(true);
        this.cbQtdPortas.setEnabled(true);
        this.txtAcessorios.setEnabled(true);
        this.IdVe.setVisible(false);
        this.txtIdVe.setVisible(false);

        this.txtModelo.setText("");
        this.txtNum.setText("");
        this.txtPlaca.setText("");
        this.txtFabricante.setText("");
        this.txtAno.setText("");
        this.cbQtdPortas.setSelectedItem("");
        this.txtAcessorios.setText("");
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancEditActionPerformed
        abaDados.setSelectedIndex(0);
        listarVeiculos();
        bloquearCampos();
        LimparCampo();
    }//GEN-LAST:event_btnCancEditActionPerformed

    private void btnCancCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancCadActionPerformed
        abaDados.setSelectedIndex(0);
        listarVeiculos();
        bloquearCampos();
        LimparCampo();
    }//GEN-LAST:event_btnCancCadActionPerformed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void btnNovoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseEntered
        btnNovo.setForeground(Color.decode("#3C005A"));
        btnNovo.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnNovoMouseEntered

    private void btnEditarConsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarConsMouseEntered
        btnEditarCons.setForeground(Color.decode("#3C005A"));
        btnEditarCons.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnEditarConsMouseEntered

    private void btnExcluirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseEntered
        btnExcluir.setForeground(Color.decode("#3C005A"));
        btnExcluir.setBackground(Color.decode("#b280ff"));
    }//GEN-LAST:event_btnExcluirMouseEntered

    private void btnNovoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoMouseExited
        btnNovo.setBackground(Color.decode("#3C005A"));
        btnNovo.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnNovoMouseExited

    private void btnEditarConsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarConsMouseExited
        btnEditarCons.setBackground(Color.decode("#3C005A"));
        btnEditarCons.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnEditarConsMouseExited

    private void btnExcluirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseExited
        btnExcluir.setBackground(Color.decode("#3C005A"));
        btnExcluir.setForeground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_btnExcluirMouseExited

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
            java.util.logging.Logger.getLogger(frmVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVeiculo().setVisible(true);
            }
        });
    }

    private void Cadastrar() {
        VeiculoDTO obj = new VeiculoDTO();

        obj.setNome(txtModelo.getText());
        obj.setNumero(Integer.parseInt(txtNum.getText()));
        obj.setPlaca(txtPlaca.getText());
        obj.setFabricante(txtFabricante.getText());
        obj.setAnoModelo(Integer.parseInt(txtAno.getText()));
        obj.setQtdPortas(Integer.parseInt(cbQtdPortas.getSelectedItem().toString()));
        obj.setAcessorios(txtAcessorios.getText());

        VeiculoDAO dao = new VeiculoDAO();
        dao.cadastrarVeiculo(obj);
    }

    private void listarVeiculos() {
        try {
            VeiculoDAO userdao = new VeiculoDAO();

            DefaultTableModel model = (DefaultTableModel) tabelaVe.getModel();
            model.setNumRows(0);
            ArrayList<VeiculoDTO> lista = userdao.pesquisarVeiculo();

            for (int rows = 0; rows < lista.size(); rows++) {
                model.addRow(new Object[]{
                    lista.get(rows).getNome(),
                    lista.get(rows).getNumero(),
                    lista.get(rows).getPlaca(),
                    lista.get(rows).getFabricante(),
                    lista.get(rows).getAnoModelo(),
                    lista.get(rows).getQtdPortas(),
                    lista.get(rows).getAcessorios(),
                    lista.get(rows).getIdVeiculo()
                });
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Usuarios View" + erro);
        }
    }

    public void LimparCampo() {
        txtModelo.setText("");
        txtNum.setText("");
        txtPlaca.setText("");
        txtFabricante.setText("");
        txtAno.setText("");
        cbQtdPortas.setSelectedItem("");
        txtAcessorios.setText("");
    }

    public void CarregarDados() {
        int setar = tabelaVe.getSelectedRow();
        txtModelo.setText(tabelaVe.getModel().getValueAt(setar, 1).toString());
        txtNum.setText(tabelaVe.getModel().getValueAt(setar, 2).toString());
        txtPlaca.setText(tabelaVe.getModel().getValueAt(setar, 3).toString());
        txtFabricante.setText(tabelaVe.getModel().getValueAt(setar, 4).toString());
        txtAno.setText(tabelaVe.getModel().getValueAt(setar, 5).toString());
        cbQtdPortas.setSelectedItem(tabelaVe.getModel().getValueAt(setar, 6).toString());
        txtAcessorios.setText(tabelaVe.getModel().getValueAt(setar, 7).toString());
    }

    private void AlterarCliente() {
        VeiculoDTO obj = new VeiculoDTO();
        obj.setNome(txtModelo.getText());
        obj.setNumero(Integer.parseInt(txtNum.getText()));
        obj.setPlaca(txtPlaca.getText());
        obj.setFabricante(txtModelo.getText());
        obj.setAnoModelo(Integer.parseInt(txtAno.getText()));
        obj.setQtdPortas(Integer.parseInt(cbQtdPortas.getSelectedItem().toString()));
        obj.setAcessorios(txtAcessorios.getText());

        VeiculoDAO dao = new VeiculoDAO();
        dao.alterarVeiculo(obj);
    }

    public void bloquearCampos() {
        //listarClientes();
        //panBotCad.setVisible(true);
        //panBotEdit.setVisible(false);

        //TORNANDO OS CAMPOS DE DADOS NÃO VISÍVEIS
        this.IdModelo.setVisible(false);
        this.txtModelo.setVisible(false);
        this.txtNum.setVisible(false);
        this.IdNum.setVisible(false);
        this.txtPlaca.setVisible(false);
        this.IdPlaca.setVisible(false);
        this.txtFabricante.setVisible(false);
        this.IdFabricante.setVisible(false);
        this.txtAno.setVisible(false);
        this.IdAno.setVisible(false);
        this.cbQtdPortas.setVisible(false);
        this.IdQtdPortas.setVisible(false);
        this.txtAcessorios.setVisible(false);
        this.IdAcessorios.setVisible(false);
        this.btnCadDados.setVisible(false);
        this.btnCancCad.setVisible(false);
        this.btnCancEdit.setVisible(false);
        this.btnSalvarEdit.setVisible(false);
        this.txtIdVe.setVisible(false);
        this.IdVe.setVisible(false);

        //setExtendedState(MAXIMIZED_BOTH);
        this.setModal(true);
        LimparCampo();
    }

    public void desbloquearCampos() {
        //listarClientes();
        //panBotCad.setVisible(true);
        //panBotEdit.setVisible(false);

        //TORNANDO OS CAMPOS DE DADOS VISÍVEIS
        this.IdModelo.setVisible(true);
        this.txtModelo.setVisible(true);
        this.txtNum.setVisible(true);
        this.IdNum.setVisible(true);
        this.txtPlaca.setVisible(true);
        this.IdPlaca.setVisible(true);
        this.txtFabricante.setVisible(true);
        this.IdFabricante.setVisible(true);
        this.txtAno.setVisible(true);
        this.IdAno.setVisible(true);
        this.cbQtdPortas.setVisible(true);
        this.IdQtdPortas.setVisible(true);
        this.txtAcessorios.setVisible(true);
        this.IdAcessorios.setVisible(true);
        this.btnCadDados.setVisible(true);
        this.btnCancCad.setVisible(true);
        this.btnCancEdit.setVisible(true);
        this.btnSalvarEdit.setVisible(true);
        this.txtIdVe.setVisible(true);
        this.IdVe.setVisible(true);

        //setExtendedState(MAXIMIZED_BOTH);
        this.setModal(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IdAcessorios;
    private javax.swing.JLabel IdAno;
    private javax.swing.JLabel IdFabricante;
    private javax.swing.JLabel IdModelo;
    private javax.swing.JLabel IdNum;
    private javax.swing.JLabel IdPlaca;
    private javax.swing.JLabel IdQtdPortas;
    private javax.swing.JLabel IdVe;
    private javax.swing.JTabbedPane abaDados;
    private javax.swing.JButton btnCadDados;
    private javax.swing.JButton btnCancCad;
    private javax.swing.JButton btnCancEdit;
    private javax.swing.JButton btnEditarCons;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvarEdit;
    private javax.swing.JComboBox<String> cbQtdPortas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panCons;
    private javax.swing.JPanel panDados;
    private javax.swing.JPanel panHeader;
    private javax.swing.JPanel panPrincipal;
    private javax.swing.JTable tabelaVe;
    private javax.swing.JTextField txtAcessorios;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtBuscaVe;
    private javax.swing.JTextField txtFabricante;
    private javax.swing.JTextField txtIdVe;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
