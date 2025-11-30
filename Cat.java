public class Cat extends Animal {

    static int catCount; 

    public Cat(String name) {
        super(name);
        this.maxRun = 200;
        this.feedAmount = 10;
        catCount++;

    }
    @Override
    public void swim(int distanceInMeters) {
        System.out.println("Кот не умеет плавать");
    }

    static void showCount() {
        System.out.println("Котов/кошек: " + catCount);
    }
}