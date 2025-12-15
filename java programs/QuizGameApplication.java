import java.util.Scanner;

public class QuizGameApplication {

    static String[] questions = new String[20];
    static String[][] options = new String[20][4];
    static char[] correctAnswers = new char[20];
    static int questionCount = 0;

    static Scanner input = new Scanner(System.in);

    // ===================== MAIN =====================
    public static void main(String[] args) {

        loadSampleQuestions();   // preload 20 MCQs

        int choice;

        while (true) {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = input.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter numbers only!");
                input.nextLine();
                continue;
            }

            input.nextLine();

            if (choice == 1) {
                System.out.println("\n--- Select Role ---");
                System.out.println("1. Admin");
                System.out.println("2. Student");
                System.out.print("Enter role: ");

                int role;
                try {
                    role = input.nextInt();
                } catch (Exception e) {
                    System.out.println("Numbers only!");
                    input.nextLine();
                    continue;
                }
                input.nextLine();

                if (role == 1) {
                    if (login() == 0)
                        adminMenu();
                } else if (role == 2) {
                    if (login() == 1)
                        studentMenu();
                } else {
                    System.out.println("Invalid role!");
                }

            } else if (choice == 2) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice!(Enter 1 or 2)");
            }
        }
    }

    // ===================== LOGIN =====================
    public static int login() {

        System.out.print("Enter username (admin/student): ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (username.equals("admin") && password.equals("123")) {
            System.out.println("Logged in as Admin ");
            return 0;
        }
        else if (username.equals("student") && password.equals("abc")) {
            System.out.println("Logged in as Student ");
            return 1;
        }
        else {
            System.out.println("Invalid username!(admin or student)");
            return -1;
        }
    }

    // ===================== ADMIN MENU =====================
    public static void adminMenu() {

        while (true) {
            System.out.println("\n===== ADMIN MENU =====");
            System.out.println("1. Add Question");
            System.out.println("2. View Questions");
            System.out.println("3. Update Question");
            System.out.println("4. Search Question");
            System.out.println("5. Logout");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = input.nextInt();
            } catch (Exception e) {
                System.out.println("Numbers only!");
                input.nextLine();
                continue;
            }
            input.nextLine();

            switch (choice) {
                case 1: addQuestion(); break;
                case 2: viewQuestions(); break;
                case 3: updateQuestion(); break;
                case 4: searchQuestion(); break;
                case 5: return;
                default: System.out.println("Invalid option!");
            }
        }
    }

    // ===================== STUDENT MENU =====================
    public static void studentMenu() {

        while (true) {
            System.out.println("\n===== STUDENT MENU =====");
            System.out.println("1. Start Quiz");
            System.out.println("2. Logout");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = input.nextInt();
            } catch (Exception e) {
                System.out.println("Numbers only!");
                input.nextLine();
                continue;
            }
            input.nextLine();

            if (choice == 1)
                startQuiz();
            else if (choice == 2)
                return;
            else
                System.out.println("Invalid choice!");
        }
    }

    // ===================== ADD QUESTION =====================
    public static void addQuestion() {

        if (questionCount >= 20) {
            System.out.println("Question limit reached!");
            return;
        }

        System.out.print("Enter question: ");
        questions[questionCount] = input.nextLine();

        for (int i = 0; i < 4; i++) {
            System.out.print("Option " + (char)('A' + i) + ": ");
            options[questionCount][i] = input.nextLine();
        }

        System.out.print("Correct answer (A/B/C/D): ");
        correctAnswers[questionCount] = input.nextLine().toUpperCase().charAt(0);

        questionCount++;
        System.out.println("Question added successfully ✔");
    }

    // ===================== VIEW QUESTIONS =====================
    public static void viewQuestions() {

        if (questionCount == 0) {
            System.out.println("No questions available.");
            return;
        }

        for (int i = 0; i < questionCount; i++) {
            System.out.println("\nQ" + (i + 1) + ": " + questions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println((char)('A' + j) + ". " + options[i][j]);
            }
            System.out.println("Correct: " + correctAnswers[i]);
        }
    }

    // ===================== UPDATE QUESTION =====================
    public static void updateQuestion() {

        viewQuestions();
        System.out.print("\nEnter question number to update: ");
        int num = input.nextInt();
        input.nextLine();

        if (num < 1 || num > questionCount) {
            System.out.println("Invalid number!");
            return;
        }

        int i = num - 1;

        System.out.print("New question: ");
        questions[i] = input.nextLine();

        for (int j = 0; j < 4; j++) {
            System.out.print("New option " + (char)('A' + j) + ": ");
            options[i][j] = input.nextLine();
        }

        System.out.print("New correct answer: ");
        correctAnswers[i] = input.nextLine().toUpperCase().charAt(0);

        System.out.println("Question updated ");
    }

    // ===================== SEARCH QUESTION =====================
    public static void searchQuestion() {

        System.out.print("Enter keyword: ");
        String key = input.nextLine().toLowerCase();

        boolean found = false;

        for (int i = 0; i < questionCount; i++) {
            if (questions[i].toLowerCase().contains(key)) {
                System.out.println("\nQ" + (i + 1) + ": " + questions[i]);
                found = true;
            }
        }

        if (!found)
            System.out.println("No matching question found.");
    }

    // ===================== START QUIZ =====================
    public static void startQuiz() {

        int score = 0;

        for (int i = 0; i < questionCount; i++) {
            System.out.println("\nQ" + (i + 1) + ": " + questions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println((char)('A' + j) + ". " + options[i][j]);
            }
            char ans;

            while (true) {
                try {
                    System.out.print("Your answer (A/B/C/D): ");
                    String in = input.nextLine().toUpperCase();

                    if (in.length() != 1)
                    throw new Exception("Invalid length");

                    ans = in.charAt(0);

                    if (ans < 'A' || ans > 'D')
                        throw new Exception("Not A-D");

                    break; // valid input
                } 
                catch (Exception e) {
                    System.out.println(" Invalid input! Only A, B, C, D allowed.");
                }
            }

            if (ans == correctAnswers[i])
                score++;
        }

        System.out.println("\nQuiz Completed ");
        System.out.println("Score: " + score + "/" + questionCount);
        double percentage = (score * 100.0) / questionCount;
        System.out.println("Percentage: " + percentage + "%");
    }

    // ===================== LOAD SAMPLE QUESTIONS =====================
    public static void loadSampleQuestions() {

        String[] q = {
            "Java is a ?", "Capital of Pakistan is?", "Red Planet is?",
            "2 + 2 * 2 = ?", "HTML is used for?", "Founder of Pakistan?",
            "Not a Java keyword?", "CPU stands for?", "Gas for breathing?",
            "Smallest prime number?", "RAM is?", "Android language?",
            "Sun rises from?", "Output device?", "Independence year?",
            "Java comment symbol?", "Water freezes at?", "Not an OS?",
            "Binary base?", 
        };

        String[][] op = {
            {"Programming Language","OS","Browser","Database"},
            {"Karachi","Lahore","Islamabad","Quetta"},
            {"Earth","Mars","Jupiter","Venus"},
            {"6","8","4","10"},
            {"Styling","DB","Structure","Logic"},
            {"Iqbal","Liaquat","Quaid","Sir Syed"},
            {"class","static","include","void"},
            {"Central Processing Unit","CPU","CPC","CP"},
            {"Nitrogen","Oxygen","CO2","Hydrogen"},
            {"0","1","2","3"},
            {"Permanent","Temporary","Secondary","Cache"},
            {"C++","Java","Python","PHP"},
            {"North","South","East","West"},
            {"Keyboard","Mouse","Monitor","Scanner"},
            {"1945","1946","1947","1948"},
            {"//","##","<!-- -->","**"},
            {"0°C","50°C","100°C","-10°C"},
            {"Windows","Linux","Java","Mac"},
            {"2","8","10","16"},
            
        };

        char[] ca = {
            'A','C','B','A','C','C','C','A','B','C',
            'B','B','C','C','C','A','A','C','A'
        };

        for (int i = 0; i < q.length; i++) {
            questions[i] = q[i];
            options[i] = op[i];
            correctAnswers[i] = ca[i];
        }

        questionCount = q.length;
    }
}
