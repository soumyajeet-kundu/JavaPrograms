public class deluxeRoom extends HotelRoom {
    
    int totalDR, ratePerSqFeet=10;
    public deluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTv, boolean hasWifi){
        super(hotelName, numberOfSqFeet, hasTv, hasWifi);

            if(hasWifi == true);
            {
                rate1();
            }
            rateCalculatorDR();
        }

        public int rateCalculatorDR() {
            totalDR = ratePerSqFeet * getNumberOfSqFeet();
            System.out.println("Total rate : " + totalDR);
            return 0;
        }

        public int rate1(){
            ratePerSqFeet = ratePerSqFeet + 2;
            totalDR = ratePerSqFeet * getNumberOfSqFeet();
            return 0;
        }
        
    }

