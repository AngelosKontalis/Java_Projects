package tankFuel;

public class TankFuel {
	private final double gasolineTankCapacity;
	private double tankFuel=0.0;
			
	public TankFuel(double gasolineTankCapacity) {
		this.gasolineTankCapacity=gasolineTankCapacity;
	}
	
	public double getTankFuel() {
		return tankFuel;
	}
	
	public double getTankCapacity() {
		return gasolineTankCapacity;
	}
	
	public void fuelTank(double fuelTempo)
			throws InvalidFuelTempoException,TankFullException{
		if ((fuelTempo!=0.1)&& (fuelTempo!=0.2))
			throw new InvalidFuelTempoException("Sorry.Fuel tempo is not supported");
			
		if(gasolineTankCapacity==tankFuel)throw new TankFullException("Thank you.The tank is now full.");
		else {
			System.out.println(tankFuel);
			tankFuel=tankFuel+fuelTempo;
			tankFuel=(double)Math.round(tankFuel * 10)/ 10;
		}
	}

}
