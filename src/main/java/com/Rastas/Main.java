package com.Rastas;

import javax.swing.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        //para probar la prueba 5 agregar cambiar el LocalDateTime.now() por LocalDateTime.now().minusHours(24) que setea el tiempo para que transcurran 24 horas desde la ultima reproduccion
       
        Cancion cancion=new Cancion("The Scientist","“Coldplay”","A Rush of Blood to the head", 2002,0,0,0, LocalDateTime.now());
        Cancion cancion2=new Cancion("The Scientist","“Coldplay”","A Rush of Blood to the head", 2002,0,0,0, LocalDateTime.now());
       
        // Caso prueba 1
        cancion.mostrarMensaje();
        // Caso prueba 2
        cancion.setReproducciones(1000);
        cancion.mostrarMensaje();
        
        // Caso prueba 3
        cancion.setDislikes(5000);
        cancion.mostrarMensaje();
        
        // Caso prueba 4
        cancion2.setReproducciones(50000);
        cancion2.setLikes(20000);
        cancion2.mostrarMensaje();
        
        // Caso prueba 5
        cancion2.setUltimaReproduccion(LocalDateTime.now().minusHours(24));
        cancion2.mostrarMensaje();
    }
}