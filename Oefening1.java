import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Oefening1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(args[0]));
        int aantal = scanner.nextInt();
        int targetSum = scanner.nextInt();

        int[] arr = new int[aantal];
        int i = 0;

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                arr[i] = scanner.nextInt();
                i++;
            }
        }

        // Print de inhoud van de array (check dat het werkt)
        // Deze regel kun je verwijderen
        System.out.println(Arrays.toString(arr));
        
        // Implementeer jouw algoritme hier.
    }
}
