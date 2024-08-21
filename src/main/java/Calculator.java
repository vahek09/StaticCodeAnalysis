/**
 * Some class for checking reports
 * */
public class Calculator {

    // Indentation issues to trigger Checkstyle warnings
    public int add(int a,int b) {
        return a+b;
    }

    // Long line to trigger Checkstyle warning
    public int subtract(int a, int b) { return a - b; }

    // Method that can potentially trigger PMD and SpotBugs
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!"); // Possible bug
            return 0;
        }
        return a / b;
    }
}
