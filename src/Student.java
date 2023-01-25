import java.util.ArrayList;

public class Student {
    String initials, surname;
    int groupNumber, grades;

    static ArrayList<Student> studentArrayList = new ArrayList<>();

    public Student(int grades, String surname, String initials, int groupNumber) {
        this.grades = grades;
        this.surname = surname;
        this.initials = initials;
        this.groupNumber = groupNumber;
    }

    public static void main(String[] args) {
        studentArrayList.add(new Student(9, "Shpak", "KS", 5));
        studentArrayList.add(new Student(2, "Shpak", "KS", 5));
        studentArrayList.add(new Student(3, "Shpak", "KS", 5));
        studentArrayList.add(new Student(10, "Shpak", "KS", 5));
        studentArrayList.add(new Student(9, "Shpak", "KS", 5));
        returnStudents();
    }
    static void returnStudents(){
        for (Student student :
                studentArrayList) {
            if (student.grades >= 9){
                System.out.println(String.format("surname Of our hero: %s, initials: %s, grade: %s",student.surname,student.initials,student.grades));
            }
        }
    }

}
