import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class IfTasks {
    private final Scanner myScan = new Scanner(System.in);

    public void if1() {
        System.out.println("If1. Дано целое число. Если оно является положительным, то прибавить к" +
                " нему 1; в противном случае не изменять его. Вывести полученное число.");
        int value = myScan.nextInt();
        System.out.println(value > 0 ? value + 1 : value);
    }

    public void if2() {
        System.out.println("If2. Дано целое число. Если оно является положительным, то прибавить к" +
                " нему 1; в противном случае вычесть из него 2. Вывести полученное число.");
        int value = myScan.nextInt();
        System.out.println(value > 0 ? value + 1 : value - 2);
    }

    public void if3() {
        System.out.println("If3. Дано целое число. Если оно является положительным, то прибавить к нему 1; " +
                "если отрицательным, то вычесть из него 2;\n" +
                " если нулевым, то заменить его на 10. Вывести полученное число.");
        int value = myScan.nextInt();
        if (value > 0) {
            System.out.println(value + 1);
        } else if (value < 0) {
            System.out.println(value - 2);
        } else {
            System.out.println(10);
        }
    }

    public void if4() {
        System.out.println("If4. Даны три целых числа. Найти количество положительных чисел в исходном наборе.");
        int value1 = myScan.nextInt();
        int value2 = myScan.nextInt();
        int value3 = myScan.nextInt();
        int temp = 0;
        if (value1 > 0) {
            temp++;
        }
        if (value2 > 0) {
            temp++;
        }
        if (value3 > 0) {
            temp++;
        }
        System.out.println(temp);
    }

    public void if5() {
        System.out.println("If5. Даны три целых числа. Найти количество положительных и количество " +
                "отрицательных чисел в исходном наборе.");
        int value1 = myScan.nextInt();
        int value2 = myScan.nextInt();
        int value3 = myScan.nextInt();
        int aboveZero = 0;
        int belowZero = 0;

        if (value1 > 0) {
            aboveZero++;
        } else if (value1 < 0) {
            belowZero++;
        }

        if (value2 > 0) {
            aboveZero++;
        } else if (value2 < 0) {
            belowZero++;
        }

        if (value3 > 0) {
            aboveZero++;
        } else if (value3 < 0) {
            belowZero++;
        }
        System.out.println("Положительные: " + aboveZero + "Отрицательные: " + belowZero);
    }

    public void if6() {
        System.out.println("If6. Даны два числа. Вывести большее из них.");
        int value1 = myScan.nextInt();
        int value2 = myScan.nextInt();

        if (value1 > value2) {
            System.out.println(value1);
        } else if (value1 < value2) {
            System.out.println(value2);
        }
    }

    public void if7() {
        System.out.println("If7. Даны два числа. Вывести порядковый номер меньшего из них.");
        int value1 = myScan.nextInt();
        int value2 = myScan.nextInt();

        if (value1 > value2) {
            System.out.println(1);
        } else if (value1 < value2) {
            System.out.println(2);
        }
    }

    public void if8() {
        System.out.println("If8. Даны два числа. Вывести вначале большее, а затем меньшее из них.");
        int value1 = myScan.nextInt();
        int value2 = myScan.nextInt();

        if (value1 > value2) {
            System.out.println(value1 + " " + value2);
        } else if (value1 < value2) {
            System.out.println(value2 + " " + value1);
        }
    }

    public void if9() {
        System.out.println("If9. Даны две переменные вещественного типа: A, B. " +
                "Перераспределить значения данных переменных так, чтобы в A оказалось меньшее из значений,\n" +
                "а в B — большее. Вывести новые значения переменных A и B.");
        System.out.println("Введите А");
        int A = myScan.nextInt();
        System.out.println("Введите В");
        int B = myScan.nextInt();
        int temp = 0;
        if (A > B) {
            temp = B;
            B = A;
            A = temp;
        }
        System.out.println("А: " + A);
        System.out.println("B: " + B);
    }

    public void if10() {
        System.out.println("If10. Даны две переменные целого типа: A и B. Если их значения не равны," +
                " то присвоить каждой переменной сумму этих значений,\n" +
                "а если равны, то присвоить переменным нулевые значения. Вывести новые значения переменных A и B.");
        System.out.println("Введите А");
        int A = myScan.nextInt();
        System.out.println("Введите В");
        int B = myScan.nextInt();
        if (A == B) {
            A = 0;
            B = 0;
        } else {
            int sum = A + B;
            A = sum;
            B = sum;
        }
        System.out.println(A + " " + B);
    }

    public void if11() {
        System.out.println("If11. Даны две переменные целого типа: A и B. Если их значения не равны, то " +
                "присвоить каждой переменной большее из этих значений, \n" +
                "а если равны, то присвоить переменным нулевые значения. Вывести новые значения переменных A и B.");
        System.out.println("Введите А");
        int A = myScan.nextInt();
        System.out.println("Введите В");
        int B = myScan.nextInt();
        if (A == B) {
            A = 0;
            B = 0;
        } else {
            if (A > B) {
                B = A;
            } else {
                A = B;
            }
        }
        System.out.println(A + " " + B);
    }

    public void if12() {
        System.out.println("If12. Даны три числа. Найти наименьшее из них.");
        System.out.println("Введите А");
        double A = myScan.nextDouble();
        System.out.println("Введите В");
        double B = myScan.nextDouble();
        System.out.println("Введите C");
        double C = myScan.nextDouble();

        //ещё можно через min решить
        if (A < B && A < C) {
            System.out.println(A);
        } else if (B < A && B < C) {
            System.out.println(B);
        } else if (C < A && C < B) {
            System.out.println(C);
        }
    }

    public void if13() {
        System.out.println("If13. Даны три числа. Найти среднее из них (то есть число, расположенное" +
                " между наименьшим и наибольшим).");
        System.out.println("Введите А");
        double A = myScan.nextDouble();
        System.out.println("Введите В");
        double B = myScan.nextDouble();
        System.out.println("Введите C");
        double C = myScan.nextDouble();
        double min = 0;
        double max = 0;

        //находим минимальное и максимальное значение, при строгом неравенстве
        if (A < B && A < C) {//минимальное
            min = A;
        } else if (B < A && B < C) {
            min = B;
        } else if (C < A && C < B) {
            min = C;
        }

        if (A > B && A > C) {//максимальное
            max = A;
        } else if (B > A && B > C) {
            max = B;
        } else if (C > A && C > B) {
            max = C;
        }

        if (A != min && A != max) {
            System.out.println(A);
        } else if (B != min && B != max) {
            System.out.println(B);
        } else if (C != min && C != max) {
            System.out.println(C);
        }
    }

    public void if14() {
        System.out.println("If14. Даны три числа. Вывести вначале наименьшее, а затем наибольшее из данных чисел.");
        System.out.println("Введите А");
        double A = myScan.nextDouble();
        System.out.println("Введите В");
        double B = myScan.nextDouble();
        System.out.println("Введите C");
        double C = myScan.nextDouble();
        double min = 0;
        double max = 0;

        //находим минимальное и максимальное значение, при строгом неравенстве
        if (A < B && A < C) {//минимальное
            min = A;
        } else if (B < A && B < C) {
            min = B;
        } else if (C < A && C < B) {
            min = C;
        }

        if (A > B && A > C) {//максимальное
            max = A;
        } else if (B > A && B > C) {
            max = B;
        } else if (C > A && C > B) {
            max = C;
        }
        System.out.println("Наименьшее: " + min + "Наибольшее: " + max);
    }

    public void if15() {
        System.out.println("If15. Даны три числа. Найти сумму двух наибольших из них.");
        System.out.println("Введите А");
        double A = myScan.nextDouble();
        System.out.println("Введите В");
        double B = myScan.nextDouble();
        System.out.println("Введите C");
        double C = myScan.nextDouble();

        double max = Math.max(Math.max(A, B), C); // находим максимальное число
        if (max == A) {
            System.out.println(max + Math.max(B, C));
        } else if (max == B) {
            System.out.println(max + Math.max(A, C));
        } else if (max == C) {
            System.out.println(max + Math.max(A, B));
        }
    }

    public void if16() {
        System.out.println("If16. Даны три переменные вещественного типа: A, B, C.\n " +
                "Если их значения упорядочены по возрастанию, то удвоить их; " +
                "в противном случае заменить значение каждой переменной на противоположное.\n " +
                "Вывести новые значения переменных A, B, C.");
        System.out.println("Введите А");
        double A = myScan.nextDouble();
        System.out.println("Введите В");
        double B = myScan.nextDouble();
        System.out.println("Введите C");
        double C = myScan.nextDouble();

        if (A < B && B < C) {
            A = A * 2;
            B = B * 2;
            C = C * 2;
        } else {
            A = -A;
            B = -B;
            C = -C;
        }
        System.out.println(A + " " + B + " " + C);
    }

    public void if17() {
        System.out.println("If17. Даны три переменные вещественного типа: A, B, C. \n" +
                "Если их значения упорядочены по возрастанию или убыванию, то удвоить их; " +
                "в противном случае заменить значение каждой переменной на противоположное.\n" +
                "Вывести новые значения переменных A, B, C.");
        System.out.println("Введите А");
        double A = myScan.nextDouble();
        System.out.println("Введите В");
        double B = myScan.nextDouble();
        System.out.println("Введите C");
        double C = myScan.nextDouble();

        if ((A < B && B < C) || (A > B && B > C)) {
            A = A * 2;
            B = B * 2;
            C = C * 2;
        } else {
            A = -A;
            B = -B;
            C = -C;
        }
        System.out.println(A + " " + B + " " + C);
    }

    public void if18() {
        System.out.println("If18. Даны три целых числа, одно из которых отлично от двух других, равных между собой. \n" +
                "Определить порядковый номер числа, отличного от остальных.");
        System.out.println("Введите А");
        double A = myScan.nextDouble();
        System.out.println("Введите В");
        double B = myScan.nextDouble();
        System.out.println("Введите C");
        double C = myScan.nextDouble();

        if (A == B) {
            System.out.println(3);
        } else if (A == C) {
            System.out.println(2);
        } else if (B == C) {
            System.out.println(1);
        }
    }

    public void if19() {
        System.out.println("If19. Даны четыре целых числа, одно из которых отлично от трех других, равных между собой.\n" +
                " Определить порядковый номер числа, отличного от остальных.");
        System.out.println("Введите А");
        double A = myScan.nextDouble();
        System.out.println("Введите В");
        double B = myScan.nextDouble();
        System.out.println("Введите C");
        double C = myScan.nextDouble();
        System.out.println("Введите D");
        double D = myScan.nextDouble();

        if (A == B && B == C) {
            System.out.println(D);
        } else if (A == B && B == D) {
            System.out.println(C);
        } else if (B == C && C == D) {
            System.out.println(A);
        } else if (C == D && D == A) {
            System.out.println(B);
        }
    }

    public void if20() {
        System.out.println("If20. На числовой оси расположены три точки: A, B, C. \n" +
                "Определить, какая из двух последних точек (B или C) расположена ближе к A, " +
                "и вывести эту точку и ее расстояние от точки A.");
        System.out.println("Введите А");
        double A = myScan.nextDouble();
        System.out.println("Введите В");
        double B = myScan.nextDouble();
        System.out.println("Введите C");
        double C = myScan.nextDouble();

        if (Math.abs(A - B) > Math.abs(A - C)) {
            System.out.println("Точка С: " + (A - C));
        } else if (Math.abs(A - B) < Math.abs(A - C)) {
            System.out.println("Точка B: " + (A - B));
        }
    }

    public void if21() {
        System.out.println("If21. Даны целочисленные координаты точки на плоскости. \n" +
                "Если точка совпадает с началом координат, то вывести 0. " +
                "Если точка не совпадает с началом координат, но лежит на оси OX или OY, то вывести соответственно 1 или 2." +
                " Если точка не лежит на координатных осях, то вывести 3.");
        System.out.println("Введите X");
        int X = myScan.nextInt();
        System.out.println("Введите Y");
        int Y = myScan.nextInt();

        if (X == 0 && Y == 0) {
            System.out.println(0);
        } else if (X > 0 && Y == 0) {//точка на оси ОХ
            System.out.println(1);
        } else if (X == 0 && Y > 0) {//точка на оси ОY
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }

    public void if22() {
        System.out.println("If22. Даны координаты точки, не лежащей на координатных осях OX и OY.\n" +
                "Определить номер координатной четверти, в которой находится данная точка.");
        System.out.println("Введите X");
        int X = myScan.nextInt();
        System.out.println("Введите Y");
        int Y = myScan.nextInt();

        if (X > 0 && Y > 0) {
            System.out.println(1);//первая
        } else if (X < 0 && Y > 0) {
            System.out.println(2);
        } else if (X < 0 && Y < 0) {
            System.out.println(3);
        } else if (X > 0 && Y < 0) {
            System.out.println(4);
        }
    }

    public void if23() {
        System.out.println("If23. Даны целочисленные координаты трех вершин прямоугольника, " +
                "стороны которого параллельны координатным осям. \nНайти координаты его четвертой вершины.");

        System.out.println("Введите X1 Y1");
        String[] first = myScan.nextLine().split(" ", 2);
        int X1 = Integer.parseInt(first[0]);
        int Y1 = Integer.parseInt(first[1]);

        System.out.println("Введите X2 Y2");
        String[] second = myScan.nextLine().split(" ", 2);
        int X2 = Integer.parseInt(second[0]);
        int Y2 = Integer.parseInt(second[1]);

        System.out.println("Введите X3 Y3");
        String[] third = myScan.nextLine().split(" ", 2);
        int X3 = Integer.parseInt(third[0]);
        int Y3 = Integer.parseInt(third[1]);

        if (X1 == X2) {
            System.out.println("Четвертая вершина имеет координаты: " + X3 + " " + Y1);
        } else if (X1 == X3) {
            System.out.println("Четвертая вершина имеет координаты: " + X2 + " " + Y1);
        } else {
            if (Y1 == Y2) {
                System.out.println("Четвертая вершина имеет координаты: " + X1 + " " + Y3);
            } else {
                System.out.println("Четвертая вершина имеет координаты: " + X1 + " " + Y2);
            }
        }
    }

    public void if24() {
        System.out.println("If24. Для данного вещественного x найти значение следующей функции " +
                "f, принимающей вещественные значения:\n" +
                "f (x) = 2·sin(x), если x > 0,\n" +
                "6 − x, если x ≤ 0.");

        System.out.println("Введите X");
        int X = myScan.nextInt();
        if (X > 0) {
            System.out.println(2 * Math.sin(X));
        } else if (X <= 0) {
            System.out.println(6 - X);
        }
    }

    public void if25() {
        System.out.println("If25. Для данного целого x найти значение следующей функции f, принимающей значения целого типа:\n" +
                "f (x) = 2·x, если x < −2 или x > 2,\n" +
                "−3·x, в противном случае.");
        System.out.println("Введите X");
        int X = myScan.nextInt();
        if (X < -2 || X > 2) {
            System.out.println(2 * X);
        } else {
            System.out.println(-3 * X);
        }
    }

    public void if26() {
        System.out.println("If26. Для данного вещественного x найти значение следующей функции f, " +
                "принимающей вещественные значения:\n" +
                "−x, если x ≤ 0,\n" +
                "x^2 , если 0 < x < 2,\n" +
                "4, если x ≥ 2.");
        System.out.println("Введите X");
        int X = myScan.nextInt();
        if (X <= 0) {
            System.out.println(-X);
        } else if (X == 1) {
            System.out.println(Math.pow(X, 2));
        } else {
            System.out.println(4);
        }
    }

    public void if27() {
        System.out.println("If27. Для данного вещественного x найти значение следующей функции f," +
                " принимающей значения целого типа:\n" +
                "0, если x < 0,\n" +
                "1, если x принадлежит [0, 1), [2, 3), . . . ,\n" +
                "−1, если x принадлежит [1, 2), [3, 4), . . . .");
        System.out.println("Введите X");
        double X = myScan.nextDouble();
        if (X < 0) {
            System.out.println(0);
        } else if (X % 2 == 0) {
            System.out.println(1);
        } else if (X % 2 != 0) {
            System.out.println(-1);
        }
    }

    public void if28() {
        System.out.println("If28. Дан номер года (положительное целое число).\n" +
                "Определить количество дней в этом году, учитывая, что обычный год насчитывает 365 дней," +
                " а високосный — 366 дней.\n" +
                "Високосным считается год, делящийся на 4, за исключением тех годов, " +
                "которые делятся на 100 и не делятся на 400 \n" +
                "(например, годы 300, 1300 и 1900 не являются високосными, а 1200 и 2000 — являются).");
        System.out.println("Введите год");
        int year = myScan.nextInt();
        if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0) {
            System.out.println(365);
        } else {
            System.out.println(366);
        }
    }

    public void if29() {
        System.out.println("If29. Дано целое число. Вывести его строку-описание вида «отрицательное четное число», " +
                "«нулевое число», «положительное нечетное число» и т. д.");
        System.out.println("Введите число");
        int value = myScan.nextInt();
        if (value < 0 && value % 2 == 0) {
            System.out.println("Отрицательное четное число");
        } else if (value < 0 && value % 2 != 0) {
            System.out.println("Отрицательное нечетное число");
        } else if (value == 0) {
            System.out.println("Нулевое число");
        } else if (value > 0 && value % 2 == 0) {
            System.out.println("Положительное четное число");
        } else if (value > 0 && value % 2 != 0) {
            System.out.println("Положительное нечетное число");
        }
    }

    public void if30() {
        System.out.println("If30. Дано целое число, лежащее в диапазоне 1–999. \n" +
                "Вывести его строку - описание вида «четное двузначное число», «нечетное трехзначное число» и т. д.");
        System.out.println("Введите число");
        int value = myScan.nextInt();
        if (value % 2 == 0) {
            if (value < 1000 && value > 99) {
                System.out.println("Четное 3зн число");
            } else if (value < 100 && value > 9) {
                System.out.println("Четное 2зн число");
            } else if (value < 10 && value > 0) {
                System.out.println("Четное 1зн число");
            }
        } else {
            if (value < 1000 && value > 99) {
                System.out.println("Нечетное 3зн число");
            } else if (value < 100 && value > 9) {
                System.out.println("Нечетное 2зн число");
            } else if (value < 10 && value > 0) {
                System.out.println("Нечетное 1зн число");
            }
        }
    }
}
