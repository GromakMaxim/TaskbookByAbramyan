import java.util.Scanner;

public class CaseTasks {
    private final Scanner myScan = new Scanner(System.in);

    public void case1() {
        System.out.println("Case1. Дано целое число в диапазоне 1–7. Вывести строку — название дня недели," +
                " соответствующее данному числу (1 — «понедельник», 2 — «вторник» и т. д.).");
        int value = myScan.nextInt();
        switch (value) {
            case 1 -> System.out.println("понедельник");
            case 2 -> System.out.println("вторник");
            case 3 -> System.out.println("среда");
            case 4 -> System.out.println("четверг");
            case 5 -> System.out.println("пятница");
            case 6 -> System.out.println("суббота");
            case 7 -> System.out.println("воскресенье");
            default -> System.out.println("Введите число в диапазоне 1-7");
        }
    }

    public void case2() {
        System.out.println("Case2. Дано целое число K. Вывести строку-описание оценки, соответствующей числу K \n" +
                "(1 — «плохо», 2 — «неудовлетворительно», 3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»). " +
                "Если K не лежит в диапазоне 1–5, то вывести строку «ошибка».");
        int value = myScan.nextInt();
        switch (value) {
            case 1 -> System.out.println("плохо");
            case 2 -> System.out.println("неудовлетворительно");
            case 3 -> System.out.println("удовлетворительно");
            case 4 -> System.out.println("хорошо");
            case 5 -> System.out.println("отлично");
            default -> System.out.println("ошибка");
        }
    }

    public void case3() {
        System.out.println("Case3. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 — февраль и т. д.). \n" +
                "Вывести название соответствующего времени года («зима», «весна», «лето», «осень»).");
        int value = myScan.nextInt();
        switch (value) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Введите число в диапазоне 1-12");
        }
    }

    public void case4() {
        System.out.println("Case4. Дан номер месяца — целое число в диапазоне 1–12 \n" +
                "(1 — январь, 2 — февраль и т. д.). Определить количество дней в этом месяце для невисокосного года.");
        int value = myScan.nextInt();
        switch (value) {
            case 2 -> System.out.println(28);
            case 4, 6, 9, 11 -> System.out.println(30);
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            default -> System.out.println("Введите число в диапазоне 1-12");
        }
    }


    public void case5() {
        System.out.println("Case5. Арифметические действия над числами пронумерованы следующим образом: " +
                "1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление. \n" +
                "Дан номер действия N (целое число в диапазоне 1–4) и вещественные числа A и B (В не равно 0). " +
                "Выполнить над числами указанное действие и вывести результат.");
        System.out.println("Введите первое число");
        double value1 = myScan.nextDouble();
        System.out.println("Введите второе число");
        double value2 = myScan.nextDouble();
        System.out.println("Введите арифметическое действие: 1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление");
        int typeOperation = myScan.nextInt();

        switch (typeOperation) {
            case 1 -> System.out.println(value1 + value2);
            case 2 -> System.out.println(value1 - value2);
            case 3 -> System.out.println(value1 * value2);
            case 4 -> System.out.println(value1 / value2);
            default -> System.out.println("Введите число в диапазоне 1-4");
        }

    }

    public void case6() {
        System.out.println("Case6. Единицы длины пронумерованы следующим образом: " +
                "1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр. \n" +
                "Дан номер единицы длины (целое число в диапазоне 1–5) и длина отрезка в этих единицах " +
                "(вещественное число). Найти длину отрезка в метрах.");
        System.out.println("Введите длину");
        double length = myScan.nextDouble();
        System.out.println("Выберите единицу измерения");
        System.out.println("1 — дециметр, 2 — километр, 3 — метр, 4 — миллиметр, 5 — сантиметр.");
        int measure = myScan.nextInt();
        switch (measure) {
            case 1 -> System.out.println(length / 10);
            case 2 -> System.out.println(length * 1000);
            case 3 -> System.out.println(length);
            case 4 -> System.out.println(length / 1000);
            case 5 -> System.out.println(length / 100);
            default -> System.out.println("Введите число в диапазоне 1-5");
        }
    }

    public void case7() {
        System.out.println("Case7. Единицы массы пронумерованы следующим образом: " +
                "1 — килограмм, 2 — миллиграмм, 3 — грамм, 4 — тонна, 5 — центнер. \n" +
                "Дан номер единицы массы (целое число в диапазоне 1–5) и масса тела в этих единицах(вещественное число)." +
                " Найти массу тела в килограммах.");
        System.out.println("Введите массу");
        double weight = myScan.nextDouble();
        System.out.println("Выберите единицу измерения");
        System.out.println("1 — килограмм, 2 — миллиграмм, 3 — грамм, 4 — тонна, 5 — центнер");
        int measure = myScan.nextInt();
        switch (measure) {
            case 1 -> System.out.println(weight);
            case 2 -> System.out.println(weight / 1_000_000);
            case 3 -> System.out.println(weight / 1_000);
            case 4 -> System.out.println(weight * 1_000);
            case 5 -> System.out.println(weight * 100);
            default -> System.out.println("Введите число в диапазоне 1-5");
        }
    }

    public void case8() {
        System.out.println("Case8. Даны два целых числа: D (день) и M (месяц), " +
                "определяющие правильную дату невисокосного года. \n" +
                "Вывести значения D и M для даты, предшествующей указанной.");
        System.out.println("Введите день: ");
        int day = myScan.nextInt();
        System.out.println("Введите месяц: ");
        int month = myScan.nextInt();

        if (day == 1 && month != 1) {
            switch (month) {
                case 2 -> System.out.println("День: " + 28 + " " + "Месяц: " + (month - 1));
                case 4, 6, 9, 11 -> System.out.println("День: " + 30 + " " + "Месяц: " + (month - 1));
                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("День: " + 31 + " " + "Месяц: " + (month - 1));
                default -> System.out.println("Введите число в диапазоне 1-12");
            }
        } else if (day == 1) {
            System.out.println("День: " + 31 + " " + "Месяц: " + 12);
        } else if (month != 1) {
            System.out.println((day - 1) + " " + (month - 1));
        } else {
            System.out.println((day - 1) + " " + 12);
        }
    }

    public void case9() {
        System.out.println("Case9. Даны два целых числа: D (день) и M (месяц), " +
                "определяющие правильную дату невисокосного года. \n" +
                "Вывести значения D и M для даты, следующей за указанной.");
        System.out.println("Введите день: ");
        int day = myScan.nextInt();
        System.out.println("Введите месяц: ");
        int month = myScan.nextInt();

        switch (month) {
            case 2 -> {
                if (day == 28) System.out.println("День: " + 1 + "Месяц: " + (month + 1));
                else System.out.println("День: " + (day + 1) + "Месяц: " + (month + 1));
            }
            case 4, 6, 9, 11 -> {
                if (day == 30) System.out.println("День: " + 1 + "Месяц: " + (month + 1));
                else System.out.println("День: " + (day + 1) + "Месяц: " + (month + 1));
            }
            case 1, 3, 5, 7, 8, 10 -> {
                if (day == 31) System.out.println("День: " + 1 + "Месяц: " + (month + 1));
                else System.out.println("День: " + (day + 1) + "Месяц: " + (month + 1));
            }
            case 12 -> {
                if (day == 31) System.out.println("День: " + 1 + "Месяц: " + 1);
                else System.out.println("День: " + (day + 1) + "Месяц: " + 1);
            }
            default -> System.out.println("Введите число в диапазоне 1-12");
        }
    }

    public void case10() {
        System.out.println("Case10. Робот может перемещаться в четырех направлениях " +
                "(«С» — север,«З» — запад, «Ю» — юг, «В» — восток) \n" +
                "и принимать три цифровые команды: 0 — продолжать движение, 1 — поворот налево, −1 — поворот направо. \n" +
                "Дан символ C — исходное направление робота и целое число N — посланная ему команда. " +
                "Вывести направление робота после выполнения полученной команды. \n" +
                "Дан символ C — исходное направление робота и целое число N — посланная ему команда. " +
                "Вывести направление робота после выполнения полученной команды.");
        System.out.println("Введите направление («С» — север,«З» — запад, «Ю» — юг, «В» — восток)");
        String wayToMove = myScan.nextLine();
        System.out.println("Введите команду (0 — продолжать движение, 1 — поворот налево, −1 — поворот направо)");
        int movement = myScan.nextInt();

        switch (movement) {
            case 1:
                switch (wayToMove) {
                    case "С" -> System.out.println("З");
                    case "З" -> System.out.println("Ю");
                    case "Ю" -> System.out.println("В");
                    case "В" -> System.out.println("С");
                }
            case -1:
                switch (wayToMove) {
                    case "С" -> System.out.println("В");
                    case "З" -> System.out.println("С");
                    case "Ю" -> System.out.println("З");
                    case "В" -> System.out.println("Ю");
                }
            case 0:
                System.out.println(wayToMove);
        }
    }

    public void case11() {
        System.out.println("Case11. Локатор ориентирован на одну из сторон света " +
                "(«С» — север, «З» — запад, «Ю» — юг, «В» — восток) и может принимать три цифровые команды поворота: \n" +
                "1 — поворот налево, −1 — поворот направо, 2 — поворот на 180. " +
                "Дан символ C — исходная ориентация локатора и целые числа N1 и N2 — две посланные команды. \n" +
                "Вывести ориентацию локатора после выполнения этих команд.");
        System.out.println("Введите направление («С» — север,«З» — запад, «Ю» — юг, «В» — восток)");
        String wayToMove = myScan.nextLine();
        System.out.println("Введите команду1 (0 — продолжать движение, 1 — поворот налево, −1 — поворот направо)");
        int step1 = myScan.nextInt();
        System.out.println("Введите команду2 (0 — продолжать движение, 1 — поворот налево, −1 — поворот направо)");
        int step2 = myScan.nextInt();
    }

    public void case12() {
        System.out.println("Case12. Элементы окружности пронумерованы следующим образом: \n" +
                "1 — радиус R, " +
                "2 — диаметр D = 2·R, " +
                "3 — длина L = 2·π·R, " +
                "4 — площадь круга S = π·R^2. \n" +
                "Дан номер одного из этих элементов и его значение. " +
                "Вывести значения остальных элементов данной окружности (в том же порядке).");
    }

    public void case13() {
        System.out.println("Case13. Элементы равнобедренного прямоугольного треугольника пронумерованы следующим образом:" +
                " 1 — катет a, " +
                "2 — гипотенуза c = a·√2, " +
                "3 — высота h, опущенная на гипотенузу (h = c/2), " +
                "4 — площадь S = c·h/2.\n " +
                "Дан номер одного из этих элементов и его значение. " +
                "Вывести значения остальных элементов данного треугольника (в том же порядке).");
    }

    public void case14() {
        System.out.println("Case14. Элементы равностороннего треугольника пронумерованы следующим образом: \n" +
                "1 — сторона a," +
                "2 — радиус R1 вписанной окружности(R1 = a·√3/6), " +
                "3 — радиус R2 описанной окружности (R2 = 2·R1), " +
                "4 — площадь S = a^2·√3/4. Дан номер одного из этих элементов и его значение. \n" +
                "Вывести значения остальных элементов данного треугольника (в том же порядке).");
    }

    public void case15() {
        System.out.println("Case15. Мастям игральных карт присвоены порядковые номера: " +
                "1 — пики," +
                "2 — трефы, " +
                "3 — бубны, " +
                "4 — червы. \n" +
                "Достоинству карт, старших десятки, присвоены номера: 11 — валет, 12 — дама, 13 — король, 14 — туз. \n" +
                "Даны два целых числа: N — достоинство (6 ≤ N ≤ 14) и M — масть карты (1 ≤ M ≤ 4). \n" +
                "Вывести название соответствующей карты вида «шестерка бубен», «дама червей», «туз треф» и т. п.");
    }

    public void case16() {
        System.out.println("Case16. Дано целое число в диапазоне 20–69, определяющее возраст (в годах). \n" +
                "Вывести строку-описание указанного возраста, обеспечив правильное согласование числа со словом «год», " +
                "например: 20 — «двадцать лет», 32 — «тридцать два года», 41 — «сорок один год».");
    }

    public void case17() {
        System.out.println("Case17. Дано целое число в диапазоне 10–40, определяющее количество учебных заданий " +
                "по некоторой теме. \n Вывести строку-описание указанного количества заданий, обеспечив правильное " +
                "согласование числа со словами «учебное задание», \n" +
                "например: 18 — «восемнадцать учебных заданий», " +
                "23 — «двадцать три учебных задания», " +
                "31 — «тридцать одно учебное задание».");
    }

    public void case18() {
        System.out.println("Case18. Дано целое число в диапазоне 100–999. Вывести строку-описание данного числа, \n" +
                "например: 256 — «двести пятьдесят шесть», 814 — «восемьсот четырнадцать».");
    }

    public void case19() {
        System.out.println("Case19. В восточном календаре принят 60-летний цикл, состоящий из 12-летних подциклов, " +
                "обозначаемых названиями цвета: зеленый, красный,желтый, белый и черный. \n" +
                "В каждом подцикле годы носят названия животных: " +
                "крысы, коровы, тигра, зайца, дракона, змеи, лошади, овцы, обезьяны, курицы, собаки и свиньи. \n" +
                "По номеру года определить его название, если 1984 год — начало цикла: «год зеленой крысы».");
    }

    public void case20() {
        System.out.println("Case20. Даны два целых числа: D (день) и M (месяц), определяющие правильную дату. " +
                "Вывести знак Зодиака, соответствующий этой дате: \n" +
                "«Водолей» (20.1–18.2), «Рыбы» (19.2–20.3), «Овен» (21.3–19.4), «Телец» (20.4–20.5), " +
                "«Близнецы» (21.5–21.6), «Рак» (22.6–22.7), «Лев» (23.7–22.8), «Дева» (23.8–22.9)," +
                " «Весы» (23.9–22.10), «Скорпион» (23.10–22.11), «Стрелец» (23.11–21.12), «Козерог» (22.12–19.1).");
    }


}
