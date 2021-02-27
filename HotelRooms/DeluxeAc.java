public class DeluxeAc extends HotelRoom {
    int totalDR, ratePerSqFeet1=12;
    public DeluxeAc(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi){
        super(hotelName, numberOfSqFeet, hasTv, hasWifi);
            if(hasWifi == false)
            {
                rateCalculatorDR();
            }
            else if(hasWifi == true)
            {
                rate1();
            }
        }

        public int rate1(){
            ratePerSqFeet1 = ratePerSqFeet1 + 2;
            totalDR = ratePerSqFeet1 * getNumberOfSqFeet();
            return 0;
        }

        public int rateCalculatorDR() {
            totalDR = ratePerSqFeet1 * getNumberOfSqFeet();
            System.out.println("Total rate : " + totalDR);
            return 0;
        }
}
