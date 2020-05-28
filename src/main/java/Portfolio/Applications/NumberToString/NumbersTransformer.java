package Portfolio.Applications.NumberToString;

public class NumbersTransformer {
    private int numFromWeb;
    private int numForWeb;
    public static final String[] belowTwenty = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    public static final String[] tens = {"hundred", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy",
            "eighty", "ninety"};

    void transfer() {
        if (getNumFromWeb() < 20) {
            System.out.println(belowTwenty[getNumFromWeb()]);
        } else if (getNumFromWeb() < 100) {
            int hight = getNumFromWeb() / 10;
            System.out.println("hight " + hight);
            int low = getNumFromWeb() % 10;
            System.out.println("low " + low);
            String text = tens[hight];
            if (low != 0) {
                text = text + " " + belowTwenty[low];
                System.out.println(text);
            } else System.out.println(tens[0]);
        }
    }

    public int getNumForWeb() {
        return numForWeb;
    }

    public void setNumForWeb(int numForWeb) {
        this.numForWeb = numForWeb;
    }

    private int getNumFromWeb() {
        return numFromWeb;
    }

    void setNumFromWeb(int numFromWeb) {
        this.numFromWeb = numFromWeb;
    }
}
