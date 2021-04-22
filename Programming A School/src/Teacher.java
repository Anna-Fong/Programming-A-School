public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;

    Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    public void setFirstName(String FirstName) {
        firstName = FirstName;
    }
    public String getFirstname() {
        return firstName;
    }

    public void setLastname(String LastName) {
        lastName = LastName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setSubject(String Subject) {
        subject = Subject;
    }
    public String getSubject() {
        return subject;
    }

    public String toString() {
        return ("Name: " + firstName + " " + lastName + ", Subject: " + subject);
    }

}
