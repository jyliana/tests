package com.company.essay2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee(100, 8);
        Employee employee2 = new Employee(200, 7);
        Employee employee3 = new Employee(150, 6);
        ArrayList<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);

        Department department = new Department();
        System.out.println("employee with maximal amount of worked hours: " + department.getMaxHours(list));
        System.out.println("employee with maximal payment: " + department.getMaxPayment(list));

        department.writeCollection(list, "department.tmp");
        ArrayList<Employee> newList = department.readCollection("department.tmp");
    }
}
