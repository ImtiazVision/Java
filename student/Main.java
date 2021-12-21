package student;
public class Main {

    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile("Salman", "Sal", "Filly", 3.75, 2022);
        StudentProfile profileTwo = new StudentProfile("Max","Roger", "Computer Science", 3.45, 2021);

        profileTwo.incrementExpectedGraduationYear();
        System.out.println(profileTwo.expectedYearToGraduate);
    }

}