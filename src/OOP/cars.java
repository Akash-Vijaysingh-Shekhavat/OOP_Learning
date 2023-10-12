package OOP;

public class cars {
//    Data  = storing variable
    int  carSeat;
    String carName;
    String carEngine;
    String  carColor;
// Behaviour of the class
    public void Design(){
        System.out.println("Preparing the car");

    }

//    Constructor

    public cars(){
        System.out.println("Non paraterized constructor");
    }
    public cars(int n){
        System.out.println("Parameterized constructor");
    }

//

}
