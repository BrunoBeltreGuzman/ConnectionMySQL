/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

import Connection.ConnectionBD;
import Ventanas.Ventana1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 *
 * @author diosl
 */
public class Ctrl implements ActionListener{

    private Ventana1 ventana1;
    private ConnectionBD connectionBD;
    
    public Ctrl(Ventana1 ventana1, ConnectionBD connectionBD){
      this.ventana1 = ventana1;
      this.connectionBD = connectionBD;
      
      ventana1.getBtnConectar().addActionListener(this);
      ventana1.getBtnDesconectar().addActionListener(this);
      
      iniciar();
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == ventana1.getBtnConectar()){
            if(connectionBD.conectar()){
                ventana1.getTexNotf().setText("Conexión realizada satisfactoriamente");
                ventana1.getEtq().setEnabled(true);
            }else{
                ventana1.getTexNotf().setText("Error al realizar conexión");
                ventana1.getEtq().setEnabled(false);
            }
        }
        
        if(e.getSource() == ventana1.getBtnDesconectar()){
            if(connectionBD.desConectar()){
                ventana1.getTexNotf().setText("Conexión desconetada satisfactoriamente");
                ventana1.getEtq().setEnabled(false);
            }else{
                ventana1.getTexNotf().setText("Error al desconetar conexión");
                ventana1.getEtq().setEnabled(false);
            }
        }
        
    }
    
    public void iniciar(){
        ventana1.setVisible(true);
    }
    
}
