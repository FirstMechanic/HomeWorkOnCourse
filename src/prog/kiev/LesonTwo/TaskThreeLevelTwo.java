package prog.kiev.LesonTwo;

import java.util.Scanner;

public class TaskThreeLevelTwo {
    public static void main(String[] args) {
        /*
         *Проверить, является ли четырехзначное число счастливым билетом.
         * Дано четырехзначное число. Проверить, является ли оно «счастливым
         * билетом». Примечание: счастливым билетом называется число, в
         * котором - при четном количестве цифр в числе сумма цифр его левой
         * половины равна сумме цифр его правой половины. Например,
         * рассмотрим число 1322. Его левая половина равна 13, а правая – 22, и
         *  оно является счастливым билетом (т. к. 1 + 3 = 2 + 2)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int person = sc.nextInt();
        int a;
        int b;
        int c;
        int d;

        a = person / 1000;
        b = (person % 1000) / 100;
        c = (person % 100) / 10;
        d = (person % 10);

        if (a + b == c + d) {
            System.out.println("You have lucky ticket");
        } else System.out.println("Sorry, you dont have lucky ticket");
    }
}
