package com.company;


public abstract class Persona {
    //Atributos a declarar
    protected String nombre;
    protected String fechaNac;
    protected char genero;
    protected float estatura;
    protected float peso;

    public Persona(){

    }
    //Constructor de persona
    public Persona (String nombre, String fechaNac, char genero){
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.genero = genero;
    }
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

}
