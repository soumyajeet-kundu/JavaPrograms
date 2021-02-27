public class DeluxeAc extends HotelRoom {
    int totalDR, ratePerSqFeet1=12;
    public DeluxeAc(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi){
        super(hotelName, numberOfSqFeet, hasTv, hasWifi);

        }

        public int rateCalculatorDR() {
            totalDR = ratePerSqFeet1 * getNumberOfSqFeet();
            System.out.println("Total rate : " + totalDR);
            return 0;
        }
}
