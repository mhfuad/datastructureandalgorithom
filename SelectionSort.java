import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,9,8,7,6,5,4,3,2};
        int[] result = section(arr);
        Arrays.stream(result).forEach(item -> System.out.print(item+", "));
    }

    public static int[] section(int[] arr){
        for(int i = 0; i <= arr.length -2; i++){
            int smallest = arr[i];
            if(smallest <= arr[i+1]){
                int local = smallest;
                smallest = arr[i+1];
                arr[i+1] = local;
            }
        }
        return arr;
    }
}
