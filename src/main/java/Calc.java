public class Calc {
    /*double sum (double a, int b) {
        return a + b; }
    double subtract (double c, int d) {
        return c - d; }
    double multiply (double e, int f) {
        return e * f; }
    double division (double g, int h) {
        return g / h; }*/
    public String sum(String a, String b) {
    int numA = Integer.parseInt(a);
    int numB = Integer.parseInt(b);
    int result = numA + numB;
    String sum = Integer.toString(result);

        return String.valueOf(result);
    }
}
