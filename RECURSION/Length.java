public class Length {
    public static int stringLength(String str, int i){
        if (str.charAt(i) == '\0'){
            return i + 1;
        }

        return 1 + stringLength(str, i+1);
    }

    public static void main(String[] args) {
        stringLength("abcde", 0);
    }
}
