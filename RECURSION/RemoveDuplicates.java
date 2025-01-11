public class RemoveDuplicates {
    public static String removeduplicates(String str){
        StringBuilder ans = new StringBuilder("");
        int count[] = new int[26];

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if (count[ch - 'a'] > 0){
                continue;
            }

            ans.append(ch);
            count[ch - 'a'] ++;
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println("Removing duplicates from 'programming', we get '" + removeduplicates("programming") + "'");
    }
}
