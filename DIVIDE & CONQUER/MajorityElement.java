public class MajorityElement {
    
    // count of num from lo to hi
    public static int count(int arr[],int num, int low, int high){
        int count = 0;
        for (int i = low; i <= high; i++){
            if (arr[i] == num){
                count++;
            }
        }
        return count;
    }

    public static int majorityElement(int arr[], int low, int high){
        if (low == high){ // if subarray has only one ele
            return arr[low]; // the ele will itself be majority
        }

        int mid = (low + high)/2;
        // majority ele from left subarray
        int left = majorityElement(arr, low, mid);
        // majority ele from right subarray
        int right = majorityElement(arr, mid+1, high);

        // left and right majority ele are same
        if (left == right){
            return left;
        }

        // return majority ele from left and right majority
        int leftcount = count(arr, left, low, mid);
        int rightcount = count(arr, right, mid+1, high);
        return (leftcount > rightcount) ? left : right;
    }

    public static void main(String[] args) {
        int arr1[] = {2, 2, 1, 1, 1, 2, 2};
        int arr2[] = {6, 5, 5};
        System.out.println(majorityElement(arr1, 0, arr1.length-1));
        System.out.println(majorityElement(arr2, 0, arr2.length-1));
    }
}
