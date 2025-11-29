public class DaysInYearTask {
        public static int numberOfDaysInAYear(int year) {
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return 366;
        } else {
            return 365;
        }
    }

    public static void main(String[] args) {
        // Display number of days from 2000 to 2020
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + " has " + numberOfDaysInAYear(year) + " days");
        }
    }
}
