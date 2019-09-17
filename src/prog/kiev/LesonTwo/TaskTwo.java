package prog.kiev.LesonTwo;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        /*
         *Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда
         *начинается с единицы. На одном этаже 4 квартиры. Напишите программу
         *которая получит номер квартиры с клавиатуры, и выведет на экран на
         *каком этаже, какого подъезда расположенна эта квартира. Если такой
         *квартиры нет в этом доме то нужно сообщить об этом пользователю
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the apartment number: ");
        int numberOfApartment = sc.nextInt();


        //Убераем неправельные номера
        if (numberOfApartment > 0 && numberOfApartment < 145) {
            int a = numberOfApartment / 36;
            int b = (numberOfApartment / 4) % 9;
            System.out.println("Floor number: " + ++b + ", " + "entrance number: " + ++a + ".");
        } else System.out.println("You enter wrong number of apartment. Restart a program.");
    }

}