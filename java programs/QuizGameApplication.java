import java.util.Scanner;

public class QuizGameApplication {

    static String[] questions = new String[20];
    static String[][] options = new String[20][4];
    static char[] correctAnswers = new char[20];
    static int questionCount = 0;

    static String[] usernames = {"admin", "student"};
    static String[] passwords = {"123", "abc"};
    static String[] roles = {"Admin", "Student"};

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

    int choice;

    while (true) {
        System.out.println("\n===== MAIN MENU =====");
        System.out.println("1. Login");
        System.out.println("2. Exit");
        System.out.print("Enter choice: ");
        choice = input.nextInt();
        input.nextLine();

        if (choice == 1) {
            int loginUser = login();
            if (loginUser >= 0) {
                String userRole = roles[loginUser];
                if (userRole.equals("Admin")) {
                    adminMenu();
                } else {
                    studentMenu();
                }
            }
        } else if (choice == 2) {
            System.out.println("Goodbye!");
            break; // exit the loop
        } else {
            System.out.println("Error: Invalid choice! Please enter 1 for Login or 2 for Exit.");
        }
    }
}
    // ---------------- LOGIN ------------------
    public static int login() {
    System.out.print("Enter username (admin/student): ");
    String userName = input.nextLine();

    // Check if username exists
    boolean validUsername = false;
    int i;
    for (i = 0; i < usernames.length; i++) {
        if (userName.equals(usernames[i])) {
            validUsername = true;
            break;
        }
    }

    if (!validUsername) {
        System.out.println("Error: Invalid username! Only 'admin' or 'student' are allowed.");
        return -1; 
    }

    // Ask for password only if username is valid
    System.out.print("Enter password: ");
    String password = input.nextLine();

    if (password.equals(passwords[i])) {
        System.out.println("Logged in as " + roles[i]);
        return i; // return the index of the user
    } else {
        System.out.println("Error: Incorrect password!");
        return -1;
    }
}

    // ---------------- ADMIN MENU ------------------
    public static void adminMenu() {

        int choice;

        do {
            System.out.println("\n===== ADMIN MENU =====");
            System.out.println("1. Add Question");
            System.out.println("2. View Questions");
            System.out.println("3. Update Question");
            System.out.println("4. Search Question");
            System.out.println("5. Logout");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

            case 1:
                addQuestion();
                break;
            case 2:
                viewQuestions();
                break;
            case 3:
                updateQuestion();
                break;
            case 4:
                searchQuestion();
                break;
            case 5:
                System.out.println("Logging out...");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
        while (choice != 5);
    }

    // ---------------- STUDENT MENU ------------------
    public static void studentMenu() {

        int choice;

        do {
            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Start Quiz");
            System.out.println("2. Logout");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
            case 1:
                startQuiz();
                break;

            case 2:
                System.out.println("Logging out...");
                break;

            default:
                System.out.println("Invalid choice! Try again.");
        }

    } while (choice != 2);  
}
public static void addQuestion() { }
    public static void viewQuestions() { }
    public static void updateQuestion() { }
    public static void searchQuestion() { }
    public static void startQuiz() { }
}
