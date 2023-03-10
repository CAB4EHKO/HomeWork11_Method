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

    public static int deliveryDays(int distance) {
        int d = 0;
        if (distance <= 20) {
            d = 1;
        } else if (distance > 20 && distance <= 60) {
            d = 2;
        } else if (distance > 60 && distance <= 100) {
            d = 4;
        } else {
            d  = 0;
        }

        return d;
    }

    public static void showDayOfDelivery(int daysOfDelivery) {
        if (daysOfDelivery == 1) {
            System.out.println("Для доставки карты потребуется " + daysOfDelivery + " день.");
        } else if (daysOfDelivery > 1) {
            System.out.println("Для доставки карты потребуется " + daysOfDelivery + " дня.");
        } else if (daysOfDelivery == 0) {
            System.out.println("Доставки нет.");
        }
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }


    public static void task1() {
        System.out.println("Task 1.");
        int year = 1900;
        showsLeapYearOrNot(year);
    }

    public static void task2() {
        System.out.println("Task 2.");
        int deviceOS = 0;
        int deviceYeaOfIssue = 2023;
        checkDevice(deviceOS, deviceYeaOfIssue);
    }

    public static void task3() {
        System.out.println("Task 3.");
        int distance = 75;
        deliveryDays(distance);
        showDayOfDelivery(deliveryDays(distance));
    }
}
