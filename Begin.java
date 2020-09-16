import java.util.Scanner;

class Begin {

    public void begin1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Begin1. Дана сторона квадрата a. Найти его периметр P = 4·a.");
        System.out.println("Введите длину стороны квадрата, чтобы узнать его периметр");
        System.out.println("Периметр: " + input.nextInt() * 4);
    }

    public void begin2() {
        System.out.println("Begin2. Дана сторона квадрата a. Найти его площадь S = a2.");
        System.out.println("Введите сторону квадрата, чтобы узнать его площадь");
        Scanner myScan = new Scanner(System.in);
        System.out.println("Площадь: " + Math.pow(myScan.nextInt(), 2));
    }

    public void begin3() {
        System.out.println("Begin3. Даны стороны прямоугольника a и b. Найти его площадь S = a·b и периметр P = 2·(a + b)");
        System.out.println("Введите 2 стороны прямоугольника, чтобы получить площадь и периметр");
        Scanner myScan = new Scanner(System.in);
        int sideFirst = myScan.nextInt();
        int sideSecond = myScan.nextInt();
        System.out.println("Периметр: " + 2 * (sideFirst + sideSecond));
        System.out.println("Площадь: " + (sideFirst * sideSecond));
    }
}