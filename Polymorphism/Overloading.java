package Polymorphism;
 class Calculator{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
}

class Overloading{
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(1,1));
        System.out.println(c.add(2.5,2.5));
    }
}


