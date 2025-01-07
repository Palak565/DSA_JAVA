import java.util.Queue;
import java.util.LinkedList;

public class FirstNonRepeatingChar {
    public static void firstNonRepeating(String str){
        Queue<Character> q = new LinkedList<>();
        int count[] = new int[26];
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            count[ch-'a']++;

            while (!q.isEmpty()) {
                char ans = q.peek();
                if (count[ans-'a'] == 1){
                    System.out.print(ans + " ");
                    break;
                } else {
                    q.remove();
                }
            }

            if (q.isEmpty()){
                System.out.print(-1 + " ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        firstNonRepeating(str);
    }
}
