package Portfolio.Applications.GuessNum;

import Portfolio.Controllers.GuessNumController;
import org.springframework.ui.Model;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.util.InputMismatchException;
import java.util.Random;

public class GuessNum {
    private int guessNumResult;
    private static Random random = new Random();
    private int tryNum;
    private String ss;
    int userScore = 0;
    int myScore = 0;
    boolean userLost = true;
private GuessNumController guessNumController = new GuessNumController();

    public void chekNum() {




            int myNum = random.nextInt(100) + 1;
            System.out.println(myNum);
            for (int i = 0; i < 10; i++) {

                int userNum = 25;
                System.out.println("Попытка #" + i);
                System.out.println("user num = " + userNum + "!!!");
                tryNum = i;

                long t1 = System.currentTimeMillis();
                if (myNum == userNum) {
                    userScore += 1;

                    System.out.println("You are WINER!!!");
                    long t2 = System.currentTimeMillis();
                    long t = t2 - t1;
                    break;
                } else if (myNum < userNum) {
                    System.out.println(" Моё число < ");

                } else {
                    System.out.println(" Моё число > ");

                }

            }
            if (userLost) {
                myScore += 1;
            }

    }

//    public int askNum(int digit) {
//
//
////        try {
////            System.out.println(digit);
////
////        } catch (MethodArgumentTypeMismatchException e) {
////            System.out.println("Это не число!");
////            return digit;
////        }
//        if (digit < 1 || digit > 100) {
//            System.out.println("Только от 1 до 100!");
//        }
//            return digit;
//
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
