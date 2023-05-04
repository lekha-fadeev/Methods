public class Main {

    public static int customYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
        return year;
    }
    public static int custom() {
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
        return clientOS;
    }
    public static int Distance(int deliveryDistance) {
        if (deliveryDistance < 20) {
        System.out.println("Потребуется дней: 1");
    } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
        System.out.println("Потребуется дней: 2");
    } else {
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }
    }
        return deliveryDistance;
}

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int oneyear = 2004;
        customYear(oneyear);
    }
    public static void task2() {
        System.out.println("Задача 2");
        custom();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 2;
        Distance(deliveryDistance);
    }
}