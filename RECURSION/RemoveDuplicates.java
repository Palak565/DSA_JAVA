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

    public static void removeduplicatesII(String str, int idx, StringBuilder sb, boolean[] map){
        if (idx == str.length()){
            System.out.println(sb);
            return;
        }

        char ch = str.charAt(idx);
        if (!map[ch-'a']){
            sb.append(ch);
            map[ch-'a'] = true;
        }
        removeduplicatesII(str, idx+1, sb, map);

    }

    public static void main(String[] args) {
        boolean map[] = new boolean[26];
        System.out.println("Removing duplicates from 'programming', we get '" + removeduplicates("programming") + "'");
        removeduplicatesII("programming", 0, new StringBuilder(), map);
    }
}
