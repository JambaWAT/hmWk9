import java.util.Arrays;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class arrays {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
    }
    public static void task1(){
        System.out.println("Задача 1" );
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr){ sum += element;};
        System.out.println("Сумма трат за месяц составила " + sum +" рублей" );

    }
    public static void task2(){
        System.out.println("Задача 2" );
        int [] arr = generateRandomArray();
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максмальная сумма трат за день составила "+ max+ " рублей" );
    }
    public static void task3(){
        System.out.println("Задача 3" );
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double average = average = (double) sum / arr.length;
        System.out.println("Сумма трат за месяц составила " + average+ " рублей");
    }
    public static void task4(){
        System.out.println("Задача 4" );
        char[] reversteFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reversteFullName.length - 1; i >= 0; i--) {
            System.out.print(reversteFullName[i]);
        }

    }

    public static int [] generateRandomArray()  {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;



        }

    }


