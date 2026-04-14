public class test10 {
    public static void main(String[] args) {
        int[] scores = {70, 85, 62, 90, 58};
        
        int min = scores[0];
        
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        
        System.out.println(min);
    }
}