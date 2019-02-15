package com.company.essay2;

public class Employee extends Department {
    private int payment;
    private int workhours;

    public Employee(int payment, int workhours) {
        this.payment = payment;
        this.workhours = workhours;
    }

    public int getPayment() {
        return payment;
    }

    public int getWorkhours() {
        return workhours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "payment=" + payment +
                ", workhours=" + workhours +
                '}';
    }
}
