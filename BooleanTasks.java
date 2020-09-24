import java.util.Scanner;

public class BooleanTasks {
    private final Scanner myScan = new Scanner(System.in);

    public void boolean1() {
        System.out.println("Boolean1. Дано целое число A. " +
                "Проверить истинность высказывания: «Число A является положительным».");
        double A = myScan.nextInt();
        if (A > 0) {
            System.out.println("Число A является положительным");
        }
    }
}
