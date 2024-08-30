/**
 * Some class for checking reports
 * */
public class Calculator {

    // Indentation issues to trigger Checkstyle warnings
    public int add(int a, int b) {
        return a + b;
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

    // Introduced issues for PMD detection
    private int multiply(int a, int b) {
        return a * b; // This method is never used, should trigger PMD's unused method warning
    }

    private int unusedVariableMethod() {
        int unusedVariable = 42; // PMD should detect this as an unused variable
        return 1;
    }

    // Duplicated method to trigger PMD's code duplication warning
    public int multiplyAgain(int a, int b) {
        return a * b; // Duplicate code as in multiply() method
    }

    // Method with poor error handling to trigger PMD warning
    public int divideWithWarning(int a, int b) {
        if (b == 0) {
            System.out.println("Warning: Division by zero"); // Poor practice
        }
        return a / b; // Will throw ArithmeticException if b is 0
    }
}
