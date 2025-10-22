package ie.atu.week4;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentApp {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        List<Student> studentsList = new ArrayList<Student>();

        System.out.println("Please enter the number of students: ");
        int totalStudents = input.nextInt();
        input.nextLine();

        while (count < totalStudents) { // Displays the prompt the same amount of times as there are students
            System.out.print("Please enter your name: ");
            String name = input.next();

            System.out.print("Please enter your email: ");
            String email = input.next();

            boolean containsEmail = false;
            for (Student student : studentsList) {
                if (student.getEmail().equals(email)) { // Checks if email is in array list
                    containsEmail = true; // if email is already in arraylist, sets containEmail to true
                    break;
                }
            }

            if (containsEmail) {
                System.out.println("There is already a student with that email"); // Displays a student already has the email
            } else {
                System.out.print("Please enter your student ID: ");
                String studentId = input.next();

                Student student1 = new Student();
                student1.setName(name);
                student1.setEmail(email);
                student1.setStudentId(studentId);
                studentsList.add(student1);
                count++;
            }
        }

        System.out.println("\nStudent List:");
        for (Student student : studentsList) {
            System.out.println("Name: " + student.getName() +
                    ", Email: " + student.getEmail() +
                    ", Student ID: " + student.getStudentId());
        }
    }
}
