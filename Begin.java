import java.util.Scanner;

class Begin {
    private final Scanner myScan = new Scanner(System.in);

    public void begin1() {
        System.out.println("Begin1. Дана сторона квадрата a. Найти его периметр P = 4·a.");
        System.out.println("Введите длину стороны квадрата, чтобы узнать его периметр");
        System.out.println("Периметр: " + myScan.nextInt() * 4);
    }

    public void begin2() {
        System.out.println("Begin2. Дана сторона квадрата a. Найти его площадь S = a2.");
        System.out.println("Введите сторону квадрата, чтобы узнать его площадь");
        System.out.println("Площадь: " + Math.pow(myScan.nextInt(), 2));
    }

    public void begin3() {
        System.out.println("Begin3. Даны стороны прямоугольника a и b. Найти его площадь S = a·b и периметр P = 2·(a + b)");
        System.out.println("Введите 2 стороны прямоугольника, чтобы получить площадь и периметр");
        int sideFirst = myScan.nextInt();
        int sideSecond = myScan.nextInt();
        System.out.println("Периметр: " + 2 * (sideFirst + sideSecond));
        System.out.println("Площадь: " + (sideFirst * sideSecond));
    }

    public void begin4() {
        System.out.println("Begin4. Дан диаметр окружности d. Найти ее длину L = π·d. В качестве значения π использовать 3.14.");
        System.out.println("Введите диаметр окружности, чтобы найти её длину");
        System.out.println("Диаметр " + myScan.nextInt() * Math.PI);
    }

    public void begin5() {
        System.out.println("Введите длину ребра куба, чтобы найти его объём и площадь поверхности");
        int edge = myScan.nextInt();
        System.out.println("Объём куба: " + Math.pow(edge, 3));
        System.out.println("Площадь поверхности: " + 6 * (Math.pow(edge, 2)));
    }

}