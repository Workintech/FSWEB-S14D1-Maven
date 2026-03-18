package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    public HRManager(long id, String name, double salary,
                     JuniorDeveloper[] juniors,
                     MidDeveloper[] mids,
                     SeniorDeveloper[] seniors) {
        super(id, name, salary);
        this.juniorDevelopers = juniors;
        this.midDevelopers = mids;
        this.seniorDevelopers = seniors;
    }

    @Override
    public void work() {
        System.out.println(getName() + " HR Manager starts to working...");
        setSalary(getSalary() + 5000);
    }

    public void addEmployee(int index, JuniorDeveloper developer) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = developer;
                System.out.println("Junior Developer added successfully.");
            } else {
                System.out.println("Warning: Index " + index + " is already full! Data is not overwritten.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " does not exist in the Junior Developer array!");
        }
    }

    public void addEmployee(int index, MidDeveloper developer) {
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = developer;
                System.out.println("Mid Developer added successfully.");
            } else {
                System.out.println("Warning: Index " + index + " is already full! Data is not overwritten.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " does not exist in the Mid Developer array!");
        }
    }

    public void addEmployee(int index, SeniorDeveloper developer) {
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = developer;
                System.out.println("Senior Developer added successfully.");
            } else {
                System.out.println("Warning: Index " + index + " is already full! Data is not overwritten.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " does not exist in the Senior Developer array!");
        }
    }
}