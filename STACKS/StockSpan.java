import java.util.Stack;

public class StockSpan {
    public static int[] getSpan(int stocks[]){
        int span[] = new int[stocks.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < stocks.length; i++){
            while (!st.isEmpty() && stocks[st.peek()] <= stocks[i]){
                st.pop();
            }

            if (st.isEmpty()){
                span[i] = i+1;
            } else {
                span[i] = i-st.peek();
            }
            st.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = getSpan(stocks);

        for (int i = 0; i < span.length; i++){
            System.out.print(span[i] + " ");
        }
    }
}
