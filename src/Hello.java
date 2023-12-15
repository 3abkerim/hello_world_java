public class Hello {
    public static void main(String[] args){
//        System.out.println("Hello, Adham");
//
//        boolean isAlien = false;
//        if (isAlien == false){
//            System.out.println("It is not an alien!");
//            System.out.println("And I am scared of aliens");
//        }
//
//        int topScore = 90;
//        if (topScore >= 100){
//            System.out.println("You got the high score!");
//        }
//
//        int secondTopScore = 60;
//        if ((topScore > secondTopScore) && (topScore < 100)){
//            System.out.println("Greater than second top score and less than 100");
//        }
//
//        if ((topScore > secondTopScore) || (topScore < 100)){
//            System.out.println("Either");
//        }

        double x = 20.00d;
        double y = 80.00d;
        double z = (x + y) * 100.00d;
        System.out.println(z);
        double moduloVar = z % 40.00d;
        System.out.println(moduloVar);
        boolean result = (moduloVar == 0.00) ? true : false;
        System.out.println(result);

        if (!result) {
            System.out.println("Got some remainder");
        }


    }
}
