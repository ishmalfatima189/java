import java.util.Scanner;
public class Quiz {
 public static int runQuiz() {
 Scanner input = new Scanner(System.in);
 int score = 0;
 String[] questions = {
 "1. What is a greenhouse gas?\n• 1. Oxygen 2. Nitrogen\n• 3. Carbon dioxide 4. Argon",
 "2. Which group is skeptical of man-made climate change?\n• 1. IPCC 2. NASA\n• 3. Climate
scientists 4. Some economists",
 "3. What does global warming cause?\n• 1. Cooling 2. Rising sea levels\n• 3. Less rainfall 4.
More snow",
 "4. Which film raised awareness?\n 1. The Day After Tomorrow 2. An Inconvenient Truth\n• 3.
Ice Age 4. Planet Earth",
 "5. What year did Al Gore win the Nobel Prize?\n• 1. 2005 2. 2006\n• 3. 2007 4. 2008"
 };
 int[] answers = {3, 4, 2, 2, 3};
 for (int i = 0; i < questions.length; i++) {
 System.out.println(questions[i]);
 System.out.print("Your answer: ");
 int userAnswer = input.nextInt();
 if (userAnswer == answers[i]) {
 score++;
 }
 System.out.println();
 }
 return score;
 }
 public static void showResult(int score) {
 System.out.println("=== Quiz Result ===");
 System.out.println("You got " + score + " out of 5 correct.");
 if (score == 5) {
 System.out.println("Excellent!");
 } else if (score == 4) {
 System.out.println("Very good!");
 } else {
 System.out.println("Time to brush up on your knowledge of global warming.");
 System.out.println("Visit:");
 System.out.println("• NASA Climate Change — https://climate.nasa.gov");
 System.out.println("• Skeptical Science — https://skepticalscience.com");
 System.out.println("• IPCC — https://www.ipcc.ch");
 }
 }
 public static void main(String[] args) {
 int score = runQuiz();
 showResult(score);
 }
}