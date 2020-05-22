package Portfolio.Applications.DotComBust;

import java.util.ArrayList;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    public void setUpGame() {
        DotCom one = new DotCom();
        one.setName("Yohoho.com");
        DotCom two = new DotCom();
        two.setName("Gulugulu.com");
        DotCom tree = new DotCom();
        tree.setName("Up33.net");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(tree);
        System.out.println("Your mission is drop to down 3 sites: ");
        System.out.println("Yohoho.com, Gulugulu.com, Up33.net");
        System.out.println("Play desk is 7x7" + "\n" + "horizontal places is (a,b,c,d,e,f,g)" + "\n" + "vertical is (1,2,3,4,5,6,7)");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    public void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String usersGuess = helper.getUserInput("Make a move");
            checkUserGuess(usersGuess);
        }
        finishGame();
    }

    private void finishGame() {
        System.out.println("All sites is droped down.");
        if (numOfGuesses <= 18) {
            System.out.println("You have used " + numOfGuesses + " moves.");

        } else {
            System.out.println("You have used " + numOfGuesses + " moves, it`s to much!");
        }
    }

    private void checkUserGuess(String usersGuess) {
        numOfGuesses++;
        String result = "Missed!!!";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.chekYourSelf(usersGuess);
            if (result.equals("Hited")) {
                break;
            }
            if (result.equals("Killed!!!")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

}
