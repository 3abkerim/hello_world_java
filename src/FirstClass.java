public class FirstClass {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;


        calculateScore(true,800,5,100);
        calculateScore(true,1000,8,200);


//        if (gameOver){
//            finalScore += (levelCompleted * bonus);
//            System.out.println(finalScore);
//        }


    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println(finalScore);
        }
    }
}
