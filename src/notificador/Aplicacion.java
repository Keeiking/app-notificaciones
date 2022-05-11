/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notificador;

/**
 *
 * @author User
 */
public class Aplicacion {
    private Notificador notificador;
    public void setNotificador(Notificador notificador){
        this.notificador = notificador;
    }
    public Notificador getNotificador(){
        return this.notificador;
    }

    public Aplicacion() {
    }

    public Aplicacion(Notificador notificador) {
        this.notificador = notificador;
    }
    
    
}
