public class TillingProblem {
    public static int WaysToTile(int n){
        if (n == 0 || n == 1){
            return 1;
        }

        // placing tile vertically
        int vways = WaysToTile(n-1);
        // placing tile horizontally
        int hways = WaysToTile(n-2);

        return vways + hways;
    }

    public static void main(String[] args) {
        System.out.println(WaysToTile(4));
    }
}