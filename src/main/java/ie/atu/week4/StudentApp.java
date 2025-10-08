package ie.atu.week4;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class StudentApp {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<Student>();


        System.out.println("Please enter the number of students");
        int totalStudents = sc.nextInt();
        sc.nextLine();

        while (count < totalStudents)
        {
            System.out.println("Please enter your name: ");
            String name = sc.next();
            System.out.println("Please enter your email: ");
            String email = sc.next();
            System.out.println("Please enter your student ID: ");
            String studentId = sc.next();
            Student student1 = new Student();
            student1.setName(name);
            student1.setEmail(email);
            student1.setStudentId(studentId);
            studentsList.add(student1);
            count++;
        }
        for(Student student : studentsList) {
            System.out.println(student); // "Name: "  +  student.getName() + "Email: " + student.getEmail() + "StudentId: " + student.getStudentId()
        }














    }
}
