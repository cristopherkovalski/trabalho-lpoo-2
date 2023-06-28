/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ClienteController;
import Model.Cliente;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * 
 */
public class JanelaClienteView extends javax.swing.JFrame {
    private ClienteTableModel modeloTabela = new ClienteTableModel();
    private ClienteController controller;
    
    public JanelaClienteView() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoListar = new javax.swing.JButton();
        botaoInserir = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        scrollPaneContatos = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        Manipula = new javax.swing.JPanel();
        Nome = new javax.swing.JLabel();
        EntNome = new javax.swing.JTextField();
        EntSal = new javax.swing.JTextField();
        Salario = new javax.swing.JLabel();
        EntEnd = new javax.swing.JTextField();
        Endereço = new javax.swing.JLabel();
        EntRG = new javax.swing.JTextField();
        CPF = new javax.swing.JLabel();
        EntCPF = new javax.swing.JTextField();
        RG = new javax.swing.JLabel();
        EntSobre = new javax.swing.JTextField();
        Sobrenome = new javax.swing.JLabel();
        botaoLimpar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoListar.setText("Listar");

        botaoInserir.setText("Inserir");

        botaoAtualizar.setText("Atualizar");

        botaoExcluir.setText("Excluir");

        tabelaClientes.setModel(modeloTabela);
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        scrollPaneContatos.setViewportView(tabelaClientes);

        Nome.setText("Nome");

        EntNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        EntSal.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        Salario.setText("Salario");

        EntEnd.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        Endereço.setText("Endereço");

        EntRG.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        CPF.setText("RG");

        EntCPF.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        RG.setText("CPF");

        EntSobre.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        Sobrenome.setText("Sobrenome");

        javax.swing.GroupLayout ManipulaLayout = new javax.swing.GroupLayout(Manipula);
        Manipula.setLayout(ManipulaLayout);
        ManipulaLayout.setHorizontalGroup(
            ManipulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManipulaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ManipulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ManipulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Endereço, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(EntNome, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RG, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntRG, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntSal, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salario, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ManipulaLayout.setVerticalGroup(
            ManipulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ManipulaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EntNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sobrenome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EntSobre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EntCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(CPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EntRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Endereço)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EntEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EntSal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        botaoLimpar.setText("Limpar");

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Sobrenome", "Salário", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneContatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botaoAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(Manipula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneContatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoListar)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoInserir))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(botaoAtualizar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Manipula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
        int linhaSel = tabelaClientes.getSelectedRow();
        botaoInserir.setEnabled(false);
        if(linhaSel != -1) {
        String nome = tabelaClientes.getValueAt(linhaSel, 1).toString();        
        String sobrenome = tabelaClientes.getValueAt(linhaSel, 2).toString();
        String rg = tabelaClientes.getValueAt(linhaSel, 3).toString();
        String cpf = tabelaClientes.getValueAt(linhaSel, 4).toString();
        String endereco = tabelaClientes.getValueAt(linhaSel, 5).toString();
        String salario = tabelaClientes.getValueAt(linhaSel, 6).toString();
        
        EntNome.setText(nome);
        EntSobre.setText(sobrenome);
        EntCPF.setText(rg);
        EntRG.setText(cpf);
        EntEnd.setText(endereco);
        EntSal.setText(salario);
        }
    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaInicial view = new TelaInicial();
        view.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int columnIndex = jComboBox1.getSelectedIndex();
        modeloTabela.ordenarPorColuna(columnIndex);
    }//GEN-LAST:event_jComboBox1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel Endereço;
    private javax.swing.JTextField EntCPF;
    private javax.swing.JTextField EntEnd;
    private javax.swing.JTextField EntNome;
    private javax.swing.JTextField EntRG;
    private javax.swing.JTextField EntSal;
    private javax.swing.JTextField EntSobre;
    private javax.swing.JPanel Manipula;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel RG;
    private javax.swing.JLabel Salario;
    private javax.swing.JLabel Sobrenome;
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoInserir;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoListar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane scrollPaneContatos;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables

    public void setController(ClienteController controller) {
        this.controller = controller;
        botaoListar.addActionListener(e -> controller.listarCliente());
        botaoInserir.addActionListener(e -> controller.adicionarCliente());
        botaoAtualizar.addActionListener(e -> controller.atualizarCliente());
        botaoExcluir.addActionListener(e -> controller.deletarCliente());
        botaoLimpar.addActionListener(e -> limpar());
        
    }

    public void initView() {
        /* Create and display the form */

        java.awt.EventQueue.invokeLater(() ->  this.setVisible(true));
             
    }

    public void mostrarListaClientes(List<Cliente> lista) {
       modeloTabela.setListaCliente(lista);
    }

    public Cliente getClienteFormulario() {
        int id = 0;
        String nome = EntNome.getText();
        String sobrenome = EntSobre.getText();
        String rg = EntCPF.getText();
        String cpf = EntRG.getText();
        String endereco = EntEnd.getText();
        Double salario =  Double.valueOf(EntSal.getText());
       
        Cliente cliente = new Cliente(id, nome, sobrenome, cpf, rg, endereco, salario);
        
        return cliente;
    }

    public Cliente getClienteFormularioManipula() {
        int linhaSel = tabelaClientes.getSelectedRow();
        int id = Integer.parseInt(tabelaClientes.getValueAt(linhaSel, 0).toString());       
        String nome = EntNome.getText();
        String sobrenome = EntSobre.getText();
        String rg = EntCPF.getText();
        String cpf = EntRG.getText();
        String endereco = EntEnd.getText();
        Double salario =  Double.valueOf(EntSal.getText());
       
        Cliente cliente = new Cliente(id, nome, sobrenome, cpf, rg, endereco, salario);
       

        return cliente;
    }
    
    public void inserirClienteView(Cliente cliente) {
        modeloTabela.adicionaCliente(cliente);
    }

    public void excluirClienteView(Cliente cliente) {
        modeloTabela.removeCliente(cliente);
    }

    public void atualizarCliente(Cliente cliente) {
        System.out.print("foi");
    }

    public void apresentaErro(String erro) {
        JOptionPane.showMessageDialog(null,erro + "\n", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public void apresentaInfo(String selecione_um_cliente_na_tabela_para_atual) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void limpar() {
        
        EntNome.setText(null);
        EntSobre.setText(null);
        EntCPF.setText(null);
        EntRG.setText(null);
        EntEnd.setText(null);
        EntSal.setText(null);
        botaoInserir.setEnabled(true);
    }

    private void chamaTela() {
        JanelaContaView telaSecundaria = new JanelaContaView();
        telaSecundaria.setVisible(true);
        
    }
    
    
    
}