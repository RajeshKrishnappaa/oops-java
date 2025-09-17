package Polymorphism;

class vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}

class car extends vehicle{
    @Override
    void run(){
        System.out.println("car is moving");
    }
}

public class Overriding {
    public static void main(String[] args) {
        vehicle v= new car();
        v.run();
    }
}
