public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int x = linearSearch(arr, 5);
        System.out.println(x);
    }

    public static int linearSearch(int[] array, int expected){
        int result = 0;
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
            if (array[i] == expected){
                result = i;
            }
        }
        return result;
    }
}
