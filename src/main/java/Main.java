public class Main {
    public static void main (String [] args) {

        Calc calc = new Calc();

        /*double result = calc.sum(1, 2);
        System.out.println("Сумма: " + result);
        result = calc.subtract(3, 4);
        System.out.println("Вычитание: " + result);
        result = calc.multiply(5, 6);
        System.out.println("Умножение: " + result);
        result = calc.division(7, 8);
        System.out.println("Деление: " + result);*/

        System.out.println(calc.sum("74", "26"));

    }
}
