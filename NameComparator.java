import java.util.Comparator;

/**
 * Comparator for comparing two students by their names.
 */
public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}
