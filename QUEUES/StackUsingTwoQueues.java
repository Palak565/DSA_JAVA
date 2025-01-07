import java.util.Queue;
import java.util.LinkedList;

public class StackUsingTwoQueues {
    static class StackWithQueues {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int x){
            if (!q1.isEmpty()){
                q1.add(x);
            } else {
                q2.add(x);
            }
        }

        public int pop(){
            if (isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;
            if (!q1.isEmpty()){
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        public int peek(){
            if (isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }

            int top = -1;
            if (!q1.isEmpty()){
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void main(String[] args) {
        StackWithQueues st = new StackWithQueues();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.peek());
        st.pop();
        st.push(6);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
    }
}
