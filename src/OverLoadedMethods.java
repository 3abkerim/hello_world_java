public class OverLoadedMethods {
//     int oneFootInInches = 12;
//     double oneInchInCm = 2.54;

    public static void main(String[] args) {
        System.out.println("5ft, 8in = "+ convertToCentimeters(5,8)+"cm" );
        System.out.println("68in = "+ convertToCentimeters(5)+"cm" );
    }
    public static double convertToCentimeters(int heightInInches){
        return heightInInches * 2.54;
    }
    public static double convertToCentimeters(int heightInFeet, int remHeightInInches){

       // return convertToCentimeters((heightInFeet * 12) + remHeightInInches);
        int feetToInches = heightInFeet + 12;
        int TotalInches = feetToInches + remHeightInInches;
        double result = convertToCentimeters(TotalInches);
        return result;
    }

}
