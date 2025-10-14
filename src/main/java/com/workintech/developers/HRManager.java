package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[5];
        midDevelopers = new MidDeveloper[5];
        seniorDevelopers = new SeniorDeveloper[5];
    }

    @Override
    public void work() {
        System.out.println("HR Manager is hiring new developers...");
        setSalary(getSalary() + 2500);
    }

    // Overloaded addEmployee methods
    public void addEmployee(JuniorDeveloper dev, int index) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Invalid index for junior developer!");
            return;
        }
        if (juniorDevelopers[index] != null) {
            System.out.println("Junior developer slot " + index + " is already filled!");
            return;
        }
        juniorDevelopers[index] = dev;
        System.out.println("Junior developer " + dev.getName() + " added to index " + index);
    }

    public void addEmployee(MidDeveloper dev, int index) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Invalid index for mid developer!");
            return;
        }
        if (midDevelopers[index] != null) {
            System.out.println("Mid developer slot " + index + " is already filled!");
            return;
        }
        midDevelopers[index] = dev;
        System.out.println("Mid developer " + dev.getName() + " added to index " + index);
    }

    public void addEmployee(SeniorDeveloper dev, int index) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Invalid index for senior developer!");
            return;
        }
        if (seniorDevelopers[index] != null) {
            System.out.println("Senior developer slot " + index + " is already filled!");
            return;
        }
        seniorDevelopers[index] = dev;
        System.out.println("Senior developer " + dev.getName() + " added to index " + index);
    }
}
