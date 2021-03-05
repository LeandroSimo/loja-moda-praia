package ufpb.poo.projetoFinal;

import com.sun.glass.events.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import java.awt.print.*;
import java.util.Date;

public class Interface extends javax.swing.JFrame {

    private static double soma = 0;

    public Interface() {
        initComponents();

        jTextFieldLogin.requestFocusInWindow();

        abasTelaPrincipal.setEnabledAt(1, false);
        abasTelaPrincipal.setEnabledAt(2, false);
        abasTelaPrincipal.setEnabledAt(3, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        abasTelaPrincipal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jPasswordFieldSENHA = new javax.swing.JPasswordField();
        jButtonEntrar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelFundoLogin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabelCodigoDeBarra = new javax.swing.JLabel();
        jTextFieldCodigoDeBarra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableItemComprados = new javax.swing.JTable();
        jButtonFinalizarCompra = new javax.swing.JButton();
        jButtonCancelarCOMPRA = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonCadastrarProduto = new javax.swing.JButton();
        jButtonCadastrarFuncionario = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldVendaQUANTIDADE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelFundPrinc = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelCadastrarNome = new javax.swing.JLabel();
        jLabelCadastrarCodigoBarra = new javax.swing.JLabel();
        jLabelCadastrarValor = new javax.swing.JLabel();
        jLabelPesquisaProduto = new javax.swing.JLabel();
        jTextFielCadastrarNomeProduto = new javax.swing.JTextField();
        jTextFieldCadastrarCodigoBarra = new javax.swing.JTextField();
        jTextFieldCadastraValor = new javax.swing.JTextField();
        jTextFieldPesquisaProduto = new javax.swing.JTextField();
        jButtonPesquisarProduto = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButtonFinalizarCadastroPRODUTO = new javax.swing.JButton();
        jButtonRemoverProdudoCADASTRADO = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jPanel6 = new javax.swing.JPanel();
        jLabelCadastroFuncionarioNOME = new javax.swing.JLabel();
        jTextFieldCadastroFuncionarioNome = new javax.swing.JTextField();
        jLabelCadastroFuncionarioCARGO = new javax.swing.JLabel();
        jTextFieldCadastroFuncionarioCARGO = new javax.swing.JTextField();
        jLabelCadastroFuncionarioLOGIN = new javax.swing.JLabel();
        jTextFieldCadastroFuncionarioLOGIN = new javax.swing.JTextField();
        jLabelCadastroFuncionarioSENHA = new javax.swing.JLabel();
        jTextFieldCadastroFuncionarioSENHA = new javax.swing.JTextField();
        jButtonCadastroFuncionarioSALVAR = new javax.swing.JButton();
        jButtonCadastroFuncionarioNOVO = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButtonFinalizarCadastroFUNCIONARIO = new javax.swing.JButton();
        jLabelCadastroFuncionarioPESQUISAR = new javax.swing.JLabel();
        jTextFieldCadastroFuncionarioPESQUISAR = new javax.swing.JTextField();
        jToggleButtonCadastrarFuncionarioPESQUISAR = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemTrocarDeUsuario = new javax.swing.JMenuItem();
        jMenuItemSobre = new javax.swing.JMenuItem();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        abasTelaPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogin.setBackground(new java.awt.Color(0, 0, 153));
        jLabelLogin.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(51, 0, 102));
        jLabelLogin.setText("LOGIN");
        jPanel1.add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 50, -1));

        jLabelSenha.setBackground(new java.awt.Color(0, 0, 153));
        jLabelSenha.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(51, 0, 102));
        jLabelSenha.setText("SENHA");
        jPanel1.add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, -1));

        jTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 206, 30));

        jPasswordFieldSENHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSENHAActionPerformed(evt);
            }
        });
        jPasswordFieldSENHA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldSENHAKeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordFieldSENHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 206, 30));

        jButtonEntrar.setBackground(new java.awt.Color(51, 0, 102));
        jButtonEntrar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEntrar.setText("ENTRAR");
        jButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        jButtonSair.setBackground(new java.awt.Color(51, 0, 102));
        jButtonSair.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setText("SAIR");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 80, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sandra _ Sloane (1).jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-110, 70, 380, 230));

        jLabelFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/aeólogos.jpg"))); // NOI18N
        jPanel1.add(jLabelFundoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 460));

        abasTelaPrincipal.addTab("LOGIN", jPanel1);

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 204));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCodigoDeBarra.setBackground(new java.awt.Color(51, 51, 51));
        jLabelCodigoDeBarra.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelCodigoDeBarra.setText("CODIGO DO PRODUTO");
        jDesktopPane1.add(jLabelCodigoDeBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 64, 145, 28));

        jTextFieldCodigoDeBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoDeBarraActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jTextFieldCodigoDeBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 98, 307, 36));

        jTableItemComprados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "CODIGO DE BARRA", "VALOR", "UNIDADE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableItemComprados);

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 64, 462, 145));

        jButtonFinalizarCompra.setBackground(new java.awt.Color(255, 0, 0));
        jButtonFinalizarCompra.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonFinalizarCompra.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFinalizarCompra.setText("FINALIZAR COMPRA");
        jButtonFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarCompraActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButtonFinalizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 388, -1, 33));

        jButtonCancelarCOMPRA.setBackground(new java.awt.Color(255, 0, 0));
        jButtonCancelarCOMPRA.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonCancelarCOMPRA.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelarCOMPRA.setText("CANCELAR COMPRA");
        jButtonCancelarCOMPRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCOMPRAActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButtonCancelarCOMPRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 388, -1, 33));

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("REMOVER PRODUTO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 388, -1, 33));

        jButtonCadastrarProduto.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButtonCadastrarProduto.setText("CADASTRAR PRODUTO");
        jButtonCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarProdutoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButtonCadastrarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 287, 169, 30));

        jButtonCadastrarFuncionario.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButtonCadastrarFuncionario.setText("CADASTRAR FUNCIONARIO");
        jButtonCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarFuncionarioActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButtonCadastrarFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 338, -1, 32));

        jButtonAdicionar.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButtonAdicionar.setText("ADICIONAR");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButtonAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 259, 115, 68));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel1.setText("QUANTIDADE");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 167, -1, 23));

        jTextFieldVendaQUANTIDADE.setText("1");
        jTextFieldVendaQUANTIDADE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVendaQUANTIDADEActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jTextFieldVendaQUANTIDADE, new org.netbeans.lib.awtextra.AbsoluteConstraints(701, 196, 80, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/supermarket-cart-with-up-arrow_icon-icons.com_55548.png"))); // NOI18N
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 259, 80, 70));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFundPrinc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FundoPrinc.jpg"))); // NOI18N
        jPanel5.add(jLabelFundPrinc, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 950, 460));

        jDesktopPane1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 460));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        abasTelaPrincipal.addTab("VENDA", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCadastrarNome.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelCadastrarNome.setText("NOME");
        jPanel3.add(jLabelCadastrarNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 44, -1));

        jLabelCadastrarCodigoBarra.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelCadastrarCodigoBarra.setText("CODIGO DE BARRA");
        jPanel3.add(jLabelCadastrarCodigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 129, -1));

        jLabelCadastrarValor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelCadastrarValor.setText("VALOR");
        jPanel3.add(jLabelCadastrarValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 50, -1));

        jLabelPesquisaProduto.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelPesquisaProduto.setText("DIGITE O CODIGO DE BARRA DO PRODUTO");
        jPanel3.add(jLabelPesquisaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 337, 280, -1));

        jTextFielCadastrarNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielCadastrarNomeProdutoActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFielCadastrarNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 320, 35));
        jPanel3.add(jTextFieldCadastrarCodigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 320, 35));
        jPanel3.add(jTextFieldCadastraValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 105, 35));
        jPanel3.add(jTextFieldPesquisaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 407, 24));

        jButtonPesquisarProduto.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonPesquisarProduto.setText("PESQUISAR");
        jButtonPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarProdutoActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonPesquisarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 160, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton4.setText("SALVAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 90, 36));

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton5.setText("NOVO");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 90, 36));

        jButtonFinalizarCadastroPRODUTO.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonFinalizarCadastroPRODUTO.setText("FINALIZAR CADASTRO");
        jButtonFinalizarCadastroPRODUTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarCadastroPRODUTOActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonFinalizarCadastroPRODUTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, -1, 40));

        jButtonRemoverProdudoCADASTRADO.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonRemoverProdudoCADASTRADO.setText("REMOVER PRODUTO");
        jButtonRemoverProdudoCADASTRADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoverProdudoCADASTRADOActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonRemoverProdudoCADASTRADO, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 169, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo.jpg"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 460));

        abasTelaPrincipal.addTab("CADASTRO DE PRODUTOS", jPanel3);

        jDesktopPane2.setBackground(new java.awt.Color(51, 0, 102));
        jDesktopPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCadastroFuncionarioNOME.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelCadastroFuncionarioNOME.setForeground(new java.awt.Color(51, 51, 51));
        jLabelCadastroFuncionarioNOME.setText("NOME");
        jPanel6.add(jLabelCadastroFuncionarioNOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 40, -1));

        jTextFieldCadastroFuncionarioNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadastroFuncionarioNomeActionPerformed(evt);
            }
        });
        jPanel6.add(jTextFieldCadastroFuncionarioNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 340, 30));

        jLabelCadastroFuncionarioCARGO.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelCadastroFuncionarioCARGO.setText("CARGO");
        jPanel6.add(jLabelCadastroFuncionarioCARGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 50, -1));

        jTextFieldCadastroFuncionarioCARGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadastroFuncionarioCARGOActionPerformed(evt);
            }
        });
        jPanel6.add(jTextFieldCadastroFuncionarioCARGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 340, 30));

        jLabelCadastroFuncionarioLOGIN.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelCadastroFuncionarioLOGIN.setText("LOGIN");
        jPanel6.add(jLabelCadastroFuncionarioLOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 50, -1));
        jPanel6.add(jTextFieldCadastroFuncionarioLOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 340, 30));

        jLabelCadastroFuncionarioSENHA.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelCadastroFuncionarioSENHA.setText("SENHA");
        jPanel6.add(jLabelCadastroFuncionarioSENHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 50, -1));
        jPanel6.add(jTextFieldCadastroFuncionarioSENHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 340, 30));

        jButtonCadastroFuncionarioSALVAR.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonCadastroFuncionarioSALVAR.setText("SALVAR");
        jButtonCadastroFuncionarioSALVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroFuncionarioSALVARActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonCadastroFuncionarioSALVAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 86, 40));

        jButtonCadastroFuncionarioNOVO.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonCadastroFuncionarioNOVO.setText("NOVO");
        jButtonCadastroFuncionarioNOVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroFuncionarioNOVOActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonCadastroFuncionarioNOVO, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 86, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton1.setText("REMOVER FUNCIONARIO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, 40));

        jButtonFinalizarCadastroFUNCIONARIO.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButtonFinalizarCadastroFUNCIONARIO.setText("FINALIZAR CADASTRO");
        jButtonFinalizarCadastroFUNCIONARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarCadastroFUNCIONARIOActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonFinalizarCadastroFUNCIONARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 181, 40));

        jLabelCadastroFuncionarioPESQUISAR.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabelCadastroFuncionarioPESQUISAR.setText("PESQUISAR");
        jPanel6.add(jLabelCadastroFuncionarioPESQUISAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 80, -1));

        jTextFieldCadastroFuncionarioPESQUISAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadastroFuncionarioPESQUISARActionPerformed(evt);
            }
        });
        jPanel6.add(jTextFieldCadastroFuncionarioPESQUISAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 400, 27));

        jToggleButtonCadastrarFuncionarioPESQUISAR.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jToggleButtonCadastrarFuncionarioPESQUISAR.setText("PESQUISAR");
        jToggleButtonCadastrarFuncionarioPESQUISAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonCadastrarFuncionarioPESQUISARActionPerformed(evt);
            }
        });
        jPanel6.add(jToggleButtonCadastrarFuncionarioPESQUISAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 140, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo.jpg"))); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 460));

        jDesktopPane2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 460));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        abasTelaPrincipal.addTab("CADASTRAR FUNCIONARIO", jPanel4);

        getContentPane().add(abasTelaPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 490));

        jMenuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/application_cascade.png"))); // NOI18N
        jMenuArquivo.setText("ARQUIVO");

        jMenuItemTrocarDeUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user.png"))); // NOI18N
        jMenuItemTrocarDeUsuario.setText("TROCAR DE USUARIO");
        jMenuItemTrocarDeUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTrocarDeUsuarioActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemTrocarDeUsuario);

        jMenuItemSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/information.png"))); // NOI18N
        jMenuItemSobre.setText("SOBRE");
        jMenuArquivo.add(jMenuItemSobre);

        jMenuItemSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/door_out.png"))); // NOI18N
        jMenuItemSair.setText("SAIR");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemSair);

        jMenuBar1.add(jMenuArquivo);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    Sistema sistema = new Sistema();

    private void jButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEntrarActionPerformed
        if (jTextFieldLogin.getText().equalsIgnoreCase("iza") && jPasswordFieldSENHA.getText().equalsIgnoreCase("poo")) {
            abasTelaPrincipal.setEnabledAt(1, true);
            abasTelaPrincipal.setSelectedIndex(1);
            abasTelaPrincipal.setEnabledAt(0, false);

        } else if (jTextFieldLogin.getText() != ("")) {
            for (int i = 0; i < sistema.getListFuncionario().size(); i++) {
                if (jTextFieldLogin.getText().equalsIgnoreCase(sistema.getListFuncionario().get(i).getLogin())
                        && jPasswordFieldSENHA.getText().equalsIgnoreCase(sistema.getListFuncionario().get(i).getSenha())) {
                    abasTelaPrincipal.setEnabledAt(1, true);
                    abasTelaPrincipal.setSelectedIndex(1);
                    abasTelaPrincipal.setEnabledAt(0, false);

                }
            }
            JOptionPane.showMessageDialog(null, "Login ou Senha estão incorretos!", "ERRO", JOptionPane.ERROR_MESSAGE);

            jTextFieldLogin.setText("");
            jPasswordFieldSENHA.setText("");

            jTextFieldLogin.requestFocusInWindow();

        }

    }//GEN-LAST:event_jButtonEntrarActionPerformed

    private void jTextFieldCadastroFuncionarioCARGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadastroFuncionarioCARGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadastroFuncionarioCARGOActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemTrocarDeUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTrocarDeUsuarioActionPerformed

        jTextFieldLogin.requestFocusInWindow();

        abasTelaPrincipal.setEnabledAt(0, true);
        abasTelaPrincipal.setSelectedIndex(0);
        abasTelaPrincipal.setEnabledAt(1, false);
        abasTelaPrincipal.setEnabledAt(2, false);
        abasTelaPrincipal.setEnabledAt(3, false);
        jTextFieldLogin.setText("");
        jPasswordFieldSENHA.setText("");

        int cont = sistema.getListaCompra().size();
        while (cont > 0) {
            for (int k = 0; k < sistema.getListaCompra().size(); k++) {
                sistema.getListaCompra().remove(sistema.getListaCompra().get(k));
                DefaultTableModel val = (DefaultTableModel) jTableItemComprados.getModel();
                val.removeRow(k);

            }
            cont--;
            soma = soma * 0;
        }


    }//GEN-LAST:event_jMenuItemTrocarDeUsuarioActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            String nome = jTextFielCadastrarNomeProduto.getText();
            String codigoDeBarra = jTextFieldCadastrarCodigoBarra.getText();
            double valor = Double.parseDouble(jTextFieldCadastraValor.getText());

            Produto produto = new Produto(nome, codigoDeBarra, valor);

            sistema.cadastrarProdutos(produto);
            JOptionPane.showMessageDialog(null, "CADASTRO EFETUADO COM SUCESSO:\n" + produto.toString());
            jTextFielCadastrarNomeProduto.setText("");
            jTextFieldCadastraValor.setText("");
            jTextFieldCadastrarCodigoBarra.setText("");

            jTextFielCadastrarNomeProduto.requestFocusInWindow();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Certifique-se que todos os campos estejam devidamente preenchidos." + "\n" + "Obs: Cod Bar e Valor = nums!", "ERRO", JOptionPane.ERROR_MESSAGE);

        }
        jTextFielCadastrarNomeProduto.setText("");
        jTextFieldCadastraValor.setText("");
        jTextFieldCadastrarCodigoBarra.setText("");

        jTextFielCadastrarNomeProduto.requestFocusInWindow();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        jTextFielCadastrarNomeProduto.setText("");
        jTextFieldCadastrarCodigoBarra.setText("");
        jTextFieldCadastraValor.setText("");
        jTextFielCadastrarNomeProduto.requestFocusInWindow();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButtonCadastroFuncionarioSALVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroFuncionarioSALVARActionPerformed
        String nomeFuncionario = jTextFieldCadastroFuncionarioNome.getText();
        String cargoFuncionario = jTextFieldCadastroFuncionarioCARGO.getText();
        String loginFuncionario = jTextFieldCadastroFuncionarioLOGIN.getText();
        String senhaFuncionario = jTextFieldCadastroFuncionarioSENHA.getText();
        if (!nomeFuncionario.equals("") && !cargoFuncionario.equals("") && !loginFuncionario.equals("") && !senhaFuncionario.equals("")) {
            Usuario funcionario = new Usuario(nomeFuncionario, cargoFuncionario, loginFuncionario, senhaFuncionario);
            sistema.cadastrarFuncionario(funcionario);
            JOptionPane.showMessageDialog(null, "CADASTRO EFETUADO COM SUCESSO:\n" + funcionario.toString());
            jTextFieldCadastroFuncionarioNome.setText("");
            jTextFieldCadastroFuncionarioCARGO.setText("");
            jTextFieldCadastroFuncionarioLOGIN.setText("");
            jTextFieldCadastroFuncionarioSENHA.setText("");

            jTextFieldCadastroFuncionarioNome.requestFocusInWindow();

        } else {
            JOptionPane.showMessageDialog(null, "Certifique-se que todos os campos estejam devidamente preenchidos!", "ERRO", JOptionPane.ERROR_MESSAGE);
            jTextFieldCadastroFuncionarioNome.requestFocusInWindow();
        }

        for (int k = 0; k < sistema.getListFuncionario().size(); k++) {
            System.out.println(sistema.getListFuncionario().get(k).getNome());
        }
    }//GEN-LAST:event_jButtonCadastroFuncionarioSALVARActionPerformed

    private void jButtonCadastroFuncionarioNOVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroFuncionarioNOVOActionPerformed
        jTextFieldCadastroFuncionarioNome.setText("");
        jTextFieldCadastroFuncionarioCARGO.setText("");
        jTextFieldCadastroFuncionarioLOGIN.setText("");
        jTextFieldCadastroFuncionarioSENHA.setText("");
        jTextFieldCadastroFuncionarioNome.requestFocusInWindow();
    }//GEN-LAST:event_jButtonCadastroFuncionarioNOVOActionPerformed

    private void jButtonPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarProdutoActionPerformed
        String texto = jTextFieldPesquisaProduto.getText();
        for (int k = 0; k < sistema.getProdutosDisponiveis().size(); k++) {

            if (texto.equals(sistema.getProdutosDisponiveis().get(k).getCodigoDeBarra())) {
                JOptionPane.showMessageDialog(null, sistema.getProdutosDisponiveis().get(k).toString());

            } else if (texto != sistema.getProdutosDisponiveis().get(k).getCodigoDeBarra()) {
                JOptionPane.showMessageDialog(null, "PRODUTO NÃO CADASTRADO:");
            }
        }


    }//GEN-LAST:event_jButtonPesquisarProdutoActionPerformed

    private void jToggleButtonCadastrarFuncionarioPESQUISARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonCadastrarFuncionarioPESQUISARActionPerformed
        String textoPesquisa = jTextFieldCadastroFuncionarioPESQUISAR.getText();
        for (int k = 0; k < sistema.getListFuncionario().size(); k++) {
            if (textoPesquisa.equals(sistema.getListFuncionario().get(k).getNome())) {
                JOptionPane.showMessageDialog(null, sistema.getListFuncionario().get(k).toString());
            }
        }
    }//GEN-LAST:event_jToggleButtonCadastrarFuncionarioPESQUISARActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonFinalizarCadastroPRODUTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarCadastroPRODUTOActionPerformed

        abasTelaPrincipal.setSelectedIndex(1);
        abasTelaPrincipal.setEnabledAt(2, false);

    }//GEN-LAST:event_jButtonFinalizarCadastroPRODUTOActionPerformed

    private void jTextFieldVendaQUANTIDADEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVendaQUANTIDADEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVendaQUANTIDADEActionPerformed

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed

        String produtoVendido = jTextFieldCodigoDeBarra.getText();

        for (int k = 0; k < sistema.getProdutosDisponiveis().size(); k++) {

            if (produtoVendido.equals(sistema.getProdutosDisponiveis().get(k).getCodigoDeBarra())) {

                sistema.adicionarAoCarrinho(sistema.getProdutosDisponiveis().get(k));

                String quant = jTextFieldVendaQUANTIDADE.getText();
                String nome1 = sistema.getProdutosDisponiveis().get(k).getNomeProduto();
                String codigo = sistema.getProdutosDisponiveis().get(k).getCodigoDeBarra();
                double valor = sistema.getProdutosDisponiveis().get(k).getPreco() * Double.parseDouble(quant);
                String preço = Double.toString(valor);
                sistema.getLquantidade().add(preço);

                //ADICIONANDO NA TABELA
                DefaultTableModel val = (DefaultTableModel) jTableItemComprados.getModel();
                val.addRow(new String[]{nome1, codigo, preço, quant});
                jTextFieldCodigoDeBarra.setText("");
                double b = Double.parseDouble(preço);
                soma += b;
            } else if (!produtoVendido.equals(sistema.getProdutosDisponiveis())) {
                JOptionPane.showMessageDialog(null, "Código de barras inválido, nenhum produto a ser adicionado!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarFuncionarioActionPerformed
        jTextFieldCadastroFuncionarioNome.requestFocusInWindow();
        abasTelaPrincipal.setEnabledAt(3, true);
        abasTelaPrincipal.setSelectedIndex(3);
        jTextFieldCadastroFuncionarioNome.requestFocusInWindow();
    }//GEN-LAST:event_jButtonCadastrarFuncionarioActionPerformed

    private void jButtonCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarProdutoActionPerformed
        jTextFielCadastrarNomeProduto.requestFocusInWindow();
        abasTelaPrincipal.setEnabledAt(2, true);
        abasTelaPrincipal.setSelectedIndex(2);
    }//GEN-LAST:event_jButtonCadastrarProdutoActionPerformed

    private void jButtonFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarCompraActionPerformed
        System.out.println(sistema.getLquantidade().size());
        double tipoPagamento = Double.parseDouble(JOptionPane.showInputDialog("INFORME O VALOR PAGO: \n" + "VALOR DA COMPRA R$" + soma));
        double total = tipoPagamento - soma;
        Date data = new Date();
        String nome = "_";

        JOptionPane.showMessageDialog(null, "|--------------------- IZAS MODA PRAIA --------------------|\n"
                + "|---------------------------------------------------|\n"
                + "|-------------------- NOTA FISCAL ------------------|\n"
                + "| CAIXA: " + jTextFieldLogin.getText() + "               DATA: " + (data.toLocaleString()) + "   |\n"
                + "  R$" + soma + "\n"
                + "                                                   \n"
                + " TOTAL: R$ " + soma + "\n"
                + "                                   TROCO: R$ " + total + "\n"
                + " FORMA DE PAGAMENTO: " + "A VISTA \n"
                + "ATENDENTE: " + jTextFieldLogin.getText() + "\n"
                + "|---------------------------------------------------|" + "\n"
                + "|------------------VOLTE SEMPRE---------------------|");

        int cont = sistema.getListaCompra().size();
        while (cont > 0) {
            for (int k = 0; k < sistema.getListaCompra().size(); k++) {
                sistema.getListaCompra().remove(sistema.getListaCompra().get(k));
                DefaultTableModel val = (DefaultTableModel) jTableItemComprados.getModel();
                val.removeRow(k);

            }
            cont--;
            soma = soma * 0;
        }
    }//GEN-LAST:event_jButtonFinalizarCompraActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String nomeRemover = JOptionPane.showInputDialog("INFORME O CODIGO DE BARRA DO PRODUTO QUE DESEJA REEMOVER:");
        try {
            for (int k = 0; k < sistema.getListaCompra().size(); k++) {
                if (nomeRemover.equals(sistema.getListaCompra().get(k).getCodigoDeBarra())) {
                    double valor = sistema.getListaCompra().get(k).getPreco();
                    soma -= valor;
                    sistema.getListaCompra().remove(sistema.getListaCompra().get(k));

                    DefaultTableModel val = (DefaultTableModel) jTableItemComprados.getModel();
                    val.removeRow(k);
                    break;
                }
            }
            for (int i = 0; i < sistema.getListaCompra().size(); i++) {
                String n = sistema.getListaCompra().get(i).getNomeProduto();
                System.out.println(n);
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "NENHUM INTEM INFORMADO: ");
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonFinalizarCadastroFUNCIONARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarCadastroFUNCIONARIOActionPerformed
        JOptionPane.showMessageDialog(null, "CADASTRO FINALIZADO COM SUCESSO: ");
        abasTelaPrincipal.setSelectedIndex(1);
        abasTelaPrincipal.setEnabledAt(3, false);
    }//GEN-LAST:event_jButtonFinalizarCadastroFUNCIONARIOActionPerformed

    private void jButtonRemoverProdudoCADASTRADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoverProdudoCADASTRADOActionPerformed
        String codigo = JOptionPane.showInputDialog("INFORME O CODIGO DE BARRA DO PRODUTO QUE DESEJA REEMOVER:");
        for (int k = 0; k < sistema.getProdutosDisponiveis().size(); k++) {
            try {
                if (codigo.equals(sistema.getProdutosDisponiveis().get(k).getCodigoDeBarra())) {
                    sistema.getProdutosDisponiveis().remove(sistema.getProdutosDisponiveis().get(k));
                }
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "NENHUM INTEM INFORMADO: ");
            }
        }
    }//GEN-LAST:event_jButtonRemoverProdudoCADASTRADOActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nome = JOptionPane.showInputDialog("INFORME O NOME DO FUNCIONARIO QUE DESEJA REEMOVER:");
        for (int k = 0; k < sistema.getListFuncionario().size(); k++) {
            if (nome.equals(sistema.getListFuncionario().get(k).getNome())) {
                sistema.getListFuncionario().remove(sistema.getListFuncionario().get(k));
                JOptionPane.showMessageDialog(null, "FUNCIONARIO REMOVIDO COM SUCESSO:");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCancelarCOMPRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCOMPRAActionPerformed
        int cont = sistema.getListaCompra().size();
        while (cont > 0) {
            for (int k = 0; k < sistema.getListaCompra().size(); k++) {
                sistema.getListaCompra().remove(sistema.getListaCompra().get(k));
                DefaultTableModel val = (DefaultTableModel) jTableItemComprados.getModel();
                val.removeRow(k);

            }
            cont--;
            soma = soma * 0;
        }
    }//GEN-LAST:event_jButtonCancelarCOMPRAActionPerformed

    private void jTextFieldCodigoDeBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoDeBarraActionPerformed

    }//GEN-LAST:event_jTextFieldCodigoDeBarraActionPerformed

    private void jTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLoginActionPerformed

    }//GEN-LAST:event_jTextFieldLoginActionPerformed

    private void jPasswordFieldSENHAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldSENHAKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTextFieldLogin.getText().equalsIgnoreCase("iza") && jPasswordFieldSENHA.getText().equalsIgnoreCase("poo")) {
                abasTelaPrincipal.setEnabledAt(1, true);
                abasTelaPrincipal.setSelectedIndex(1);
                abasTelaPrincipal.setEnabledAt(0, false);

            } else if (jTextFieldLogin.getText() != ("")) {
                for (int i = 0; i < sistema.getListFuncionario().size(); i++) {
                    if (jTextFieldLogin.getText().equalsIgnoreCase(sistema.getListFuncionario().get(i).getLogin())
                            && jPasswordFieldSENHA.getText().equalsIgnoreCase(sistema.getListFuncionario().get(i).getSenha())) {
                        abasTelaPrincipal.setEnabledAt(1, true);
                        abasTelaPrincipal.setSelectedIndex(1);
                        abasTelaPrincipal.setEnabledAt(0, false);

                    }
                }
                JOptionPane.showMessageDialog(null, "Login ou Senha estão incorretos!", "ERRO", JOptionPane.ERROR_MESSAGE);

                jTextFieldLogin.setText("");
                jPasswordFieldSENHA.setText("");

                jTextFieldLogin.requestFocusInWindow();

            }

        }

    }//GEN-LAST:event_jPasswordFieldSENHAKeyPressed

    private void jTextFieldCadastroFuncionarioPESQUISARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadastroFuncionarioPESQUISARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadastroFuncionarioPESQUISARActionPerformed

    private void jPasswordFieldSENHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSENHAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSENHAActionPerformed

    private void jTextFieldCadastroFuncionarioNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadastroFuncionarioNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadastroFuncionarioNomeActionPerformed

    private void jTextFielCadastrarNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielCadastrarNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielCadastrarNomeProdutoActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abasTelaPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonCadastrarFuncionario;
    private javax.swing.JButton jButtonCadastrarProduto;
    private javax.swing.JButton jButtonCadastroFuncionarioNOVO;
    private javax.swing.JButton jButtonCadastroFuncionarioSALVAR;
    private javax.swing.JButton jButtonCancelarCOMPRA;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonFinalizarCadastroFUNCIONARIO;
    private javax.swing.JButton jButtonFinalizarCadastroPRODUTO;
    private javax.swing.JButton jButtonFinalizarCompra;
    private javax.swing.JButton jButtonPesquisarProduto;
    private javax.swing.JButton jButtonRemoverProdudoCADASTRADO;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCadastrarCodigoBarra;
    private javax.swing.JLabel jLabelCadastrarNome;
    private javax.swing.JLabel jLabelCadastrarValor;
    private javax.swing.JLabel jLabelCadastroFuncionarioCARGO;
    private javax.swing.JLabel jLabelCadastroFuncionarioLOGIN;
    private javax.swing.JLabel jLabelCadastroFuncionarioNOME;
    private javax.swing.JLabel jLabelCadastroFuncionarioPESQUISAR;
    private javax.swing.JLabel jLabelCadastroFuncionarioSENHA;
    private javax.swing.JLabel jLabelCodigoDeBarra;
    private javax.swing.JLabel jLabelFundPrinc;
    private javax.swing.JLabel jLabelFundoLogin;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelPesquisaProduto;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JMenuItem jMenuItemTrocarDeUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordFieldSENHA;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableItemComprados;
    private javax.swing.JTextField jTextFielCadastrarNomeProduto;
    private javax.swing.JTextField jTextFieldCadastraValor;
    private javax.swing.JTextField jTextFieldCadastrarCodigoBarra;
    private javax.swing.JTextField jTextFieldCadastroFuncionarioCARGO;
    private javax.swing.JTextField jTextFieldCadastroFuncionarioLOGIN;
    private javax.swing.JTextField jTextFieldCadastroFuncionarioNome;
    private javax.swing.JTextField jTextFieldCadastroFuncionarioPESQUISAR;
    private javax.swing.JTextField jTextFieldCadastroFuncionarioSENHA;
    private javax.swing.JTextField jTextFieldCodigoDeBarra;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldPesquisaProduto;
    private javax.swing.JTextField jTextFieldVendaQUANTIDADE;
    private javax.swing.JToggleButton jToggleButtonCadastrarFuncionarioPESQUISAR;
    // End of variables declaration//GEN-END:variables
}
