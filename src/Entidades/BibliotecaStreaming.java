/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Usuario
 */
public class BibliotecaStreaming {
        private int capacidad;
        private Collection<Contenido> contenido;
        
        public BibliotecaStreaming(){
            this.capacidad = 3;
            this.contenido = new ArrayList<>();
        }
        
        public BibliotecaStreaming (int capacidad){
            this.capacidad = capacidad;
            this.contenido = new ArrayList<>();
        }
        
        private boolean sonIguales(Contenido c){
            if(contenido == null){
                return false;
            }
            
            for (Contenido contenidos : contenido) {
              if (contenidos.equals(c)) {
                  return true;
              }
            }
            return false;
        }
        
        public boolean agregarContenido(Contenido c) {
        if(sonIguales(c)){
            System.out.println("ya existe aqui");
            return false;
        }
         if(contenido.size() > capacidad){
            return contenido.add(c);
        }
         
        System.out.println("Esta lleno");
        return false;    
        }
        
        private int getDuracionContenido(TipoContenido tipo) {
            int duracionTotal = 0;
    
            for (Contenido c : contenido) {
                switch (tipo) {
                    case CANCIONES:
                        if (c instanceof Cancion) {
                            duracionTotal += c.duracion;
                        }
                        break;
                    case PODCASTS:
                        if (c instanceof Podcast) {
                            duracionTotal += c.duracion;
                        }
                        break;
                    case TODOS:
                        duracionTotal += c.duracion;
                        break;
                }
            }
    
            return duracionTotal;
    }
        
}
