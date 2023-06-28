/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ClienteDao;
import DAO.ContaDao;
import Model.Conta;
import View.JanelaManipulaContaView;

/**
 *
 * @author T-GAMER
 */
public class ContaManipulaController {

    private ContaDao contadao;
    private JanelaManipulaContaView view;

    public ContaManipulaController(JanelaManipulaContaView view, ContaDao contadao) {
        this.view = view;
        this.contadao = contadao;
        initController();
    }

    private void initController() {
        this.view.setController(this);
        this.view.initView();

    }

    public void buscarConta() {
        try {
            String cpf = view.getContaParaBuscar();
            Conta conta = contadao.buscar(cpf);
            view.apresentarConta(conta);
        } catch (Exception ex) {
            view.apresentaErro("Conta não encontrada.");
        }
    }

    public void sacarConta() {
        try {
            Conta conta = view.getContaManipula();
            double valor = view.getValorParaSacar();
            conta.saca(valor);
            contadao.atualizar(conta);
            view.apresentarConta(conta);
        } catch (Exception ex) {
            view.apresentaErro("Não foi possivel efetuar o saque.");
        }
    }

    public void depositarConta() {
        try {
            Conta conta = view.getContaManipula();
            double valor = view.getValorParaDepositar();
            conta.deposita(valor);
            contadao.atualizar(conta);
            view.apresentarConta(conta);
        } catch (Exception ex) {
            view.apresentaErro("Não foi possivel efetuar o depósito.");
        }
    }

    public void remunerarConta() {
        try {
            Conta conta = view.getContaManipula();
            if (conta.getSaldo() > 0.0) {
                conta.remunera();
                contadao.atualizar(conta);
                view.apresentarConta(conta);
            } else {
                view.apresentaErro("Conta com saldo negativo!");
            }
        } catch (Exception ex) {
            view.apresentaErro("Não foi possivel efetuar a remuneração.");
        }
    }

}
