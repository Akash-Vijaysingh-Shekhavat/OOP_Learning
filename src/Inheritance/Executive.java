package Inheritance;

import javax.swing.*;

public class Executive extends Employee{
    int Bonus =60;

    Executive(){

    }
    Executive(int salary,int id,int Bonus, String name){
        this.salary = salary;
        this.id = id;
        this.Bonus = Bonus;
        this.name = name;
    }




}
