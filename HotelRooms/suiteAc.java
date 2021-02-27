public class suiteAc extends HotelRoom{
    int totalDR, ratePerSqFeet2=15;
    public suiteAc(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi){
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
            ratePerSqFeet2 = ratePerSqFeet2 + 2;
            totalDR = ratePerSqFeet2 * getNumberOfSqFeet();
            return 0;
        }

        public int rateCalculatorDR() {
            totalDR = ratePerSqFeet2 * getNumberOfSqFeet();
            System.out.println("Total rate : " + totalDR);
            return 0;
        }
}
