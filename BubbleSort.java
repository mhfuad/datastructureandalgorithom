import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,2,6,3,4,8,11,10,9};

        System.out.println(Arrays.toString(arr));
        int length = arr.length - 1;
        for (int i = 0; i <= length -1; i++){
            for (int j = 0; j <= length - 1; j++){
                if ( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            length = length - 1;
        }

        System.out.println(Arrays.toString(arr));
    }
}
