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
public class NotificacionEmail  implements Notificaciones{
    private String email;

    public NotificacionEmail() {
    }

    public NotificacionEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println(mensaje);
        System.out.println("se envio un mensaje a la direccion "+ this.getEmail());
    }
    
}
