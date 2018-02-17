package com.company;



public class Horario {
    private FormatoHora inicio;
    private FormatoHora fin;
    private String aula;

    public Horario() {
        inicio = new FormatoHora(0, 0, 0);
        fin = new FormatoHora(0, 0, 0);
        aula = "";
    }

    public Horario(FormatoHora inicio, FormatoHora fin, String aula) {
        this.inicio = inicio;
        this.fin = fin;
        this.aula = aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public FormatoHora getInicio() {
        return this.inicio;
    }

    public FormatoHora getFin() {
        return this.fin;
    }

    public String getAula() {
        return this.aula;
    }

    public FormatoHora calculaDuracion() {
        int horain = inicio.getHoras();
        int minin = inicio.getMinutos();
        int segunin = inicio.getSegundos();

        int horafin = fin.getHoras();
        int minutfin = fin.getMinutos();
        int segunfin = fin.getSegundos();

        if (minutfin < minin) {
            horafin = horafin - 1;
            minutfin = minutfin + 60;
        }
        if(segunfin < segunin){
            minutfin = minutfin-1;
            segunfin = segunfin+60;
        }
        return new FormatoHora(horafin-horain,minutfin-minin, segunfin - segunin);
    }
    public String to_String(){
        return "de" + getInicio() + "a" + getFin() + this.aula;
    }
}

