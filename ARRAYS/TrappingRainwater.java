public class TrappingRainwater{
    public static int trappingRainwaterI(int heights[]){
        int n = heights.length, trappedWater = 0;
        int leftmax[] = new int[n]; // leftmax boundary
        int rightmax[] = new int[n]; // rightmax boundary

        leftmax[0] = heights[0];
        rightmax[n-1] = heights[n-1];

        for (int i = 1; i < n; i++){
            leftmax[i] = Math.max(heights[i], leftmax[i-1]);
        }

        for (int i = n-2; i >= 0; i--){
            rightmax[i] = Math.max(heights[i], rightmax[i+1]);
        }

        for (int i = 0; i < n; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]); 
            // trappedwater = waterlevel - heights[i]
            if (waterlevel - heights[i] > 0){
                trappedWater += waterlevel - heights[i];
            }
        }

        System.out.println("Trapped water = " + trappedWater);
        return trappedWater;
    }

    public static int trappingRainwaterII (int heights[]){
        int l = 0, r = heights.length-1;
        int trappedWater = 0;
        int lmax = heights[l], rmax = heights[r];

        while (l < r){
            if (lmax < rmax){ 
                // Consider smaller height for water level
                // Update lmax
                lmax = Math.max(lmax, heights[++l]);
                trappedWater += lmax - heights[l];
            } else {
                // Consider smaller height for water level
                // Update rmax
                rmax = Math.max(rmax, heights[--r]);
                trappedWater += rmax - heights[r];
            }
        }
        System.out.println("Trapped water = " + trappedWater);
        return trappedWater;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        trappingRainwaterI(arr);
        trappingRainwaterII(arr);
    }
}