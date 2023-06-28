/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.ClienteDao;
import DAO.ConnectionFactory;
import View.JanelaClienteView;
import View.TelaInicial;

/**
 *
 * @author Gabriel
 */
public class Main {
    public static void main(String args[]){
        TelaInicial view = new TelaInicial();
        view.initView();
    }
    
}
