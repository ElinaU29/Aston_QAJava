import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    @DisplayName("Проверка метода getFactorial()")
    public void testFactorial() {

        int[]numbers = {5, 1, 0, -5};
        assertAll ("numbers",
            () -> assertEquals(MyMath.getFactorial(numbers[0]), 120),
            () -> assertEquals(MyMath.getFactorial(numbers[1]), 1),
            () -> assertEquals(MyMath.getFactorial(numbers[2]), 1),
            () -> assertThrows(NegativeNumberException.class, () -> {
                MyMath.getFactorial(numbers[3]);
            })
        );
    } 
    
    @Test
    @DisplayName("Проверка метода getTrianglePerimeter()")
    public void testTrianglePerimeter() {

        int[][]numbers = {{2, 5}, {3, 4}, {-2, 5}, {0, 10}};
        assertAll ("numbers",
            () -> assertEquals(MyMath.getTrianglePerimeter(numbers[0][0], numbers[0][1]), 5.0),
            () -> assertEquals(MyMath.getTrianglePerimeter(numbers[1][0], numbers[1][1]), 6.0),
            () -> assertThrows(NegativeNumberException.class, () -> {
                MyMath.getTrianglePerimeter(numbers[2][0], numbers[2][1]);
            }),
            () -> assertThrows(NegativeNumberException.class, () -> {
                MyMath.getTrianglePerimeter(numbers[3][0], numbers[3][1]);
            })
        );
    }  

    @Test
    @DisplayName("Проверка метода arithmeticOperations()")
    public void testArithmeticOperation() {

        assertAll ("numbers",
            () -> assertEquals(MyMath.arithmeticOperations(5, 6, "-"), -1),
            () -> assertEquals(MyMath.arithmeticOperations(5, 6, "+"), 11),
            () -> assertEquals(MyMath.arithmeticOperations(24, 6, "/"), 4),
            () -> assertEquals(MyMath.arithmeticOperations(5, 6, "*"), 30),
            () -> assertThrows(IllegalArgumentException.class, () -> {
                MyMath.arithmeticOperations(5, 2, "фывфыа");
            }),
            () -> assertThrows(ArithmeticException.class, () -> {
                MyMath.arithmeticOperations(5, 0, "/");
            })
        );
    }

    @Test
    @DisplayName("Тест метода isBiggerThen()")
    public void testIsBiggerThen() {

        assertEquals("5 больше 2", MyMath.isBiggerThen(5, 2));
        assertEquals("5 равно 5", MyMath.isBiggerThen(5, 5));
        assertEquals("2 меньше 5", MyMath.isBiggerThen(2, 5));
    }
}