public class Main {

    public static void initializingTimeInterval() {
        int year = 2004;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void mobileDeviceInitialization() {
        int clientOS = 0;
        int clientDeviceYear = 1445;
        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            if (clientOS == 0 && clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
    }

    public static int calculateDeliveryDays(int distance) {
        if (distance < 20) return 1;
        else if (distance < 60) return 2;
        else if (distance <= 100) return 3;
        else return -1;
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        initializingTimeInterval();
    }
    public static void task2() {
        System.out.println("Задача 2");
        mobileDeviceInitialization();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 1;
        int daysForDelivery = calculateDeliveryDays(deliveryDistance);
        if(daysForDelivery > 0) System.out.println("Потребуется дней: " + daysForDelivery);
        else System.out.println("Доставки нет");
    }
}