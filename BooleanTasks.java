import java.util.Scanner;

public class BooleanTasks {
    private final Scanner myScan = new Scanner(System.in);


    public void boolean1() {
        System.out.println("Boolean1. Дано целое число A. " +
                "Проверить истинность высказывания: «Число A является положительным».");
        double A = myScan.nextDouble();
        if (A > 0) {
            System.out.println("Число A является положительным");
        }
    }

    public void boolean2() {
        System.out.println("Boolean2. Дано целое число A. Проверить истинность высказывания: «Число A является нечетным».");
        double A = myScan.nextDouble();
        if (A % 2 != 0) {
            System.out.println("Число A является нечетным");
        }
    }

    public void boolean3() {
        System.out.println("Boolean3. Дано целое число A. Проверить истинность высказывания: «Число A является четным».");
        double A = myScan.nextDouble();
        if (A % 2 == 0) {
            System.out.println("Число A является четным");
        }
    }

    public void boolean4() {
        System.out.println("Boolean4. Даны два целых числа: A, B. " +
                "Проверить истинность высказывания: «Справедливы неравенства A > 2 и B ≤ 3».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();

        if (A > 2 && B <= 3) {
            System.out.println("TRUE. A > 2 и B ≤ 3");
        }
    }

    public void boolean5() {
        System.out.println("Boolean5. Даны два целых числа: A, B. " +
                "Проверить истинность высказывания: «Справедливы неравенства A ≥ 0 или B < −2».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();

        if (A >= 0 || B < -2) {
            System.out.println("TRUE. A ≥ 0 или B < −2");
        }
    }

    public void boolean6() {
        System.out.println("Boolean6. Даны три целых числа: A, B, C. " +
                "Проверить истинность высказывания: «Справедливо двойное неравенство A < B < C».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();

        if (A < B && B < C) {
            System.out.println("TRUE. A < B < C");
        }
    }

    public void boolean7() {
        System.out.println("Boolean7. Даны три целых числа: A, B, C. " +
                "Проверить истинность высказывания: «Число B находится между числами A и C».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();

        if ((A < B && B < C) || (C < B && B < A)) {
            System.out.println("TRUE. Число B находится между числами A и C");
        }
    }

    public void boolean8() {
        System.out.println("Boolean8. Даны два целых числа: A, B. " +
                "Проверить истинность высказывания: «Каждое из чисел A и B нечетное».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();

        if (A % 2 != 0 && B % 2 != 0) {
            System.out.println("TRUE. Каждое из чисел A и B нечетное");
        }
    }

    public void boolean9() {
        System.out.println("Boolean9. Даны два целых числа: A, B. " +
                "Проверить истинность высказывания: «Хотя бы одно из чисел A и B нечетное».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();

        if (A % 2 != 0 || B % 2 != 0) {
            System.out.println("TRUE. Хотя бы одно из чисел A и B нечетное");
        }
    }

    public void boolean10() {
        System.out.println("Boolean10. Даны два целых числа: A, B. " +
                "Проверить истинность высказывания: «Ровно одно из чисел A и B нечетное».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        if ((A + B) % 2 != 0) {
            System.out.println("TRUE. Ровно одно из чисел A и B нечетное");
        }
    }

    public void boolean11() {
        System.out.println("Boolean11. Даны два целых числа: A, B. " +
                "Проверить истинность высказывания: «Числа A и B имеют одинаковую четность».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();

        if ((A + B) % 2 == 0) {
            System.out.println("TRUE. Числа A и B имеют одинаковую четность");
        }
    }

    public void boolean12() {
        System.out.println("Boolean12. Даны три целых числа: A, B, C. " +
                "Проверить истинность высказывания: «Каждое из чисел A, B, C положительное».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();
        if (A > 0 && B > 0 && C > 0) {
            System.out.println("TRUE. Каждое из чисел A, B, C положительное");
        }
    }

    public void boolean13() {
        System.out.println("Boolean13. Даны три целых числа: A, B, C. " +
                "Проверить истинность высказывания: «Хотя бы одно из чисел A, B, C положительное».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();
        if (A > 0 || B > 0 || C > 0) {
            System.out.println("TRUE. Хотя бы одно из чисел A, B, C положительное");
        }
    }

    public void boolean14() {
        System.out.println("Boolean14. Даны три целых числа: A, B, C. " +
                "Проверить истинность высказывания: «Ровно одно из чисел A, B, C положительное».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();

        if ((A > 0 && B <= 0 && C <= 0) || (B > 0 && A <= 0 && C <= 0) || (C > 0 && A <= 0 && B <= 0)) {
            System.out.println("TRUE. Ровно одно из чисел A, B, C положительное");
        }
    }

    public void boolean15() {
        System.out.println("Boolean15. Даны три целых числа: A, B, C. " +
                "Проверить истинность высказывания: «Ровно два из чисел A, B, C являются положительными».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();

        if ((A > 0 && B > 0 && C < 0) || (A > 0 && C > 0 && B < 0) || (B > 0 && C > 0 && A < 0)) {
            System.out.println("TRUE. Ровно два из чисел A, B, C являются положительными");
        }
    }

    public void boolean16() {
        System.out.println("Boolean16. Дано целое положительное число. " +
                "Проверить истинность высказывания: «Данное число является четным двузначным».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        if (A > 9 && A < 100 && A % 2 == 0) {
            System.out.println("TRUE. Данное число является четным двузначным");
        }
    }

    public void boolean17() {
        System.out.println("Boolean17. Дано целое положительное число. " +
                "Проверить истинность высказывания: «Данное число является нечетным трехзначным».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        if (A > 99 && A < 1000 && A % 2 != 0) {
            System.out.println("TRUE. Данное число является нечетным трехзначным");
        }
    }

    public void boolean18() {
        System.out.println("Boolean18. Проверить истинность высказывания: " +
                "«Среди трех данных целых чисел есть хотя бы одна пара совпадающих».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();
        if (A == B || A == C || B == C) {
            System.out.println("TRUE. Среди трех чисел есть хотя бы одна пара совпадающих");
        }
    }

    public void boolean19() {
        System.out.println("Boolean19. Проверить истинность высказывания: " +
                "«Среди трех данных целых чисел есть хотя бы одна пара взаимно противоположных».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();
        if (A == -B || B == -C || C == -A) {
            System.out.println("TRUE. Среди трех чисел есть хотя бы одна пара взаимно противоположных");
        }
    }

    public void boolean20() {
        System.out.println("Boolean20. Дано трехзначное число. " +
                "Проверить истинность высказывания: «Все цифры данного числа различны».");
        System.out.println("Введите число: ");
        int value = myScan.nextInt();
        int A = value / 100;//сотни
        int B = value % 100 / 10;//десятки
        int C = value % 100 % 10;//единицы
        if (A != B && B != C && C != A) {
            System.out.println("TRUE. Все цифры данного числа различны");
        }
    }

    public void boolean21() {
        System.out.println("Boolean21. Дано трехзначное число. Проверить истинность высказывания:\n" +
                "«Цифры данного числа образуют возрастающую последовательность».\n");
        System.out.println("Введите число: ");
        int value = myScan.nextInt();
        int A = value / 100;//сотни
        int B = value % 100 / 10;//десятки
        int C = value % 100 % 10;//единицы

        if (A < B && B < C) {
            System.out.println("TRUE. Цифры данного числа образуют возрастающую последовательность");
        }
    }

    public void boolean22() {
        System.out.println("Boolean22. Дано трехзначное число. Проверить истинность высказывания:\n" +
                "«Цифры данного числа образуют возрастающую или убывающую последовательность».");
        System.out.println("Введите число: ");
        int value = myScan.nextInt();
        int A = value / 100;//сотни
        int B = value % 100 / 10;//десятки
        int C = value % 100 % 10;//единицы

        if ((A < B && B < C) || (A > B && B > C)) {
            System.out.println("TRUE. Цифры данного числа образуют возрастающую или убывающую последовательность");
        }
    }

    public void boolean23() {
        System.out.println("Boolean23. Дано четырехзначное число. Проверить истинность высказывания: " +
                "«Данное число читается одинаково слева направо и справа налево».");
        System.out.println("Введите число: ");
        int value = myScan.nextInt();

        int A = value / 1000;//тысячи
        int B = value % 1000 / 100;//сотни
        int C = value % 1000 % 100 / 10;//десятки
        int D = value % 1000 % 100 % 10;//единицы

        if (A == D && B == C) {
            System.out.println("TRUE. Данное число читается одинаково слева направо и справа налево");
        }
    }

    public void boolean24() {
        System.out.println("Boolean24. Даны числа A, B, C (число A не равно 0). Рассмотрев дискриминант D = B^2 − 4·A·C,\n"
                + "проверить истинность высказывания: «Квадратное уравнение A·x^2 + B·x + C = 0 имеет вещественные корни».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();

        if ((Math.pow(B, 2) - (4 * A * C)) >= 0) {
            System.out.println("TRUE. Уравнение имеет вещественные корни.");
        }
    }

    public void boolean25() {
        System.out.println("Boolean25. Даны числа x, y. Проверить истинность высказывания: «Точка с" +
                "координатами (x, y) лежит во второй координатной четверти».");

        System.out.println("Введите X");
        double X = myScan.nextDouble();
        System.out.println("Введите Y");
        double Y = myScan.nextDouble();

        if (X < 0 && Y > 0) {
            System.out.println("TRUE. Точка лежит во второй координатной четверти.");
        }

    }

    public void boolean26() {
        System.out.println("Boolean26. Даны числа x, y. Проверить истинность высказывания: «Точка с" +
                "координатами (x, y) лежит в четвертой координатной четверти».");

        System.out.println("Введите X");
        double X = myScan.nextDouble();
        System.out.println("Введите Y");
        double Y = myScan.nextDouble();

        if (X > 0 && Y < 0) {
            System.out.println("TRUE. Точка лежит в четвертой координатной четверти.");
        }
    }

    public void boolean27() {
        System.out.println("Boolean27. Даны числа x, y. Проверить истинность высказывания: «Точка с" +
                "координатами (x, y) лежит во второй или третьей координатной четверти».");
        System.out.println("Введите X");
        double X = myScan.nextDouble();
        System.out.println("Введите Y");
        double Y = myScan.nextDouble();

        if (X < 0 && Y != 0) {
            System.out.println("TRUE. Точка лежит во второй или третьей координатной четверти.");
        }
    }

    public void boolean28() {
        System.out.println("Boolean28. Даны числа x, y. Проверить истинность высказывания: " +
                "«Точка с координатами (x, y) лежит в первой или третьей координатной четверти».");
        System.out.println("Введите X");
        double X = myScan.nextDouble();
        System.out.println("Введите Y");
        double Y = myScan.nextDouble();

        if ((X > 0 && Y > 0) || (X < 0 && Y < 0)) {
            System.out.println("TRUE. Точка лежит в первой или третьей координатной четверти.");
        }
    }

    public void boolean29() {
        System.out.println("Boolean29. Даны числа x, y, x1, y1, x2, y2. Проверить истинность высказывания: \n" +
                "«Точка с координатами (x, y) лежит внутри прямоугольника, левая" +
                "верхняя вершина которого имеет координаты (x1, y1), правая нижняя — (x2, y2),\n" +
                " а стороны параллельны координатным осям».\n");
        System.out.println("Введите числа через пробел");
        String[] values = myScan.nextLine().split(" ", 6);
        int X = Integer.parseInt(values[0]);
        int Y = Integer.parseInt(values[1]);
        int X1 = Integer.parseInt(values[2]);
        int Y1 = Integer.parseInt(values[3]);
        int X2 = Integer.parseInt(values[4]);
        int Y2 = Integer.parseInt(values[5]);

        if (X > X1 && X < X2 && Y < Y1 && Y > Y2) {
            System.out.println("TRUE. Точка с координатами (x, y) лежит внутри прямоугольника.");
        }
    }

    public void boolean30() {
        System.out.println("Boolean30. Даны целые числа a, b, c, являющиеся сторонами некоторого треугольника. " +
                "Проверить истинность высказывания: «Треугольник со сторонами a, b, c является равносторонним».\n");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();

        if (A == B && A == C) {
            System.out.println("TRUE. Треугольник равносторонний.");
        }
    }

    public void boolean31() {
        System.out.println("Boolean31. Даны целые числа a, b, c, являющиеся сторонами некоторого треугольника. " +
                "Проверить истинность высказывания: «Треугольник со сторонами a, b, c является равнобедренным».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();

        if (A + B > C && A + C > B && B + C > A) {//проверить, существует ли треугольник
            if (A == B || B == C || A == C) {
                System.out.println("TRUE. Треугольник равнобедренный.");
            }
        }
    }

    public void boolean32() {
        System.out.println("Boolean32. Даны целые числа a, b, c, являющиеся сторонами некоторого треугольника. " +
                "Проверить истинность высказывания: «Треугольник со сторонами a, b, c является прямоугольным».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();

        //теорема Пифагора a^2+b^2=c^2
        if ((Math.pow(A, 2) + Math.pow(B, 2) == Math.pow(C, 2) ||
                Math.pow(B, 2) + Math.pow(C, 2) == Math.pow(A, 2)) ||
                Math.pow(A, 2) + Math.pow(C, 2) == Math.pow(B, 2)) {
            System.out.println("TRUE. Треугольник является прямоугольным");
        }
    }

    public void boolean33() {
        System.out.println("Boolean33. Даны целые числа a, b, c. Проверить истинность высказывания:\n" +
                "«Существует треугольник со сторонами a, b, c».");
        System.out.println("Введите число А");
        double A = myScan.nextDouble();
        System.out.println("Введите число B");
        double B = myScan.nextDouble();
        System.out.println("Введите число C");
        double C = myScan.nextDouble();

        if (A + B > C && A + C > B && B + C > A) {//проверить, существует ли треугольник
            System.out.println("TRUE. Треугольник существует.");
        }
    }

    public void boolean34() {
        System.out.println("Boolean34. Даны координаты поля шахматной доски x, y (целые числа, лежащие в диапазоне 1–8)." +
                "\n Учитывая, что левое нижнее поле доски (1, 1) является черным, проверить истинность высказывания: " +
                "«Данное поле является белым».");
        System.out.println("Введите X");
        double X = myScan.nextDouble();
        System.out.println("Введите Y");
        double Y = myScan.nextDouble();

        if ((X % 2 == 0 && Y % 2 != 0) || (X % 2 != 0 && Y % 2 == 0)) {//но лучше через сумму координат
            System.out.println("TRUE. Данное поле является белым");
        }
    }

    public void boolean35() {
        System.out.println("Boolean35. Даны координаты двух различных полей шахматной доски x1,y1, x2, y2" +
                " (целые числа, лежащие в диапазоне 1–8).\n Проверить истинность высказывания: " +
                "«Данные поля имеют одинаковый цвет».");
        System.out.println("Введите X1");
        double X1 = myScan.nextDouble();
        System.out.println("Введите Y1");
        double Y1 = myScan.nextDouble();
        System.out.println("Введите X2");
        double X2 = myScan.nextDouble();
        System.out.println("Введите Y2");
        double Y2 = myScan.nextDouble();

        if ((X1 + X2 + Y1 + Y2) % 2 == 0) {
            System.out.println("TRUE. Данные поля имеют одинаковый цвет");
        }
    }

    public void boolean36() {
        System.out.println("Boolean36. Даны координаты двух различных полей шахматной доски x1, y1, x2, y2" +
                " (целые числа, лежащие в диапазоне 1–8). \n Проверить истинность высказывания: " +
                "«Ладья за один ход может перейти с одного поля на другое».");
        System.out.println("Введите X1");
        double X1 = myScan.nextDouble();
        System.out.println("Введите Y1");
        double Y1 = myScan.nextDouble();
        System.out.println("Введите X2");
        double X2 = myScan.nextDouble();
        System.out.println("Введите Y2");
        double Y2 = myScan.nextDouble();

        if (X1 == X2 || Y1 == Y2) {//ладья двигается только по прямой
            System.out.println("TRUE. Ладья за один ход может перейти с одного поля на другое");
        }
    }

    public void boolean37() {
        System.out.println("Boolean37. Даны координаты двух различных полей шахматной доски x1,y1, x2, y2 " +
                "(целые числа, лежащие в диапазоне 1–8). \n " +
                "Проверить истинность высказывания: «Король за один ход может перейти с одного поля на другое».");
        System.out.println("Введите X1");
        double X1 = myScan.nextDouble();
        System.out.println("Введите Y1");
        double Y1 = myScan.nextDouble();
        System.out.println("Введите X2");
        double X2 = myScan.nextDouble();
        System.out.println("Введите Y2");
        double Y2 = myScan.nextDouble();

        if (Math.abs(X1 - X2) < 2 || Math.abs(Y1 - Y2) < 2) {//король двигается только на 1 кл
            System.out.println("TRUE. Король за один ход может перейти с одного поля на другое");
        }
    }

    public void boolean38() {
        System.out.println("Boolean38. Даны координаты двух различных полей шахматной доски x1,y1, x2, y2" +
                " (целые числа, лежащие в диапазоне 1–8). \n Проверить истинность" +
                "высказывания: «Слон за один ход может перейти с одного поля на другое».");
        System.out.println("Введите X1");
        double X1 = myScan.nextDouble();
        System.out.println("Введите Y1");
        double Y1 = myScan.nextDouble();
        System.out.println("Введите X2");
        double X2 = myScan.nextDouble();
        System.out.println("Введите Y2");
        double Y2 = myScan.nextDouble();

        if (Math.abs(X1 - X2) == Math.abs(Y1 - Y2)) {
            System.out.println("TRUE. Слон за один ход может перейти с одного поля на другое");
        }
    }

    public void boolean39() {
        System.out.println("Boolean39. Даны координаты двух различных полей шахматной доски x1, y1,x2, y2 " +
                "(целые числа, лежащие в диапазоне 1–8). \n" +
                "Проверить истинность высказывания: «Ферзь за один ход может перейти с одного поля на другое».");
        System.out.println("Введите X1");
        double X1 = myScan.nextDouble();
        System.out.println("Введите Y1");
        double Y1 = myScan.nextDouble();
        System.out.println("Введите X2");
        double X2 = myScan.nextDouble();
        System.out.println("Введите Y2");
        double Y2 = myScan.nextDouble();

        if (X1 == X2 || Y1 == Y2 || (Math.abs(X1 - X2) == Math.abs(Y1 - Y2))) {
            System.out.println("TRUE. Ферзь за один ход может перейти с одного поля на другое");
        }
    }

    public void boolean40() {
        System.out.println("Boolean40. Даны координаты двух различных полей шахматной доски x1,y1, x2, y2" +
                " (целые числа, лежащие в диапазоне 1–8). \n Проверить истинность" +
                "высказывания: «Конь за один ход может перейти с одного поля на другое».");
        System.out.println("Введите X1");
        double X1 = myScan.nextDouble();
        System.out.println("Введите Y1");
        double Y1 = myScan.nextDouble();
        System.out.println("Введите X2");
        double X2 = myScan.nextDouble();
        System.out.println("Введите Y2");
        double Y2 = myScan.nextDouble();

        if ((Math.abs(X1 - X2) == 2 && Math.abs(Y1 - Y2) == 1) || (Math.abs(X1 - X2) == 1 && Math.abs(Y1 - Y2) == 2)) {
            System.out.println("TRUE. Конь за один ход может перейти с одного поля на другое");
        }
    }
}
