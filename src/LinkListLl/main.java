package LinkListLl;

public class main {
    public static void main(String[] args) {
        DD dl = new DD();
        dl.insertFirstDDL(1);
        dl.insertFirstDDL(2);
        dl.insertFirstDDL(3);
        dl.insertFirstDDL(4);

        dl.DisplayDDL();
        System.out.println("Reverse the LL");
        dl.ReverseDDL();

    }
}
