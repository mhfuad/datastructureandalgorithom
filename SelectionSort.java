import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,2,6,3,4};
        System.out.println(Arrays.toString(selectionSearch(arr)));;
    }

    public static int[] selectionSearch(int[] array){
        for(int i = 0; i <= array.length - 2; i++){
            if(array[i] < array[i+1]){
                int[] num = {array[i], array[i+1]};
                int[] swapt = swap(num);
                array[i] = swapt[0];
                array[i+1] = swapt[1];
            }
        }
        return array;
    }

    public static int[] swap(int[] arr){
        arr[0] = arr[0] + arr[1];
        arr[1] = arr[0] - arr[1];
        arr[0] = arr[0] - arr[1];
        System.out.println(arr[0]+ "="+ arr[1]);
        return arr;
    }
}
