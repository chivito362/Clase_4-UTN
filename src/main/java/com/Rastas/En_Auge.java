package com.Rastas;

import javax.swing.*;

public class En_Auge implements Estado{
    private Cancion cancion;


    @Override
    public void verificacion() {
        if(cancion.getDislikes()<5000){
            if(cancion.getReproducciones()>=50000 && cancion.getLikes()>=20000){
                cancion.cambiarEstado(new En_Tendencia());
                cancion.setIcono(new ImageIcon(Icono.FIRE.texto()));
                cancion.validar();
            }
        }else{
            cancion.cambiarEstado(new Normal());
            cancion.setIcono(new ImageIcon(Icono.MUSICAL_NOTE.texto()));
        }
    }

    @Override
    public void setCancion(Cancion cancion) {
        this.cancion=cancion;
    }

    @Override
    public void setMensaje() {
        cancion.setMensaje(cancion.getArtista() + " - " + cancion.getTitulo()+ " (" +cancion.getAlbum()+ " - " +cancion.getFechaAlbum()+ ")");
    }
}
