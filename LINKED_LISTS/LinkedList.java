public class LinkedList{
    public class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    public Node head, tail;
    public int size;

    public void addLast(int data){
        Node newnode = new Node(data);
        size++;

        if (head == null){
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;
    }

    public void printLL(){
        System.out.print("Linked list: ");

        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public Node mergesort(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node rightnode = mid.next;
        mid.next = null;

        Node newleft = mergesort(head);
        Node newright = mergesort(rightnode);
        return merge(newleft, newright);
    }

    private Node merge(Node head1, Node head2){
        Node merged = new Node(-1);
        Node temp = merged;

        while (head1 != null && head2 != null){
            if (head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            
            temp = temp.next;
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        
        return merged.next;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.printLL();
        ll.head = ll.mergesort(ll.head);
        ll.printLL();
    }

}
