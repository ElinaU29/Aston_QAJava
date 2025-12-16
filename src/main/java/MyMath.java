public class MyMath {
     
    public static long getFactorial(int number) {

        long factorial = 1;
            
        if (number >= 0) {
            for(int i = 1; i <= number; i++) {
                factorial = i * factorial;
            }
            return factorial;
        } else {
            throw new NegativeNumberException("Введено отрицательное число");
        }
    }

    public static double getTrianglePerimeter(double base, double height) {
        if (base <= 0 || height <=0) {
            throw new NegativeNumberException("Введено отрицательное или нулевое число");
        }
        return base*height*0.5;
    }

    public static double arithmeticOperations(int a, int b, String operation) {

        switch (operation) {
            case "+":
                return a+b;
                
            case "-":
                return a-b;

            case "*":
                return a*b;

            case "/":
            
                if (b != 0) {
                    return (double) a/b;
                } else {
                    throw new ArithmeticException();
                }
            
            default:
                throw new IllegalArgumentException();
        }
    }
    
    public static String isBiggerThen(int a, int b) {

        if (a > b) {
            return a + " больше " + b;
        } else if (a == b) {
            return a + " равно " + b;
        } else {
            return a + " меньше " + b;
        }
    }
}

