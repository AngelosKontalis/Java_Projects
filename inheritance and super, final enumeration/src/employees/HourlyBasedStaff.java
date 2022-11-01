package employees;

import enumerations.WorkingExperience;
import randomize.Randomize;

public class HourlyBasedStaff extends Academic {
    private WorkingExperience exp;
    private int hours;
    private int monthlysalary;

    public HourlyBasedStaff(int id) {
        super(id);

        exp=Randomize.WorkingExperience();
        hours=Randomize.MonthlyWorkingHours();

    }

    public int CalculateMonthSalary() {
        int HourlySalary=0;
        if (exp==WorkingExperience.UpToFiveYears) {
            HourlySalary=10;
        }
        if (exp==WorkingExperience.FiveToTenYears) {
            HourlySalary=20;
        }
        if(exp==WorkingExperience.MoreThanTenYears) {
            HourlySalary=30;
        }
        
        monthlysalary=baseMonthlySalary+(HourlySalary*hours);
        return monthlysalary;

    }

    public WorkingExperience getWorkingExperience() {
        return exp;
    }

    public void printInfo() {
        System.out.println("");
        System.out.println("EmployeeID: "+super.getEmployeeID()+" is hourly based");
        System.out.println("Worling Experience: "+exp);
        System.out.println("Working Hours: "+hours);
        System.out.println("Hourly based employee salary: "+CalculateMonthSalary());

    }
}

