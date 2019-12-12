/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundoexamen2;

/**
 *
 * @author Marcela Florez
 */
public class Peliculas {
    String nombre;
    String tipo;
    String director;
    String casa;
    double duracion;
    int año;
    double precio;
    String protagonista;

    public Peliculas() {
    }

    public Peliculas(String nombre) {
        this.nombre = nombre;
    }

    public Peliculas(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Peliculas(String nombre, String tipo, String director) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.director = director;
    }

    public Peliculas(String nombre, String tipo, String director, String casa) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.director = director;
        this.casa = casa;
    }

    public Peliculas(String nombre, String tipo, String director, String casa, int duracion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.director = director;
        this.casa = casa;
        this.duracion = duracion;
    }

    public Peliculas(String nombre, String tipo, String director, String casa, double duracion, int año) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.director = director;
        this.casa = casa;
        this.duracion = duracion;
        this.año = año;
    }

    public Peliculas(String nombre, String tipo, String director, String casa, double duracion, int año, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.director = director;
        this.casa = casa;
        this.duracion = duracion;
        this.año = año;
        this.precio = precio;
    }
     public Peliculas(String nombre, String tipo, String director, String casa, double duracion, int año, double precio, String protagonista) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.director = director;
        this.casa = casa;
        this.duracion = duracion;
        this.año = año;
        this.precio = precio;
        this.protagonista=protagonista;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setDirector(String director){
        this.director=director;
    }
    
    public String getDirector(){
        return this.director;
    }
    
    public void setCasa(String casa){
        this.casa=casa;
    }
    
    public String getCasa(){
        return this.casa;
    }
    
    public void setDuracion(double duracion){
        this.duracion=duracion;
    }
    
    public double getDuracion(){
        return this.duracion;
    }
    
    public void setAño(int año){
        this.año=año;
    }
    
    public int getAño(){
        return this.año;
    }
    
    public void setPrecio(double precio){
        this.precio=precio;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    public void setProtagonista(String protagonista){
        this.protagonista=protagonista;
       
    }
    public String getProtagonista(){
        return this.protagonista;
    }
    
 
}
