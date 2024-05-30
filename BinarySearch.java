public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int res = binary_search(arr, 11);
        if( res == 99){
            System.out.println("Number not found");
        }
        System.out.println(res);
    }

    public static int binary_search(int[] arr, int num){

        int left, right, mid;
        left = 0;
        right = arr.length -1;

        while (left <= right){
            mid = (left + right) / 2;
            if(arr[mid] == num){
                return mid;
            }

            if(arr[mid] < num){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 99;
    }
}
