import java.util.Scanner;

public class IntegerTasks {
    private final Scanner myScan = new Scanner(System.in);

    public void integer1() {
        System.out.println("Integer1. Дано расстояние L в сантиметрах. \n" +
                "Используя операцию деления нацело, найти количество полных метров в нем (1 метр = 100 см).");
        System.out.println("Введите расстояние в см");
        System.out.println("Количество полных метров в нём: " + myScan.nextInt() / 100);

    }

    public void integer2() {
        System.out.println("Integer2. Дана масса M в килограммах. \n" +
                "Используя операцию деления нацело, найти количество полных тонн в ней (1 тонна = 1000 кг).");
        System.out.println("Введите массу в кг");
        System.out.println("Кол-во полных тонн: " + myScan.nextInt() / 1000);
    }

    public void integer3() {
        System.out.println("Integer3. Дан размер файла в байтах. \n" +
                "Используя операцию деления нацело, найти количество полных килобайтов, " +
                "которые занимает данный файл (1 килобайт = 1024 байта).");
        System.out.println("Введите размер файла в байтах");
        System.out.println("Кол-во КБ: " + myScan.nextInt() / 1024);
    }

    public void integer4() {
        System.out.println("Integer4. Даны целые положительные числа A и B (A > B). \n" +
                "На отрезке длины A размещено максимально возможное количество отрезков длины B (без наложений). \n" +
                "Используя операцию деления нацело, найти количество отрезков B, размещенных на отрезке A.");
        System.out.println("Введите А");
        double A = Math.abs(myScan.nextDouble());
        System.out.println("Введите B");
        double B = Math.abs(myScan.nextDouble());
        System.out.println("Ответ: " + (int) (A / B));
    }

    public void integer5() {
        System.out.println("Integer5. Даны целые положительные числа A и B (A > B). \n" +
                "На отрезке длины A размещено максимально возможное количество отрезков длины B (без наложений). \n" +
                "Используя операцию взятия остатка от деления нацело, найти длину незанятой части отрезка A.");
        System.out.println("Введите А");
        double A = Math.abs(myScan.nextDouble());
        System.out.println("Введите B");
        double B = Math.abs(myScan.nextDouble());
        System.out.println("Ответ: " + A % B);
    }

    public void integer6() {
        System.out.println("Integer6. Дано двузначное число. " +
                "Вывести вначале его левую цифру (десятки), а затем — его правую цифру (единицы). \n" +
                "Для нахождения десятков использовать операцию деления нацело, " +
                "для нахождения единиц — операцию взятия остатка от деления.");
        System.out.println("Введите двузначное число: ");
        int value = myScan.nextInt();
        System.out.println("Левая цифра: " + value / 10);
        System.out.println("Правая цифра: " + value % 10);
    }

    public void integer7() {
        System.out.println("Integer7. Дано двузначное число. Найти сумму и произведение его цифр.");
        System.out.println("Введите двузначное число: ");
        int value = myScan.nextInt();
        System.out.println("Сумма: " + (value / 10 + value % 10));
        System.out.println("Произведение: " + (value / 10) * (value % 10));
    }

    public void integer8() {
        System.out.println("Integer8. Дано двузначное число. " +
                "Вывести число, полученное при перестановке цифр исходного числа.");
        System.out.println("Введите двузначное число: ");
        int value = myScan.nextInt();
        System.out.println("Ответ: " + (value % 10) + (value / 10));
    }

    public void integer9() {
        System.out.println("Integer9. Дано трехзначное число. " +
                "Используя одну операцию деления нацело, вывести первую цифру данного числа (сотни).");
        System.out.println("Введите трехзначное число: ");
        System.out.println("Ответ: " + (myScan.nextInt() / 100));
    }

    public void integer10() {
        System.out.println("Integer10. Дано трехзначное число. " +
                "Вывести вначале его последнюю цифру (единицы), а затем — его среднюю цифру (десятки).");
        System.out.println("Введите трехзначное число: ");
        int value = myScan.nextInt();
        System.out.println("Ответ: " + (value % 100 % 10) + (value % 100 / 10));
    }

    public void integer11() {
        System.out.println("Integer11. Дано трехзначное число. Найти сумму и произведение его цифр.");
        System.out.println("Введите трехзначное число: ");
        int value = myScan.nextInt();
        System.out.println("Сумма: " + (value / 100 + value % 100 / 10 + value % 100 % 10));
        System.out.println("Произведение: " + ((value / 100) * (value % 100 / 10) * (value % 100 % 10)));
    }

    public void integer12() {
        System.out.println("Integer12. Дано трехзначное число. " +
                "Вывести число, полученное при прочтении исходного числа справа налево.");
        System.out.println("Введите трехзначное число: ");
        int value = myScan.nextInt();
        System.out.println("Ответ: " + value % 100 % 10 + value % 100 / 10 + value / 100);
    }

    public void integer13() {
        System.out.println("Integer13. Дано трехзначное число. " +
                "В нем зачеркнули первую слева цифру и приписали ее справа. Вывести полученное число.");
        System.out.println("Введите трехзначное число: ");
        int value = myScan.nextInt();
        System.out.println("Ответ: " + value % 100 / 10 + value % 100 % 10 + value / 100);
    }

    public void integer14() {
        System.out.println("Integer14. Дано трехзначное число. " +
                "В нем зачеркнули первую справа цифру и приписали ее слева. Вывести полученное число.");
        System.out.println("Введите трехзначное число: ");
        int value = myScan.nextInt();
        System.out.println("Ответ: " + value % 100 % 10 + value / 100 + value % 100 / 10);
    }

    public void integer15() {
        System.out.println("Integer15. Дано трехзначное число. " +
                "Вывести число, полученное при перестановке цифр сотен и десятков исходного числа " +
                "(например, 123 перейдет в 213).");
        System.out.println("Введите трехзначное число: ");
        int value = myScan.nextInt();
        System.out.println("Ответ: " + value % 100 / 10 + value / 100 + value % 100 % 10);
    }

    public void integer16() {
        System.out.println("Integer16. Дано трехзначное число. " +
                "Вывести число, полученное при перестановке цифр десятков и единиц исходного числа (например, 123 перейдет в 132).");
        System.out.println("Введите трехзначное число: ");
        int value = myScan.nextInt();
        System.out.println("Ответ: " + value / 100 + value % 100 % 10 + value % 100 / 10);
    }

    public void integer17() {
        System.out.println("Integer17. Дано целое число, большее 999. " +
                "Используя одну операцию деления нацело и одну операцию взятия остатка от деления, \n" +
                "найти цифру, соответствующую разряду сотен в записи этого числа.");
        System.out.println("Введите число > 999: ");
        System.out.println("Ответ: " + (myScan.nextInt() / 100 % 10));
    }

    public void integer18() {
        System.out.println("Integer18. Дано целое число, большее 999. \n" +
                "Используя одну операцию деления нацело и одну операцию взятия остатка от деления, найти цифру, " +
                "соответствующую разряду тысяч в записи этого числа.");
        System.out.println("Введите число > 999: ");
        System.out.println("Ответ: " + (myScan.nextInt() / 1000 % 10));
    }

    public void integer19() {
        System.out.println("Integer19. С начала суток прошло N секунд (N — целое). " +
                "Найти количество полных минут, прошедших с начала суток.");
        System.out.println("Введите кол-во секунд: ");
        System.out.println("Ответ: " + myScan.nextInt() / 60);
    }

    public void integer20() {
        System.out.println("Integer20. С начала суток прошло N секунд (N — целое). " +
                "Найти количество полных часов, прошедших с начала суток.");
        System.out.println("Введите кол-во секунд: ");
        System.out.println("Ответ: " + myScan.nextInt() / 60 / 60);
    }

    public void integer21() {
        System.out.println("Integer21. С начала суток прошло N секунд (N — целое). " +
                "Найти количество секунд, прошедших с начала последней минуты.");
        System.out.println("Введите кол-во секунд: ");
        System.out.println("Ответ: " + myScan.nextInt() % 60);
    }

    public void integer22() {
        System.out.println("Integer22. С начала суток прошло N секунд (N — целое). " +
                "Найти количество секунд, прошедших с начала последнего часа.");
        System.out.println("Введите кол-во секунд: ");
        System.out.println("Ответ: " + myScan.nextInt() % 3600);
    }

    public void integer23() {
        System.out.println("Integer23. С начала суток прошло N секунд (N — целое). " +
                "Найти количество полных минут, прошедших с начала последнего часа.");
        System.out.println("Введите кол-во секунд: ");
        System.out.println("Ответ: " + myScan.nextInt() % 3600 / 60);
    }

    public void integer24() {
        System.out.println("Integer24. Дни недели пронумерованы следующим образом: \n" +
                "0 — воскресенье, 1 — понедельник, 2 — вторник, …, 6 — суббота. \n" +
                "Дано целое число K, лежащее в диапазоне 1–365. " +
                "Определить номер дня недели для K-го дня года, если известно, что в этом году 1 января было понедельником.");
        System.out.println("Введите номер дня, чтобы узнать его день недели, исходя из условия задачи: ");
        System.out.println("Ответ: " + myScan.nextInt() % 7);
    }
}
