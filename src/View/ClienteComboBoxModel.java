/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

/**
 *
 * @author T-GAMER
 */
import Model.Cliente;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import java.util.ArrayList;
import java.util.List;

public class ClienteComboBoxModel extends AbstractListModel implements ComboBoxModel{
    private Object selectedItem;

    private List<Cliente> clientes;

    public ClienteComboBoxModel(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public int getSize() {
        return clientes.size();
    }

    @Override
    public Object getElementAt(int index) {
        return clientes.get(index);
    }

    @Override
    public void setSelectedItem(Object selectedItem) {
        this.selectedItem = selectedItem;
    }

    @Override
    public Object getSelectedItem() {
        return selectedItem;
    }
    
}
