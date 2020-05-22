package Portfolio.Applications.DotComBust;

import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    void setLocationCells(ArrayList<String> newLocation) {
        locationCells = newLocation;
    }


    public void setName(String s) {
        name = s;

    }

    String chekYourSelf(String userInput) {
        String result = "Miss!";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Kill!";
                System.out.println("Ups, you have killed " + name + " :");
            } else {
                result = "Hit!";
            }
        }
        return result;
    }
}
