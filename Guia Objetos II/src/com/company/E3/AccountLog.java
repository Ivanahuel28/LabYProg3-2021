package com.company.E3;

public class AccountLog {

    private final int LOGLIMIT = 11;

    private int counter;
    private String [] logs = new String[LOGLIMIT];

    public AccountLog(){
        this.counter = 0;
    }

    public AccountLog(String firstLog){
        this.logs[0]= firstLog;
        this.counter = 1;
    }

    public void add(String newLog){

        doSpace();
        this.logs[0] = newLog;
        if (this.counter<10){
            this.counter++;
        }
    }

    private void doSpace(){
        for (int i=this.counter;i>0;i--){
            this.logs[i] = this.logs[i-1];
        }
    }

    public void printAllLogs(){
        for (int i=0;i<this.counter;i++){
            System.out.println(this.logs[i]);
        }
    }
}
