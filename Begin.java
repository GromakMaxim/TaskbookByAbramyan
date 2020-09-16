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
        System.out.println("Begin5. Дана длина ребра куба a. Найти объем куба V = a^3 и площадь его поверхности S = 6·a^2.");
        System.out.println("Введите длину ребра куба, чтобы найти его объём и площадь поверхности");
        int edge = myScan.nextInt();
        System.out.println("Объём куба: " + Math.pow(edge, 3));
        System.out.println("Площадь поверхности: " + 6 * (Math.pow(edge, 2)));
    }

    public void begin6() {
        System.out.println("Begin6. Даны длины ребер a, b, c прямоугольного параллелепипеда. " +
                "Найти его объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c)");
        System.out.println("Введите длины двух ребёр, чтобы найти объём прямоугольного параллелепипеда и площадь его поверхности");
        int edge1 = myScan.nextInt();
        int edge2 = myScan.nextInt();
        int edge3 = myScan.nextInt();
        System.out.println("Объём: " + edge1 * edge2 * edge3);
        System.out.println("Площадь поверхности: " + 2 * (edge1 * edge2 + edge2 * edge3 + edge1 * edge3));
    }

    public void begin7() {
        System.out.println("Begin7. Найти длину окружности L и площадь круга S заданного радиуса R:\n" +
                "L = 2·π·R,  S = π·R^2.");
        System.out.println("Введите радиус окружности, чтобы вычислить длину окружности и площадь круга");
        int radius = myScan.nextInt();
        System.out.println("Длина окружности: " + 2 * Math.PI * radius);
        System.out.println("Площадь круга: " + Math.PI * Math.pow(radius, 2));
    }

    public void begin8() {
        System.out.println("Begin8. Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2");
        System.out.println("Введите 2 числа, чтобы узнать их среднее арифметическое");
        System.out.println((double) (myScan.nextInt() + myScan.nextInt()) / 2);
    }

    public void begin9() {
        System.out.println("Begin9. Даны два неотрицательных числа a и b. " +
                "Найти их среднее геометрическое, т. е. квадратный корень из их произведения: (a·b)^(1/2)");
        System.out.println("Введите 2 неотрицательных числа, чтобы чтобы найти их среднее геометрическое");
        System.out.println("Среднее геометрическое: " + Math.sqrt(myScan.nextInt() * myScan.nextInt()));
    }
}