package src.main.java;
import java.util.ArrayList;

public class Main6_1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        
        // Группа А - 5 студентов
        students.add(new Student("Иван", "Группа А", new int[]{0, 0, 0, 0, 0})); // среднее = 0
        students.add(new Student("Мария", "Группа А", new int[]{1, 2, 2, 1, 2})); // среднее = 1.6
        students.add(new Student("Петр", "Группа А", new int[]{2, 2, 2, 2, 2})); // среднее = 2.0
        students.add(new Student("Анна", "Группа А", new int[]{3, 3, 3, 3, 3})); // среднее = 3.0
        students.add(new Student("Дмитрий", "Группа А", new int[]{4, 4, 4, 4, 4})); // среднее = 4.0
        
        // Группа Б - 5 студентов
        students.add(new Student("Елена", "Группа Б", new int[]{0, 0, 0, 0, 0})); // среднее = 0
        students.add(new Student("Сергей", "Группа Б", new int[]{1, 1, 2, 1, 1})); // среднее = 1.2
        students.add(new Student("Ольга", "Группа Б", new int[]{2, 2, 1, 2, 2})); // среднее = 1.8
        students.add(new Student("Александр", "Группа Б", new int[]{3, 4, 3, 3, 3})); // среднее = 3.2
        students.add(new Student("Наталья", "Группа Б", new int[]{5, 5, 5, 5, 5})); // среднее = 5.0
        
        // Группа В - 5 студентов
        students.add(new Student("Михаил", "Группа В", new int[]{0, 0, 0, 0, 0})); // среднее = 0
        students.add(new Student("Татьяна", "Группа В", new int[]{1, 2, 1, 2, 1})); // среднее = 1.4
        students.add(new Student("Андрей", "Группа В", new int[]{2, 1, 2, 2, 2})); // среднее = 1.8
        students.add(new Student("Екатерина", "Группа В", new int[]{3, 3, 4, 3, 3})); // среднее = 3.2
        students.add(new Student("Игорь", "Группа В", new int[]{4, 5, 4, 5, 4})); // среднее = 4.4
        
        StudentService.prettyPrintStudents(students);

        StudentService.promote(students);
        StudentService.prettyPrintStudents(students);

        StudentService.disqualifyStudents(students);
        StudentService.prettyPrintStudents(students);

        StudentService.printStudents(students, 1);
        StudentService.printStudents(students, 2);
    }
}
