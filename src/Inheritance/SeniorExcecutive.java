package Inheritance;

public class SeniorExcecutive extends Executive{
    int stocks = 5;

    SeniorExcecutive(){
    }
    SeniorExcecutive(int stocks){
        super();
        this.stocks = stocks;
    }
    SeniorExcecutive(SeniorExcecutive old){
        this.stocks = old.stocks;
    }


}
