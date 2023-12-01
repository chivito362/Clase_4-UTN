package com.Rastas;

import javax.swing.*;
import java.time.LocalDateTime;

public class Cancion {
    private String titulo;
    private String artista;
    private String album;
    private int fechaAlbum;
    private int reproducciones;
    private int likes;
    private int dislikes;
    private LocalDateTime ultimaReproduccion;
    private ImageIcon icono;
    private Estado estado;
    private String mensaje;

    public Cancion() {
    }

    public Cancion(String titulo, String artista, String album, int fechaAlbum, int reproducciones, int likes, int dislikes, LocalDateTime ultimaReproduccion) {
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.fechaAlbum = fechaAlbum;
        this.reproducciones = reproducciones;
        this.likes = likes;
        this.dislikes = dislikes;
        this.ultimaReproduccion = ultimaReproduccion;
        this.icono = new ImageIcon(Icono.MUSICAL_NOTE.texto());
        this.estado = new Normal();
        this.estado.setCancion(this);
        validar();
    }

    public void cambiarEstado(Estado estado){
        this.estado=estado;
        this.estado.setCancion(this);
    }
    public void validar(){
        this.estado.verificacion();
        this.estado.setMensaje();
    }
    public void mostrarMensaje(){
        JOptionPane.showMessageDialog(null,getMensaje()+" "+ getIcono(),getEstado().getClass().getSimpleName().replace("_"," "),JOptionPane.INFORMATION_MESSAGE);

    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getFechaAlbum() {
        return fechaAlbum;
    }

    public void setFechaAlbum(int fechaAlbum) {
        this.fechaAlbum = fechaAlbum;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
        this.estado.verificacion();
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
        this.estado.verificacion();
    }

    public int getDislikes() {
        return dislikes;

    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
        this.estado.verificacion();
    }

    public LocalDateTime getUltimaReproduccion() {
        return ultimaReproduccion;
    }

    public void setUltimaReproduccion(LocalDateTime ultimaReproduccion) {
        this.ultimaReproduccion = ultimaReproduccion;
        this.estado.verificacion();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ImageIcon getIcono() {
        return icono;
    }

    public void setIcono(ImageIcon icono) {
        this.icono = icono;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
    class Icono {
    public static Icono MUSICAL_NOTE = new Icono(new int[]{0xD83C, 0xDFB5});
    public static Icono ROCKET = new Icono(new int[]{0xD83D, 0xDE80});
    public static Icono FIRE = new Icono(new int[]{0xD83D, 0xDD25});
    private int[] internalEncoding;
    Icono(int[] internalEncoding){
        this.internalEncoding = internalEncoding;
    }
    public String texto() {

        return new String(internalEncoding, 0, internalEncoding.length);
    }
}
