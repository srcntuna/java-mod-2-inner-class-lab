import java.util.HashMap;
import java.util.Map;

public class InnerClassRunner {

    public static void main(String[] args) {
        String gradingMethod = "HEAVY"; // <---- simply change this value to change the way grades are curved
        StudentGradeTranslator gradeTranslator = new StudentGradeTranslator(gradingMethod);

        HashMap<String, String> studentGrades = new HashMap<String, String>();
        studentGrades.put("Jamaal", "93");
        studentGrades.put("Jennifer", "77");
        studentGrades.put("Jules", "49");

        // get all the student and their grades using each entry
        System.out.println("List of students and their grades:");
        for (Map.Entry<String, String> studentGrade : studentGrades.entrySet()) {
            System.out.println(studentGrade.getKey() + "'s grade is " +
                    gradeTranslator.getLetterGrade(Integer.parseInt(studentGrade.getValue())));
            System.out.println("Passing grade status: "
                    + gradeTranslator.isPassingGrade(Integer.parseInt(studentGrade.getValue())));
            int neededPoints = gradeTranslator.howManyForNextLetterGrade(Integer.parseInt(studentGrade.getValue()));
            if (neededPoints != 0) {
                System.out.println(neededPoints + " more point(s) needed for next letter grade.");
            }
        }

    }
}