import java.time.LocalDateTime;

public class Product {
        String name, manufacturer, country, status;
        int price; 
        LocalDateTime date;

        Product(String name, int price, String status, LocalDateTime date, String manufacturer, String country) {
            this.name = name;
            this.price = price;
            this.status = status;
            this.date = date;
            this.manufacturer = manufacturer;
            this.country = country;
        }    
        public void showInfo() {
            System.out.println("Name: " + this.name + ", Price: " + this.price + ", Status: " + this.status + ", Date: " + this.date + ", Manufacturer: " + this.manufacturer + ", Country: " + this.country);
        }
        
    
 }   

