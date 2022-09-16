import java.util.Scanner;

public class Mahlreihen {

    public static void main(String[] args) {

        long number;
        long result;
        int multiplikator;

        System.out.println( " Bitte geben Sie eine Zahl ein ");

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        // Schleife für den multiplikator
        for (multiplikator = 1; multiplikator <= 25; multiplikator++) {
            result = number * multiplikator;
            System.out.println(number + "*" + multiplikator + "=" + result);

        }





    }
}
