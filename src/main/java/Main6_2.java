package src.main.java;
public class Main6_2 {
    public static void main(String[] args) {

        PhoneBook.add("Иванов", "+79161234567");
        PhoneBook.add("Петров", "+79162345678");
        PhoneBook.add("Сидоров", "+79163456789");
        PhoneBook.add("Козлов", "+79164567890");
        PhoneBook.add("Смирнов", "+79165678901");
        PhoneBook.add("Иванов", "+79166789012");
        PhoneBook.add("Волков", "+79167890123");
        PhoneBook.add("Новиков", "+79168901234");
        PhoneBook.add("Соколов", "+79169012345");
        PhoneBook.add("Иванов", "+79170123456"); 
        PhoneBook.add("Лебедев", "+79171234567");
        PhoneBook.add("Морозов", "+79172345678");
        PhoneBook.add("Федоров", "+79173456789");
        PhoneBook.add("Иванов", "+79174567890"); 
        PhoneBook.add("Орлов", "+79175678901");

        PhoneBook.get("Орлов");
        PhoneBook.get("Морозов");
        PhoneBook.get("Иванов");
    }
}
