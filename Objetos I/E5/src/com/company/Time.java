package com.company;

public class Time {

    /*
    Modele el objeto Hora, teniendo en cuenta sus atributos, hora, minuto y segundo.
    Tenga en cuenta el rango de valores aceptados para cada uno de estos.
        a.Hora: 0 ... 23
        b.Minuto: 0 ... 59
        c.Segundo: 0 ... 59
    Considere el siguiente comportamiento:
        1.Un método que imprima la hora bajo el siguiente formato hh:mm:ss usando zero a la izquierda ejemplo 13:04:22 .
        2.Un método que avance en 1 segundo y devuelva la instancia del objeto.
        3.Un método que retroceda en 1 segundo y devuelva la instancia del objeto.
        4.Instanciar el objeto y probar los métodos creados.
     */

    private int hour;
    private int min;
    private int sec;

    public Time(int hour,int min,int sec){
        this.hour = (hour>=0 && hour<24)?hour:0;
        this.min = (min>=0 && min<60)?min:0;
        this.sec = (sec>=0 && sec<60)?sec:0;
    }

    private void increaseHour(){
        if (this.hour==23){
            this.hour = 0;
        }
        else{
            this.hour ++;
        }
    }

    private void decreaseHour(){
        if(this.hour==0){
            this.hour = 23;
        }
        else {
            --this.hour;
        }
    }

    private void increaseMin(){
        if (this.min == 59){
            increaseHour();
            this.min = 0;
        }
        else {
            ++this.min;
        }
    }

    private void decreaseMin(){
        if (this.min == 0){
            this.min = 59;
            decreaseHour();
        }
        else{
            --this.min;
        }
    }

    public void increaseSec(){
        if (this.sec == 59){
            increaseMin();
            this.sec = 0;
        }
        else {
            ++this.sec;
        }

        printTime();
    }

    public void decreaseSec(){
        if (this.sec == 0){
            this.sec = 59;
            decreaseMin();
        }
        else{
            --this.sec;
        }

        printTime();
    }

    public void printTime(){
        System.out.println("La hora es : "+String.format("%2d",this.hour)+":"+String.format("%2d",this.min)+":"+String.format("%2d",this.sec));
    }
}
