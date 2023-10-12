package Inheritance;

public class IN {
    public static void main(String[] args) {
        Employee em = new Employee();
        SeniorExcecutive se = new SeniorExcecutive();
        Executive e = new Executive();

        System.out.println(em.salary);
    }
}
