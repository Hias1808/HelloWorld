public class FirstCalculator {
    //psvm
    public static void main(String[] args) {
        //beidesMöglich
        int number1 = 9;
        int number2;
        number2 = 5;

        System.out.println("Zahl 1:" + number1);
        System.out.println("Zahl 2:" + number2);

        int summe = number1 + number2;
       // System.out.println(number1 + "+" + number2 + "=" + summe);
        System.out.print(number1);
        System.out.print("+");
        System.out.print(number2);
        System.out.print("=");
        System.out.print(summe);
        System.out.println();

        int resultSubtraktion = number1 - number2;
        System.out.println(number1 + "-" + number2 + "=" + resultSubtraktion);

        int resultMultiplikation = number1 * number2;
        System.out.println(number1 + "*" + number2 + "=" + resultMultiplikation);

        double numberDouble2 = number2;
        double resultDivision = number1 / numberDouble2;
        System.out.println(number1 + "/" + number2 + "=" + resultDivision);

        int resultModulo = number1 % number2;
        System.out.println(number1 + "%" + number2 + "=" + resultModulo);

    }
}
