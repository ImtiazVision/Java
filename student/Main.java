package student;
public class Main {

    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile("Salman", "Sal", "Filly", 3.75, 2022);
        StudentProfile profileTwo = new StudentProfile("Max","Roger", "Computer Science", 3.45, 2021);

        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.expectedYearToGraduate);
    }

}

class Main {
  public static void main(String[] args) {
    int studentAge = 15;
    double studentGPA = 3.45;
    char studentFirstInitial = 'I';
    char studentLastInitial = 'A';
    boolean hasPerfectAttendance = true;
    System.out.println(hasPerfectAttendance);
    System.out.println(studentAge);
    System.out.println(studentFirstInitial);
    System.out.println(studentLastInitial);
  }
}