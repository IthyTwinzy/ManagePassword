import java.util.Objects;

public class PasswordStorage {
    private Node head = null;
    private Node tail = head;


    public void add(String p, String u) {
        Node temp = new Node();
        temp.setPassword(p);
        temp.setUsername(u);
        if(head == null){
            head = temp;
        } else{
            temp.setNext(head);
            head = temp;
        }

        System.out.println(temp.getPassword());
        System.out.println(temp.getUsername());

    }

    public Node overwrite(String u) {
        Node walker = head;
        while (walker != null) {
            if(Objects.equals(walker.getUsername(), u)){
                return walker;
            }
            walker = walker.getNext();

        }
        return null;

    }

    public void display() {
        Node walker = head;
        while (walker != null) {
            System.out.print( walker.getPassword() + " ");
            walker = walker.getNext();
        }
        System.out.println();
    }
    public void displayUsername() {
        Node walker = head;
        while (walker != null) {
            System.out.print( walker.getUsername() + " ");
            walker = walker.getNext();
        }
        System.out.println();
    }
    public void displayPassword() {
        Node walker = head;
        while (walker != null) {
            System.out.print( walker.getPassword() + " ");
            walker = walker.getNext();
        }
        System.out.println();
    }




    public String Search(String u) {
        Node walker = head;
        while(walker != null){
            if(Objects.equals(walker.getUsername(), u)){
                //System.out.println(walker.getPassword());
                return walker.getPassword();
                //return walker.getPassword();
            }
            walker = walker.getNext();
        }
        return "error";
    }

///
}


