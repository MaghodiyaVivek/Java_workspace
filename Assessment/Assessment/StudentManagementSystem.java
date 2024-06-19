package Assessment;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String contactNumber;
    private String gender;
    private int marks;

    public Student(int id, String firstName, String lastName, String email, String contactNumber, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.contactNumber = contactNumber;
        this.gender = gender;
        this.marks = 0;  // Initializing marks to zero
    }

    // Getters and Setters for the fields
    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String contactNumber) { this.contactNumber = contactNumber; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + firstName + " " + lastName + ", Email: " + email + 
               ", Contact: " + contactNumber + ", Gender: " + gender + ", Marks: " + marks;
    }
}

public class StudentManagementSystem {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            displayMainMenu();
            int choice = getUserInput();
            switch (choice) {
                case 1:
                    displayCounsellorMenu();
                    break;
                case 2:
                    displayFacultyMenu();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMainMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. Counsellor Menu");
        System.out.println("2. Faculty Menu");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void displayCounsellorMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\nCounsellor Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. View All Students");
            System.out.println("4. View Specific Student");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = getUserInput();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    viewAllStudents();
                    break;
                case 4:
                    viewSpecificStudent();
                    break;
                case 5:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayFacultyMenu() {
        boolean back = false;
        while (!back) {
            System.out.println("\nFaculty Menu:");
            System.out.println("1. Add Student Marks");
            System.out.println("2. View Own Students");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");
            int choice = getUserInput();
            switch (choice) {
                case 1:
                    addStudentMarks();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static int getUserInput() {
        int choice = -1;
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        } finally {
            scanner.nextLine();  // Clear the buffer
        }
        return choice;
    }

    private static void addStudent() {
        try {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // Clear the buffer

            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();
            while (!firstName.matches("[A-Za-z]+")) {
                System.out.print("Invalid input. Enter First Name (alphabets only): ");
                firstName = scanner.nextLine();
            }

            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            System.out.print("Enter Contact Number: ");
            String contactNumber = scanner.nextLine();
            while (!contactNumber.matches("\\d+")) {
                System.out.print("Invalid input. Enter Contact Number (digits only): ");
                contactNumber = scanner.nextLine();
            }

            System.out.print("Enter Gender (Male/Female): ");
            String gender = scanner.nextLine();

            Student student = new Student(id, firstName, lastName, email, contactNumber, gender);
            studentList.add(student);
            System.out.println("Student added successfully.");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
            scanner.nextLine();  // Clear the buffer
        }
    }

    private static void removeStudent() {
        System.out.print("Enter Student ID to remove: ");
        int id = getUserInput();
        Iterator<Student> iterator = studentList.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                System.out.print("Are you sure you want to delete this student? (Y/N): ");
                String confirmation = scanner.nextLine();
                if (confirmation.equalsIgnoreCase("Y")) {
                    iterator.remove();
                    System.out.println("Student removed successfully.");
                    found = true;
                    break;
                } else {
                    System.out.println("Student removal canceled.");
                    return;
                }
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    private static void viewAllStudents() {
        System.out.println("\nAll Students:");
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    private static void viewSpecificStudent() {
        System.out.print("Enter Student ID to view: ");
        int id = getUserInput();
        for (Student student : studentList) {
            if (student.getId() == id) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void addStudentMarks() {
        System.out.print("Enter Student ID to add marks: ");
        int id = getUserInput();
        for (Student student : studentList) {
            if (student.getId() == id) {
                System.out.print("Enter marks: ");
                int marks = getUserInput();
                student.setMarks(marks);
                System.out.println("Marks added successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
