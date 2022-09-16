import java.util.Scanner;

public class CurrencyCalculator {

    public static void main(String[] args) {

        // Begrüßung
        System.out.println( " Wert in Euro ");

        // Werte einlesen
        Scanner scanner = new Scanner(System.in);
        double wertEuro;
        wertEuro = scanner.nextDouble();



        // Werte ausgeben
        double wertRubel;
        wertRubel = wertEuro * 59.38;
        System.out.println( wertRubel + " Rubel ");

        double wertYen;
        wertYen = wertEuro * 142.68;
        System.out.println( wertYen + " Yen ");

        double wertZloty;
        wertZloty = wertEuro * 4.72;
        System.out.println( wertZloty + " Zloty ");

        double wertForint;
        wertForint = wertEuro * 405.12;
        System.out.println( wertForint + " Forint ");

        double wertKuna;
        wertKuna = wertEuro * 7.52;
        System.out.println( wertKuna + " Kuna ");

        double wertFranken;
        wertFranken = wertEuro * 0.96;
        System.out.println( wertFranken + " Franken ");

        double wertDirham;
        wertDirham = wertEuro * 3.66;
        System.out.println( wertDirham + " Dirham ");





    }
}
