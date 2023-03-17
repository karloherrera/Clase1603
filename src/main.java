
import Controladores.ListaController;
import Modelos.ClientesModel;
import Modelos.ClientesModel2;
import Vistas.frmListas;
import Vistas.frmPrincipal;
import Vistas.frmVer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author USUARIO 2
 */
public class main {

    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        frmVer VistaVer = new frmVer();
        frmListas VistaListas = new frmListas(null, true);
        ClientesModel ModeloLista = new ClientesModel();
        ClientesModel2 ModeloLista2 = new ClientesModel2();
        ListaController ControladorLista = new ListaController(VistaPrincipal, VistaVer, VistaListas, ModeloLista, ModeloLista2);
    }
    
}
