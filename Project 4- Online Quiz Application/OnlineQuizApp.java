import java.util.Scanner;

class Question {
    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    char correctAnswer;

    public Question(String question, String optionA, String optionB,
                    String optionC, String optionD, char correctAnswer) {

        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctAnswer = correctAnswer;
    }

    public boolean checkAnswer(char answer) {
        return answer == correctAnswer;
    }
}

public class OnlineQuizApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        Question[] questions = new Question[3];

        questions[0] = new Question(
                "What is the capital of France?",
                "A. Paris",
                "B. London",
                "C. Berlin",
                "D. Madrid",
                'A');

        questions[1] = new Question(
                "Which is the national animal of India?",
                "A. Lion",
                "B. Cheetah",
                "C. Tiger",
                "D. Elephant",
                'C');

        questions[2] = new Question(
                "What does OOP stand for?",
                "A. Object Oriented Programming",
                "B. Online Operating Process",
                "C. Object Operating Program",
                "D. None",
                'A');

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\nQuestion " + (i + 1));
            System.out.println(questions[i].question);
            System.out.println(questions[i].optionA);
            System.out.println(questions[i].optionB);
            System.out.println(questions[i].optionC);
            System.out.println(questions[i].optionD);

            System.out.print("Enter your answer (A/B/C/D): ");
            char answer = sc.next().toUpperCase().charAt(0);

            if (questions[i].checkAnswer(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + questions[i].correctAnswer);
            }
        }

        System.out.println("\nQuiz Finished!");
        System.out.println("Your Score: " + score + "/" + questions.length);

        sc.close();
    }
}