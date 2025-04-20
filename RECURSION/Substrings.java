public class Substrings {
    // We are given a string S, we need to find the count of all contiguous substrings starting and ending with the same character.
    public static int numberOfSubstrings(String str, int i){
        if (i == str.length()){
            return 0;
        }

        char ch = str.charAt(i);
        int count = 0;
        for (int j = i+1; j < str.length(); j++){
            if (str.charAt(j) == ch){
                count++;
            }
        }
        return 1 + count + numberOfSubstrings(str, i+1);
    }

    public static void main(String[] args) {
        String str1 = "abcab";
        System.out.println("Number of contiguous substrings starting and ending with the same character in '" + str1 + "' = " + numberOfSubstrings(str1, 0));
        // Number of contiguous substrings starting and ending with the same character in 'abcab' = 7

        String str2 = "aba";
        System.out.println("Number of contiguous substrings starting and ending with the same character in '" + str2 + "' = " + numberOfSubstrings(str2, 0));
        // Number of contiguous substrings starting and ending with the same character in 'aba' = 4
    }
}
