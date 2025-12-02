interface Shape {

    int[] getSides();

    default double perimeter() {
        int[] sides = getSides();
        double sum = 0;
        for (int side : sides) {
            sum += side;
        }
        return sum;
    }

    double square();
}

class Circle implements Shape {

    String colorFill;
    String colorBorder;
    private int[] sides; // sides[0] - радиус
    final double pi = 3.14;

    Circle(int[] sides, String colorFill, String colorBorder) {
        this.sides = sides;
        this.colorFill = colorFill;
        this.colorBorder = colorBorder;
    }

    @Override
    public int[] getSides() {
        return sides;
    }

    @Override
    public double perimeter() {
        return 2*pi*sides[0];
    }

    @Override
    public double square() {
        return pi*Math.pow(sides[0],2);
    }
    
}

class Rectangle implements Shape {

    String colorFill;
    String colorBorder;
    private int[] sides;

    Rectangle(int[] sides, String colorFill, String colorBorder) {
        this.sides = sides;
        this.colorFill = colorFill;
        this.colorBorder = colorBorder;
    }

    @Override
    public int[] getSides() {
        return sides;
    }

    @Override
    public double square() {
        return sides[0]*sides[1];
    }
    
}

class Triangle implements Shape {
    
    String colorFill; 
    String colorBorder;
    private int[] sides; 
    
    Triangle(int[] sides, String colorFill, String colorBorder) {
        this.sides = sides;
        this.colorFill = colorFill;
        this.colorBorder = colorBorder;
    }

    @Override
    public int[] getSides() {
        return sides;
    }

    @Override
    public double square() {
        double halfPerimeter = perimeter()/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter - sides[0])*(halfPerimeter - sides[1])*(halfPerimeter - sides[2]));
    }
    
}
