package com.Rastas;

import javax.swing.*;

public class Normal implements Estado{
    private Cancion cancion;


    @Override
    public void verificacion() {
        if(cancion.getReproducciones()>=1000){
            cancion.cambiarEstado(new En_Auge());
            cancion.setIcono(new ImageIcon(Icono.ROCKET.texto()));
            cancion.validar();
        }

    }

    @Override
    public void setCancion(Cancion cancion) {
    this.cancion=cancion;
    }

    @Override
    public void setMensaje() {
        cancion.setMensaje(cancion.getArtista() + " - " + cancion.getAlbum()+ " - " + cancion.getTitulo());
    }
}
