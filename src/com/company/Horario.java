package com.company;



public class Horario { //Horario es una clase pública, no abstracta.
    private FormatoHora inicio;
    private FormatoHora fin;
    private String aula;

    public Horario() {  /*Constructor de Horario, en este  Tenemos objetos de tipo FormatoHora,
    en este se imprime la hora de inicio, la hora final y el aula.  Constructor por default*/

        inicio = new FormatoHora(0, 0, 0);
        fin = new FormatoHora(0, 0, 0);
        aula = "";
    }

    public Horario(FormatoHora inicio, FormatoHora fin, String aula) {
        /*Constructor de Horario; ya estructurados */
        this.inicio = inicio;
        this.fin = fin;
        this.aula = aula;
    }

    //Metodos de la clase Horario.
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
/*Se declaran nuevos atributos para poder sacar las hora, minuto y segundo de inicio, agarrando
los getters de la clase FormatoHora*/
    public FormatoHora calculaDuracion() {
        int horain = inicio.getHoras();
        int minin = inicio.getMinutos();
        int segunin = inicio.getSegundos();
/*Se declaran nuevos atributos para poder sacar la hora, minuto y segundo final, agarrando los getters
de la clase FormatoHora*/
        int horafin = fin.getHoras();
        int minutfin = fin.getMinutos();
        int segunfin = fin.getSegundos();

        //Condicional de de los atributos ya establecidos
        if (minutfin < minin) {
            horafin = horafin - 1;
            minutfin = minutfin + 60;
        }
        if(segunfin < segunin){
            minutfin = minutfin-1;
            segunfin = segunfin+60;
        }
        //Se devuelve el nuevo formato con la resta ya incluida
        return new FormatoHora(horafin-horain,minutfin-minin, segunfin - segunin);
    }
    public String to_String(){
        /*En este to string, los datos que debe de imprimir son de la hora de inicio con hora, miuto
        y segundo establecido a la hora final con los mismos terminos.*/


        return "de" + getInicio() + "a" + getFin() + this.aula;
    }
}

