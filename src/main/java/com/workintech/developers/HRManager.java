package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[10];
    private MidDeveloper[] midDevelopers = new MidDeveloper[10];
    private SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[10];

    public HRManager(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work(int salary) {
        System.out.println("HRManager starts working");
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        boolean added = false;
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = juniorDeveloper;
                System.out.println("Junior Developer added at index " + i);
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("No more space for Junior Developers.");
        }
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        boolean added = false;
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = midDeveloper;
                System.out.println("Mid Developer added at index " + i);
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("No more space for Mid Developers.");
        }
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        boolean added = false;
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = seniorDeveloper;
                System.out.println("Senior Developer added at index " + i);
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("No more space for Senior Developers.");
        }
    }
}
