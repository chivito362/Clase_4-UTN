package com.Rastas;

import javax.swing.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        //para probar la prueba 5 agregar cambiar el LocalDateTime.now() por LocalDateTime.now().minusHours(24) que setea el tiempo para que transcurran 24 horas desde la ultima reproduccion
        Cancion cancion=new Cancion("The Scientist","“Coldplay”","A Rush of Blood to the head", 2002,999,0,4999, LocalDateTime.now());
        cancion.mostrarMensaje();
        
    }
}