import java.util.ArrayList;
import java.util.Comparator;

/**
 * Provides a method to perform selection sort on an ArrayList of Students.
 */
public class SelectionSorter {

    /**
     * Sorts the specified list of students using selection sort algorithm and the given comparator.
     *
     * @param students   the list of students to sort.
     * @param comparator the comparator to determine the order of students.
     */
    public static void selectionSort(ArrayList<Student> students, Comparator<Student> comparator) {
        int n = students.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(students.get(j), students.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            Student temp = students.get(minIndex);
            students.set(minIndex, students.get(i));
            students.set(i, temp);
        }
    }
}
