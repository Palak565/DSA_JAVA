public class ShortestDist {
    public static double shortestDist(String str){
        int n = str.length();
        int x = 0, y = 0;
        for (int i = 0; i < n; i++){
            if (str.charAt(i) == 'N'){
                y++;
            } else if (str.charAt(i) == 'S'){
                y--;
            } else if (str.charAt(i) == 'E'){
                x++;
            } else if (str.charAt(i) == 'W'){
                x--;
            }
        }
        return Math.sqrt(x*x + y*y);

    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestDist(str));
    }
}
