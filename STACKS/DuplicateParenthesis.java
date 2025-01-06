import java.util.Stack;

public class DuplicateParenthesis{
    public static boolean isDuplicate(String exp){
        Stack<Character> st = new Stack<>();
        int i = 0;
        while (i < exp.length()){
            char ch = exp.charAt(i);
            if (ch == ')'){
                int count = 0;
                while (st.peek() != '('){
                    count++;
                    st.pop();
                }
                st.pop();
                if (count < 1){
                    return true;
                }
            } else {
                st.push(ch);
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(((a+b)*(c)))";
        System.out.println(isDuplicate(str));
    }
}