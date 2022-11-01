package main;
import java.util.Scanner;
import tankFuel.*;

public class MainClass{

	public static void main(String[] args) {
		Scanner The_Tank = new Scanner(System.in);
		System.out.println("Enter fuel tank capacity: ");
		int fuelTank = The_Tank.nextInt();
		TankFuel myTank = new TankFuel(fuelTank);
		boolean fillTank=true;
		Scanner the_Tempo = new Scanner(System.in);
		System.out.println("Enter fuel tempo(0.1 or 0.2): ");
		double fuelTempo = the_Tempo.nextDouble();
		while(fillTank){
			
			try {
				myTank.fuelTank(fuelTempo);
			    }
			catch (InvalidFuelTempoException ex) {
				fillTank=false;
				System.out.println(ex.getMessage());
			}
			catch (TankFullException ex) { 
				fillTank=false;
				System.out.println(ex.getMessage());
			}
				
		}
	
		System.out.println(myTank.getTankFuel());
		myTank=null;
	
	}
}
