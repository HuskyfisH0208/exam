public class test9 {
    
    // 一樣使用內部類別來避免與其他檔案衝突
    static class Student {
        String name;
        int score;

        Student(String n, int s) {
            name = n;
            score = s;
        }
    }

    public static void main(String[] args) {
        // 建立測試用的學生物件 (Tom, 85分)
        Student tom = new Student("Tom", 85);
        
        // 呼叫更新分數的方法，將分數改為 95
        updateScore(tom, 95);
        
        // 印出結果確認是否更新成功
        System.out.println(tom.name + ": " + tom.score);
    }

    // 這是你作業真正要寫的 method
    public static void updateScore(Student s, int newScore) {
        // 直接將傳入的新分數，覆蓋掉學生原本的分數
        s.score = newScore;
    }
}