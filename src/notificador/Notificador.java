/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notificador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Notificador implements Notificaciones{
    private  List<Notificaciones> notificaciones;

    public List<Notificaciones> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(List<Notificaciones> notificaciones) {
        this.notificaciones = notificaciones;
    }
    
    public void agregarNotificacion( Notificaciones notificacion){
        notificaciones.add(notificacion);
    }
    
    public void eliminarNotificaciones(Notificaciones notificacion){
        notificaciones.remove(notificacion);
    }
    

    public Notificador() {
        this.notificaciones = new ArrayList<>();
    }
    

    @Override
    public void enviar(String mensaje) {
        this.notificaciones.forEach((notificacion) -> notificacion.enviar(mensaje));
    }
    
}
