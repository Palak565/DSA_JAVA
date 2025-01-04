import java.util.Stack;

public class NextGreater {
    public static int[] nextGreater(int arr[]){
        int nextgreater[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length-1; i >= 0; i--){
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]){
                st.pop();
            }

            if (st.isEmpty()){
                nextgreater[i] = -1;
            } else {
                nextgreater[i] = arr[st.peek()];
            }
            st.push(i);
        }
        return nextgreater;
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        int res[] = nextGreater(arr);
        for (int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
        }
    }
}
