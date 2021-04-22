public class Student {

    private String firstName;
    private String lastName;
    private int grade;
    private static int studentIDGenerator = 0;
    public int studentID;

    Student(String firstName, String lastName, int grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        studentID = studentIDGenerator;
        studentIDGenerator++;
        this.studentID = studentIDGenerator;
    }

    public void setFirstName(String FirstName) {
        firstName = FirstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String LastName) {
        lastName = LastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setGrade(int Grade) {
        grade = Grade;
    }
    public int getGrade() {
        return grade;
    }

    public String toString() {
        return ("ID: " + studentID + ", Name: " + firstName + " " + lastName + ", Grade: " + grade);
    }

}


