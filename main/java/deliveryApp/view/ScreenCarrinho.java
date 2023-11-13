package deliveryApp.view;

import deliveryApp.control.GerenciaCarrinho;
import deliveryApp.control.GerenciaClientes;
import deliveryApp.model.Carrinho;
import deliveryApp.model.Cliente;
import deliveryApp.model.Pedido;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ScreenCarrinho extends javax.swing.JInternalFrame {

    private GerenciaClientes fc;
    private ArrayList<Cliente> clientes;
    private GerenciaCarrinho fcar;
    private ArrayList<Carrinho> carrinhos;
    DefaultListModel modelo = new DefaultListModel();
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    private float precoTotal = 0;

    public ScreenCarrinho(GerenciaClientes fc, ArrayList<Cliente> clientes, GerenciaCarrinho fcar, ArrayList<Carrinho> carrinhos) {
        initComponents();
        this.fc = fc;
        this.clientes = clientes;
        this.fcar = fcar;
        this.carrinhos = carrinhos;
        listPedidos.setModel(modelo);
        
        int posCliente = fc.getPosClienteAtual();
        ArrayList<Pedido> pedidos = clientes.get(posCliente).getPedidos();
        ArrayList<Integer> codPedido = new ArrayList<>();
        for (Pedido ped : pedidos) {
            codPedido.add(ped.getCodigo());
        }

        modelo.removeAllElements();

        for (int i = 0; i < codPedido.size(); i++) {
            modelo.addElement(codPedido.get(i));
        }

        Calendar dataSistema = Calendar.getInstance();
        tfData.setText(String.valueOf(formato.format(dataSistema.getTime())));
        
        for(int i = 0; i < pedidos.size(); i++){
            precoTotal = precoTotal + pedidos.get(i).getValorTotal();
        }
        
        tfPrecoTotal.setText(String.valueOf(precoTotal));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tableItemsPedido = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfData = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfPrecoTotal = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listPedidos = new javax.swing.JList<>();
        btnConsultar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tfEmpresa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfPrecoPedido = new javax.swing.JTextField();
        btnFinalizar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        combTipoPagamento = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Carrinho");

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Pedidos:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Items do Pedido:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Data de Criação:");

        tfData.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Preço Total:");

        tfPrecoTotal.setEditable(false);

        btnVoltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVoltar.setText("Voltar");

        jScrollPane3.setViewportView(listPedidos);

        btnConsultar.setText(">>");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Empresa:");

        tfEmpresa.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Preço do Pedido:");

        tfPrecoPedido.setEditable(false);

        btnFinalizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Tipo de Pagamento:");

        combTipoPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Débito", "Crédito", "Pix" }));
        combTipoPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combTipoPagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPrecoTotal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfData)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfEmpresa))
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfPrecoPedido)))))
                        .addContainerGap(16, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(btnConsultar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(combTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        int posCliente = fc.getPosClienteAtual();
        Pedido ped = fc.retornarPedido(posCliente, listPedidos.getSelectedIndex());

        ((DefaultTableModel) tableItemsPedido.getModel()).setNumRows(0);
        DefaultTableModel itemsProduto = (DefaultTableModel) tableItemsPedido.getModel();
        for (int i = 0; i < ped.getProdutos().size(); i++) {
            Object[] dados = {ped.getProdutos().get(i).getTipo(), ped.getProdutos().get(i).getPreco(), ped.getProdutos().get(i).getCodigo()};
            itemsProduto.addRow(dados);
        }
        
        tfEmpresa.setText(ped.getEmpresa().getNome());
        tfPrecoPedido.setText(String.valueOf(ped.getValorTotal()));
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        if (!fc.isStatusAdmin()) {
            Carrinho c = new Carrinho();
            
            c.setPrecoTotal(Float.parseFloat(tfPrecoTotal.getText()));
            
            Date auxDate = null;

            try {
                auxDate = formato.parse(tfData.getText());
            } catch (ParseException ex) {
                Logger.getLogger(ScreenCadastroPedido.class.getName()).log(Level.SEVERE, null, ex);
            }
            c.setDataCriacao(auxDate);
            
            int posCliente = fc.getPosClienteAtual();
            Cliente cli = fc.retornarCliente(posCliente);
            c.setCliente(cli);
            
            ArrayList<Pedido> peds = new ArrayList<>();
            for(int i = 0; i< cli.getPedidos().size(); i++){
                Pedido p = new Pedido();
                p.setCodigo(cli.getPedidos().get(i).getCodigo());
                p.setData(cli.getPedidos().get(i).getData());
                p.setEmpresa(cli.getPedidos().get(i).getEmpresa());
                p.setProdutos(cli.getPedidos().get(i).getProdutos());
                p.setValorTotal(cli.getPedidos().get(i).getValorTotal());
                
                peds.add(p);
            } 
            
            c.setPedidos(peds);
             
            switch (combTipoPagamento.getSelectedIndex()) {
                case 0 -> c.setTipoPagamento("Dinheiro");
                case 1 -> c.setTipoPagamento("Débito");
                case 2 -> c.setTipoPagamento("Crédito");
                case 3 -> c.setTipoPagamento("Pix");
                default -> {
                }
            }
            
            fcar.cadastro(c);
            setVisible(false);
            
        }else{
            JOptionPane.showMessageDialog(this, "Usuário administrador não pode finalizar nenhum carrinho!!");
            return;
        }
        
       
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void combTipoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combTipoPagamentoActionPerformed

    }//GEN-LAST:event_combTipoPagamentoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> combTipoPagamento;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listPedidos;
    private javax.swing.JTable tableItemsPedido;
    private javax.swing.JTextField tfData;
    private javax.swing.JTextField tfEmpresa;
    private javax.swing.JTextField tfPrecoPedido;
    private javax.swing.JTextField tfPrecoTotal;
    // End of variables declaration//GEN-END:variables
}
