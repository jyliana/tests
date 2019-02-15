package com.company.essay1;

import java.awt.*;

public class Rectangle extends Shape {
    private boolean visible;
    private int x1, x2, y1, y2;
    private Color color;

    public Rectangle(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public Color getColor() {
        return color;
    }

    public void draw(Graphics graphics) {
        setVisible(false);
        graphics.setColor(getColor());
        graphics.drawLine(getX1(), getY1(), getX2(), getY2());
        setVisible(true);
    }
}

