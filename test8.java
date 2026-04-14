public class test8 {
    
    // 將 Student 寫在 Problem08 裡面（加上 static 變成靜態內部類別）
    // 這樣就不會跟第 4 題、第 5 題的 Student 衝突了！
    static class Student {
        String name;
        int score;

        Student(String n, int s) {
            name = n;
            score = s;
        }
    }

    public static void main(String[] args) {
        // 1. 建立物件陣列，長度為 3
        Student[] students = new Student[3];

        // 2. 初始化每個學生物件
        students[0] = new Student("Tom", 85);
        students[1] = new Student("Mary", 90);
        students[2] = new Student("John", 78);

        // 3. 使用迴圈印出所有學生的資訊
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + ": " + students[i].score);
        }
    }
}