package prog.kiev.Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1Lev1 {

    public static int max(int[] arr) {
        int coin = 0;
        int maxValue = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            int a = arr[j];
            int b = arr[j + 1];
            if (maxValue < b) {
                maxValue = b;
            } else if (maxValue < a) {
                maxValue = a;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        /*
         * Напишите метод который вернет максимальное число из массива целых чисел.
         */
        System.out.println("Enter the size of the array, numbers are inserted randomly: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter a range for random numbers: ");
        int b = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * b+1);
        }
        System.out.println(Arrays.toString(arr));
        count = max(arr);
        System.out.println("The largest number in the array is: " + count);
    }
}
