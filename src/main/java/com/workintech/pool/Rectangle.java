package com.workintech.pool;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        if(this.length <0){
            this.length = 0;
        }else {
            this.length = length;
        }
        if(this.width <0){
            this.width = 0;
        }else {
            this.width = width;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return width * length;
    }
}