package prog.kiev.LesonTwo;

import java.util.Scanner;

public class TaskOneLevelTwo {
    public static void main(String[] args) {
        /*
         *Есть круг с центром в начале координат и радиусом 4. Пользователь
         *вводит с клавиатуры координаты точки x и y. Написать программу которая
         *определит лежит ли эта точка внутри круга или нет.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X coordinate ");
        int a = sc.nextInt();
        System.out.println("Enter Y coordinate ");
        int b = sc.nextInt();
        int r = 4;
        //Только для круга с центром (0;0)
        if (a * a + b * b <= r * r) {
            System.out.println("Point lies in a circle");
        } else System.out.println("The point lies outside the circle.");


    }
}
