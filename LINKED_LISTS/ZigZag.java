public class ZigZag extends BasicLinkedList{
    public static Node zigzag(){
        if (head == null || head.next == null){
            return head;
        }
        Node slow = head, fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        
        Node prev = null, curr = mid.next;
        mid.next = null;
        while (curr != null) {
            Node nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }


        Node head2 = prev;
        Node temp1 = head, temp2 = head2;
        while (temp2 != null){
            Node next1 = temp1.next;
            Node next2 = temp2.next;

            temp1.next = temp2;
            temp2.next = next1;

            temp1 = next1;
            temp2 = next2;
        }

        tail = mid;
        if (mid.next != null){
            tail = head2;
        }
        return head;
    }

    public static void main(String[] args) {
        BasicLinkedList ll = new BasicLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        printLL();
        zigzag();
        printLL();
    }
}
