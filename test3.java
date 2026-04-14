public class test3 {
    public static void main(String[] args) {
        int[] scores = {60, 70};
        addBonus(scores);
        for (int score : scores) {
            System.out.println(score);
        }
    }

    public static void addBonus(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            scores[i] += 5;
        }
    }
}