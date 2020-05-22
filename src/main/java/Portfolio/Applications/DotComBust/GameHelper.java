package Portfolio.Applications.DotComBust;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class GameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLenth = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;



    String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0)
                return null;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IOException: " + e);
        }
        assert inputLine != null;
        return inputLine.toLowerCase();
    }

    ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] alphaCoords = new String[comSize];
        String temp = null;
        int[] coords = new int[comSize];
        int attempts = 0;
        boolean success = false;
        int location = 0;

        comCount++;
        int incr = 1;
        if ((comCount % 2) == 1) {
            incr = gridLenth;
        }
        while (!success & attempts++ < 200) {
            location = (int) (Math.random() * gridSize);
//            System.out.println("test point " + location);
            int x = 0;
            success = true;
            while (success && x < comSize) {
                if (grid[location] == 0) {
                    coords[x++] = location;
                    location += incr;
                    if (location >= gridSize) {
                        success = false;
                    }
                } else {
//                    System.out.println("used location: " + location);
                    success = false;
                }
            }
        }
        int x = 0;
        int row = 0;
        int column = 0;
        while (x < comSize) {
            grid[coords[x]] = 1;
            row = (int) (coords[x] / gridLenth);
            column = coords[x] % gridLenth;
            temp = String.valueOf(alphabet.charAt(column));
            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
//            System.out.println("coord " + x + " = " + alphaCells.get(x - 1));
        }
        return alphaCells;
    }
}
