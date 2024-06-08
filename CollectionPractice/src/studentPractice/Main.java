package studentPractice;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentGradeAnalyzer analyzer = new StudentGradeAnalyzer();

        // Adding grades for students
        List<Integer> johnGrades = Arrays.asList(90, 85, 88);
        analyzer.addGrades("John", johnGrades);

        List<Integer> aliceGrades = Arrays.asList(80, 95, 75);
        analyzer.addGrades("Alice", aliceGrades);

        // Testing calculateAverageGrade method
        double johnAverage = analyzer.calculateAverageGrade("John");
        System.out.println("Expected average grade for John: 87.7");
        System.out.println("Actual average grade for John: " + johnAverage);

        double aliceAverage = analyzer.calculateAverageGrade("Alice");
        System.out.println("Expected average grade for Alice: 83.3");
        System.out.println("Actual average grade for Alice: " + aliceAverage);

        // Testing getUnionOfGrades method
        List<String> studentNames = Arrays.asList("John", "Alice");
        List<Integer> unionGrades = analyzer.getUnionOfGrades(studentNames);
        System.out.println("Expected union of grades: [90, 85, 88, 80, 95, 75]");
        System.out.println("Actual union of grades: " + unionGrades);

        // Testing removeGrades method
        analyzer.removeGrades("John");
        List<Integer> johnGradesAfterRemoval = analyzer.getUnionOfGrades(Arrays.asList("John"));
        System.out.println("Expected grades for John after removal: []");
        System.out.println("Actual grades for John after removal: " + johnGradesAfterRemoval);
    }
}