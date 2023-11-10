package exception;

public class Second {

    public static void main(String[] args) {
        try {
            divideByZero(5, 0);
        } catch (ArithmeticException e) {
            System.out.println("/ by 0.0");
        }

        System.out.println(divideByZero(5, -1));

        try {
            joinLines(null, "");
        } catch (IllegalArgumentException e) {
            System.out.println("Arguments must be not null");
        }

        System.out.println(joinLines("join ", "lines"));

        try {
            substringBy("123", -1);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(substringBy("123", 1));
    }

    public static double divideByZero(double first, double second) {
        if (second == 0)
            throw new ArithmeticException("Second must be not zero");

        return first / second;
    }

    public static String joinLines(String first, String second) {
        if (first == null || second == null)
            throw new IllegalArgumentException("First and second must be not null");

        return first + second;
    }

    public static String substringBy(String line, int index) {
        if (line == null)
            throw new IllegalArgumentException("Line must be not null");
        if (index < 0 || index > line.length() - 1)
            throw new StringIndexOutOfBoundsException("Index must be not negative and less then length");

        return line.substring(index);
    }
}
