/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Controller.ContaManipulaController;
import Model.Conta;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author T-GAMER
 */
public class JanelaManipulaContaView extends javax.swing.JFrame {
        
        private Conta conta;
    /**
     * Creates new form JanelaManipulaConta
     */
    public JanelaManipulaContaView() {
        initComponents();
    
    }
    private ContaManipulaController controller;
    
    public void setController(ContaManipulaController controller) {
        this.controller = controller;
        botBuscar.addActionListener(e -> controller.buscarConta());
        botSacar.addActionListener(e -> controller.sacarConta());
        botDepositar.addActionListener(e -> controller.depositarConta());
        botRemunerar.addActionListener(e -> controller.remunerarConta());

    }
    
    
    
    public String getContaParaBuscar(){
            if (11 == fieldCPF.getText().length()){
               String cpf = fieldCPF.getText();
               return cpf;       
            }else{
              JOptionPane.showMessageDialog(null,null, "CPF inválido", JOptionPane.ERROR_MESSAGE);
            }
            return null;
               
    }
    
    public void apresentarConta(Conta conta){
        fieldSaldo.setText(new DecimalFormat("#.##").format(conta.getSaldo()));
        fieldValor.setEditable(true);
        this.conta=conta;
    }
    
    public double getValorParaSacar(){
        try{
        double valor = Double.parseDouble(fieldValor.getText());
        return valor;
        }catch (Exception e){
            apresentaErro("valor não suportado");
            e.printStackTrace();  
        }
            return 0;
        
    }
    public Conta getContaManipula(){
        return conta;
    }
    
    public double getValorParaDepositar(){
        try{
        double valor = Double.parseDouble(fieldValor.getText());
        return valor;
        }catch (Exception e){
           apresentaErro("valor não suportado");
           e.printStackTrace();
        }
            return 0;
    }
    
    
    
    
     public void apresentaErro(String erro) {
        JOptionPane.showMessageDialog(null,erro + "\n", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        fieldCPF = new javax.swing.JTextField();
        botBuscar = new javax.swing.JButton();
        botSacar = new javax.swing.JButton();
        botDepositar = new javax.swing.JButton();
        botRemunerar = new javax.swing.JButton();
        fieldValor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldSaldo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();

        jLabel4.setText("R$");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fieldCPF.setText("Insira o CPF");
        fieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldCPFActionPerformed(evt);
            }
        });

        botBuscar.setText("Buscar");
        botBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botBuscarActionPerformed(evt);
            }
        });

        botSacar.setText("Sacar");
        botSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botSacarActionPerformed(evt);
            }
        });

        botDepositar.setText("Depositar");
        botDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botDepositarActionPerformed(evt);
            }
        });

        botRemunerar.setText("Remunerar");
        botRemunerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botRemunerarActionPerformed(evt);
            }
        });

        fieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldValorActionPerformed(evt);
            }
        });

        jLabel1.setText("Valor:");

        jLabel2.setText("R$");

        fieldSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSaldoActionPerformed(evt);
            }
        });

        jLabel3.setText("Saldo:");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setText("Manipular Conta");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setText("R$");

        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botSacar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(botDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(156, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(fieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botBuscar)
                            .addComponent(jLabel3)
                            .addComponent(botRemunerar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6))
                            .addComponent(Voltar))
                        .addGap(8, 8, 8))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botBuscar))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(fieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botRemunerar)
                    .addComponent(botDepositar)
                    .addComponent(botSacar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(Voltar)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldCPFActionPerformed

    private void botBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botBuscarActionPerformed

    private void botDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botDepositarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botDepositarActionPerformed

    private void botSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botSacarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botSacarActionPerformed

    private void fieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldValorActionPerformed

    private void botRemunerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botRemunerarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botRemunerarActionPerformed

    private void fieldSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldSaldoActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        TelaInicial view = new TelaInicial();
        view.show();
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    /**
     * @param args the command line arguments
     */
     public void initView() {
        /* Create and display the form */

        java.awt.EventQueue.invokeLater(() -> this.setVisible(true));
        
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Voltar;
    private javax.swing.JButton botBuscar;
    private javax.swing.JButton botDepositar;
    private javax.swing.JButton botRemunerar;
    private javax.swing.JButton botSacar;
    private javax.swing.JTextField fieldCPF;
    private javax.swing.JTextField fieldSaldo;
    private javax.swing.JTextField fieldValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}