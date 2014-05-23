/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pc.remoto;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enaveira
 */
public class SocketServidor extends Thread{
    
    private ServerSocket servidor;

    private int puerto;
    
    public SocketServidor(int puerto){
        this.puerto = puerto;
        try {
            servidor = new ServerSocket(puerto);
        } catch (IOException ex) {
            Logger.getLogger(SocketServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void run(){
        
    }
    
    public void iniciar(){
        
    }
    
    public void pausar(){
        
    }
    
    public void cerrar(){
        
    }
    
    public void recibir(){
        
    }
    
    public void enviar(String mensaje){
        
    }
    
}
