/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Modelos.Clientes;
import Modelos.ClientesModel;
import Modelos.ClientesModel2;
import Vistas.frmListas;
import Vistas.frmVer;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author USUARIO 2
 */
public class ListaController implements ActionListener{
frmPrincipal VistaPrincipal;
frmVer VistaVer;
frmListas VistaLista;
ClientesModel ModeloClientes;
ClientesModel2 ModeloClientes2;

    public ListaController(frmPrincipal VistaPrincipal, frmVer VistaVer, frmListas VistaLista, ClientesModel ModeloClientes, ClientesModel2 ModeloClientes2) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaVer = VistaVer;
        this.VistaLista = VistaLista;
        this.ModeloClientes = ModeloClientes;
        this.ModeloClientes2 = ModeloClientes2;
        
        //PONER A LA ESCUCHA LOS BOTONES
        this.VistaPrincipal.btnIngresar.addActionListener(this);
        this.VistaPrincipal.btnPacientes.addActionListener(this);
        //LEVANTAR LA VISTA LISTAs
        this.VistaPrincipal.setLocationRelativeTo(null);
        this.VistaPrincipal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.VistaPrincipal.btnIngresar)
        {
        
            this.VistaLista.btnMedico1.addActionListener(this);
            this.VistaLista.btnMedico2.addActionListener(this);
            this.VistaLista.setLocationRelativeTo(null);
            this.VistaLista.setVisible(true);    
        }
        if(e.getSource() == this.VistaPrincipal.btnPacientes){
        
            this.VistaVer.setLocationRelativeTo(null);
            this.VistaVer.setVisible(true);
    }
        if(e.getSource() == this.VistaLista.btnMedico1){
        
            this.ModeloClientes.EncolarCliente(this.VistaLista.txtApellidos.getText(), 
            this.VistaLista.txtNombres.getText());
            
            //TRAE LA LISTA CLIENTES DESDE EL MODELO
            Queue<Clientes> listaLocal = this.ModeloClientes.ListarClientes();
            
            //RECORRE LA LISTA CLIENTES DESDE EL MODELO
                String Cadena = "";
                for(Clientes MiListaClientes: listaLocal)
                {
                    
                    Cadena = Cadena + MiListaClientes.getNombre()+" "+MiListaClientes.getApellidos()+"\n";
                    this.VistaVer.txtMedico1.setText(Cadena);
                }
        }
        
        if(e.getSource() == this.VistaLista.btnMedico2){
            this.ModeloClientes2.EncolarCliente2(this.VistaLista.txtApellidos.getText(), 
            this.VistaLista.txtNombres.getText());
            
            //TRAE LA LISTA CLIENTES DESDE EL MODELO
            Queue<Clientes> listaLocal = this.ModeloClientes2.ListarClientes2();
            
            //RECORRE LA LISTA CLIENTES DESDE EL MODELO
                String Cadena = "";
                for(Clientes MiListaClientes: listaLocal)
                {
                    
                    Cadena = Cadena + MiListaClientes.getNombre()+" "+MiListaClientes.getApellidos()+"\n";
                    this.VistaVer.txtMedico2.setText(Cadena);
                }
        }
    }
}
