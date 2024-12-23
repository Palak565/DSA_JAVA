public class FindPermutations {
    public static void permutations(String str, String ans){
        // base case
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            permutations(newstr, ans + curr);
        }
    }

    public static void permutations(String str, StringBuilder ans){
        // base case
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i+1);
            permutations(newstr, ans.append(curr));
            ans.deleteCharAt(ans.length()-1);
        }
    }

    public static void main(String[] args) {
        permutations("abc", "");
        System.out.println();
        permutations("abc", new StringBuilder(""));
    }
}
