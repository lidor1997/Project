import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Creating sets
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        Set<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        // Testing union
        testUnion(setA, setB);

        // Testing intersection
        testIntersection(setA, setB);

        // Testing difference
        testDifference(setA, setB);

        // Testing symmetric difference
        testSymmetricDifference(setA, setB);
    }

    public static void testUnion(Set<Integer> setA, Set<Integer> setB) {
        SetOperations<Integer> setOps = new SetOperations<>();
        Set<Integer> union = setOps.union(setA, setB);
        Set<Integer> expected = new HashSet<>();
        expected.addAll(setA);
        expected.addAll(setB);

        if (!union.equals(expected)) {
            System.out.println("Test Failed: Union");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + union);
        } else {
            System.out.println("Test Passed: Union");
        }
    }

    public static void testIntersection(Set<Integer> setA, Set<Integer> setB) {
        SetOperations<Integer> setOps = new SetOperations<>();
        Set<Integer> intersection = setOps.intersection(setA, setB);
        Set<Integer> expected = new HashSet<>(setA);
        expected.retainAll(setB);

        if (!intersection.equals(expected)) {
            System.out.println("Test Failed: Intersection");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + intersection);
        } else {
            System.out.println("Test Passed: Intersection");
        }
    }

    public static void testDifference(Set<Integer> setA, Set<Integer> setB) {
        SetOperations<Integer> setOps = new SetOperations<>();
        Set<Integer> difference = setOps.difference(setA, setB);
        Set<Integer> expected = new HashSet<>(setA);
        expected.removeAll(setB);

        if (!difference.equals(expected)) {
            System.out.println("Test Failed: Difference (A - B)");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + difference);
        } else {
            System.out.println("Test Passed: Difference (A - B)");
        }
    }

    public static void testSymmetricDifference(Set<Integer> setA, Set<Integer> setB) {
        SetOperations<Integer> setOps = new SetOperations<>();
        Set<Integer> symmetricDifference = setOps.symmetricDifference(setA, setB);
        Set<Integer> union = setOps.union(setA, setB);
        Set<Integer> intersection = setOps.intersection(setA, setB);
        Set<Integer> expected = new HashSet<>(union);
        expected.removeAll(intersection);

        if (!symmetricDifference.equals(expected)) {
            System.out.println("Test Failed: Symmetric Difference");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + symmetricDifference);
        } else {
            System.out.println("Test Passed: Symmetric Difference");
        }
    }
}