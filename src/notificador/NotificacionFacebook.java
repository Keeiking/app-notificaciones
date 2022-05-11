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
public class NotificacionFacebook implements Notificaciones{
    private String url;

    public NotificacionFacebook(String url) {
        this.url = url;
    }

    public NotificacionFacebook() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    

    @Override
    public void enviar(String mensaje) {
        System.out.println(mensaje);
        System.out.println("Se envio un mensaje a la url de facebook "+ this.getUrl());
    }
    
}
