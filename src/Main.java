public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println((char) 27 + "[35m----------Задача 1----------" + (char)27 + "[0m");
        int[] arr = generateRandomArray();
        int[] mounth = new int[30];

    }

    public static void task2() {
        System.out.println((char) 27 + "[31m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[35m----------Задача 2----------" + (char)27 + "[0m");

    }

    public static void task3() {
        System.out.println((char) 27 + "[31m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[35m----------Задача 3----------" + (char)27 + "[0m");
    }

    public static void task4() {
        System.out.println((char) 27 + "[31m--------Конец задачи--------" + (char)27 + "[0m");
        System.out.println(" ");
        System.out.println((char) 27 + "[35m----------Задача 4----------" + (char)27 + "[0m");
    }
}