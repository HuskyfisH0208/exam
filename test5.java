class Student {
    String name;
    int score;
}

public class test5 {
    public static void main(String[] args) {
        Student tom = new Student();
        tom.name = "Tom";
        tom.score = 55;
        
        curve(tom);
        
        System.out.println(tom.name + ": " + tom.score);
    }

    public static void curve(Student s) {
        if (s.score < 60) {
            s.score += 10;
        }
    }
}