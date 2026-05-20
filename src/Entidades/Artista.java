/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Artista {
    private String nombre;
    private String apellido;
    private String paisNacimiento;

    public Artista(String nombre, String apelldio, String paisNacimiento) {
        this.nombre = nombre;
        this.apellido = apelldio;
        this.paisNacimiento = paisNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidio() {
        return apellido;
    }

    public String getArtista() {
        return this.nombre + " " + this.apellido + " - " + this.paisNacimiento;
    }
    
    public static boolean sonIguales(Artista a, Artista b){
        return a.nombre.equals(b.nombre) && a.apellido.equals(b.apellido) && a.paisNacimiento.equals(b.paisNacimiento);
    }
}
