package Portfolio.Applications.GuessNum;

import java.util.Random;

public class GuessNum {
    private int guessNumResult;
    private static Random random = new Random();
    private int tryNum;
private String ss;
    public void chekNum(int digit) {
        do {

            int myNum = random.nextInt(100) + 1;
            boolean userLost = true;
            for (int i = 0; i < 10; i++) {
                tryNum = i;
                System.out.println(tryNum + " " + i);
            }
        } while (ss.equals("end"));



    }

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
