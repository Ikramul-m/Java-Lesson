import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> examScore = new HashMap<String, Integer>();

        examScore.put("Math", 87);
        examScore.put("English", 88);
        examScore.put("Science", 78);
        examScore.put("Computer Science", 88);
        examScore.put("Social Science", 90);

        System.out.println(examScore.toString());
    }
}
