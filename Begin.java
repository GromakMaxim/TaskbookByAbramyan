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
}