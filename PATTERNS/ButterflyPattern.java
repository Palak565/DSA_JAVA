public class ButterflyPattern {
    public static void drawButterfly(int n){
        for (int i = 1; i <= n; i++){

            //Stars
            for (int j = 1; j <= i; j++){
                System.out.print('*');
            }

            //Spaces
            for (int k = 1; k <= 2*(n-i); k++){
                System.out.print(' ');
            }

            // Stars
            for (int j = 1; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--){

            //Stars
            for (int j = 1; j <= i; j++){
                System.out.print('*');
            }

            //Spaces
            for (int k = 1; k <= 2*(n-i); k++){
                System.out.print(' ');
            }

            // Stars
            for (int j = 1; j <= i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        int n = 4;
        drawButterfly(n);
    }
}
