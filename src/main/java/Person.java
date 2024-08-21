/**
 * Some class for checking reports
 * */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Unused method to trigger a warning
    public void unusedMethod() {
        String unusedVariable = "This is never used";
    }

    // Potentially buggy code
    public boolean isAdult() {
        return age >= 18;
    }
}
