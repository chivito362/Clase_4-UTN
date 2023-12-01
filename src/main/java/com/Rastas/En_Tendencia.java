package com.Rastas;

import javax.swing.*;
import java.time.Duration;
import java.time.LocalDateTime;

public class En_Tendencia implements Estado{
    private Cancion cancion;

    @Override
    public void verificacion() {
        if (pasoMasDe24()){
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
        cancion.setMensaje(cancion.getTitulo() + " - " + cancion.getArtista()+ " (" +cancion.getAlbum()+ " - " +cancion.getFechaAlbum()+ ")");

    }

    private boolean pasoMasDe24(){
        Duration tiempoTranscurrido = Duration.between(cancion.getUltimaReproduccion(), LocalDateTime.now());
        long horasTranscurridas = tiempoTranscurrido.toHours();
        return horasTranscurridas >= 24;
    }
}
