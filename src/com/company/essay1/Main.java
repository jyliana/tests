package com.company.essay1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("shape test");
        System.out.println(shape.getTitle());
        shape.setTitle("new shape title");
        System.out.println(shape.getTitle());

        Rectangle rectangle = new Rectangle(1, 3, 2, 4, Color.BLACK);
        rectangle.setVisible(true);
        rectangle.setVisible(false);

        rectangle.setTitle("rectangle test");
        System.out.println(rectangle.getTitle());
    }
}
