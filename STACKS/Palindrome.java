import java.util.Stack;

class BasicLinkedList {
    public class Node {
        int data;
        Node next;
        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newnode = new Node(data);
        size++;
        newnode.next = head;
        
        // don't update head here otherwise if-condition will be unreachable
        if (head == null){
            head = tail = newnode;
            return;
        }

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
        tail = newnode;
    }

    public void addinMiddle(int idx, int data){
        if (idx == 0){
            addFirst(data); // don't do size++ here (it's already written in addFirst())
            return;
        }

        int count = 0;
        Node temp = head;
        while (temp != null && count < idx - 1){
            count++;
            temp = temp.next;
        }

        if (temp == null){
            System.out.println("Node can't be inserted at given index!");
            return;
        }
        Node newnode = new Node(data);
        newnode.next = temp.next;
        temp.next = newnode;
        size++;

        if (newnode.next == null){
            tail = newnode;
        }
    }

    public static int removeFirst(){
        if (size == 0){
            System.out.println("Empty LL...Node can't be deleted!");
            return Integer.MIN_VALUE;
        } else if (size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static int removeLast(){
        if (size == 0){
            System.out.println("Empty LL...Node can't be deleted!");
            return Integer.MIN_VALUE;
        } else if (size == 1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        Node temp = head;
        while (temp.next != tail){
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    

    public static void printLL(){
        System.out.print("Linked list: ");

        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static int searchIterative(int key){
        int idx = 0;
        Node temp = head;
        while (temp != null){
            if (temp.data == key){
                System.out.println("Key " + key + " found at index " + idx);
                return idx;
            }
            idx++;
            temp = temp.next;
        }

        System.out.println("Key " + key + " not found!");
        return -1; 
    }

    public static int searchRecursive(Node head, int key, int idx){
        // base case
        if (head == null){
            return -1;
        }

        if (head.data == key){
            return idx;
        } else {
            return searchRecursive(head.next, key, idx+1);
        }
    }
}


public class Palindrome extends BasicLinkedList{
    public static boolean isPalindrome(Node head){
        Stack<Integer> st = new Stack<>();

        Node slow = head, fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node right = mid.next;
        mid.next = null;

        while (right != null){
            st.push(right.data);
            right = right.next;
        }

        Node left = head;
        while (!st.isEmpty()) {
            if (st.peek() != left.data){
                return false;
            } else {
                st.pop();
                left = left.next;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        BasicLinkedList ll = new BasicLinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        System.out.println(isPalindrome(head));
    }
}
