package com.workintech.pool;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
        if(this.height<0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}