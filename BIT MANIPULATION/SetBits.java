public class SetBits {
    public static int setBits(int num){
        int count = 0;
        while (num > 0){
            int lsb = num & 1;
            num >>= 1;
            if (lsb == 1){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(setBits(10)); // 2
    }
}
