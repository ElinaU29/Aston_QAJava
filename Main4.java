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

        Cat[] catsArray = new Cat[4];
        catsArray[0] = new Cat("Маркус");
        catsArray[1] = new Cat("Элвис");
        catsArray[2] = new Cat("Мася");
        catsArray[3] = new Cat("Нэся");

        bowlMedium.pourFeed(5);
        bowlMedium.pourFeed(100);

        for (Cat cat : catsArray) {
            cat.feed(bowlMedium);
        }

        Animal humster = new Animal("Бульдозер");

        Animal.showCount();
        Dog.showCount();
        Cat.showCount();

    }
}
