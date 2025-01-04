import java.util.Stack;

public class ReverseStack extends PushAtBottom {
    public static void revStack(Stack<Integer> st){
        if (st.isEmpty()){
            return;
        }

        int top = st.pop();
        revStack(st);
        pushAtBottom(st, top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        revStack(st);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
