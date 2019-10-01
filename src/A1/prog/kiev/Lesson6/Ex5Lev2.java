package A1.prog.kiev.Lesson6;

import java.util.Scanner;

public class Ex5Lev2 {
    public static void main(String[] args) {
        /*
         * Существуют такие последовательности чисел
         * 0,2,4,6,8,10,12
         * 1,4,7,10,13
         * 1,2,4,8,16,32
         * 1,3,9,27
         * 1,4,9,16,25
         * 1,8,27,64,125
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sequence from 4 to 7 numbers, separated by commas. And you get the next number of sequence");
        String line = sc.next();
        String[] arr = line.split("[,]");
        if (4 <= arr.length && arr.length <= 7) {
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int c = Integer.parseInt(arr[2]);
            int d = Integer.parseInt(arr[3]);
            int e = 0;
            int g = 0;
            int k = 0;
            if (arr.length >= 5) {
                e = Integer.parseInt(arr[4]);
            }
            if (arr.length >= 6) {
                g = Integer.parseInt(arr[5]);
            }
            if (arr.length >= 7) {
                k = Integer.parseInt(arr[6]);
            }
            int value = 0;
                         if (b - a == b && c - b == b && d - c == b && e - d == b || g - e == b || k - g == b) {
                            value = k + b;
                            System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + "," + g + "," + k + " next number " + value);
            } else if (b - a == c - b && d - c == c - b) {
                         value = e + (b - a);
                          System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + "," + " next number " + value);
            } else if (b * 2 == c && c * 2 == d) {
                if(e == 0){
                    //e==d*2;
                System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + "," + g + " next number " + value);

                }
                value = g * 2;
                System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + "," + g + " next number " + value);
            } else if (b * b == c && c * b == d) {
                value = d * b;
                System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + " next number " + value);
            } else if ((b - a == ((c - b) - 2) && ((c - b) == ((d - c) - 2)))) {
                value = e + (e - d) + 2;
                System.out.println("You entered the sequence: " + a + "," + b + "," + c + "," + d + "," + e + " next number " + value);

            } else if (Math.cbrt(b) == Math.cbrt(c) - 1 && Math.cbrt(c) == Math.cbrt(d) - 1) {
                double alue = (Math.cbrt(e) + 1) * (Math.cbrt(e) + 1) * (Math.cbrt(e) + 1);
                System.out.println("You entered the sequence " + a + "," + b + "," + c + "," + d + "," + e + " next number " + Math.round(alue));
            }
        } else System.out.println("Invalid array size.");
    }
}
