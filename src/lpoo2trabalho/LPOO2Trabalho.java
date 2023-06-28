/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lpoo2trabalho;

import DAO.ClienteDao;
import DAO.ConnectionFactory;
import DAO.ContaDao;
import Model.Cliente;
import static Model.Cliente.ordenaNome;
import static Model.Cliente.ordenaSalario;
import static Model.Cliente.ordenaSobrenome;
import Model.Conta;
import Model.ContaCorrente;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-GAMER
 */
public class LPOO2Trabalho {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
            ClienteDao dao = new ClienteDao(new ConnectionFactory());
            ContaDao cdao = new ContaDao();
            List<Cliente> lista= new ArrayList<>(); 
            Conta conta = cdao.buscar("10101010101");
            System.out.println(conta.getTipo().toString().replace("_"," "));
            System.out.println(conta.getSaldo());
            conta.remunera();
            System.out.println(conta.getSaldo());
            Conta conta1 = cdao.buscar("55555555555");
            conta1.setSaldo(1000.00);
            System.out.println(conta1.getTipo().toString().replace("_"," "));
            System.out.println(conta1.getSaldo());
            conta1.remunera();
            System.out.println(conta1.getSaldo()); 
            cdao.atualizar(conta);
            
            /*lista = dao.listar();
            ordenaNome(lista);
            for (Cliente cliente: lista){
                System.out.println(cliente.getNome());
            }
            ordenaSalario(lista);*/
        } catch (Exception ex) {
            Logger.getLogger(LPOO2Trabalho.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

}