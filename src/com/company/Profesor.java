package com.company;

public abstract class Profesor extends Persona {
    //Profesor se extiende de la clase padre Persona.


    //El unico atributo de la clase Profesor es nómina, de tipo String.
    private String nomina;

    //Constructor de Profesor, con la fucnion super, que se utiliza para heredar atributos.
    public Profesor (String nombre, String fechaNac, char genero, String nomina){
        super(nombre, fechaNac, genero);
        this.nomina = nomina;
    }
    //Métodos de la Clase Profesor
    public void setHorario(Horario horario){
        horario.to_String();
    }
//Getters
    public Horario getHorario(){
        return getHorario();
    }

    public String getNomina(){
        return nomina;
    }
    @Override // usod e un @override, ya que el to_string heredado es abstracto
    public String to_String(){
        return nombre + " " + fechaNac + " "  + genero + " " + getHorario() + " "  + nomina;

    }
    //El to_String debe mostrar todos los datos que se le solicitan, de los que estan declarados.
}
