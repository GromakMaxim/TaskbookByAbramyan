import java.sql.SQLOutput;
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

    public void begin10() {
        System.out.println("Begin10. Введите 2 ненулевых числа, чтобы получить сумму, разность, произведение и частное их квадратов");
        double firstValue = Math.pow(myScan.nextDouble(), 2);
        double secondValue = Math.pow(myScan.nextDouble(), 2);
        System.out.println("Сумма квадратов: " + (firstValue + secondValue));
        System.out.println("Разность квадратов: " + (firstValue + secondValue));
        System.out.println("Произведение квадратов: " + (firstValue * secondValue));
        System.out.println("Частное квадратов: " + (firstValue / secondValue));
    }

    public void begin11() {
        System.out.println("Begin11. Введите 2 ненулевых числа, чтобы получить их сумму, разность, произведение и частное их модулей");
        int firstValue = Math.abs(myScan.nextInt());
        int secondValue = Math.abs(myScan.nextInt());
        System.out.println("Сумма: " + (firstValue + secondValue));
        System.out.println("Разность: " + (firstValue - secondValue));
        System.out.println("Произведение: " + (firstValue * secondValue));
        System.out.println("Частное: " + (firstValue / secondValue));
    }

    public void begin12() {
        System.out.println("Begin12. Введите 2 катета прямоугольного треугольника, чтобы найти его гипотенузу и периметр");
        double cathetus1 = myScan.nextDouble();
        double cathetus2 = myScan.nextDouble();
        double hypotenuse = Math.sqrt(Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2));
        System.out.println("Гипотенуза: " + hypotenuse);
        System.out.println("Периметр: " + cathetus1 + cathetus2 + hypotenuse);
    }

    public void begin13() {
        System.out.println("Begin13. Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2). " +
                "Найти площади этих кругов S1 и S2, а также площадь S3 кольца, " +
                "внешний радиус которого равен R1, а внутренний радиус равен R2:");
        System.out.println("Введите R1, R2");
        double s1 = Math.PI * Math.pow(myScan.nextDouble(), 2);
        double s2 = Math.PI * Math.pow(myScan.nextDouble(), 2);
        System.out.println("Площадь первого круга: " + s1);
        System.out.println("Площадь второго круга: " + s2);
        System.out.println("Площадь кольца: " + (s1 - s2));
    }

    public void begin14() {
        System.out.println("Begin14. Дана длина L окружности. " +
                "Найти ее радиус R и площадь S круга, ограниченного этой окружностью, учитывая, что L = 2·π·R, S = π·R^2");
        System.out.println("Введите длину окружности, чтобы найти её радиус и площадь круга, ограниченного этой окружностью");
        double radius = myScan.nextDouble() / (2 * Math.PI);
        System.out.println("Радиус: " + radius);
        System.out.println("Площадь: " + Math.PI * Math.pow(radius, 2));
    }

    public void begin15() {
        System.out.println("Begin15. Дана площадь S круга. " +
                "Найти его диаметр D и длину L окружности, ограничивающей этот круг, учитывая, что L = π·D, S = π·D^2 /4.");
        System.out.println("Введите площадь круга, чтобы найти его диаметр и длину");
        double area = myScan.nextDouble();
        double diameter = Math.sqrt(area / Math.PI) * 2;
        System.out.println("Диаметр: " + diameter);
        System.out.println("Длина: " + 2 * Math.PI * diameter);
    }

    public void begin16() {
        System.out.println("Begin16. Найти расстояние между двумя точками с заданными координатами x1 и x2 " +
                "на числовой оси: |x2 − x1|.");
        System.out.println("Введите координаты двух точек, чтобы найти расстояние между ними");
        System.out.println("Расстояние между двумя точками: " + Math.abs(myScan.nextInt() - myScan.nextInt()));
    }

    public void begin17() {
        System.out.println("Begin17. Даны три точки A, B, C на числовой оси. Найти длины отрезков AC и BC и их сумму.");
        System.out.println("Введите координаты точек А B C, чтобы найти длины отрезков AC, BC и их сумму");
        int coordA = myScan.nextInt();
        int coordB = myScan.nextInt();
        int coordC = myScan.nextInt();
        int AC = Math.abs(coordA - coordC);
        int BC = Math.abs(coordB - coordC);

        System.out.println("Длина AC: " + AC);
        System.out.println("Длина BC: " + BC);
        System.out.println("AC + BC: " + (AC + BC));
    }

    public void begin18() {
        System.out.println("Begin18. Введите координаты точек А B C, чтобы найти произведение длин отрезков AC BC");
        int coordA = myScan.nextInt();
        int coordB = myScan.nextInt();
        int coordC = myScan.nextInt();
        System.out.println("AC * BC: " + (coordA - coordC) * (coordB - coordC));
    }

    public void begin19() {
        System.out.println("Begin19. Введите (через пробел) координаты 2 противоположных вершин прямоугольника " +
                "(х1, у1), (х2, у2) чтобы найти периметр и площадь данного прямоугольника");

        System.out.println("Введите координаты х1, у1");
        String coord1 = myScan.nextLine();
        String[] coord1List = coord1.split(" ", 2);

        System.out.println("Введите координаты х2, у2");
        String coord2 = myScan.nextLine();
        String[] coord2List = coord2.split(" ", 2);

        double lengthFirstSide = Math.abs(Integer.parseInt(coord2List[0]) - Integer.parseInt(coord1List[0]));
        double lengthSecondSide = Math.abs(Integer.parseInt(coord2List[1]) - Integer.parseInt(coord1List[1]));

        System.out.println("Площадь: " + (lengthFirstSide * lengthSecondSide));
        System.out.println("Периметр: " + (2 * (lengthFirstSide * lengthSecondSide)));
    }

    public void begin20() {
        System.out.println("Begin20. Введите координаты 2 точек (х1, у1), (х2, у2) чтобы найти расстояние");
        System.out.println("Введите координаты х1, у1");

        String coord1 = myScan.nextLine();
        String[] coord1List = coord1.split(" ", 2);
        System.out.println("Введите координаты х2, у2");
        String coord2 = myScan.nextLine();
        String[] coord2List = coord2.split(" ", 2);

        System.out.println("Расстояние: " +
                Math.abs(
                        Math.sqrt(
                                Math.pow(Integer.parseInt(coord2List[0]) - Integer.parseInt(coord1List[0]), 2)
                                        +
                                        Math.pow(Integer.parseInt(coord2List[1]) - Integer.parseInt(coord1List[1]), 2))));
    }

    public void begin21() {
        System.out.println("Begin21. Даны координаты трех вершин треугольника:\n" +
                "(x1, y1), (x2, y2), (x3, y3).\n" +
                "\n" +
                "Найти его периметр и площадь, используя формулу для расстояния между двумя точками на плоскости. " +
                "Для нахождения площади треугольника со сторонами a, b, c использовать формулу Герона:\n" +
                "S = (p·(p − a)·(p − b)·(p − c))^1/2,\n" +
                "\n" +
                "где p = (a + b + c)/2 — полупериметр.");


        System.out.println("Введите координаты х1, у1");
        String coord1 = myScan.nextLine();
        String[] coord1List = coord1.split(" ", 2);

        System.out.println("Введите координаты х2, у2");
        String coord2 = myScan.nextLine();
        String[] coord2List = coord2.split(" ", 2);

        System.out.println("Введите координаты х3, у3");
        String coord3 = myScan.nextLine();
        String[] coord3List = coord3.split(" ", 2);

        double AB = Math.abs(Math.sqrt(Math.pow(Integer.parseInt(coord2List[0]) - Integer.parseInt(coord1List[0]), 2) + Math.pow(Integer.parseInt(coord2List[1]) - Integer.parseInt(coord1List[1]), 2)));
        double AC = Math.abs(Math.sqrt(Math.pow(Integer.parseInt(coord3List[0]) - Integer.parseInt(coord1List[0]), 2) + Math.pow(Integer.parseInt(coord3List[1]) - Integer.parseInt(coord1List[1]), 2)));
        double BC = Math.abs(Math.sqrt(Math.pow(Integer.parseInt(coord3List[0]) - Integer.parseInt(coord2List[0]), 2) + Math.pow(Integer.parseInt(coord3List[1]) - Integer.parseInt(coord2List[1]), 2)));

        double halfPerimeter = (AB + AC + BC) / 2;

        double area = Math.sqrt(halfPerimeter * (halfPerimeter - AB) * (halfPerimeter - AC) * (halfPerimeter - BC));
        System.out.println("Полупериметр: " + halfPerimeter);
        System.out.println("Площадь: " + area);
    }

    public void begin22() {
        System.out.println("Begin22. Поменять местами содержимое переменных A и B и вывести новые значения A и B.");

        System.out.println("Первая переменная: ");
        String firstVal = myScan.nextLine();
        System.out.println("Вторая переменная: ");
        String secondVal = myScan.nextLine();
        System.out.println("Первая переменная: " + firstVal + "Вторая переменная: " + secondVal);
        String temp;
        temp = firstVal;
        firstVal = secondVal;
        secondVal = temp;
        System.out.println("Первая переменная: " + firstVal + "Вторая переменная: " + secondVal);
    }

    public void begin23() {
        System.out.println("Begin23. Даны переменные A, B, C. " +
                "Изменить их значения, переместив содержимое A в B, B — в C, C — в A, " +
                "и вывести новые значения переменных A, B, C.");
        System.out.println("Первая переменная: ");
        String A = myScan.nextLine();
        System.out.println("Вторая переменная: ");
        String B = myScan.nextLine();
        System.out.println("Третья переменная: ");
        String C = myScan.nextLine();
        System.out.println("1: " + A + " 2: " + B + " 3: " + C);

        String temp;
        temp = C;
        C = B;
        B = A;
        A = temp;
        System.out.println("1: " + A + " 2: " + B + " 3: " + C);
    }

    public void begin24() {
        System.out.println("Begin24. Даны переменные A, B, C. " +
                "Изменить их значения, переместив содержимое A в C, C — в B, B — в A, и вывести новые значения переменных A, B, C.");
        System.out.println("Первая переменная: ");
        String A = myScan.nextLine();
        System.out.println("Вторая переменная: ");
        String B = myScan.nextLine();
        System.out.println("Третья переменная: ");
        String C = myScan.nextLine();
        System.out.println("1: " + A + " 2: " + B + " 3: " + C);
        String temp;

        temp = A;
        A = B;
        B = C;
        C = temp;
        System.out.println("1: " + A + " 2: " + B + " 3: " + C);
    }

    public void begin25() {
        System.out.println("Begin25. Найти значение функции y = 3x^6 − 6x^2 − 7 при данном значении x.");
        System.out.println("Введите х");
        double x = myScan.nextDouble();
        System.out.println("Ответ: " + (3 * Math.pow(x, 6) - 6 * Math.pow(x, 2) - 7));
    }

    public void begin26() {
        System.out.println("Begin26. Найти значение функции y = 4(x−3)^6 − 7(x−3)^3 + 2 при данном значении x.");
        System.out.println("Введите х");
        double x = myScan.nextDouble();
        System.out.println("Ответ: " + ((4 * Math.pow(x - 3, 6)) - (7 * Math.pow(x - 3, 3)) + 2));
    }

    public void begin27() {
        System.out.println("Begin27. Дано число A. " +
                "Вычислить A^8, используя вспомогательную переменную и три операции умножения. " +
                "Для этого последовательно находить A^2, A^4, A^8. Вывести все найденные степени числа A.");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        double temp;
        temp = A * A;
        System.out.println("в квадрате- " + temp);
        temp = temp * temp;
        System.out.println("в четвёртой- " + temp);
        temp = temp * temp;
        System.out.println("в восьмой- " + temp);
    }

    public void begin28() {
        System.out.println("Begin28. Дано число A. " +
                "Вычислить A15, используя две вспомогательные переменные и пять операций умножения. " +
                "Для этого последовательно находить A2, A3, A5, A10, A15. Вывести все найденные степени числа A.");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        double temp1;
        double temp2;
        temp1 = A * A;
        System.out.println("в квадрате- " + temp1);
        temp2 = temp1 * A;
        System.out.println("в кубе- " + temp2);
        temp1 = temp2 * temp1;
        System.out.println("в пятой- " + temp1);
        temp2 = temp1 * temp1;
        System.out.println("в десятой- " + temp2);
        temp1 = temp2 * temp1;
        System.out.println("в 15- " + temp1);
    }

    public void begin29() {
        System.out.println("Begin29. Дано значение угла α в градусах (0 ≤ α < 360). " +
                "Определить значение этого же угла в радианах, учитывая, что 180° = π радианов.");
        System.out.println("В радианах: " + Math.abs(myScan.nextDouble()) * Math.PI / 180);
    }

    public void begin30() {
        System.out.println("Begin30. Дано значение угла α в радианах (0 ≤ α < 2·π). " +
                "Определить значение этого же угла в градусах, учитывая, что 180° = π радианов.");
        System.out.println("В градусах: " + Math.abs(myScan.nextDouble()) * 180 / Math.PI);
    }

    public void begin31() {
        System.out.println("Begin31. Дано значение температуры T в градусах Фаренгейта. " +
                "Определить значение этой же температуры в градусах Цельсия. " +
                "Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:\n" +
                "TC = (TF − 32)·5/9.");

        System.out.println("По цельсию: " + (myScan.nextDouble() - 32) * 5 / 9);
    }

    public void begin32(){
        System.out.println("Begin32. Дано значение температуры T в градусах Цельсия. " +
                "Определить значение этой же температуры в градусах Фаренгейта. " +
                "Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:\n" +
                "TF = 9·FC/5 + 32.");
        System.out.println("По фаренгейту: " + (9 * myScan.nextDouble() / 5 + 32));
    }
}
