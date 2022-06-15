public class Main {
    public static void camelCase(int leapYears) {
        if (leapYears % 4 == 0 || leapYears % 400 == 0 && leapYears % 100 != 0) {
            System.out.println(leapYears + " год является високосным");
        } else {
            System.out.println(leapYears + " год не является високосным");
        }
    }

    public static void checkingTheDevice(int clientDevice) {
        if (clientDevice <= 0) {
            System.out.println("Установите наше приложение для Айфон");
        } else if (clientDevice <= 1) {
            System.out.println("Установите наше приложение для Андроид");
        }
    }
    public static void checkingTheDeviceYear(int clientDeviceYear) {
        if (clientDeviceYear >= 2015) {
            System.out.println("Ваше приложение будет работать корректно");
        } else if (clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения по ссылке");
        }
    }

    public static void deliveryCard(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance >= 20) {
            days += ((deliveryDistance - 20) / 40);
            if ((deliveryDistance - 20) % 40 > 0) {
                days++;
            }
            System.out.println("Доставка составит от " + days + " дней");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 2020;
        camelCase(year);
        System.out.println("Задание 2");
        int clientDeviceYear = 2014;
        int cllientDevice = 1;
        checkingTheDevice(cllientDevice);
        checkingTheDeviceYear(clientDeviceYear);
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        deliveryCard(deliveryDistance);
    }
}