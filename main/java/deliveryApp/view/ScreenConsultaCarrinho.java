package deliveryApp.view;

import deliveryApp.control.GerenciaCarrinho;
import deliveryApp.control.GerenciaClientes;
import deliveryApp.model.Carrinho;
import deliveryApp.model.Cliente;
import deliveryApp.model.Pedido;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class ScreenConsultaCarrinho extends javax.swing.JInternalFrame {

    GerenciaCarrinho fcar;
    ArrayList<Carrinho> carrinhos;
    GerenciaClientes fc;
    ArrayList<Cliente> clientes;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    public ScreenConsultaCarrinho(GerenciaCarrinho fcar, ArrayList<Carrinho> carrinhos, GerenciaClientes fc, ArrayList<Cliente> clientes) {
        initComponents();
        this.fcar = fcar;
        this.carrinhos = carrinhos;
        this.fc = fc;
        this.clientes = clientes;

        ArrayList<String> nomeCliente = new ArrayList<>();
        for (Carrinho car : carrinhos) {
            nomeCliente.add(car.getCliente().getNome());
        }
        combCliente.setModel(new DefaultComboBoxModel(nomeCliente.toArray()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableItemsPedido = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        combCliente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        combPedido = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfPrecoTotal = new javax.swing.JTextField();
        tfTipoPagamento = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableItemsPedido1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        tfEmpresa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfPrecoPedido = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

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

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consulta de Carrinho");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Cliente:");

        combCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combClienteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Pedido:");

        combPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combPedidoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Tipo de Pagamento:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Data de Criação:");

        tfData.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Preço Total:");

        tfPrecoTotal.setEditable(false);

        tfTipoPagamento.setEditable(false);

        tableItemsPedido1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço", "Código"
            }
        ));
        tableItemsPedido1.setColumnSelectionAllowed(true);
        tableItemsPedido1.setEnabled(false);
        jScrollPane3.setViewportView(tableItemsPedido1);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Empresa:");

        tfEmpresa.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Items do Pedido:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Preço do Pedido:");

        tfPrecoPedido.setEditable(false);

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVoltar.setText("Voltar");

        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTipoPagamento))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPrecoTotal))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfData, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combPedido, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfPrecoPedido))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(combCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(combPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tfPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tfTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tfPrecoPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combPedidoActionPerformed
        Pedido p = new Pedido();
        String nomeCliente = combCliente.getItemAt(combCliente.getSelectedIndex());
        p = fc.retornarPedido(nomeCliente, combPedido.getSelectedIndex());

        ((DefaultTableModel) tableItemsPedido1.getModel()).setNumRows(0);
        DefaultTableModel itemsProduto = (DefaultTableModel) tableItemsPedido1.getModel();
        for (int i = 0; i < p.getProdutos().size(); i++) {
            Object[] dados = {p.getProdutos().get(i).getTipo(), p.getProdutos().get(i).getPreco(), p.getProdutos().get(i).getCodigo()};
            itemsProduto.addRow(dados);
        }

        tfEmpresa.setText(p.getEmpresa().getNome());
        tfPrecoPedido.setText(String.valueOf(p.getValorTotal()));
    }//GEN-LAST:event_combPedidoActionPerformed

    private void combClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combClienteActionPerformed
        String nomeCliente = combCliente.getItemAt(combCliente.getSelectedIndex());
        ArrayList<Pedido> p = new ArrayList<>();

        p = fc.retornaArrayPedidos(nomeCliente);

        ArrayList<Integer> codPedido = new ArrayList<>();
        for (Pedido ped : p) {
            codPedido.add(ped.getCodigo());
        }
        combPedido.setModel(new DefaultComboBoxModel(codPedido.toArray()));

        Carrinho c = fcar.retornarCarrinho(combCliente.getSelectedIndex());

        tfData.setText(String.valueOf(formato.format(c.getDataCriacao())));
        tfPrecoTotal.setText(String.valueOf(c.getPrecoTotal()));
        tfTipoPagamento.setText(c.getTipoPagamento());
    }//GEN-LAST:event_combClienteActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String nomeCliente = combCliente.getItemAt(combCliente.getSelectedIndex());
        fcar.excluir(nomeCliente);
        limpar();
        atualizar();
    }//GEN-LAST:event_btnExcluirActionPerformed

    public void limpar() {
        ((DefaultTableModel) tableItemsPedido1.getModel()).setNumRows(0);
        tableItemsPedido1.updateUI();
        tfData.setText(null);
        tfEmpresa.setText(null);
        tfPrecoPedido.setText(null);
        tfPrecoTotal.setText(null);
        tfTipoPagamento.setText(null);
       
    }
    
    public void atualizar(){
        ArrayList<String> nomeCliente = new ArrayList<>();
        for (Carrinho car : carrinhos) {
            nomeCliente.add(car.getCliente().getNome());
        }
        combCliente.setModel(new DefaultComboBoxModel(nomeCliente.toArray()));
        
        combPedido.removeAllItems();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> combCliente;
    private javax.swing.JComboBox<String> combPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableItemsPedido;
    private javax.swing.JTable tableItemsPedido1;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfEmpresa;
    private javax.swing.JTextField tfPrecoPedido;
    private javax.swing.JTextField tfPrecoTotal;
    private javax.swing.JTextField tfTipoPagamento;
    // End of variables declaration//GEN-END:variables
}
