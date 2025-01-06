public class BuildQueue {
    static class Queue {
        int arr[];
        int size;
        int rear;

        Queue(int n){
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

    public static void main(String[] args) {

        // Queue q = new Queue(5);
        // Queue q2 = new Queue(5);
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
        
        CircularQueue cq = new CircularQueue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        cq.add(6);
        System.out.println(cq.arr[cq.front]);
        System.out.println(cq.arr[cq.rear]);
        cq.remove();
        System.out.println(cq.arr[cq.front]);
        System.out.println(cq.arr[cq.rear]);
        cq.add(7);
        System.out.println(cq.arr[cq.front]);
        System.out.println(cq.arr[cq.rear]);

    }
}
