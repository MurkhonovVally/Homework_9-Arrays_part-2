public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println((char) 27 + "[35m----------Задача 1----------" + (char)27 + "[0m");
        int[] arr = generateRandomArray();
        int mounth = 0;
        for (int a = 0; a < arr.length; a++) {
            mounth = mounth + arr[a];
        }
        System.out.println("Сумма трат за месяц составила " + mounth + " рублей");
    }

    public static void task2() {
        System.out.println((char) 27 + "[31m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[35m----------Задача 2----------" + (char)27 + "[0m");
        int[] arr = generateRandomArray();
        int sumMounth = 0;
        int maxDay = +99999;
        int minDay = +200000;
        for (int i = 0; i < arr.length; i++) {
            sumMounth += arr[i];
            if (arr[i] > maxDay) {
                maxDay = arr[i];
            }
            if (arr[i] < minDay) {
                minDay = arr[i];
            }
        }
        System.out.println(" Максимальная сумма трат за день составила " + maxDay + " рублей");
        System.out.println(" Минимальныая сумма трат за день составила " + minDay + " рублей");
    }

    public static void task3() {
        System.out.println((char) 27 + "[31m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[35m----------Задача 3----------" + (char)27 + "[0m");
        int[] arr = generateRandomArray();
        int sumMounth = 0;
        int maxDay = +99999;
        int minDay = +200000;
        for (int i = 0; i < arr.length; i++) {
            sumMounth += arr[i];
            if (arr[i] > maxDay) {
                maxDay = arr[i];
            }
            if (arr[i] < minDay) {
                minDay = arr[i];
            }
        }
        double averageValue = sumMounth / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");
    }

    public static void task4() {
        System.out.println((char) 27 + "[31m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[35m----------Задача 4----------" + (char)27 + "[0m");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (var i = 10; i < reverseFullName.length; i--) {
            System.out.print(reverseFullName[i]);
            if (i == 0) {
                {
                    break;
                }
            }
        }
    }
}