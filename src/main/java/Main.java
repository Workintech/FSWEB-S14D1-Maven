package com.workintech;

import com.workintech.cylinder.*;
import com.workintech.developers.*;

public class Main {
    public static void main(String[] args) {

        // Geometry demo
        Circle circle = new Circle(5);
        Cylinder cylinder = new Cylinder(5, 10);

        System.out.println(circle);
        System.out.println(cylinder);

        // HR demo
        HRManager hr = new HRManager(1, "Alice", 10000);
        JuniorDeveloper j1 = new JuniorDeveloper(2, "Bob", 5000);
        MidDeveloper m1 = new MidDeveloper(3, "Charlie", 7000);
        SeniorDeveloper s1 = new SeniorDeveloper(4, "Diana", 9000);

        hr.addEmployee(j1, 0);
        hr.addEmployee(m1, 1);
        hr.addEmployee(s1, 2);

        j1.work();
        m1.work();
        s1.work();
        hr.work();

        System.out.println(hr);
    }
}