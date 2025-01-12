public class FriendsPairing {
    public static int pairFriends(int n){
        if (n == 1 || n == 2){
            return n;
        }

        // single
        int single = pairFriends(n-1);
        // pair
        int pair = (n-1) * pairFriends(n-2);
        return single + pair;
    }

    public static void main(String[] args) {
        System.out.println(pairFriends(4));
    }
}
