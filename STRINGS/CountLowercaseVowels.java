public class CountLowercaseVowels {
    public static int countLowercaseVowels(String str){
        int n = str.length(), count = 0;
        for (int i = 0; i < n; i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }
        System.out.println("Lowercase vowels = " + count);
        return count;
    }

    public static void main(String[] args) {
        String str = "Lowercase Vowels";
        countLowercaseVowels(str); // Lowercase vowels = 6
    }
}
