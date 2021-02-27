public class HotelRoom {
    
    private String hotelName;
    private int numberOfSqFeet;
    private boolean hasTv;
    private boolean hasWifi;

    public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi)
    {
        super();
        this.hotelName = hotelName;
        this.numberOfSqFeet = numberOfSqFeet;
        this.hasTv = hasTv;
        this.hasWifi = hasWifi;
    }

    public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

    public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}
	public void setnumberOfSqFeet (int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet ;
	}

    public boolean isHasTv() {
		return hasTv;
	}
	public void sethasTv(boolean hasTv) {
		this.hasTv = hasTv;
	}
    
    public boolean isHasWifi() {
		return hasWifi;
	}
	public void sethasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}
}

    

    // }
    // void rateCalculatorDR(){

    //}


