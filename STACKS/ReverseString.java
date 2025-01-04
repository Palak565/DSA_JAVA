import java.util.Stack;

public class ReverseString {
    public static String reverseStr(String str){
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder("");

        for (int i = 0; i < str.length(); i++){
            st.push(str.charAt(i));
        }

        while (!st.isEmpty()){
            res.append(st.pop());
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Reverse of string `" + str + "` is: " + reverseStr(str));
    }
}
