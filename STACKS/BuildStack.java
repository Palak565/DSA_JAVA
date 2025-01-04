import java.util.Stack;
import java.util.ArrayList;
import java.util.LinkedList;

class StackWithLinkedList {
    private LinkedList<Integer> stack = new LinkedList<Integer>();
    class Node {
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public boolean isEmpty(){
        return head == null;
    }

    public void push(int x){
        Node newnode = new Node(x);
        newnode.next = head;
        head = newnode;
    }

    public int pop(){
        if (head == null){
            return -1;
        }
        
        int val = head.data;
        head = head.next;
        return val;
    }

    public int peek(){
        if (head == null){
            return -1;
        }
        
        return head.data;
    }
    
}
// static is used for showing independence of instances, i.e. shared resource among all instances of a class
class StackWithArrayList { 
    private ArrayList<Integer> stack = new ArrayList<>(); // private becoz each instance is associated with different stack

    public boolean isEmpty(){ 
        return stack.size() == 0;
    }
    
    public void push(int x){
        stack.add(x);
    }

    public int pop(){
        if (stack.size() == 0){
            return -1;
        }

        return stack.remove(stack.size()-1);
    }

    public int peek(){
        if (stack.size() == 0){
            return -1;
        }

        return stack.get(stack.size()-1);
    }
}
public class BuildStack {
    
    public static void main(String[] args) {
        // StackWithArrayList stack1 = new StackWithArrayList();
        // StackWithArrayList stack2 = new StackWithArrayList();
        // stack1.push(1);
        // stack1.push(2);
        // stack2.push(3);
        // System.out.println(stack1.peek());
        // System.out.println(stack2.peek());
        // System.out.println(stack1.isEmpty());
        // System.out.println(stack2.pop());
        // System.out.println(stack2.peek());
        // System.out.println(stack2.isEmpty());


        // StackWithLinkedList stack1 = new StackWithLinkedList();
        // StackWithLinkedList stack2 = new StackWithLinkedList();
        // stack1.push(1);
        // stack1.push(2);
        // stack2.push(3);
        // stack2.push(4);
        // System.out.println(stack1.peek());
        // System.out.println(stack1.pop());
        // System.out.println(stack1.pop());
        // System.out.println(stack1.isEmpty());
        // System.out.println();
        // System.out.println(stack2.peek());
        // System.out.println(stack2.pop());
        // System.out.println(stack2.pop());
        // System.out.println(stack2.isEmpty());

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        while (!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
    }
}
