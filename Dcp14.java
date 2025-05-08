import java.util.Scanner;

public class Dcp14 {
    public static void main(String[] args) {
        QuestionService service = new QuestionService();
        service.playquiz();
        service.printscore();
    }
}




class Question {
    private int id;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String answer;

    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer) {
        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.answer = answer;
    }

    public int getId() { return id; }
    public String getQuestion() { return question; }
    public String getOpt1() { return opt1; }
    public String getOpt2() { return opt2; }
    public String getOpt3() { return opt3; }
    public String getOpt4() { return opt4; }
    public String getAnswer() { return answer; }
}









class QuestionService {
    Question[] question = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        question[0] = new Question(1, "Which keyword is used to inherit a class?", "this", "super", "extends", "implements", "extends");
        question[1] = new Question(2, "What size of int variable?", "2 bytes", "4 bytes", "8 bytes", "1 byte", "4 bytes");
        question[2] = new Question(3, "Which keyword is used to create a new object?", "object", "make", "create", "new", "new");
        question[3] = new Question(4, "Which keyword is used to stop a loop?", "exit", "stop", "break", "quit", "break");
        question[4] = new Question(5, "Which is non-primitive data type?", "int", "float", "String", "char", "String");
    }

    public void playquiz() {
        Scanner sc = new Scanner(System.in);
        int i = 0;

        for (Question q : question) {
            System.out.println("Question no. :" + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("A. " + q.getOpt1());
            System.out.println("B. " + q.getOpt2());
            System.out.println("C. " + q.getOpt3());
            System.out.println("D. " + q.getOpt4());
            System.out.print("Enter your choice (A/B/C/D): ");
            String choice = sc.nextLine().toUpperCase();

            String[] options = { q.getOpt1(), q.getOpt2(), q.getOpt3(), q.getOpt4() };
            int index = choice.charAt(0) - 'A';

            if (index >= 0 && index < 4) {
                selection[i] = options[index];
            } else {
                System.out.println("Invalid choice. Recorded as empty.");
                selection[i] = "";
            }
            i++;
        }
    }

    public void printscore() {
        int score = 0;
        for (int i = 0; i < question.length; i++) {
            String actualanswer = question[i].getAnswer();
            String userAnswer = selection[i];

            if (actualanswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is: " + score);
    }
}

