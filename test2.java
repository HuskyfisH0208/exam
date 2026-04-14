public class test2 {
    public static void main(String[] args) {
      
        int[] testArray = {3, 1, 9, 5, 2}; 
        System.out.println(findMax(testArray)); 
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

