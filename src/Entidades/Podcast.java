/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Podcast extends Contenido implements Publicitable{
    
    private TipoPodcast tipoPodcast;
    
    public Podcast(String titulo, int duracion, Artista artista, TipoPodcast tipoPodcast) {
        super(titulo, duracion, artista);
        this.tipoPodcast = tipoPodcast;
    }
    
    

    @Override
    public int getDuracionConPublicidad() {
        int duracionEst = super.duracion;
                if(this.tipoPodcast == TipoPodcast.TECNOLOGIA){
            duracionEst += 60;
        }else if(this.tipoPodcast == TipoPodcast.EDUCACION){
            duracionEst += 20;
        }else if(this.tipoPodcast == TipoPodcast.ENTRETENIMIENTO){
            duracionEst += 45;
        }
        return duracionEst;
    }
    
}
