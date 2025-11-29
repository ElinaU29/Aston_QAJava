import java.time.LocalTime;

public class Park {
    String name;
    String location;
    public class Attractions {
        String name;
        int price;
        
        LocalTime gettingOpen;
        LocalTime gettingClose;
        Attractions(String name, int price, LocalTime gettingOpen, LocalTime gettingClose) {
            this.name = name;
            this.price = price;
            this.gettingOpen = gettingOpen;
            this.gettingClose = gettingClose;
        }
    }    
}
