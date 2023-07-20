package Lec62;

public class Number_of_Ways_to_Divide_a_Long_Corridor {
    public static void main(String[] args) {
        System.out.println(numberOfWays("SSPPSPS"));
    }

    public static int numberOfWays(String corridor) {
        int mod = (int)((1e9)+7);
        int total_seat = 0;
        int seat = 0;
        int plant = 0;
        boolean firstCorridor = false;
        long res = 1;

        for (int i = 0; i < corridor.length(); i++) {
            if(corridor.charAt(i)=='S'){
                total_seat++;
                seat++;
            }
            else if(seat == 0){
                plant++;
            }

            if(seat==2){
                if(firstCorridor){
                    res = res * (plant+1);
                    res = res % mod;
                }

                firstCorridor = true;
                seat = 0;
                plant = 0;
            }
        }

        if(total_seat == 0 || (total_seat & 1) != 0){
            return 0;
        }

        return (int)res;
    }
}
