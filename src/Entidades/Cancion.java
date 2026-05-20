/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Cancion extends Contenido implements Publicitable{

    private GeneroMusical generoMusical;
    private CalidadAudio calidadAudio;
    
    public Cancion(String titulo, int duracion, Artista artista, GeneroMusical generoMusical, CalidadAudio calidadAudio) {
        super(titulo, duracion, artista);
        this.generoMusical = generoMusical;
        this.calidadAudio = calidadAudio;
    }
        
    @Override
    public int getDuracionConPublicidad() {
        int duracionEst = super.duracion;
        if(this.calidadAudio == CalidadAudio.BAJA){
            duracionEst += 30;
        }else if(this.calidadAudio == CalidadAudio.MEDIA){
            duracionEst += 20;
        }
        return duracionEst;
    }
    
    public String toString(){
        return super.toString() +
                "\nGenero: " + this.generoMusical +
                "\nCalidad: " + this.calidadAudio +
                "\nDuracion: " + getDuracionConPublicidad();
    }
    
    public boolean equals(Object ob){
        if(!(ob instanceof Cancion)){
            return false;
        }
        Cancion c = (Cancion)ob;
        
        return this.generoMusical.equals(c.generoMusical);
    }
}
