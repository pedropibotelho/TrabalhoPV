package deliveryApp.view;

import deliveryApp.control.GerenciaClientes;
import deliveryApp.control.GerenciaEmpresa;
import deliveryApp.control.GerenciaPedido;
import deliveryApp.control.GerenciaProduto;
import deliveryApp.model.Cliente;
import deliveryApp.model.Empresa;
import deliveryApp.model.Pedido;
import deliveryApp.model.Produto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ScreenCadastroPedido extends javax.swing.JInternalFrame {

    private GerenciaPedido fpe;
    private GerenciaClientes fc;
    private GerenciaEmpresa fe;
    private ArrayList<Empresa> empresas;
    private GerenciaProduto fp;
    private ArrayList<Produto> produtos;
    DefaultListModel modelo = new DefaultListModel();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private float precoTotal = 0;

    public ScreenCadastroPedido(GerenciaPedido fpe, GerenciaClientes fc, ArrayList<Empresa> empresas, GerenciaEmpresa fe, GerenciaProduto fp) {
        initComponents();
        this.fpe = fpe;
        this.fc = fc;
        this.fe = fe;
        this.fp = fp;
        this.empresas = empresas;
        listProdutos.setModel(modelo);

        ArrayList<String> nomesEmpresas = new ArrayList<>();
        for (Empresa emp : empresas) {
            nomesEmpresas.add(emp.getNome());
        }
        combEmpresa.setModel(new DefaultComboBoxModel(nomesEmpresas.toArray()));

        Calendar dataSistema = Calendar.getInstance();
        tfData.setText(String.valueOf(formato.format(dataSistema.getTime())));

        tfCodigo.setText(String.valueOf(fpe.getCodigo()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        combEmpresa = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listProdutos = new javax.swing.JList<>();
        btnConsultarEmpresa = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableItemsPedido = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfPrecoTotal = new javax.swing.JTextField();
        btnAdcionar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        btnRefazer = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro de Pedido");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Empresa:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Produtos:");

        jScrollPane1.setViewportView(listProdutos);

        btnConsultarEmpresa.setText("Consultar");
        btnConsultarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarEmpresaActionPerformed(evt);
            }
        });

        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVoltar.setText("Voltar");

        tableItemsPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço", "Código"
            }
        ));
        tableItemsPedido.setColumnSelectionAllowed(true);
        tableItemsPedido.setEnabled(false);
        jScrollPane2.setViewportView(tableItemsPedido);
        tableItemsPedido.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Items do Pedido:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Preço Total:");

        tfPrecoTotal.setEditable(false);

        btnAdcionar.setText(">>");
        btnAdcionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdcionarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Código do Pedido:");

        tfCodigo.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Data do Pedido:");

        tfData.setEditable(false);

        btnRefazer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRefazer.setText("Refazer");
        btnRefazer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefazerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefazer, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(combEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnConsultarEmpresa))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAdcionar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfCodigo))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarEmpresa)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btnAdcionar)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRefazer, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarEmpresaActionPerformed
        ArrayList<Produto> produtos = empresas.get(combEmpresa.getSelectedIndex()).getProdutos();
        ArrayList<String> nomeProdutos = new ArrayList<>();
        for (Produto prod : produtos) {
            nomeProdutos.add(prod.getTipo());
        }

        modelo.removeAllElements();
        for (int i = 0; i < nomeProdutos.size(); i++) {
            modelo.addElement(nomeProdutos.get(i));
        }
    }//GEN-LAST:event_btnConsultarEmpresaActionPerformed

    private void btnAdcionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdcionarActionPerformed
        int posProd = listProdutos.getSelectedIndex();
        int posEmp = combEmpresa.getSelectedIndex();
        Produto p = fe.retornarProduto(posEmp, posProd);

        DefaultTableModel itemsProduto = (DefaultTableModel) tableItemsPedido.getModel();
        Object[] dados = {p.getTipo(), p.getPreco(), p.getCodigo()};
        itemsProduto.addRow(dados);
        precoTotal = precoTotal + p.getPreco();
        tfPrecoTotal.setText(String.valueOf(precoTotal));

        combEmpresa.setEnabled(false);
        btnConsultarEmpresa.setEnabled(false);

    }//GEN-LAST:event_btnAdcionarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if (!fc.isStatusAdmin()) {
            if (precoTotal == 0) {
                JOptionPane.showMessageDialog(this, "Nenhum item no pedido!");
                return;
            }

            Pedido p = new Pedido();

            p.setCodigo(Integer.parseInt(tfCodigo.getText()));

            Date auxDate = null;

            try {
                auxDate = formato.parse(tfData.getText());
            } catch (ParseException ex) {
                Logger.getLogger(ScreenCadastroPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
            p.setData(auxDate);

            Empresa empresa = fe.retornarEmpresa(combEmpresa.getSelectedIndex());
            p.setEmpresa(empresa);

            p.setValorTotal(precoTotal);

            ArrayList<Produto> prods = new ArrayList<>();
            DefaultTableModel itemsProdutoModel = (DefaultTableModel) tableItemsPedido.getModel();
            int contRow = itemsProdutoModel.getRowCount();

            for (int i = 0; i < contRow; i++) {
                String nomeProduto = itemsProdutoModel.getValueAt(i, 0).toString();
                float precoProduto = Float.parseFloat(itemsProdutoModel.getValueAt(i, 1).toString());
                int codigoProduto = Integer.parseInt(itemsProdutoModel.getValueAt(i, 2).toString());
                Produto prod = new Produto();
                prod.setCodigo(codigoProduto);
                prod.setPreco(precoProduto);
                prod.setTipo(nomeProduto);

                prods.add(prod);
            }

            p.setProdutos(prods);
           
            
            int posCliente = fc.getPosClienteAtual();

            fc.addPedido(posCliente, p);
            fpe.setCodigo();
            limpar();
            tfCodigo.setText(String.valueOf(fpe.getCodigo()));
        } else {
            JOptionPane.showMessageDialog(this, "Usuário administrador não pode fazer pedido!!");
            return;
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnRefazerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefazerActionPerformed
        limpar();
    }//GEN-LAST:event_btnRefazerActionPerformed

    public void limpar() {
        ((DefaultTableModel) tableItemsPedido.getModel()).setNumRows(0);
        tableItemsPedido.updateUI();
        btnConsultarEmpresa.setEnabled(true);
        combEmpresa.setEnabled(true);
        tfPrecoTotal.setText(null);
        precoTotal = 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdcionar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnConsultarEmpresa;
    private javax.swing.JButton btnRefazer;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> combEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listProdutos;
    private javax.swing.JTable tableItemsPedido;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfPrecoTotal;
    // End of variables declaration//GEN-END:variables
}
