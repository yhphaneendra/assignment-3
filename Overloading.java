class Parent {
    // Overloaded method
    public void display() {
        System.out.println("Parent's display method");
    }
}

class Child extends Parent {
    // Overriding method
    @Override
    public void display() {
        System.out.println("Child's display method");
    }
    
    // Overloaded method
    public void display(String message) {
        System.out.println("Child's overloaded display method: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        
        // Method overriding
        parent.display(); // Output: Parent's display method
        child.display(); // Output: Child's display method
        
        // Method overloading
        child.display("Hello!"); // Output: Child's overloaded display method: Hello!
    }
}
