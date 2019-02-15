package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

public class Department implements Serializable {

    public Department() {
    }

    public void writeCollection(ArrayList<Employee> list, String filename) {
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Employee> readCollection(String filename) {
        ArrayList<Employee> employees = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream ois = new ObjectInputStream(fis);
            employees = (ArrayList<Employee>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employees;
    }

    public Employee getMaxHours(ArrayList<Employee> list) {
        return list.stream().max(Comparator.comparing(Employee::getWorkhours)).get();
    }

    public Employee getMaxPayment(ArrayList<Employee> list) {
        return list.stream().max(Comparator.comparing(Employee::getPayment)).get();
    }
}

