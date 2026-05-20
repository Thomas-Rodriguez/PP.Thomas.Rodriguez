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
public abstract class Contenido implements Comparable<Contenido>{
    protected Artista artista;
    protected String titulo;
    protected int duracion;
    protected int likes;
    protected static Random generadorLikes;
    
    static {
        generadorLikes = new Random();
    }
    
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
    

    public int getLikes(){
        if(this.likes == 0){
            this.likes = generadorLikes.nextInt(0,  1000000);
        }
        return this.likes;
    }
    
    private String mostrar(Contenido c){
        return c.artista.getArtista() + 
                "\nTitulo: " + c.titulo +
                "\n:Duracion: " + c.duracion  + 
                "\nLikes: " + c.getLikes();
    }
    
    public boolean sonIguales(Contenido c1, Contenido c2){
        return c1.artista.equals(c2.artista) && c1.titulo.equals(c2.titulo);
    }
    
    public boolean equals(Object c){
        if(c == null || !(c instanceof Contenido)){
            return false;
        }
        
        Contenido cn = (Contenido)c;
        
        return this.titulo.equals(cn.titulo) && this.artista.equals(cn.artista);        
    }
    
    public String toString(){
        return mostrar(this);
    }
    
    @Override
    public int compareTo(Contenido o){
        int apellidoCom = this.artista.getApellidio().compareTo(o.artista.getApellidio());
        if(apellidoCom != 0){
            return apellidoCom;
        }
        
        int nombreCom = this.artista.getNombre().compareTo(o.artista.getNombre());
        if(nombreCom != 0){
            return nombreCom;
        }
    
        return this.titulo.compareTo(o.titulo);
    }
}
