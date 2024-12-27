public class RemoveNthFromEnd extends BasicLinkedList{
    public static int removeNth(int n){
        int count = 1;
        if (n > size){
            System.out.println("Node can't be deleted!");
            return Integer.MIN_VALUE;
        }

        Node temp = head;
        while (temp != null && count < size-n){
            temp = temp.next;
            count++;
        }

        if (temp == null){ // nth node from last doesn't exist
            System.out.println("Node can't be deleted!");
            return Integer.MIN_VALUE;
        }

        if (n == 1){ // 1st node from last to be deleted
            tail = temp;
        }
        if (size == n){ // 1st node from start to be deleted
            int val = head.data;
            head = head.next;
            System.out.println("Node deleted is " + val);
            return val;
        }
        
        // temp is the node just behind delnode
        Node delnode = temp.next;
        int val = delnode.data;
        temp.next = delnode.next;
        System.out.println("Node deleted is " + val);
        return val;
    }

    public static void main(String[] args) {
        BasicLinkedList ll = new BasicLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        removeNth(5);
        printLL();
        System.out.println(head.data);
    }
}
