package com.company;

public abstract class Profesor extends Persona {
    private String nomina;

    public Profesor (String nombre, String fechaNac, char genero, String nomina){
        super(nombre, fechaNac, genero);
        this.nomina = nomina;
    }
    public void setHorario(Horario horario){
        horario.to_String();
    }

    public Horario getHorario(){
        return getHorario();
    }

    public String getNomina(){
        return nomina;
    }
    @Override
    public String to_String(){
        return nombre + " " + fechaNac + " "  + genero + " " + getHorario() + " "  + nomina;

    }
}
