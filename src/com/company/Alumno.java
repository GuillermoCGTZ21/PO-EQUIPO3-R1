package com.company;

public abstract class Alumno extends Persona {

    private String matricula;
    private String gene;
    private Materia[] materias = new Materia[6];

    public Alumno(String nombre, String fechaNac, char genero, String matricula, String gene){
        super(nombre, fechaNac,genero);
        this.matricula = matricula;
        this.gene = gene;
    }
    public void setHorario (Horario horario){
        horario.to_String();
    }
    public Horario getHorario (){
        return getHorario();
    }
    public void setMaterias(Materia m[]){
        this.materias = m;
    }

    public Materia[] getMaterias() {
        return materias;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public String getGene(){
        return this.gene;
    }
    @Override
    public String to_String(){
        return nombre + " " + fechaNac + " "  + genero + " " + matricula + " "  + gene + " "  + getHorario();

    }
}
