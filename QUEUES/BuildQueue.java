import java.util.LinkedList;
import java.util.Queue;

public class BuildQueue {
    static class QueueB {
        int arr[];
        int size;
        int rear;

        QueueB(int n){
            this.arr = new int[n];
            this.size = n;
            this.rear = -1;
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        public void add(int x){
            if (rear == size){
                System.out.println("Queue is full");
                return;
            } 

            rear++;
            arr[rear] = x;
        }

        public int remove(){
            if (rear == -1){
                System.out.println("Queue is empty");
                return -1;
            }

            int val = arr[0];
            for (int i = 1; i <= rear; i++){
                arr[i-1] = arr[i];
            }
            rear--;
            return val;
        }

        public int peek(){
            if (rear == -1){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[0];
        }
    }

    static class CircularQueue {
        int arr[];
        int size, front, rear;

        CircularQueue(int n){
            this.arr = new int[n];
            this.size = n;
            this.front = -1;
            this.rear = -1;
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        public boolean isFull(){
            return (rear+1)%size == front;
        }

        public void add(int x){
            if (isFull()){
                System.out.println("Queue is full");
                return;
            }

            if (front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = x;
        }

        public int remove(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            int val = arr[front];
            if (front == rear){
                front = rear = -1;
            } else {
                front = (front+1)%size;
            }
            return val;
        }

        public int peep(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }
        
    }

    static class Node {
        int data;
        Node next;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    static class QueueWithLL {
        Node head;
        Node tail;

        QueueWithLL(){
            head = tail = null;
        }

        public boolean isEmpty(){
            return head == null && tail == null;
        }

        public void add(int x){
            Node newnode = new Node(x);
            if (head == null){
                head = tail = newnode;
            }

            tail.next = newnode;
            tail = newnode;
        }

        public int remove(){
            if (head == null){
                System.out.println("Queue is empty");
                return -1;
            }

            int val = head.data;
            if (head == tail){
                tail = null;
            }
            head = head.next;
            return val;
        }

        public int peek(){
            if (head == null){
                System.out.println("Queue is empty");
                return -1;
            }

            return head.data;
        }
    }
    public static void main(String[] args) {

        // QueueB q = new QueueB(5);
        // QueueB q2 = new QueueB(5);
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q2.add(10);
        // System.out.println(q.peek());
        // System.out.println(q.rear);
        // System.out.println(q2.rear);
        // System.out.println(q.remove());
        // System.out.println(q2.remove());
        
        // CircularQueue cq = new CircularQueue(5);
        // cq.add(1);
        // cq.add(2);
        // cq.add(3);
        // cq.add(4);
        // cq.add(5);
        // cq.add(6);
        // System.out.println(cq.arr[cq.front]);
        // System.out.println(cq.arr[cq.rear]);
        // cq.remove();
        // System.out.println(cq.arr[cq.front]);
        // System.out.println(cq.arr[cq.rear]);
        // cq.add(7);
        // System.out.println(cq.arr[cq.front]);
        // System.out.println(cq.arr[cq.rear]);

        // QueueWithLL qll = new QueueWithLL();
        // System.out.println(qll.isEmpty());
        // qll.add(1);
        // qll.add(2);
        // qll.add(3);
        // qll.add(4);
        // System.out.println(qll.peek());
        // qll.remove();
        // System.out.println(qll.tail.data);
        // System.out.println(qll.head.data);
        // qll.add(5);
        // qll.remove();
        // System.out.println(qll.tail.data);
        // System.out.println(qll.head.data);

        Queue<Integer> qll = new LinkedList<>();
        qll.add(10);
        qll.add(20);
        qll.add(30);
        System.out.println("Head of the queue: " + qll.peek()); // Peek at the head
        System.out.println("Removed: " + qll.poll());           // Remove the head
        System.out.println("Queue after removal: " + qll);
        

    }
}
