import java.util.Scanner;

public class ForTasks {
    private final Scanner myScan = new Scanner(System.in);

    public void for1() {
        System.out.println("For1. Даны целые числа K и N (N > 0). Вывести N раз число K.");
        System.out.println("Введите К");
        int K = myScan.nextInt();
        if (K < 1) {
            System.out.println("K должно быть > 0");
        } else {
            System.out.println("Введите N");
            int N = myScan.nextInt();
            if (N < 0) {
                System.out.println("N должно быть больше 0");
            } else {
                for (int i = 0; i < N; i++) {
                    System.out.println(K);
                }
            }
        }
    }

    public void for2() {
        System.out.println("For2. Даны два целых числа A и B (A < B).\n Вывести в порядке возрастания все целые числа, " +
                "расположенные между A и B (включая сами числа A и B), а также количество N этих чисел.");
        System.out.println("Введите A");
        int A = myScan.nextInt();
        System.out.println("Введите B");
        int B = myScan.nextInt();
        if (A > B) {
            System.out.println("Ошибка! По условию A < B!");
        } else {
            for (; A < B + 1; A++) {
                System.out.println(A);
            }
        }
    }

    public void for3() {
        System.out.println("For3. Даны два целых числа A и B (A < B). \n Вывести в порядке убывания все целые числа, " +
                "расположенные между A и B (не включая числа A и B), а также количество N этих чисел.");
        System.out.println("Введите A");
        int A = myScan.nextInt();
        System.out.println("Введите B");
        int B = myScan.nextInt();
        if (A > B) {
            System.out.println("Ошибка! По условию A < B!");
        } else {
            for (; B > A + 1; B--) {
                System.out.println(B - 1);
            }
        }
    }

    public void for4() {
        System.out.println("For4. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1, 2, . . . , 10кг " +
                "конфет.");
        System.out.println("Введите цену за 1кг конфет");
        int price = myScan.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println("Цена за " + i + "кг " + (price * i));
        }
    }

    public void for5() {
        System.out.println("For5. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 0.1, 0.2, . . . , 1кг " +
                "конфет.");
        System.out.println("Введите цену за 1кг конфет");
        double price = myScan.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(((price / 10) * i));
        }
    }

    public void for6() {
        System.out.println("For6. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2, 1.4, ... , 2кг" +
                " конфет.");
        System.out.println("Введите цену за 1кг конфет");
        double price = myScan.nextInt();
        double price200g = price / 5;
        for (int i = 1; i < 6; i++) {
            System.out.println(price + (price200g * i));
        }
    }

    public void for7() {
        System.out.println("For7. Даны два целых числа A и B (A < B). " +
                "Найти сумму всех целых чисел от A до B включительно.");
        System.out.println("Введите A");
        int A = myScan.nextInt();
        System.out.println("Введите B");
        int B = myScan.nextInt();
        if (A > B) {
            System.out.println("Ошибка! По условию A < B!");
        } else {
            int sum = 0;
            for (; A < B + 1; A++) {
                sum = sum + A;
            }
            System.out.println(sum);
        }
    }

    public void for8() {
        System.out.println("For8. Даны два целых числа A и B (A < B). " +
                "Найти произведение всех целых чисел от A до B включительно.");
        System.out.println("Введите A");
        int A = myScan.nextInt();
        System.out.println("Введите B");
        int B = myScan.nextInt();
        if (A > B) {
            System.out.println("Ошибка! По условию A < B!");
        } else {
            int sum = 1;
            for (; A < B + 1; A++) {
                sum = sum * A;
            }
            System.out.println(sum);
        }
    }

    public void for9() {
        System.out.println("For9. Даны два целых числа A и B (A < B). " +
                "Найти сумму квадратов всех целых чисел от A до B включительно.");
        System.out.println("Введите A");
        int A = myScan.nextInt();
        System.out.println("Введите B");
        int B = myScan.nextInt();
        if (A > B) {
            System.out.println("Ошибка! По условию A < B!");
        } else {
            double sum = 0;
            for (; A < B + 1; A++) {
                sum = sum + Math.pow(A, 2);
            }
            System.out.println(sum);
        }
    }

    public void for10() {
        System.out.println("For10. Дано целое число N>0. Найти сумму 1 + 1/2 + 1/3 + ... + 1/N (вещественное число).");
        System.out.println("Введите число N");
        int N = myScan.nextInt();
        if (N < 1) {
            System.out.println("Ошибка! По условию N>0");
        } else {
            double sum = 0;
            for (double i = 1; i < N + 1; i++) {
                sum = sum + (1 / i);
                System.out.println(sum);
            }
        }
    }

    public void for11() {
        System.out.println("For11. Дано целое число N>0.Найти сумму N^2 + (N + 1)^2 + (N + 2)^2 + ... + (2·N)^2(целое число).");
        System.out.println("Введите число N");
        int N = myScan.nextInt();
        if (N < 1) {
            System.out.println("Ошибка! По условию N>0");
        } else {
            double sum = 0;
            for (int i = N; i < (2 * N); i++) {
                sum = sum + Math.pow(N, 2);
            }
            System.out.println(sum);
        }
    }

    public void for12() {
        System.out.println("For12. Дано целое число N>0. Найти произведение 1.1 · 1.2 · 1.3 · ... (N сомножителей).");
        System.out.println("Введите число N");
        int N = myScan.nextInt();
        if (N < 1) {
            System.out.println("Ошибка! По условию N>0");
        } else {
            double sum = 0;
            for (double i = 1; i < N + 1; i++) {
                sum = sum + 1 + (i / 10);
            }
            System.out.println(sum);
        }
    }

    public void for13() {
        System.out.println("For13. Дано целое число N>0. \n" +
                "Найти значение выражения 1.1 − 1.2 + 1.3 − ... (N слагаемых, знаки чередуются). " +
                "Условный оператор не использовать.");
        System.out.println("Введите число N");
        int N = myScan.nextInt();
        if (N < 1) {
            System.out.println("Ошибка! По условию N>0");
        } else {
            int temp = -1;
            double sum = 0;
            for (double i = 1; i < N + 1; i++) {
                temp = -temp;
                sum = sum + (temp * (1 + (i / 10)));
            }
            System.out.println(sum);
        }
    }

    public void for14() {
        System.out.println("For14. Дано целое число N>0. Найти квадрат данного числа, используя для его " +
                "вычисления следующую формулу: \n N2 = 1 + 3 + 5 + . . . + (2·N − 1). После добавления к сумме " +
                "каждого слагаемого выводить текущее значение суммы (в результате будут выведены квадраты всех " +
                "целых чисел от 1 до N).");
        System.out.println("Введите число N");
        int N = myScan.nextInt();
        if (N < 1) {
            System.out.println("Ошибка! По условию N>0");
        } else {
            int A = 0;
            for (int i = 1; i < N + 1; i++) {
                A = A + 2 * i - 1;
                System.out.println(i + " " + A);
            }
        }
    }

    public void for15() {
        System.out.println("For15. Дано вещественное число A и целое число N>0. Найти A в степени N:\n" +
                "A^N = A·A· . . . ·A (числа A перемножаются N раз).");
        System.out.println("Введите число A");
        int A = myScan.nextInt();
        System.out.println("Введите число N");
        int N = myScan.nextInt();
        if (A < 1 || N < 1) {
            System.out.println("Ошибка");
        } else {
            int result = 1;
            for (int i = 1; i < N + 1; i++) {
                result = result * A;
            }
            System.out.println(result);
        }
    }

    public void for16() {
        System.out.println("For16. Дано вещественное число A и целое число N>0. \n" +
                "Используя один цикл, вывести все целые степени числа A от 1 до N.");
        int A = myScan.nextInt();
        int N = myScan.nextInt();
        if (A < 1 || N < 1) {
            System.out.println("Ошибка!");
        } else {
            int result = 1;
            for (int i = 1; i < N + 1; i++) {
                result = result * A;
                System.out.println(result);
                //или System.out.println(Math.pow(A,i));
            }
        }
    }

    public void for17() {
        System.out.println("For17. Дано вещественное число A и целое число N>0. \n" +
                "Используя один цикл, найти сумму 1 + A + A^2 + A^3 + . . . + A^N .");
        int A = myScan.nextInt();
        int N = myScan.nextInt();
        if (A < 1 || N < 1) {
            System.out.println("Ошибка!");
        } else {
            double sum = 1;
            for (int i = 1; i < N + 1; i++) {
                sum = sum + Math.pow(A, i);
                System.out.println(sum);
            }
        }
    }

    public void for18() {
        System.out.println("For18. Дано вещественное число A и целое число N>0. Используя один цикл, найти значение выражения\n" +
                "1 − A + A^2 − A^3 + ... + (−1)^N·A^N. Условный оператор не использовать.");
        int A = myScan.nextInt();
        int N = myScan.nextInt();
        if (A < 1 || N < 1) {
            System.out.println("Ошибка!");
        } else {
            int temp = -1;
            double sum = 1;
            for (int i = 1; i < N + 1; i++) {
                sum = sum + (temp * (Math.pow(A, i)));
                temp = -temp;
            }
            System.out.println(sum);
        }
    }

    public void for19() {
        System.out.println("For19. Дано целое число N>0. Найти произведение N! = 1·2·...·N (N–факториал). \n" +
                "Чтобы избежать целочисленного переполнения, вычислять это произведение с помощью " +
                "вещественной переменной и вывести его как вещественное число.");
        int N = myScan.nextInt();
        if (N < 1) {
            System.out.println("Ошибка!");
        } else {
            int sum = 1;
            for (int i = 1; i < N + 1; i++) {
                sum = sum * i;
            }
            System.out.println(sum);
        }
    }

    public void for20() {
        System.out.println("For20. Дано целое число N>0. Используя один цикл, найти сумму 1! + 2! + 3! + ... + N! " +
                "(выражение N! — N–факториал — обозначает произведение всех целых чисел от 1 до N: N! = 1·2·...·N). \n" +
                "Чтобы избежать целочисленного переполнения, проводить вычисления с помощью вещественных переменных " +
                "и вывести результат как вещественное число.");
        int N = myScan.nextInt();
        if (N < 1) {
            System.out.println("Ошибка");
        } else {
            int sum = 0;
            int factorial = 1;
            for (int i = 1; i < N + 1; i++) {
                factorial = factorial * i;
                sum = sum + factorial;
            }
            System.out.println(sum);
        }
    }

    public void for21() {
        System.out.println("For21. Дано целое число N>0. Используя один цикл, найти сумму " +
                "1 + 1/(1!) + 1/(2!) + 1/(3!) + ... + 1/(N!) (выражение N! — N–факториал — " +
                "обозначает произведение всех целых чисел от 1 до N: N! = 1·2·. . .·N). \n" +
                "Полученное число является приближенным значением константы e = exp(1).");
        int N = myScan.nextInt();
        if (N < 1) {
            System.out.println("Ошибка!");
        } else {
            int factorial = 1;
            int sum = 1;
            for (int i = 1; i < N + 1; i++) {
                factorial = factorial * i;
                sum = sum + 1 / factorial;
            }
            System.out.println(sum);
        }
    }

    public void for22() {
        System.out.println("For22. Дано вещественное число X и целое число N>0. \n" +
                "Найти значение выражения 1 + X + X2/(2!) + . . . + XN /(N!)(N! = 1·2·. . .·N). \n" +
                "Полученное число является приближенным значением функции exp в точке X.");
        int X = myScan.nextInt();
        int N = myScan.nextInt();
        if (X < 1 || N < 1) {
            System.out.println("Ошибка!");
        } else {
            double sum = 1;
            int factorial = 1;
            for (int i = 1; i < N + 1; i++) {
                factorial = factorial * i;
                sum = sum + (Math.pow(X, i) / factorial);
            }
            System.out.println(sum);
        }

    }

    public void for23() {
        System.out.println("For23. Дано вещественное число X и целое число N > 0). \n" +
                "Найти значение выражения X − X3/(3!) + X5/(5!) − ... + (−1)N ·X2·N+1/((2·N+1)!)(N! = 1·2·. . .·N). \n" +
                "Полученное число является приближенным значением функции sin в точке X.");
        int X = myScan.nextInt();
        int N = myScan.nextInt();
        if (X < 1 || N < 1) {
            System.out.println("Ошибка");
        } else {
            int factorial = 1;
            int temp = -1;
            double sum = 0;
            for (int i = 1; i < N + 1; i = i + 2) {
                factorial = factorial * i;
                temp = -temp;
                sum = sum + (temp * (Math.pow(X, i) / factorial));
            }
            System.out.println(sum);
        }
    }

    public void for24() {
        System.out.println("For24. Дано вещественное число X и целое число N (> 0). " +
                "Найти значение выражения 1 − X2/(2!) + X4/(4!) − ... + (−1)N ·X2·N /((2·N)!)(N! = 1·2·. . .·N). \n" +
                "Полученное число является приближенным значением функции cos в точке X.");
        int X = myScan.nextInt();
        int N = myScan.nextInt();
        if (X < 1 || N < 1) {
            System.out.println("Ошибка");
        } else {
            double sum = 1;
            double firstValue = 1;
            double x2 = Math.pow(X, 2);

            for (int i = 1; i < N - 1; i++) {
                firstValue = -firstValue * x2 / ((2 * i - 1) * 2 * i);
                sum = sum + firstValue;
            }
            System.out.println(sum);
        }
    }

    public void for25() {
        System.out.println("For25. Дано вещественное число X (|X| < 1) и целое число N>0. " +
                "Найти значение выражения X − X2/2 + X3/3 − . . . + (−1)N−1·XN /N. \n" +
                "Полученное число является приближенным значением функции ln в точке 1 + X.");
        int X = myScan.nextInt();
        int N = myScan.nextInt();
        int sum = 0;
        if (X > 1 || N < 1) {
            System.out.println("Ошибка");
        } else {
            int a = X;
            for (int i = 2; i < N + 1; i++) {
                a = -a * X;
                sum = sum + a / i;
            }
            System.out.println(sum);
        }
    }

    public void for26() {
        System.out.println("For26. Дано вещественное число X (|X| < 1) и целое число N (> 0). " +
                "Найти значение выражения X − X3/3 + X5/5 − . . . + (−1)N ·X2·N+1/(2·N+1). \n" +
                "Полученное число является приближенным значением функции arctg в точке X.");
    }

    public void for27() {
        System.out.println("For27. Дано вещественное число X (|X| < 1) и целое число N (> 0). " +
                "Найти значение выражения X + 1·X3/(2·3) + 1·3·X5/(2·4·5) + ... + 1·3·...·(2·N−1)·X2·N+1/(2·4·...·(2·N)·(2·N+1)).\n" +
                "Полученное число является приближенным значением функции arcsin в точке X.");
    }

    public void for28() {
        System.out.println("For28. Дано вещественное число X (|X| < 1) и целое число N (> 0). " +
                "Найти значение выражения 1 + X/2 − 1·X2/(2·4) + 1·3·X3/(2·4·6) − ... + (−1)N−1·1·3·...·(2·N−3)·X N /(2·4·...·(2·N)). \n" +
                "Полученное число является приближенным значением функции √1+X.");
    }

    public void for29() {
        System.out.println("For29. Дано целое число N (> 1) и две вещественные точки на числовой оси: A, B (A < B)." +
                "Отрезок [A, B] разбит на N равных отрезков. \nВывести H — длину каждого отрезка, " +
                "а также набор точек A, A + H, A + 2·H, A + 3·H, . . . , B, образующий разбиение отрезка [A, B].");
    }

    public void for30() {
        System.out.println("For30. Дано целое число N (> 1) и две вещественные точки на числовой оси: A, B (A < B). \n" +
                "Отрезок [A, B] разбит на N равных отрезков. Вывести H — длину каждого отрезка, " +
                "а также значения функции F(X) = 1 − sin(X) в точках, \n" +
                "разбивающих отрезок [A, B]: F(A), F(A + H), F(A + 2·H), . . . , F(B).");
    }

    public void for31() {
        System.out.println("For31. Дано целое число N (> 0). Последовательность вещественных чисел AK определяется следующим образом: \n" +
                "A0 = 2, AK = 2 + 1/AK−1, K = 1, 2, . . . . Вывести элементы A1, A2, . . . , AN .");
    }

    public void for32() {
        System.out.println("For32. Дано целое число N (> 0). Последовательность вещественных чисел AK определяется " +
                "следующим образом: \n A0 = 1, AK = (AK−1 + 1)/K, K = 1, 2, ... . Вывести элементы A1, A2, ... , AN .");
    }

    public void for33() {
        System.out.println("For33. Дано целое число N (> 1). Последовательность чисел Фибоначчи FK (целого типа) " +
                "определяется следующим образом: F1 = 1, F2 = 1, FK = FK−2 + FK−1, K = 3, 4, ... . \n" +
                "Вывести элементы F1, F2, ..., FN .");
    }

    public void for34() {
        System.out.println("For34. Дано целое число N (> 1). Последовательность вещественных чисел AK " +
                "определяется следующим образом: \nA1 = 1, A2 = 2, AK = (AK−2 + 2·AK−1)/3, K = 3, 4, . . . . " +
                "Вывести элементы A1, A2, . . . , AN .");
    }

    public void for35() {
        System.out.println("For35. Дано целое число N (> 2). Последовательность целых чисел AK " +
                "определяется следующим образом: A1 = 1, A2 = 2, A3 = 3, AK = AK−1 + AK−2 − 2·AK−3, K = 4, 5, ... . \n" +
                "Вывести элементы A1, A2, . . . , AN .");
    }

    public void for36() {
        System.out.println("For36. Даны целые положительные числа N и K. Найти сумму 1K + 2K + . . . + N K.\n" +
                "Чтобы избежать целочисленного переполнения, вычислять слагаемые этой суммы с помощью вещественной " +
                "переменной и выводить результат как вещественное число.");
    }

    public void for37() {
        System.out.println("For37. Дано целое число N (> 0). Найти сумму 11 + 22 + ... + N N .\n" +
                "Чтобы избежать целочисленного переполнения, вычислять слагаемые этой суммы с помощью " +
                "вещественной переменной и выводить результат как вещественное число.");
    }

    public void for38() {
        System.out.println("For38. Дано целое число N (> 0). Найти сумму 1N + 2N−1 + . . . + N1.\n" +
                "Чтобы избежать целочисленного переполнения, вычислять слагаемые этой суммы с помощью " +
                "вещественной переменной и выводить результат как вещественное число.");
    }

    public void for39() {
        System.out.println("For39. Даны целые положительные числа A и B (A < B). Вывести все целые числа от A до B " +
                "включительно; \n при этом каждое число должно выводиться столько раз, каково его значение " +
                "(например, число 3 выводится 3 раза).");
    }

    public void for40() {
        System.out.println("For40. Даны целые числа A и B (A < B). Вывести все целые числа от A до B включительно; \n" +
                "при этом число A должно выводиться 1 раз, число A + 1 должно выводиться 2 раза и т. д.");
    }
}
