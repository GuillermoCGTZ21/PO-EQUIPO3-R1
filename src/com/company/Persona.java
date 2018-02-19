package com.company;


public abstract class Persona { //Persona es una clase abstracta
    //Atributos de la clase Persona: String, character y float.
    protected String nombre;
    protected String fechaNac;
    protected char genero;
    protected float estatura;
    protected float peso;



    //Metodos y constructores
    public Persona(){

    }
    /*Constructor de persona; en el constructor se le inicializa al objeto persona,
    de la clase persona, agregandole valores.
     */
    public Persona (String nombre, String fechaNac, char genero) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.genero = genero;
    }
    /*Métodos de la clase Persona; en estos métodos se reciben valores de un atributo y realizan
    operaciones.
     */

    public void setEstatura(float estatura){
        this.estatura = estatura;
    }
    public void setPeso (float peso) {
        this.peso = peso;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getFechaNac(){
        return this.fechaNac;
    }
    public char getGenero (){
        return this.genero;
    }
    public float getEstatura(){
        return this.estatura;
    }
    public float getPeso(){
        return  this.peso;
    }
    public abstract String to_String ();
    // este to_String esta declarado en abstarcto.

}
