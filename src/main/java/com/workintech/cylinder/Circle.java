package com.workintech.cylinder;

public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }

    public double getRadius() {
        System.out.println("hi");
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
