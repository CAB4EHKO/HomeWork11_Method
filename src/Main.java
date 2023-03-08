public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void showsLeapYearOrNot(int thisYear) {
        if (thisYear % 4 != 0 || thisYear % 100 == 0) {
            System.out.println(thisYear + " год - невисокосный.");
        } else if (thisYear % 4 == 0 && thisYear % 100 != 0) {
            System.out.println(thisYear + " год - високосный.");
        }
    }
    public static void task1() {
        System.out.println("Task 1.");
        int year = 2003;
        showsLeapYearOrNot(year);
    }
}