package com.company;

public class FormatoHora { //Clase Publica FormatoHora
    //Atributos de la clase FormatoHora; (int, int, int)
    private int horas;
    private int minutos;
    private int segundos;
//Constructor de la clase FormatoHora
    public FormatoHora(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
//Getters y Setters
    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }
//Condicional Booleano para validar el formato de Hora
    private boolean validaHrs(int horas) {

        if (horas <= 23 && horas >= 0) {
            return true;
        }else{
            return false;
        }
    }
    //Condicional Booleano para validar el formato de minutos y segundos
    private boolean validaMS(int minutos, int segundos) {

        if (minutos<= 59 && minutos >= 0 && segundos<=59 && segundos >=0 ) {
            return true;
        } else {
            return false;
        }

    }
    //El to_String tiene que mostrar el formato en horas, minutos y segundos.
    public String to_String (){

        return horas + ":" + minutos + ":" + segundos;
    }
}
