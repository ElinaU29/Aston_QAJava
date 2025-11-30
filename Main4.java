public class Main4 {
    public static void main(String[] args) {

        Cat catBarsik = new Cat("Барсик");
        catBarsik.swim(100);
        catBarsik.run(500);
        catBarsik.run(199);

        Dog dogSharik = new Dog("Шарик");
        dogSharik.swim(9);
        dogSharik.swim(100);
        dogSharik.run(200);
        dogSharik.run(700);

        Bowl bowlMedium = new Bowl(55);
        bowlMedium.pourFeed(55);
        catBarsik.feed(bowlMedium);
        dogSharik.feed(bowlMedium);

        bowlMedium.pourFeed(5);
        bowlMedium.pourFeed(100);
        dogSharik.feed(bowlMedium);

        Animal humster = new Animal("Бульдозер");

        Animal.showCount();
        Dog.showCount();
        Cat.showCount();

    }
}
