public class Anagrams {
    public static boolean anagrams (String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        int[] arr1 = new int[26];
        for (int i = 0; i < str1.length(); i++){
            arr1[str1.charAt(i)-'a'] ++;
        }

        for (int i = 0; i < str2.length(); i++){
            arr1[str2.charAt(i)-'a'] --;
        }

        for (int i : arr1){
            if (i != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "race", str2 = "care";
        System.out.println(anagrams(str1, str2));
    }
}
