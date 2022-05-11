/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entreganotificacion;

import notificador.Aplicacion;
import notificador.NotificacionEmail;
import notificador.NotificacionFacebook;
import notificador.NotificacionSMS;
import notificador.Notificador;

/**
 *
 * @author User
 */
public class EntregaNotificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Aplicacion aplicacion = new Aplicacion(new Notificador());
        aplicacion.getNotificador().agregarNotificacion(new NotificacionSMS("123456"));
        aplicacion.getNotificador().agregarNotificacion(new NotificacionEmail("juan@hotmail.com"));
        aplicacion.getNotificador().agregarNotificacion(new NotificacionFacebook("facebook.com"));
        aplicacion.getNotificador().enviar("Mensaje de prueba");
    }
    
}
