import java.util.Scanner;

/**
 * @author vitalik1313
 * @version 1.0
 * @see LuceNumb
 *
 */

public class Main {
    /**
     *
     * @param args the N of Luce's number
     */
    public static void main(String[] args) {
        int N = 0;
        LuceNumb[] arr = new LuceNumb[N];

        if(args.length == 0) {
            Scanner reader = new Scanner(System.in);
            System.out.println("Enter N of Luce's numbers: ");
            N = reader.nextInt();
            reader.close();
        }
        else {
            N = Integer.parseInt(args[0]);
            System.out.println("N of Luce sequence = " + N + " from command line");
        }

        LuceNumb[] luceObj = new LuceNumb[N];
        LuceNumb.setLucasNums(luceObj);

        LuceNumb.printCorrectNumbs(luceObj);

    }
}
