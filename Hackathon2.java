import java.util.Scanner;

class Student {
    String studentName;
    int rollNumber;
    double marks;
    String courseName;
    int courseCredits;
     // parametarized constructor
    Student(String studentName, int rollNumber, double marks,
     String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }
    // calculate fee
    double calculateFee () {
    return courseCredits * 1500;
    }
    // eligibility check 
    
    boolean checkEligibility() {
    if (marks >= 50) {
        System.out.println("TRUE");
        return true;
    } else {
        System.out.println("FALSE");
        return false;
    }
}
    // Scholarship calculation
    double calculateScholarship() {
     if (marks >= 85) {
            return 20;
     } else if (marks >= 70) {
            return 10;
     } else {
         return 0;
        }
    }
    // calculate final fee
    double calculateFinalFee() {
    double fee = calculateFee();
    double scholarship = calculateScholarship();
    return fee - ( fee * scholarship / 100);
    }
    // course details formate
    void displayDetails() {
    System.out.println("----Student Course Registration System----");
    System.out.println("Student Name = " + studentName);
    System.out.println("Roll number = " + rollNumber);
    System.out.println("Marks of the student = " + marks);
    System.out.println("Course Name = " + courseName);
    System.out.println("Course Credits = " + courseCredits);
    System.out.println("Registration");
     System.out.println("Total Fee: Rs. " + calculateFee());
     System.out.println("Scholarship: " + calculateScholarship() + "%");
     System.out.println("Final Fee: Rs. " + calculateFinalFee());
  }
}
public class Hackathon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Course Name: ");
        String course = sc.nextLine();
        System.out.print("Enter Course Credits: ");
        int credits = sc.nextInt();
        Student s = new Student(name, roll, marks, course, credits);
        if (s.checkEligibility()) {
            s.displayDetails();
        } else {
            System.out.println("Student is not eligible for course registration");
            System.out.println("Minimum required marks: 50.");
        }
    }
}


