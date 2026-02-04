public class Node {
    private String password;
    private Node next;
    private String username;







    public void setPassword(String password) {
        this.password = password;

    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public String getUsername() {
        return username;
    }
    public Node getNext() {
        return next;
    }

    public String getPassword() {
        return password;
    }



}
