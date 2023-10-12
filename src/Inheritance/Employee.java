package Inheritance;

public class Employee {
    int salary  = 50;
    String name = "Akash";
    int id =3;

    Employee(){

    }
    Employee(int salary,int id ,String name){
        this.salary = salary ;
        this.id = id;
        this.name = name;
    }
    Employee(int id ,String name ){
        this.name = name ;
        this.id = id;
    }

}
