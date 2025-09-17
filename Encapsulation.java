class Employee{
    private String name; //private data
    private int id;

    public String getName(){//getter
        return name;
    }

    public void setName(String name){//setter
        this.name=name;
    }

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id=id;
    }
}

class Encapsulation{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Rajesh");
        emp.setID(3580);

        System.out.println(emp.getName() + " have employee id : " + emp.getID());
    }
}
