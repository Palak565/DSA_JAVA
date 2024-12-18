public class ToUppercase {
    public static StringBuilder toUppercase(String str){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if (i == 0 || str.charAt(i-1) == ' '){
                ans.append(Character.toUpperCase(str.charAt(i)));
            } else {
                ans.append(str.charAt(i));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "hi i am palak";
        System.out.println(toUppercase(str)); // Hi I Am Palak
    }
}
