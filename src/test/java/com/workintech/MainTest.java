package com.workintech;

import com.workintech.cylinder.*;
import com.workintech.developers.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testCircleArea() {
        Circle circle = new Circle(5);
        double expectedArea = 78.53981633974483;
        assertEquals(expectedArea, circle.getArea(), 0.0001, "Circle area must be correct");
    }

    @Test
    public void testCylinderVolume() {
        Cylinder cylinder = new Cylinder(5, 10);
        double expectedVolume = 785.3981633974483;
        assertEquals(expectedVolume, cylinder.getVolume(), 0.0001, "Cylinder volume must be correct");
    }

    @Test
    public void testHRManagerHiring() {
        HRManager hr = new HRManager(1, "Alice", 10000);
        JuniorDeveloper jd = new JuniorDeveloper(2, "Bob", 5000);
        hr.addEmployee(jd, 0);
        assertNotNull(hr.getEmployees()[0], "Employee must be added successfully");
    }

    @Test
    public void testDevelopersWork() {
        JuniorDeveloper j = new JuniorDeveloper(2, "Bob", 5000);
        MidDeveloper m = new MidDeveloper(3, "Charlie", 7000);
        SeniorDeveloper s = new SeniorDeveloper(4, "Diana", 9000);

        j.work();
        m.work();
        s.work();

        assertEquals("Bob", j.getName());
        assertEquals("Charlie", m.getName());
        assertEquals("Diana", s.getName());
    }
}
