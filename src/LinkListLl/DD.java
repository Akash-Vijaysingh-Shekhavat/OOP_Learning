package LinkListLl;

public class DD {

    /**
     * We are creating the node in the double linklist**/
    public  class Node{
        Node next;
        Node prev;
        int val;

        Node(int val){
            this.val = val;

        }
        Node(int val,Node next , Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    Node head;
    public  void insertFirstDDL(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void DisplayDDL(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");


    }

    public void ReverseDDL(){
        Node temp = head;
        Node last = null ;
        while(temp!=null){
            temp = temp.next;
            last = temp;
        }
        last = last.prev;
        while(last !=head){
            System.out.print(last.val + "<->");
            last = last.prev;
        }
        System.out.println("END");



    }

}
