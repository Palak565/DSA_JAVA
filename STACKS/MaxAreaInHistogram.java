import java.util.Stack;

public class MaxAreaInHistogram {
    public static int[] nextSmallerRight(int arr[]){
        int nextsmaller[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length-1; i >= 0; i--){
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if (st.isEmpty()){
                nextsmaller[i] = arr.length;
            } else {
                nextsmaller[i] = arr[st.peek()];
            }
            st.push(i);
        }
        return nextsmaller;
    }

    public static int[] nextSmallerLeft(int arr[]){
        int nextsmaller[] = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++){
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if (st.isEmpty()){
                nextsmaller[i] = -1;
            } else {
                nextsmaller[i] = arr[st.peek()];
            }
            st.push(i);
        }
        return nextsmaller;
    }

    public static int maxArea(int[] arr){
        int max = 0, n = arr.length;
        int nsl[] = new int[n];
        int nsr[] = new int[n];

        // next smaller right
        Stack<Integer> st = new Stack<>();
        for (int i = n-1; i >= 0; i--){
            while (!st.empty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if (st.isEmpty()){
                nsr[i] = n;
            } else {
                nsr[i] = st.peek();
            }
            st.push(i);
        }

        st.clear();
        // next smaller left
        for (int i = 0; i < n; i++){
            while (!st.empty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if (st.isEmpty()){
                nsl[i] = -1;
            } else {
                nsl[i] = st.peek();
            }
            st.push(i);
        }

        for (int i = 0; i < n; i++){
            int width = nsr[i]-nsl[i]-1;
            max = Math.max(max, arr[i]*width);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        System.out.println(maxArea(arr));
    }
}
