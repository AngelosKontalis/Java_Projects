package employees;

import enumerations.Bathmida;
import randomize.Randomize;

final public class PermanentStaff extends Academic {
	    private Bathmida rank;
	    private int monthlysalary;

	    public PermanentStaff(int id) {
	        super(id);

	        rank=Randomize.Bathmida();

	    }
	    
	    public int CalculateMonthSalary() {
	        int onTopSalary=0;
	        if (rank==Bathmida.Lecturer) {
	            onTopSalary=1000;
	        }
	        if (rank==Bathmida.Assistant) {
	            onTopSalary=1200;
	        }
	        if (rank==Bathmida.Associate) {
	            onTopSalary=1400;
	        }
	        if (rank==Bathmida.Professor) {
	            onTopSalary=1500;
	        }
	        monthlysalary=baseMonthlySalary+onTopSalary;
	        return monthlysalary;

	    }

	    public Bathmida getBathmida() {
	        return rank;
	    }

	    public void printInfo() {
	        System.out.println("");
	        System.out.println("EmployeeID: "+super.getEmployeeID()+ " is permanent");
	        System.out.println("Academic rank: "+rank);
	        System.out.println("Hourly based employee salary: "+CalculateMonthSalary());

	    }
}
