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
        int floor;

        //Убераем неправельные номера
        if(numberOfApartment > 0 && numberOfApartment < 145) {
            //Первый подъезд
            if (numberOfApartment < 37) {
                System.out.println("You need the first entrance");
                floor = numberOfApartment / 4;
                System.out.println("You need " + floor + " floor.");
            }
            //Второй подъезд
            if (numberOfApartment > 36 && numberOfApartment < 73) {
                System.out.println("You need the second entrance");
                floor = (numberOfApartment - 36) / 4;
                System.out.println("You need " + floor + " floor.");
            }
            //Третий подъезд
            if (numberOfApartment > 72 && numberOfApartment < 109) {
                System.out.println("You need the third entrance");
                floor = (numberOfApartment - 72) / 4;
                System.out.println("You need " + floor + " floor.");
            }
            //Четвертый подъезд
            if (numberOfApartment > 108 && numberOfApartment < 145) {
                System.out.println("You need the forth entrance");
                floor = (numberOfApartment - 108) / 4;
                System.out.println("You need " + floor + " floor.");
            }
        } else System.out.println("You enter wrong number of apartment. Restart a program.");
    }
}
