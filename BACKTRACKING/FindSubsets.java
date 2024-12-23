public class FindSubsets {
    public static void printSubsets(String str, String ans, int i){
        // Base case
        if (i == str.length()){
            System.out.println(ans);
            return;
        }

        // kaam
        // Yes choice
        printSubsets(str, ans + str.charAt(i), i+1);
        // No choice
        printSubsets(str, ans, i+1);
    }


    public static void printSubsets(String str, StringBuilder ans, int i){
        // Base case
        if (i == str.length()){
            System.out.println(ans);
            return;
        }

        // kaam
        // Yes choice
        printSubsets(str, ans.append(str.charAt(i)), i+1);
        // If u use stringbuilder instead of string for ans, delete the curr char becoz stringbuilder is mutable
        ans.deleteCharAt(ans.length() - 1);  

        // No choice
        printSubsets(str, ans, i+1);
    }



    

    public static void main(String[] args) {
        String str = "abc";
        printSubsets(str, "", 0);
        printSubsets(str, new StringBuilder(""), 0);
    }
}
