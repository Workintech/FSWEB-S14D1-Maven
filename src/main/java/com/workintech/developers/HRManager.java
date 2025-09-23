package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary, int juniorSize, int midSize, int seniorSize) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[juniorSize];
        this.midDevelopers = new MidDeveloper[midSize];
        this.seniorDevelopers = new SeniorDeveloper[seniorSize];
    }
    public HRManager(long id, String name, double salary) {
        super(id,name,salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is managing employees...");
        setSalary(getSalary() + 4000);
    }

    // Overloaded addEmployee
    public void addEmployee(JuniorDeveloper dev, int index) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Geçersiz index: " + index);
            return;
        }
        if (juniorDevelopers[index] == null) {
            juniorDevelopers[index] = dev;
            System.out.println("Junior developer eklendi: " + dev.getName());
        } else {
            System.out.println("Index " + index + " zaten dolu!");
        }
    }

    public void addEmployee(MidDeveloper dev, int index) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Geçersiz index: " + index);
            return;
        }
        if (midDevelopers[index] == null) {
            midDevelopers[index] = dev;
            System.out.println("Mid developer eklendi: " + dev.getName());
        } else {
            System.out.println("Index " + index + " zaten dolu!");
        }
    }

    public void addEmployee(SeniorDeveloper dev, int index) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Geçersiz index: " + index);
            return;
        }
        if (seniorDevelopers[index] == null) {
            seniorDevelopers[index] = dev;
            System.out.println("Senior developer eklendi: " + dev.getName());
        } else {
            System.out.println("Index " + index + " zaten dolu!");
        }
    }
}
