package day2.pool;

public class Student {
    // Private attributes
    private String name;
    private int age;

    // Public constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public method to display student information
    public void displayInfo() {
        System.out.println("day2.pool.Student Name: " + name);
        System.out.println("day2.pool.Student Age: " + age);
    }

    // Public method to set the student's age (mutator method)
    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
            System.out.println("Age updated successfully.");
        } else {
            System.out.println("Invalid age. Age remains unchanged.");
        }
    }
    public static void main(String[] args) {
        // Creating an object of the day2.pool.Student class
        Student student1 = new Student("Alice", 20);

        // Accessing public methods
        student1.displayInfo();

        // Trying to access private attributes directly (which is not allowed)
        // student1.name; // This will result in a compilation error

        // Using a public method to update the student's age
        student1.setAge(21);
        student1.displayInfo();
    }
}


