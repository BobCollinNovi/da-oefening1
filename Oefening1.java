import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Oefening1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(args[0]));
        int aantal = scanner.nextInt();
        int targetSum = scanner.nextInt();

        int[] myList = new int[aantal];
        int x = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                myList[x] = scanner.nextInt();
                x++;
            }
        }
        System.out.println(Arrays.toString(myList));
        // Print de inhoud van de array (check dat het werkt)
        // Deze regel kun je verwijderen

//        System.out.println(Arrays.toString(arr));

        // Implementeer jouw algoritme hier.
        int q = 0;
        //int[] myList = new int[] { -4, -1, -1, 0, 1, 2 };
        //int[] myList = new int[] { 6, 0, -1, 0, 1, 2, -1, -4 };
        //int[] myList = new int[] { 1, -1, 0, 2, 3 };
        //Arrays.sort(myList);

        int totaal = targetSum;
        System.out.println(totaal);
        for (int i = 0; i < myList.length; i++) {
            for (int j = i + 1; j < myList.length; j++) {
                for (int k = j + 1; k < myList.length; k++) {
                    if (myList[i] + myList[j] + myList[k] == totaal) {
                        q += 1;
                        //System.out.println(myList[i] + "+" + myList[j] + "+" + myList[k]);
                    }
                }
            }
        }
        System.out.println(q);
    }

}