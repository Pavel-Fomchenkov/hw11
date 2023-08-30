import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        task1();
        System.out.println("Задача 2");
        task2();
        System.out.println("Задача 3");
        task3();
    }

    public static int takeIntInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static boolean yearIsLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void task1() {
        System.out.println("Введите год");
        int year = takeIntInput();
        if(yearIsLeap(year)){
            System.out.println(year + " год является високосным.");
        } else System.out.println(year + " год не является високосным.");
    }

    public static String selectSoftwareByOs(int phoneYear, int oS) {
        int year = 2015;
        if(phoneYear < year && oS == 0) {
            return "Установите облегченную версию приложения для iOS по ссылке.";
        } else if (oS == 0) {
            return "Установите версию приложения для iOS по ссылке.";
        } else if (phoneYear < year && oS == 1) {
            return "Установите облегченную версию приложения для Android по ссылке.";
        } else if (oS == 1) {
            return "Установите версию приложения для Android по ссылке.";}
        else return "Вы ввели неверные данные.";
    }

    public static void task2() {
        System.out.println("Введите год выпуска Вашего телефона");
        int clientPhoneYear = takeIntInput();
        System.out.println("Какая операционная система у Вашего телефона: 0 - IOS, 1 - Android");
        int oS = takeIntInput();
        System.out.println(selectSoftwareByOs(clientPhoneYear, oS));
    }

    public static int countDeliveryTime(int distance) {
        int deliveryTime = 0;
        if (distance < 20) deliveryTime += 1;
        if (distance < 60) deliveryTime += 2;
        if (distance <= 100) deliveryTime += 3;
        return deliveryTime;
    }

    public static void task3() {
        int deliveryDistance = 95;
        if (countDeliveryTime(deliveryDistance) != 0) {
            System.out.println("Для доставки товара потребуется дней: " + countDeliveryTime(deliveryDistance) + ".");
        } else {
            System.out.println("Доставка невозможна.");
        }
    }

}