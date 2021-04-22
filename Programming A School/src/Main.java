public class Main {

    public static void main(String[] args) {

        School school = new School("Windermere Secondary", "604-713-8180", "Vancouver");
        System.out.println(school);

        //add 3 teachers
        school.addTeacher("Jane", "Mee", "Science");
        school.addTeacher("Bane", "Bee", "History");
        school.addTeacher("Cane", "Cee", "Math");

        //add 10 students
        school.addStudent("Anna", "Fong", 11);
        school.addStudent("Banna", "Bong", 9);
        school.addStudent("Canna", "Cong", 9);
        school.addStudent("Dnna", "Dong", 11);
        school.addStudent("Enna", "Eong", 11);
        school.addStudent("Fnna", "Fong", 10);
        school.addStudent("Gnna", "Gong", 10);
        school.addStudent("Hnna", "Hong", 11);
        school.addStudent("Inna", "Iong", 10);
        school.addStudent("Jnna", "Jong", 12);

        //display both lists
        System.out.println("\nTeachers: " + school.showTeachers());
        System.out.println("\nStudents: " + school.showStudents());

        //remove 1 teacher
        school.removeTeacher("Jane", "Mee", "Science");

        //remove 2 students
        school.removeStudent("Dnna", "Dong", 11);
        school.removeStudent("Jnna", "Jong", 12);

        //display both lists
        System.out.println("\nTeachers (new list): " + school.showTeachers());
        System.out.println("\nStudents (new list): " + school.showStudents());

    }

}