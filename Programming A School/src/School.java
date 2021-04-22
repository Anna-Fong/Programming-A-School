import java.util.ArrayList;

public class School {

    ArrayList<Teacher> listTeachers = new ArrayList<>();
    ArrayList<Student> listStudents = new ArrayList<>();

    private String schoolName;
    public String schoolNumber;
    public String schoolCity;

    public School(String schoolName, String schoolNumber, String schoolCity) {
        this.schoolName = schoolName;
        this.schoolNumber = schoolNumber ;
        this.schoolCity = schoolCity;
    }

    public void setSchoolName(String SchoolName) {
        schoolName = SchoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void getSchoolNumber(String SchoolNumber) {
        schoolNumber = SchoolNumber;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolCity(String SchoolCity) {
        schoolCity = SchoolCity;
    }

    public String getSchoolCity() {
        return schoolCity;
    }

    public String toString() {
        return ("School Name: " + schoolName + ", Phone Number: " + schoolNumber +
                ", City: " + schoolCity);
    }

    //add teacher
    public void addTeacher(String FirstName, String LastName, String Subject) {
        listTeachers.add(new Teacher(FirstName, LastName, Subject));
    }

    //remove teacher
    public void removeTeacher(String FirstName, String LastName, String Subject) {
        for (int i = 0; i < listTeachers.size(); i++) {
            if (listTeachers.get(i).getFirstname().equals(FirstName) &&
                    listTeachers.get(i).getLastName().equals(LastName) &&
                    listTeachers.get(i).getSubject().equals(Subject)) {
                listTeachers.remove(i);
            }
        }
    }

    //show teachers
    public String showTeachers() {
        String printTeachers = "";
        for (int i = 0; i < listTeachers.size(); i++) {
            printTeachers = (printTeachers +  "\nName: " + listTeachers.get(i).getFirstname() + " " +
                    listTeachers.get(i).getLastName() + ", Subject: " + listTeachers.get(i).getSubject());
        }
        return printTeachers;
    }

    //add student
    public void addStudent(String FirstName, String LastName, int Grade) {
        listStudents.add(new Student(FirstName, LastName, Grade));
    }

    //remove student
    public void removeStudent(String FirstName, String LastName, int Grade) {
        for (int i = 0; i < listStudents.size(); i++) {
            if (listStudents.get(i).getFirstName().equals(FirstName) &&
                    listStudents.get(i).getLastName().equals(LastName) &&
                    listStudents.get(i).getGrade() == Grade) {
                listStudents.remove(i);
            }
        }
    }

    //show students
    public String showStudents() {
        String printStudents = "";
        for (int i = 0; i < listStudents.size(); i++) {
            printStudents = (printStudents + "\nName: " + listStudents.get(i).getFirstName() + " " +
                    listStudents.get(i).getLastName() + ", Grade: " + listStudents.get(i).getGrade());
        }
        return printStudents;

    }


}


