public class Dog extends Animal {

    static int dogCount;

    public Dog(String name) {
        super(name);
        this.maxRun = 500;
        this.maxSwim = 10;
        this.feedAmount = 50;
        dogCount++;
    }

    static void showCount() {
        System.out.println("Собак: " + dogCount);
    }
}