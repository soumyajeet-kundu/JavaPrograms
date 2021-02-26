public class TwoWheeler extends vehicle {

	  private boolean KickStartAvailable;
	  
	public TwoWheeler(String vehicleNumber, String make, String fuelType, int fuelCapacity, int cc,
			boolean kickStartAvailable) {
		super(vehicleNumber, make, fuelType, fuelCapacity, cc);
		KickStartAvailable = kickStartAvailable;
	}

	public boolean isKickStartAvailable() {
		return KickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		KickStartAvailable = kickStartAvailable;
	}

	
    public void displayDetailInfo() {
		
    	if(KickStartAvailable==true) {
    		System.out.println("KickStartAvailable:Yes");
    	}
    	else {
    		System.out.println("KickStartAvailable:No");
    	}
	}
	
	  
}