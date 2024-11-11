import java.util.Scanner;
public class Onlineexaminationsystem {
     // Array to store questions
     private static String[] questions = {
        "1. What is the capital of France?\n(a) London\n(b) Berlin\n(c) Paris\n(d) Madrid",
        "2. What is the output of 2 + 2 * 2?\n(a) 6\n(b) 8\n(c) 4\n(d) 10",
        "3. Which language is used for Android development?\n(a) Python\n(b) Java\n(c) C++\n(d) Swift"
    };

    // Array to store correct answers
    private static char[] answers = {'c', 'a', 'b'};

    // Method to conduct the exam
    public static int conductExam() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Enter your answer (a, b, c, d): ");
            char userAnswer = scanner.next().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + answers[i]);
            }
            System.out.println();
        }

        scanner.close();
        return score;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Online Examination System!");
        
        // Conduct exam and calculate score
        int score = conductExam();
        
        // Display results
        System.out.println("Exam finished!");
        System.out.println("Your total score is: " + score + "/" + questions.length);

        if (score >= questions.length / 2) {
            System.out.println("Congratulations, you passed!");
        } else {
            System.out.println("Better luck next time!");
        }
    }
}

