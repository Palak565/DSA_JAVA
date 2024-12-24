public class GridWays {
    public static int gridways(int n, int m, int i, int j){
        if (i == n-1 && j == m-1){
            return 1;
        } else if (i == n || j == m){
            return 0;
        }

        return gridways(n, m, i+1, j) + gridways(n, m, i, j+1);
    }

    public static void main(String[] args) {
        System.out.println(gridways(3, 3, 0, 0));
    }
}
