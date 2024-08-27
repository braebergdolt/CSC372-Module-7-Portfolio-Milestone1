import java.util.Comparator;

/**
 * Comparator for comparing two students by their roll numbers.
 */
public class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollno(), s2.getRollno());
    }
}
