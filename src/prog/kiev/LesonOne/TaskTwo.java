package prog.kiev.LesonOne;
public class TaskTwo {
    public static void main(String[] args) {
        /*
         * Написать програму которая вычислит и выведет на екран
         * площадь треугольника если извесны его стороны (Если известны его стороны, их не нужно вводить с клавиатуры)
         */
        int katetOne = 2;
        int katetTwo = 4;
        int katetThree = 5;
        double polPerimetr;
        double squareTriangle;

        polPerimetr = (katetOne + katetTwo + katetThree) / 2.0;

        squareTriangle = Math.sqrt(polPerimetr * (polPerimetr - katetOne) * (polPerimetr - katetTwo) * (polPerimetr - katetThree));
        System.out.println("The area of the triangle is " + squareTriangle);
    }
}
