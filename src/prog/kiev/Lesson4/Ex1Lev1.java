package prog.kiev.Lesson4;

public class Ex1Lev1 {
    public static void main(String[] args) {
        /*
         * Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета
         * нечетных цифр в нем.
         */
        int[] arr = {0, 5, 2, 4, 7, 1, 3, 19};
        int counting = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                counting += 1;
            }
        }
        System.out.println("Of odd numbers in the array: " + counting);
    }
}
