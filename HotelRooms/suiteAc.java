public class suiteAc extends HotelRoom{
    int totalDR, ratePerSqFeet2=15;
    public suiteAc(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi){
        super(hotelName, numberOfSqFeet, hasTv, hasWifi);

        }

        public int rateCalculatorDR() {
            totalDR = ratePerSqFeet2 * getNumberOfSqFeet();
            System.out.println("Total rate : " + totalDR);
            return 0;
        }
}
