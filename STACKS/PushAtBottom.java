import java.util.Stack;
public class PushAtBottom {
    public static void pushAtBottom(Stack<Integer> st, int x){
        if (st.isEmpty()){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        pushAtBottom(st, 4);

        System.out.println();
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
