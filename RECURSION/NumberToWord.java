public class NumberToWord {
    static String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void toWord(int n){
        if (n == 0){
            return;
        }

        toWord(n/10);
        System.out.print(word[n%10] + ' ');
    }

    public static void main(String[] args) {
        toWord(1970);
    }
}
