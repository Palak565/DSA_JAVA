import java.util.Stack;

public class ValidParentheses {
    public static boolean isValidParentheses(String str){
        Stack<Character> st = new Stack<>();

        int i = 0;
        while (i < str.length()){
            char ch = str.charAt(i);
            if (ch == '[' || ch == '{' || ch == '('){
                st.push(ch);
            } else {
                if (st.isEmpty()) { // no opening braces in stack
                    return false;
                } else if ((ch == ']' && st.peek() == '[') // braces pair found
                        ||  (ch == '}' && st.peek() == '{')
                        ||  (ch == ')' && st.peek() == '(') ){
                            st.pop();
                } else { // mismatch of braces
                    return false;
                }
            }
            i++;
        }
        
        return st.isEmpty() == true;
    }
    

    public static void main(String[] args) {
        String str1 = "({[]})", str2 = "{}[()]", str3 = "}{";
        System.out.println(isValidParentheses(str1));
        System.out.println(isValidParentheses(str2));
        System.out.println(isValidParentheses(str3));
    }
}
