
public class Main7 {

    public static void main(String[] args) {

        System.out.println(MyMath.getFactorial(0));
        System.out.println(MyMath.getFactorial(1));
        System.out.println(MyMath.getFactorial(5));

        try {
            System.out.println(MyMath.arithmeticOperations(5, 2, "-"));
            System.out.println(MyMath.arithmeticOperations(5, 2, "*"));
            System.out.println(MyMath.arithmeticOperations(5, 2, "+"));
            // System.out.println(MyMath.arithmeticOperations(5, 0, "/"));
            System.out.println(MyMath.arithmeticOperations(5, 2, "фывфыа"));
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
