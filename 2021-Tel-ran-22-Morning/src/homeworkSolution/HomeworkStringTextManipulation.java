package homeworkSolution;

public class HomeworkStringTextManipulation {
    public static void main(String[] args) {
        bestfriedenString();
    }
    public static void bestfriedenString() {
        String sentence = "Вход разрешён ";
        String firstWord = sentence.substring(0, 5);
        String secondWord = "воспрещён.";
        String twoWord = "осторожно,";
        String sentence2 = twoWord + firstWord + secondWord;


        String title = sentence2.toUpperCase();
        System.out.println(title);
    }
}
