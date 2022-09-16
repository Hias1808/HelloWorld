import java.util.Scanner;

public class TowerCalculator {

    public static void main(String[] args) {

        long number;
        long result;
        int multiplikator;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte die Startzahl eingeben: ");

        number = scanner.nextInt();
        result = number;

        for (multiplikator = 2; multiplikator <= 9; multiplikator++) {
            number = result;
            result = number * multiplikator;
            System.out.println(number + "*" + multiplikator + "=" + result);
        }

        for (multiplikator = 2; multiplikator <= 9; multiplikator++) {
            number = result;
            result = number / multiplikator;
            System.out.println(number + "/" + multiplikator + "=" + result);
        }



        /*number = result;
        result = number / 3;
        System.out.println(number + " / 3 = " + result);

        number = result;
        result = number / 4;
        System.out.println(number + " / 4 = " + result);

        number = result;
        result = number / 5;
        System.out.println(number + " / 5 = " + result);

        number = result;
        result = number / 6;
        System.out.println(number + " / 6 = " + result);

        number = result;
        result = number / 7;
        System.out.println(number + " / 7 = " + result);

        number = result;
        result = number / 8;
        System.out.println(number + " / 8 = " + result);

        number = result;
        result = number / 9;
        System.out.println(number + " / 9 = " + result);
*/
    }
}
