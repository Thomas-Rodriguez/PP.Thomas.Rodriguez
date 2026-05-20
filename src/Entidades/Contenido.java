/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Random;

/**
 *
 * @author Usuario
 */
public abstract class Contenido {
    protected Artista artista;
    protected String titulo;
    protected int duracion;
    protected int likes;
    protected Random generadorLikes;

    public Contenido(String titulo, int duracion, Artista artista) {
        this.artista = artista;
        this.titulo = titulo;
        this.duracion = duracion;       
    }
    
    
    public Contenido(String titulo, int duracion, String nombreArtista, String apellidoArtista, String paisArtista) {
        this.artista = new Artista(nombreArtista, apellidoArtista, paisArtista);
        this.titulo = titulo;
        this.duracion = duracion;
    }
    
    static {
        generadorLikes = new Random();
    }
    
    public int getLikes(){
        if(this.likes == 0){
            this.likes = generadorLikes.nextInt(0,  1000000);
        }
        return this.likes;
    }
    
    private String mostrar(Contenido c){
        return this.artista.toString() + 
                "\nTitulo: " + this.titulo +
                "\n:Duracion: " + this.duracion  + 
                "\nLikes: " + this.likes;
    }
}
