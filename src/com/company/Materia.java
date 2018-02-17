package com.company;

public class Materia {
    private String nombre;
    private String clave;
    private Horario horario;
    private Profesor maestro;

    public Materia (String nombre, String clave){
        this.nombre = "";
        this.clave = "";
    }
   public Materia(String nombre, String clave, Horario horario, Profesor maestro){
        this.nombre = nombre;
        this.clave = clave;
        horario.to_String();
        maestro.getNomina();
         }


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

    public String to_String(){
        return "Nombre: " + nombre + "Clave: " + clave + ",de "+ horario.getInicio() + " a "
                + horario.getFin() + " " + horario.getAula() + "," + maestro.getNombre();
    }
}
