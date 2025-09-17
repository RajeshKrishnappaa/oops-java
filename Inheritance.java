class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{  //Dog inherits Animal class
    void barks(){
        System.out.println("Dog is barking");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); //inherited method
        d.barks();//child method
    }
}
