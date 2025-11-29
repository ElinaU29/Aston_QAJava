import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main3 {
    public static void main(String[] args) {

        Product[] productsArray = new Product[5];
        productsArray[0] = new Product(
            "iPhone 15 Pro",
            99900,
            "new",
            LocalDateTime.of(2024, 1, 15, 10, 30),
            "Apple",
            "USA"
        );
        productsArray[1] = new Product(
            "Samsung Galaxy S24",
            89900,
            "new",
            LocalDateTime.of(2024, 2, 10, 14, 15),
            "Samsung",
            "South Korea"
        );
        productsArray[2] = new Product(
            "Google Pixel 8",
            79900,
            "new",
            LocalDateTime.of(2024, 3, 5, 9, 45),
            "Google",
            "USA"
        );
        productsArray[3] = new Product(
            "OnePlus 12",
            69900,
            "new",
            LocalDateTime.of(2024, 4, 1, 12, 20),
            "OnePlus",
            "China"
        );
        productsArray[4] = new Product(
            "Xiaomi 14",
            59900,
            "new",
            LocalDateTime.of(2024, 5, 15, 15, 5),
            "Xiaomi",
            "China"
        );

        for (Product product : productsArray) {
            System.out.println(product.name + " " + product.price + " " + product.status + " " + product.date + " " + product.manufacturer + " " + product.country);
        }

        Park park = new Park(); 
        park.name = "Парк Гагарина";
        park.location = "Челябинск";

        Park.Attractions  ferrisWheel = park.new Attractions("Колесо обозрения", 200, LocalTime.of(11, 0), LocalTime.of(20, 0));
        Park.Attractions  rollerCoaster = park.new Attractions("Американские горки", 200, LocalTime.of(11, 0), LocalTime.of(20, 0));

        System.out.println("Название: " + park.name + ", " + park.location);
        System.out.println(ferrisWheel.name + ", " + rollerCoaster.name);
    }
}