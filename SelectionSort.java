import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,6,3,4};

        System.out.println(Arrays.toString(arr));
        for(int j = 0; j <= arr.length - 1; j++){
            for(int i = j; i <= arr.length -2; i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }




}
