import java.util.Scanner;

public class TemperatureCalculator {

    public static void main(String[] args) {

        // Allgemeine Begrüßung
        System.out.println(" Wert in Celsius");


        // Einlesen der Werte
        Scanner scanner = new Scanner(System.in);
        double wertCelsius;
        wertCelsius = scanner.nextDouble();
        double wertFahrenheit;


        // Berechnung C to F

        wertFahrenheit = wertCelsius * 9 / 5 + 32;
        System.out.println( wertFahrenheit + " F ");


        // Berechnung F to C
        wertCelsius = (wertFahrenheit - 32) * 5 / 9;
        System.out.println( wertCelsius + " C ");

    }

}

