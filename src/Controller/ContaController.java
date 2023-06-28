/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ClienteDao;
import DAO.ContaDao;
import Model.Cliente;
import Model.Conta;
import View.JanelaClienteView;
import View.JanelaContaView;
import View.JanelaManipulaContaView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-GAMER
 */
public class ContaController {

    private ContaDao contadao;
    private ClienteDao clientedao;
    private JanelaContaView view;
  

    public ContaController(JanelaContaView view, ContaDao contadao, ClienteDao clientedao) {
        this.view = view;
        this.contadao = contadao;
        this.clientedao=clientedao;
        initController();
    }
    
    

    private void initController() {
        this.view.setController(this);
        this.view.initView();

    }

    
   public void adicionarConta() {
        try {
            Conta conta = view.getContaFormulario();
            contadao.inserir(conta);
          // view.inserirContaView(conta);
           listarClienteSemConta();
           view.apresentaInfo("Adicionado com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
           view.apresentaErro("Erro ao adicionar conta.");
        }
    }
    public void listarClienteSemConta() {
        try {
            //view.limparClienteAtualizar();
            List<Cliente> lista = clientedao.listarClienteSemConta();
           view.mostrarClienteConta(lista);
        } catch (Exception ex) {
            ex.printStackTrace();
           // view.apresentaErro("Erro ao listar clientes.");
        }
    }

   /* public void atualizarConta() {
        try {
            Conta conta = view2.getContaAtualizada();
            contadao.atualizar(conta);
            view2.apresentarConta(conta);
        } catch (Exception ex) {
            view2.apresentaErro("Erro ao atualizar conta.");
        }
    }*/

    


    
        
}
