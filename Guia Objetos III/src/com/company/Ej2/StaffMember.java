package com.company.Ej2;

public class StaffMember extends Person{

    private double salary;
    private String workShift;

    public StaffMember() {
    }

    public StaffMember(String dni, String name, String lastName, String email, String homeAddress, double salary, String workShift) {
        super(dni, name, lastName, email, homeAddress);
        this.salary = salary;
        this.workShift = workShift;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkShift() {
        return workShift;
    }

    public void setWorkShift(String workShift) {
        this.workShift = workShift;
    }

    @Override
    public String toString() {
        return "StaffMember{" +
                "dni='" + super.getDni() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                ", email='" + super.getEmail() + '\'' +
                ", homeAddress='" + super.getHomeAddress() + '\'' +
                "salary=" + salary +
                ", workShift='" + workShift + '\'' +
                '}';
    }
}
