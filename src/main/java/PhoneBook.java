package src.main.java;
import java.util.ArrayList;

public class PhoneBook {
    static ArrayList<Contact> phoneBook = new ArrayList<>();

    static void add(String name, String phone) {
        phoneBook.add( new Contact(name, phone));
    }

    static void get(String name) {
        for (Contact contact : phoneBook) {
            if (contact.name.equals(name)) {
                System.out.printf("\n Фамилия: %s:", contact.name);
                System.out.printf("\n Тел. номер: %s", contact.phone);
            }
        }
    }
}
