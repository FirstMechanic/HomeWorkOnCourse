package prog.kiev.Lesson4;

public class SimpleClass1 {
    public static void main(String[] args) {
        /*
         * Створюємо масів, і кожній ячейці присвоюємо елементи. Виводимо значення массива
         */
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.println(array[i] + " ");
        }
        // System.out.println(massiv); Виводиться хеш код масива.


    }
}
