package com.workintech.Employee;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id,String name,double salary){
        super(id,name,salary);
    }

    public HRManager(long id, String name, double salary,JuniorDeveloper[] juniorDevelopers,MidDeveloper[] midDevelopers ,SeniorDeveloper[] seniorDevelopers) {
        super(id,name,salary);
        this.juniorDevelopers=juniorDevelopers;
        this.midDevelopers=midDevelopers;
        this.seniorDevelopers=seniorDevelopers;

    }

    public void addEmployee(int index,JuniorDeveloper juniorDeveloper){
        if(juniorDeveloper==null){
            juniorDevelopers[index]=juniorDeveloper;
        }
    }

    public void addEmployee(int index,MidDeveloper midDeveloper){
        if(midDeveloper==null){
            midDevelopers[index]=midDeveloper;
        }
    }

    public void addEmployee(int index,SeniorDeveloper seniorDeveloper){
            if(seniorDeveloper==null){
                seniorDevelopers[index]=seniorDeveloper;
            }
    }
    @Override
    public void work(){
        System.out.println("Human resource starts to working"+getSalary());

    }





}
