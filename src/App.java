import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner inputs = new Scanner(System.in).useLocale(Locale.US);
        int[] numbers = new int[10];
        int pos = 0, neg = 0, cero = 0, i;

        try {

            System.out.println("Then type each of the elements of the array");

            for (i = 0; i < numbers.length; i++) {
                System.out.print("Please indicate the number of position " + (i + 1) + ": ");
                numbers[i] = inputs.nextInt();
            }   

            System.out.println("Array numbers have been loaded");

            for (i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    pos++;
                } else if (numbers[i] < 0) {
                    neg++;
                } else {
                    cero++;
                }
            }

            System.out.println("Positive numbers are: " + pos);
            System.out.println("Negative numbers are: " + neg);
            System.out.println("Cero numbers are: " + cero);

        } catch (Exception ex) {
            System.out.println("An error has ocurred" + ex.getMessage());
        } finally {
            inputs.close();
        }       

    }
}
