package com.company;

public class Materia { //clase Publica Materia
    private String nombre;
    private String clave;
    private Horario horario;
    private Profesor maestro;

   //Constructores de la clase Materia (Default)
    public Materia (String nombre, String clave){
        this.nombre = "";
        this.clave = "";
    }
    //Constructor definitivo
   public Materia(String nombre, String clave, Horario horario, Profesor maestro){
        this.nombre = nombre;
        this.clave = clave;
        horario.to_String();
        maestro.getNomina();
         }

    // Getters y Setters
    public void setHorario(Horario horario){
        horario.to_String();
    }

    public void setMaestro(Profesor maestro){
        maestro.getNomina();

    }

    public String getNombre(){
        return this.nombre;
    }
    public String getClave(){
        return this.clave;
    }
    public Horario getHorario(){
        return horario;
    }

    public Profesor getMaestro(){
        return maestro;
    }

    public String to_String(){  //El to_String devuelve: Nombre, clave de la materia, hora de inicio y final y nombre del maestro.
        return "Nombre: " + nombre + "Clave: " + clave + ",de "+ horario.getInicio() + " a "
                + horario.getFin() + " " + horario.getAula() + "," + maestro.getNombre();
    }
}
