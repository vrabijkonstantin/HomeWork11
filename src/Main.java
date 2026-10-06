public class Main {

    // Метод для разделения задач:

    public static void taskSeparrator(int task) {
        System.out.println("Задача № " + task);
    }

    // Метод для задачи № 1:

    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год — високосный");
        } else {
            System.out.println(year + " год — невисокосный");
        }

        System.out.println();
    }

    // Метод для задачи № 2

    public static void checkOsDeviceCurrentYear(int clientOs, int clientDeviceYear) {
        if (clientOs == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Ошибка скачивания");
        }
        System.out.println();
    }

    // Метод для задачи № 3

    public static int deliveryTimeCard(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 0;
        } else if (deliveryDistance <= 60) {
            return 1;
        } else if (deliveryDistance <= 100) {
            return 2;
        } else {
            return 3;
        }

    }

    public static void main(String[] args) {

        taskSeparrator(1);
        int year = 2039;
        checkLeapYear(year);

        taskSeparrator(2);
        int clientOs = 1;
        int clientDeviceYear = 2014;
        checkOsDeviceCurrentYear(clientOs, clientDeviceYear);

        taskSeparrator(3);
        int deliveryDistance = 9999999;
        int deliveryTime = deliveryTimeCard(deliveryDistance);
        if (deliveryTime == 3) {
            System.out.println("Доставка на данное расстояние невозможна");
        } else {
            System.out.println("Потребуется " + deliveryTime + " дня для доставки карты на дом");
        }
    }
}