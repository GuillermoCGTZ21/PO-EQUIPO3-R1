package com.company;

public abstract class Alumno extends Persona {
    /*La clase alumno se extiende de la clase Padre:Persona*/


   //Atributos de la clase Alumno: Strings y un array de tipo Materia
    private String matricula;
    private String gene;
    private Materia[] materias = new Materia[6];
    /*Aqui se declara el array, que es el responsable de guardar 6 tipos de datos,
     * que dependiendo de lo que el usuario ponga, se depliegan */


    // Constructor de Alumno.
    public Alumno(String nombre, String fechaNac, char genero, String matricula, String gene){
        super(nombre, fechaNac,genero);
        this.matricula = matricula;
        this.gene = gene;
    }


    //Métodos de la clase Alumno
    public void setHorario (Horario horario){
        horario.to_String();
    }
    public Horario getHorario (){
        return getHorario();
    }
    //Getters y Setters
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

    /*En este to_Strign estamos utilizando atributos de la Clase Persona, pero al ser abstracta,
    estos se adaptan a la clase Alumno
     */
    @Override
    public String to_String(){
        return nombre + " " + fechaNac + " "  + genero + " " + matricula + " "  + gene + " "  + getHorario();

    }
    /*Lo que deberia moatrar el to_String serian todos datos heredados abstractos, mas los que
    se declararon el la clase alumno en orden, más el horario
     */
}
