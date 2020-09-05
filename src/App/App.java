/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import Connection.ConnectionBD;
import Ctrl.Ctrl;
import Ventanas.Ventana1;

/**
 *
 * @author diosl
 */
public class App {

    public static void iniciar() {
        ConnectionBD connectionBD = new ConnectionBD();

        Ventana1 ventana1 = new Ventana1();

        Ctrl ctrl = new Ctrl(ventana1, connectionBD);
    }

    public static void main(String[] args) {
        iniciar();
    }

}
