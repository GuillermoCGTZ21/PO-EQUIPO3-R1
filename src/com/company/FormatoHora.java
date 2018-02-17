package com.company;

public class FormatoHora {
    private int horas;
    private int minutos;
    private int segundos;

    public FormatoHora(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    private boolean validaHrs(int horas) {

        if (horas <= 23 && horas >= 0) {
            return true;
        }else{
            return false;
        }
    }
    private boolean validaMS(int minutos, int segundos) {

        if (minutos<= 59 && minutos >= 0 && segundos<=59 && segundos >=0 ) {
            return true;
        } else {
            return false;
        }

    }
    public String to_String (){

        return horas + ":" + minutos + ":" + segundos;
    }
}
