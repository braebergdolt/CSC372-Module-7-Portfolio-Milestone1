/**
 * Represents a student with a roll number, name, and address.
 */
public class Student {
    private int rollno;
    private String name;
    private String address;

    /**
     * Constructs a new Student object with the given roll number, name, and address.
     *
     * @param rollno  the roll number of the student, must be non-negative.
     * @param name    the name of the student, must not be null or empty.
     * @param address the address of the student, must not be null or empty.
     * @throws IllegalArgumentException if any argument is invalid.
     */
    public Student(int rollno, String name, String address) {
        if (rollno < 0) {
            throw new IllegalArgumentException("Roll number must be non-negative.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name must not be null or empty.");
        }
        if (address == null || address.trim().isEmpty()) {
            throw new IllegalArgumentException("Address must not be null or empty.");
        }
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    /**
     * Returns the roll number of the student.
     *
     * @return the roll number of the student.
     */
    public int getRollno() {
        return rollno;
    }

    /**
     * Returns the name of the student.
     *
     * @return the name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the address of the student.
     *
     * @return the address of the student.
     */
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + name + ", Address: " + address;
    }
}
