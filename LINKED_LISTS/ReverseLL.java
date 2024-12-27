public class ReverseLL extends BasicLinkedList {
    public static void reverseLL(){
        Node prev = null, curr = head;
        tail = head;
        while (curr != null){
            Node nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
        head = prev;
    }

    public static void main(String[] args) {
        BasicLinkedList ll = new BasicLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        reverseLL();
        printLL();
        System.out.println(head.data);
        System.out.println(tail.data);
        System.out.println(size);
    }
}
