class Vehicle{
	int passenger, fuelcap, hundredkpl;
	
	double fuelneeded (int kilometers){
		
		return (double) kilometers/hundredkpl;
		
		
	}
}

class VehicleDemo{
	
	public static void main(String args[]){
	int range;
	
	Vehicle  elantraV = new Vehicle();
	Vehicle mE300 = new Vehicle();
	
	elantraV.passenger = 5;
	elantraV.fuelcap = 50;
	elantraV.hundredkpl = 7;
	
	range = elantraV.fuelcap *  elantraV.hundredkpl;
	System.out.println("Hyundai Elantra VI generation can transport " + elantraV.passenger + " passengers " + 
	" to " + range + " kilometers");
	
	mE300.passenger = 5;
	mE300.fuelcap = 65;
	mE300.hundredkpl = 12;
	
	range = (mE300.fuelcap * 100) / mE300.hundredkpl;
	System.out.println("Mercedes E300 generation can transport " + mE300.passenger + " passengers" + 
	" to " + range + " kilometers");
	
	System.out.println("for E300 5000 kilometers "  + mE300.fuelneeded(5000) + "litres Fuel Required");
	}
}