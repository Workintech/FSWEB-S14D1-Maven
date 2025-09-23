package com.workintech.developers;

public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(long id, String name, double salary) {
        super(id,name,salary);
    }

    @Override
    public void work() {
        System.out.println("Junior Developer is coding simple tasks...");
        setSalary(getSalary() + 1000); // maaş artışı
    }
}
