package src.main.java;
import java.util.ArrayList;

public class StudentService {
    
    static void disqualifyStudents(ArrayList<Student> arrayStudent) {
        arrayStudent.removeIf(student -> student.calculateAvgMarks() < 3);
    }
    
    static void promote(ArrayList<Student> arrayStudent) {
        for (Student student : arrayStudent) {
            if (student.calculateAvgMarks() >= 3) {
                student.course += 1;
            }
        }
    }
    
    static void printStudents(ArrayList<Student> arrayStudent, int course) {

        ArrayList<Student> arrayPrintStudents = new ArrayList<Student>();

        for (Student student : arrayStudent) {
            if (student.course == course) {
                arrayPrintStudents.add(student);
            }
        }
        if (arrayPrintStudents.isEmpty() == false) {
            prettyPrintStudents(arrayPrintStudents);
        } else {
            System.out.println("Студентов данного курса нет");
        }
    }

    static void prettyPrintStudents(ArrayList<Student> arrayStudent) {
        System.out.println("Всего студентов: " + arrayStudent.size());
        System.out.println("\nИнформация о студентах:");
        for (Student student : arrayStudent) {
            System.out.printf("%s (%s) - Курс: %d, Средний балл: %.2f%n", 
                student.name, student.group, student.course, student.calculateAvgMarks());
        }
    }
}
