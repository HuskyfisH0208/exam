public class test1 {
    public static void main(String[] args) {
        int[] scores = {70, 80, 90};
        
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i]; 
        }

        double average = (double) sum / scores.length;

        System.out.println("平均分數為: " + average);
    }
}