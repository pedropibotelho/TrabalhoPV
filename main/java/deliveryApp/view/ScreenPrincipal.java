package deliveryApp.view;

import deliveryApp.control.GerenciaCarrinho;
import deliveryApp.model.Cliente;
import deliveryApp.model.Empresa;
import deliveryApp.model.Produto;
import deliveryApp.control.GerenciaClientes;
import deliveryApp.control.GerenciaEmpresa;
import deliveryApp.control.GerenciaPedido;
import deliveryApp.control.GerenciaProduto;
import deliveryApp.model.Carrinho;
import deliveryApp.model.Pedido;
import deliveryApp.model.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ScreenPrincipal extends javax.swing.JFrame {
    
    ArrayList<Usuario> usuarios;
    Usuario u = new Usuario("admin", "8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918", true);
    ArrayList<Cliente> clientes;
    GerenciaClientes fc;
    ArrayList<Empresa> empresas;
    GerenciaEmpresa fe;
    ArrayList<Produto> produtos;
    GerenciaProduto fp;
    ArrayList<Pedido> pedidos;
    GerenciaPedido fpe;
    ArrayList<Carrinho> carrinhos;
    GerenciaCarrinho fcar;

    public ScreenPrincipal() {
        initComponents();
        this.clientes = new ArrayList<>();
        fc = new GerenciaClientes(clientes);
        this.empresas = new ArrayList<>();
        fe = new GerenciaEmpresa(empresas);
        this.produtos = new ArrayList<>();
        fp = new GerenciaProduto(produtos);
        this.pedidos = new ArrayList<>();
        fpe = new GerenciaPedido(pedidos);
        this.carrinhos = new ArrayList<>();
        fcar= new GerenciaCarrinho(carrinhos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpAreaDeTrabalho = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mUsuario = new javax.swing.JMenu();
        miUsuarioLogin = new javax.swing.JMenuItem();
        mCliente = new javax.swing.JMenu();
        miCadastroCliente = new javax.swing.JMenuItem();
        miConsultaCliente = new javax.swing.JMenuItem();
        mEmpresa = new javax.swing.JMenu();
        miCadastroEmpresa = new javax.swing.JMenuItem();
        miConsultaEmpresa = new javax.swing.JMenuItem();
        mProduto = new javax.swing.JMenu();
        miCadastroProduto = new javax.swing.JMenuItem();
        miConsultaProduto = new javax.swing.JMenuItem();
        mPedido = new javax.swing.JMenu();
        miCadastroPedido = new javax.swing.JMenuItem();
        miConsultaPedido = new javax.swing.JMenuItem();
        mCarrinho = new javax.swing.JMenu();
        miAbrir = new javax.swing.JMenuItem();
        miConsultaCarrinho = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delivery App by Pedro Botelho");

        javax.swing.GroupLayout jdpAreaDeTrabalhoLayout = new javax.swing.GroupLayout(jdpAreaDeTrabalho);
        jdpAreaDeTrabalho.setLayout(jdpAreaDeTrabalhoLayout);
        jdpAreaDeTrabalhoLayout.setHorizontalGroup(
            jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
        );
        jdpAreaDeTrabalhoLayout.setVerticalGroup(
            jdpAreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        mUsuario.setText("Usuario");

        miUsuarioLogin.setText("Login");
        miUsuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUsuarioLoginActionPerformed(evt);
            }
        });
        mUsuario.add(miUsuarioLogin);

        jMenuBar1.add(mUsuario);

        mCliente.setText("Cliente");

        miCadastroCliente.setText("Cadastro");
        miCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroClienteActionPerformed(evt);
            }
        });
        mCliente.add(miCadastroCliente);

        miConsultaCliente.setText("Consulta");
        miConsultaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaClienteActionPerformed(evt);
            }
        });
        mCliente.add(miConsultaCliente);

        jMenuBar1.add(mCliente);

        mEmpresa.setText("Empresa");

        miCadastroEmpresa.setText("Cadastro");
        miCadastroEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroEmpresaActionPerformed(evt);
            }
        });
        mEmpresa.add(miCadastroEmpresa);

        miConsultaEmpresa.setText("Consulta");
        miConsultaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaEmpresaActionPerformed(evt);
            }
        });
        mEmpresa.add(miConsultaEmpresa);

        jMenuBar1.add(mEmpresa);

        mProduto.setText("Produto");

        miCadastroProduto.setText("Cadastro");
        miCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroProdutoActionPerformed(evt);
            }
        });
        mProduto.add(miCadastroProduto);

        miConsultaProduto.setText("Consulta");
        miConsultaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaProdutoActionPerformed(evt);
            }
        });
        mProduto.add(miConsultaProduto);

        jMenuBar1.add(mProduto);

        mPedido.setText("Pedido");

        miCadastroPedido.setText("Cadastro");
        miCadastroPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastroPedidoActionPerformed(evt);
            }
        });
        mPedido.add(miCadastroPedido);

        miConsultaPedido.setText("Consulta");
        miConsultaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaPedidoActionPerformed(evt);
            }
        });
        mPedido.add(miConsultaPedido);

        jMenuBar1.add(mPedido);

        mCarrinho.setText("Carrinho");

        miAbrir.setText("Abrir");
        miAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAbrirActionPerformed(evt);
            }
        });
        mCarrinho.add(miAbrir);

        miConsultaCarrinho.setText("Consulta");
        miConsultaCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultaCarrinhoActionPerformed(evt);
            }
        });
        mCarrinho.add(miConsultaCarrinho);

        jMenuBar1.add(mCarrinho);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpAreaDeTrabalho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpAreaDeTrabalho)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroClienteActionPerformed
        msgLoginAdmin();
        ScreenCadastroCliente cadastroCliente = new ScreenCadastroCliente(fc);  
        jdpAreaDeTrabalho.add(cadastroCliente);
        cadastroCliente.setVisible(fc.isStatusAdmin());
    }//GEN-LAST:event_miCadastroClienteActionPerformed

    private void miCadastroEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroEmpresaActionPerformed
        msgLoginAdmin();
        ScreenCadastroEmpresa cadastroEmpresa = new ScreenCadastroEmpresa(fe, fc);
        jdpAreaDeTrabalho.add(cadastroEmpresa);
        cadastroEmpresa.setVisible(fc.isStatusAdmin());
    }//GEN-LAST:event_miCadastroEmpresaActionPerformed

    private void miCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroProdutoActionPerformed
        msgLoginAdmin();
        ScreenCadastroProduto cadastroProduto = new ScreenCadastroProduto(fp, empresas, fe, fc);
        jdpAreaDeTrabalho.add(cadastroProduto);
        cadastroProduto.setVisible(fc.isStatusAdmin());
    }//GEN-LAST:event_miCadastroProdutoActionPerformed

    private void miCadastroPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastroPedidoActionPerformed
        msgLoginNaoAdmin();
        ScreenCadastroPedido cadastroPedido = new ScreenCadastroPedido(fpe, fc, empresas, fe, fp);
        jdpAreaDeTrabalho.add(cadastroPedido);
        cadastroPedido.setVisible(fc.isStatus() && !fc.isStatusAdmin());
    }//GEN-LAST:event_miCadastroPedidoActionPerformed

    private void miUsuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUsuarioLoginActionPerformed
        ScreenLogin login = new ScreenLogin(fc);
        jdpAreaDeTrabalho.add(login);
        login.setVisible(true);
    }//GEN-LAST:event_miUsuarioLoginActionPerformed

    private void miConsultaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaClienteActionPerformed
        msgLoginAdmin();
        ScreenConsultaCliente consultaCliente = new ScreenConsultaCliente(fc, clientes);
        jdpAreaDeTrabalho.add(consultaCliente);
        consultaCliente.setVisible(fc.isStatusAdmin());
    }//GEN-LAST:event_miConsultaClienteActionPerformed

    private void miConsultaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaEmpresaActionPerformed
        msgLoginAdmin();
        ScreenConsultaEmpresa consultaEmpresa = new ScreenConsultaEmpresa(fe, empresas);
        jdpAreaDeTrabalho.add(consultaEmpresa);
        consultaEmpresa.setVisible(fc.isStatusAdmin());
    }//GEN-LAST:event_miConsultaEmpresaActionPerformed

    private void miConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaProdutoActionPerformed
        msgLoginAdmin();
        ScreenConsultaProduto consultaProduto = new ScreenConsultaProduto(fp, empresas, produtos, fe);
        jdpAreaDeTrabalho.add(consultaProduto);
        consultaProduto.setVisible(fc.isStatusAdmin());
    }//GEN-LAST:event_miConsultaProdutoActionPerformed

    private void miConsultaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaPedidoActionPerformed
        msgLoginAdmin();
        ScreenConsultaPedido consultaPedido = new ScreenConsultaPedido(fpe, pedidos, fc, clientes);
        jdpAreaDeTrabalho.add(consultaPedido);
        consultaPedido.setVisible(fc.isStatusAdmin());
    }//GEN-LAST:event_miConsultaPedidoActionPerformed

    private void miAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAbrirActionPerformed
        msgLoginNaoAdmin();
        ScreenCarrinho carrinho = new ScreenCarrinho(fc, clientes, fcar, carrinhos);
        jdpAreaDeTrabalho.add(carrinho);
        carrinho.setVisible(fc.isStatus() && !fc.isStatusAdmin());
    }//GEN-LAST:event_miAbrirActionPerformed

    private void miConsultaCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultaCarrinhoActionPerformed
        msgLoginAdmin();
        ScreenConsultaCarrinho consultaCarrinho = new ScreenConsultaCarrinho(fcar, carrinhos, fc, clientes);
        jdpAreaDeTrabalho.add(consultaCarrinho);
        consultaCarrinho.setVisible(fc.isStatusAdmin());
    }//GEN-LAST:event_miConsultaCarrinhoActionPerformed
    
    public void msgLogin(){
        if(!fc.isStatus())
            JOptionPane.showMessageDialog(this, "Faça login para ter acesso ao sistema!");
    }
    
    public void msgLoginNaoAdmin(){
        if(!fc.isStatus())
            JOptionPane.showMessageDialog(this, "Faça login para ter acesso ao sistema!");
        else if(fc.isStatusAdmin())
            JOptionPane.showMessageDialog(this, "Faça login como um cliente para ter acesso a essa funcionalidade!");
    }
    
    public void msgLoginAdmin(){
        if(!fc.isStatus())
            JOptionPane.showMessageDialog(this, "Faça login para ter acesso ao sistema!");
        else if(!fc.isStatusAdmin())
            JOptionPane.showMessageDialog(this, "Faça login como administrador para ter acesso a essa funcionalidade!");
    }
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpAreaDeTrabalho;
    private javax.swing.JMenu mCarrinho;
    private javax.swing.JMenu mCliente;
    private javax.swing.JMenu mEmpresa;
    private javax.swing.JMenu mPedido;
    private javax.swing.JMenu mProduto;
    private javax.swing.JMenu mUsuario;
    private javax.swing.JMenuItem miAbrir;
    private javax.swing.JMenuItem miCadastroCliente;
    private javax.swing.JMenuItem miCadastroEmpresa;
    private javax.swing.JMenuItem miCadastroPedido;
    private javax.swing.JMenuItem miCadastroProduto;
    private javax.swing.JMenuItem miConsultaCarrinho;
    private javax.swing.JMenuItem miConsultaCliente;
    private javax.swing.JMenuItem miConsultaEmpresa;
    private javax.swing.JMenuItem miConsultaPedido;
    private javax.swing.JMenuItem miConsultaProduto;
    private javax.swing.JMenuItem miUsuarioLogin;
    // End of variables declaration//GEN-END:variables
}
