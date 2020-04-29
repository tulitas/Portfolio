package Portfolio.Applications.GuessNum;

import Portfolio.Controllers.GuessNumController;

import java.util.Random;

public class GuessNum {
    private int guessNumResult;
    private static Random random = new Random();
    private int tryNum;
    private String ss;
    private int userScore = 0;
    private int myScore = 0;
    private boolean userLost = true;
    private GuessNumController guessNumController = new GuessNumController();
    private int userNum = 0;
    int myNum = 0;

    public void runMyNum(int digit) {

        do {
//
//
        myNum = random.nextInt(100) + 1;
        System.out.println(myNum);
//        chekNum(digit);
            for (int i = 1; i < 10; i++) {
                if (myNum > digit) {
                    System.out.println("Mojo bolse");

                } else if (myNum < digit) {
                    System.out.println("mojo mense");

                } else {
                    System.out.println("you lose");
                }
                break;
            }

        } while (myNum == digit);
    }

//    private void chekNum(int digit) {
//
//
//        for (int i = 1; i < 10; i++) {
//            System.out.println("Попытка #" + i);
//            System.out.println("user num = " + digit + "!!!");
//            tryNum = i;
//
//            if (myNum == digit) {
//                userScore += 1;
//
//                System.out.println("You are WINER!!!");
//
//
//                break;
//            } else if (myNum < digit) {
//                System.out.println(" Моё число < ");
//                return;
//
//            } else {
//                System.out.println(" Моё число > ");
//                return;
//            }
//
//        }
//        if (userLost) {
//            myScore += 1;
//        }
//
//    }



    public int getGuessNumResult() {
        return guessNumResult;
    }

    public void setGuessNumResult(int guessNumResult) {
        this.guessNumResult = guessNumResult;
    }

    @Override
    public String toString() {
        return "GuessNum{" +
                "guessNumResult=" + guessNumResult +
                '}';
    }
}
