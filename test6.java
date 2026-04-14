public class test6 {
    public static void main(String[] args) {
        int[] scores = {45, 60, 80, 59, 100};
        int count = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= 60) {
                count++;
            }
        }

        System.out.println("通過學生數: " + count);
    }
}