package com.company.Ej2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Student [] students = new Student[4];

        students[0] = new Student("39093125","Juan","Armando","juancito@hotmail.com","Azcuenga 5123", LocalDate.now(),4000,"Ingenieria");
        students[1] = new Student("43240230","Arturo","Gonzales","arturgon@hotmail.com","Cerrito 524", LocalDate.now(),1500,"Tecnicatura");
        students[2] = new Student("39093125","Pablo","Echeverria","pabloe@hotmail.com","Juan B Justo 10151", LocalDate.now(),3500,"Licenciatura");
        students[3] = new Student("34512323","Carlos","Hernandez","carHernandez@hotmail.com","Belgrano 3123", LocalDate.now(),4000,"Ingenieria");

        StaffMember [] staffMembers = new StaffMember[4];

        staffMembers[0] = new StaffMember("9342342","Antonio","Canuzzi","antonio.canuzzi@hotmail.com","Cuba 5412",60000,"Mañana");
        staffMembers[1] = new StaffMember("40123513","Lucas","Gutierrez","luquita@hotmail.com","Güemes 6342",40000,"Mañana");
        staffMembers[2] = new StaffMember("22314187","Estella","Gambora","estelita@hotmail.com","Garcia Lorca 7889",60000,"Tarde");
        staffMembers[3] = new StaffMember("38123900","Carolina","Molina","caro.molina@hotmail.com","Colon 11432",50000,"Tarde");

        Person [] persons = new Person[8];

        for (int i = 0; i < 4 ; i++) {
            persons[i] = students[i];
            persons[4+i] = staffMembers[i];
        }

        int studentsAmount = 0;
        int staffMembersAmount = 0;

        double totalAmount = 0;

        for (int i = 0; i < 8; i++) {
            if (persons[i] instanceof Student){
                studentsAmount++;
                totalAmount += ((Student) persons[i]).getMonthlyFee();
            } else if (persons[i] instanceof StaffMember){
                staffMembersAmount++;
            }
        }

        System.out.println(String.format("Cantida de estudiante : %d ; Miembros del Staff : %d",studentsAmount,staffMembersAmount));

        System.out.println(String.format("La cantidad recibida mensualmente por todos los estudiantes es : %.2f",totalAmount));
    }
}
