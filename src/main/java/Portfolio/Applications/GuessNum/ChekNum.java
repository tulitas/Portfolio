package Portfolio.Applications.GuessNum;


import java.util.Random;

public class ChekNum {

    private static Random random = new Random();
    int myNum = 0;
    String askResult;

    public void runMyNum(int digit) {

        myNum = random.nextInt(3) + 1;

        if (myNum == digit) {
             setAskResult("Good! You are winner! You can go, for the time being. ");
        } else if (myNum < digit) {
            setAskResult("My num is less! Sit down next to friends. ");
        } else {
            setAskResult("you lose! My num is larger. Don`t sleep.");
        }
    }

    public String getAskResult() {
        return askResult;
    }

    private void setAskResult(String askResult) {
        this.askResult = askResult;
    }
}



