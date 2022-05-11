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
public class NotificacionSMS implements Notificaciones{

    public NotificacionSMS(String numero) {
        this.numero = numero;
    }

    public NotificacionSMS() {
    }
    
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    @Override
    public void enviar(String mensaje) {
        System.out.println(mensaje);
        System.out.println("se envio un mensaje al numero " + this.getNumero());
    }
    
}
