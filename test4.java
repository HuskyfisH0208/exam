class Student {
    String name;
    int score;
}

public class test4 {
    public static void main(String[] args) {
        Student tom = new Student();
        tom.name = "Tom";
        tom.score = 85;
        
        System.out.println(tom.name + ": " + tom.score);
    }
}