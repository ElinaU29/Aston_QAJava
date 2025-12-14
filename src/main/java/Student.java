package src.main.java;
public class Student {
    public String name;
    public String group;
    public int course = 1;
    public int[] marks;

    public Student(String name, String group, int[] marks) {
        this.name = name;
        this.group = group;
        this.marks = marks;
    }

    public double calculateAvgMarks() {
        int sum = 0;
        if (marks != null && marks.length != 0) {
            for (int mark : marks) {
                sum += mark;
            }    
            return (double)sum/marks.length;
        } else {
            return 0.0;
        }   
    }
}
