import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Initialize all the objects
        FullTimeTeacher fullTimeTeacher1 = new FullTimeTeacher(1, "John", 50000, 5);
        FullTimeTeacher fullTimeTeacher2 = new FullTimeTeacher(2, "Alice", 60000, 7);

        PartTimeTeacher partTimeTeacher1 = new PartTimeTeacher(3, "Bob", 30, 20);
        PartTimeTeacher partTimeTeacher2 = new PartTimeTeacher(4, "Eve", 35, 25);

        Student student1 = new Student(1, "Alice", 20);
        Student student2 = new Student(2, "Bob", 21);
        Student student3 = new Student(3, "Charlie", 22);
        Student student4 = new Student(4, "David", 19);
        Student student5 = new Student(5, "Eve", 23);
        Student student6 = new Student(6, "Frank", 24);

        Class mathClass = new Class(1, "Math101", "Room 101", fullTimeTeacher1);
        mathClass.addStudent(student1);
        mathClass.addStudent(student2);

        Class englishClass = new Class(2, "English101", "Room 102", partTimeTeacher1);
        englishClass.addStudent(student2);
        englishClass.addStudent(student3);

        Class physicsClass = new Class(3, "Physics201", "Room 201", fullTimeTeacher2);
        physicsClass.addStudent(student3);
        physicsClass.addStudent(student4);

        Class historyClass = new Class(4, "History202", "Room 202", partTimeTeacher2);
        historyClass.addStudent(student4);
        historyClass.addStudent(student5);

        //Creating university object using the previous objects
        University espol = new University();
        espol.addClass(mathClass);
        espol.addClass(englishClass);
        espol.addClass(physicsClass);
        espol.addClass(historyClass);

        espol.addStudent(student1);
        espol.addStudent(student2);
        espol.addStudent(student3);
        espol.addStudent(student4);
        espol.addStudent(student5);
        espol.addStudent(student6);

        espol.addTeacher(fullTimeTeacher1);
        espol.addTeacher(fullTimeTeacher2);
        espol.addTeacher(partTimeTeacher1);
        espol.addTeacher(partTimeTeacher2);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("University Management System Menu:");
            System.out.println("a. Print all professors with their data");
            System.out.println("b. Print all classes");
            System.out.println("c. Create a new student and add to an existing class");
            System.out.println("d. Create a new class with a teacher and students");
            System.out.println("e. List classes for a given student (search by ID)");
            System.out.println("f. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "a":
                    espol.printAllTeachers();
                    break;
                case "b":
                    espol.printAllClasses();
                    break;
                case "c":

                    break;
                case "d":

                    break;
                case "e":

                    break;
                case "f":
                    exit = true;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}