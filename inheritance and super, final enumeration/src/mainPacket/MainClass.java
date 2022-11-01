package mainPacket;

import randomize.Randomize;
import employees.*;
import enumerations.*;

public class MainClass {
	public static void main (String[] agrs) {
		System.out.println("HELLO PROJECT WEEK4");
		createRandomizedEmployees(100);
	}
	
	public static void createRandomizedEmployees(int k) {
		System.out.println("Creating "+ k +" Randomized Employees");
		for(int i=1;i<=k;i++) {
			StaffType staff=Randomize.Staff();
			
			if (staff==StaffType.Permanent) {
				PermanentStaff pstaff=new PermanentStaff(i);
				pstaff.CalculateMonthlySalary();
				pstaff.printInfo();
			}
			
			if (staff==StaffType.HourlyBased) {
				HourlyBasedStaff hstaff=new HourlyBasedStaff(i);
				hstaff.CalculateMonthlySalary();
				hstaff.printInfo();
			}
		}
	}
}
