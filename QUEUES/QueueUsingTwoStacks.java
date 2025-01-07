import java.util.Stack;

public class QueueUsingTwoStacks {
    static class QueueWithStacks {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        public void add(int x){
            if (s1.isEmpty()){
                s1.push(x);
                return;
            }

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(x);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public int remove(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.pop();
        }

        public int peek(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.peek();
        }
    }

    public static void main(String[] args) {
        QueueWithStacks qst = new QueueWithStacks();
        qst.add(1);
        qst.add(2);
        qst.add(3);
        qst.add(4);
        qst.add(5);
        qst.remove();
        System.out.println(qst.peek());
        qst.remove();
        System.out.println(qst.peek());
    }
}
