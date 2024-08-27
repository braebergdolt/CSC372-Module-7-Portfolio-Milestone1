import java.util.ArrayList;

/**
 * Demonstrates sorting a list of students by name and roll number.
 */
public class StudentSorter {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Add 10 students with real names and addresses to the ArrayList
        students.add(new Student(1, "Emma Johnson", "123 Maple Street, Denver, CO"));
        students.add(new Student(2, "Liam Brown", "456 Oak Avenue, Boulder, CO"));
        students.add(new Student(3, "Olivia Williams", "789 Pine Road, Fort Collins, CO"));
        students.add(new Student(4, "Noah Jones", "101 Birch Lane, Colorado Springs, CO"));
        students.add(new Student(5, "Ava Garcia", "202 Cedar Court, Aurora, CO"));
        students.add(new Student(6, "Elijah Miller", "303 Aspen Drive, Lakewood, CO"));
        students.add(new Student(7, "Sophia Davis", "404 Spruce Terrace, Arvada, CO"));
        students.add(new Student(8, "James Martinez", "505 Redwood Circle, Thornton, CO"));
        students.add(new Student(9, "Isabella Hernandez", "606 Sequoia Square, Westminster, CO"));
        students.add(new Student(10, "Benjamin Lopez", "707 Cypress Crescent, Littleton, CO"));

        // Sort by name
        SelectionSorter.selectionSort(students, new NameComparator());
        System.out.println("Sorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by roll number
        SelectionSorter.selectionSort(students, new RollNoComparator());
        System.out.println("\nSorted by roll number:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}


