package com.company.Ej2;

import java.time.LocalDate;

public class Student extends Person{

    private LocalDate admissionDate;
    private double monthlyFee;
    private String Career;

    public Student() {
    }

    public Student(String dni, String name, String lastName, String email, String homeAddress, LocalDate admissionDate, double monthlyFee, String career) {
        super(dni, name, lastName, email, homeAddress);
        this.admissionDate = admissionDate;
        this.monthlyFee = monthlyFee;
        Career = career;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getCareer() {
        return Career;
    }

    public void setCareer(String career) {
        Career = career;
    }

    @Override
    public String toString() {
        return "Student{" +
                "dni='" + super.getDni() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", homeAddress='" + super.getHomeAddress() + '\'' +
                "admissionDate=" + admissionDate +
                ", monthlyFee=" + monthlyFee +
                ", Career='" + Career + '\'' +
                '}';
    }
}
