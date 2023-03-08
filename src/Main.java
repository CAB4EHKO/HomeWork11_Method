import java.time.LocalDate;

public class Main {
    public static void showsLeapYearOrNot(int thisYear) {
        if (thisYear % 4 == 0 && (thisYear % 100 != 0 || thisYear % 400 == 0)) {
            System.out.println(thisYear + " год - високосный.");
        } else {
            System.out.println(thisYear + " год - невисокосный.");
        }
    }

    public static void checkDevice(int deviceOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (deviceOS == 0) {
            if (deviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите полную версию приложения для iOS по ссылке.");
            }
        } else if (deviceOS == 1) {
            if (deviceYear < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите полную версию приложения для Android по ссылке.");
            }
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
    }


    public static void task1() {
        System.out.println("Task 1.");
        showsLeapYearOrNot(1900);
    }

    public static void task2() {
        System.out.println("Task 2.");
        int deviceOS = 0;
        int deviceYeaOfIssue = 2023;
        checkDevice(deviceOS, deviceYeaOfIssue);
    }
}
