public class DoublyLL {
    public class Node{
        int data;
        Node prev, next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public Node head, tail;
    public int size;

    public void addFirst(int data){
        Node newnode = new Node(data);
        size++;

        if (head == null){
            head = tail = newnode;
            return;
        }

        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public void addLast(int data){
        Node newnode = new Node(data);
        size++;

        if (head == null){
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
    }

    public int removeFirst(){
        if (head == null){
            System.out.println("Node can't be deleted!");
            return Integer.MIN_VALUE;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        if (head == null){
            tail = null;
        }
        System.out.println("Deleted val: " + val);
        size--;
        return val;
    }

    public int removeLast(){
        if (head == null){
            System.out.println("Node can't be deleted!");
            return Integer.MIN_VALUE;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        if (tail == null){
            head = null;
        }
        size--;
        System.out.println("Deleted val: " + val);
        return val;
    }

    public Node reverseDLL(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node prev = null, curr = head;
        while (curr != null){
            Node nextnode = curr.next;
            curr.next = prev;
            curr.prev = nextnode;
            prev = curr;
            curr = nextnode;
        }
        head = prev;
        return head;
    }

    public void printDLL(Node head){
        System.out.print("Doubly Linked List:");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.printDLL(dll.head);
        dll.removeFirst();
        dll.printDLL(dll.head);
        dll.removeLast();
        dll.printDLL(dll.head);
        System.out.println(dll.size);
        dll.head = dll.reverseDLL(dll.head);
        dll.printDLL(dll.head);
    }
}
