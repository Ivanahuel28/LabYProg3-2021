package com.company;

public class Main {

    public static void main(String[] args) {
	    Time time = new Time(1,30,30);

	    time.printTime();

	    for (int i=0;i < 3600;i++){
            time.decreaseSec();
        }

        for (int i=0;i < 3600;i++){
            time.increaseSec();
        }
    }
}
