public class StringCompression {
    public static void compressString(String str){
        StringBuilder newstr = new StringBuilder();
        for (int i = 0; i < str.length()-1; i++){
            int count = 1;
            newstr.append(str.charAt(i));
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            if (count > 1){
                newstr.append(count);
            }
        }
        System.out.println(newstr);
    }

    public static void main(String[] args) {
        String str = "aabcddddd";
        compressString(str); // a2bcd5
    }
}
