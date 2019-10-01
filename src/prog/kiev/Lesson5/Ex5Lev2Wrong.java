package prog.kiev.Lesson5;

import java.util.Scanner;

public class Ex5Lev2Wrong {
    public static void main(String[] args) {
        /*
         * «Перевернуть массив». Т.е. написать программу которая повернет
         * базовый массив на 90,180,270 градусов по часовой стрелке. (При
         * выполнении задания использовать дополнительный массив нельзя). В
         * примере показан поворот на 90 градусов - (3 часа)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int x = sc.nextInt();
        int y = x;

        int[][] array = new int[x][x];
        System.out.println("This is the source array.");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Choose what you want to do: ");
        System.out.println("    1. Turn LEFT 90 degrees");
        System.out.println("    2. Turn RIGHT 90 degrees");
        System.out.println("    3. Rotate 180 degrees (flip)");
        System.out.println("    4. Nothing to do. EXIT");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println();
                for (int q = 0; q < array.length; q++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[q][j] = j;
                        System.out.print(array[q][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Turned left 90 degrees");
                break;
            case 2:
                System.out.println();
                for (int w = 0; w < array.length; w++) {
                    for (int j = array.length - 1; j >= 0; j--) {
                        array[w][j] = j;
                        System.out.print(array[w][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Turned right 90 degrees");
                break;
            case 3:
                System.out.println();
                for (int e = array.length - 1; e >= 0; e--) {
                    for (int j = array.length - 1; j >= 0; j--) {
                        array[j][e] = j;
                        System.out.print(array[e][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Rotated 180 degrees (turned over)");
                break;
            case 4:
                break;
        }
    }
}
