public class Cycle extends BasicLinkedList{
    public static boolean iscycle(){
        Node slow = head, fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        Node slow = head, fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                cycle = true;
                break;
            }
        }

        if (cycle == false){
            return;
        }
        
        slow = head;
        Node prev = null;
        while (slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }

    public static void main(String[] args) {
        BasicLinkedList ll = new BasicLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        tail.next = head;
        ll.addFirst(0);
        System.out.println(iscycle());
        removeCycle();
        printLL();
        System.out.println(tail.data);
    }
}
