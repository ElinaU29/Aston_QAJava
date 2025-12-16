public class Main7 {

    public static void main(String[] args) {

        System.out.println(MyMath.getFactorial(0));
        System.out.println(MyMath.getFactorial(-2));
        System.out.println("----");

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
