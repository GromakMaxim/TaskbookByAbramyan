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

    public void integer7(){
        System.out.println("Integer7. Дано двузначное число. Найти сумму и произведение его цифр.");
        System.out.println("Введите двузначное число: ");
        int value = myScan.nextInt();
        System.out.println("Сумма: " + (value / 10 + value % 10));
        System.out.println("Произведение: " + (value / 10) * (value % 10));
    }
}
