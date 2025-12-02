public class MainInterface {
    public static void main(String[] args) {
        Circle circle = new Circle(new int[] {1}, "red", "red");
        Rectangle rectangle = new Rectangle(new int[] {1, 1}, "red", "red");
        Triangle triangle = new Triangle(new int[] {1, 1, 1}, "red", "red");

        System.out.printf("Круг: \n Периметр: %.2f\n Площадь:%.2f\n Цвет обводки: %s\n Цвет заливки: %s\n", circle.perimeter(), circle.square(), circle.colorBorder, circle.colorFill);
        System.out.printf("Прямоугольник: \n Периметр: %.2f\n Площадь:%.2f\n Цвет обводки: %s\n Цвет заливки: %s\n", rectangle.perimeter(), rectangle.square(), rectangle.colorBorder, rectangle.colorFill);
        System.out.printf("Треугольник: \n Периметр: %.2f\n Площадь:%.2f\n Цвет обводки: %s\n Цвет заливки: %s\n", triangle.perimeter(), triangle.square(), triangle.colorBorder, triangle.colorFill);

    }
}