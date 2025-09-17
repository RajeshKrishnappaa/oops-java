package Abstraction;

public class AbstractClass {
    public static void main(String[] args) {
        Shape s1 = new Circle();  // upcasting
        Shape s2 = new Square();

        s1.draw();   // Drawing a circle
        s2.draw();   // Drawing a square
        s1.info();   // This is a shape.
    }
}

// Abstract class
abstract class Shape {
    abstract void draw();  // abstract method (no body)

    void info() {   // concrete method
        System.out.println("This is a shape.");
    }
}

// Subclass implementing abstract method
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Another subclass
class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

