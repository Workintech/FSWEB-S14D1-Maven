package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary){
        super(id, name, salary);
    }
    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
    }

    public void AddEmployee(JuniorDeveloper dev, int index){
        if(juniorDevelopers == null){
            System.out.println("Junior Developer array is not initialized");
            return;
        }
        if(index < 0 || index > juniorDevelopers.length){
            System.out.println("Invalid index for junior developer!");
            return;
        }
        if (juniorDevelopers[index] != null) {
            System.out.println("This position for junior developer is already filled!");
            return;
        }
        juniorDevelopers[index] = dev;
        System.out.println("Junior developer " + dev.getName() + " added at index " + index);
    }

    public void addEmployee(MidDeveloper dev, int index) {
        if (midDevelopers == null) {
            System.out.println("Mid developer array is not initialized!");
            return;
        }
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Invalid index for mid developer!");
            return;
        }
        if (midDevelopers[index] != null) {
            System.out.println("This position for mid developer is already filled!");
            return;
        }
        midDevelopers[index] = dev;
        System.out.println("Mid developer " + dev.getName() + " added at index " + index);
    }

    public void addEmployee(SeniorDeveloper dev, int index) {
        if (seniorDevelopers == null) {
            System.out.println("Senior developer array is not initialized!");
            return;
        }
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Invalid index for senior developer!");
            return;
        }
        if (seniorDevelopers[index] != null) {
            System.out.println("This position for senior developer is already filled!");
            return;
        }
        seniorDevelopers[index] = dev;
        System.out.println("Senior developer " + dev.getName() + " added at index " + index);
    }

    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public void setJuniorDevelopers(JuniorDeveloper[] juniorDevelopers) {
        this.juniorDevelopers = juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public void setMidDevelopers(MidDeveloper[] midDevelopers) {
        this.midDevelopers = midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }

    public void setSeniorDevelopers(SeniorDeveloper[] seniorDevelopers) {
        this.seniorDevelopers = seniorDevelopers;
    }
}