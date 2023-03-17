
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;        
        
public class ClientesModel2 {
    Queue<Clientes> ListaClientes2 = new LinkedList();
    
    public void EncolarCliente2(String apelli, String nombre)
    {
        Clientes nuevoCliente2 = new Clientes(apelli, nombre);
        this.ListaClientes2.add(nuevoCliente2);
        JOptionPane.showMessageDialog(null, "CLIENTE AGREGADO A LA LISTA");
    }
    
    public Queue ListarClientes2()
{
    return this.ListaClientes2;
}

public void DesEncolar()
{
    this.ListaClientes2.poll();
}
}
