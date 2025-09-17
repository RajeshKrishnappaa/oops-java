package Abstraction;

public class Interface {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();  // Dog barks
        a1.eat();    // Dog eats bones

        a2.sound();  // Cat meows
        a2.eat();    // Cat drinks milk
    }
}

// Interface
interface Animal {
    void sound();   // abstract method
    void eat();
}

// Class implements interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats bones");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }

    public void eat() {
        System.out.println("Cat drinks milk");
    }
}
