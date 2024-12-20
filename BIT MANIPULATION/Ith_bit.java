public class Ith_bit {
    public static int getIbit(int num, int i){
        int bitMask = 1 << i;
        if ((num & bitMask) == 0){
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIbit(int num, int i){
        int bitMask = 1 << i;
        return num | bitMask;
    }

    public static int clearIbit(int num, int i){
        int bitMask = ~(1 << i);
        return num & bitMask;
    }

    public static int updateIbit(int num, int i, int newbit){
        int clearedIbit = clearIbit(num, i);
        int bitMask = newbit << i;
        return clearedIbit | bitMask;
    }

    public static int clearLastIbits(int num, int i){
        int bitMask = (~0) << i;
        return num & bitMask;
    }

    public static int clearRangeOfbits(int num, int i, int j){
        int mask1 = (~0) << (j+1);
        int mask2 = (1 << i) - 1;
        int bitMask = mask1 | mask2;
        return num & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(getIbit(10, 2)); // 0
        System.out.println(setIbit(10, 2)); // 14 (1110)
        System.out.println(clearIbit(7, 1)); // 5 (101)
        System.out.println(updateIbit(9, 1, 0)); // 9 (1001)
        System.out.println(updateIbit(9, 1, 1)); // 11 (1011)
        System.out.println(clearLastIbits(15, 2)); // 12 (1100)
        System.out.println(clearRangeOfbits(31, 1,3)); // 17 (10001) 11111
    }
}
