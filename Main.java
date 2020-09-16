import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Begin begin = new Begin();
        Scanner myScan = new Scanner(System.in);
        while (true) {
            System.out.println("Введите номер задачи из блока BEGIN (1-40)");
            int menuPoint = myScan.nextInt();
            switch (menuPoint) {
                case 1:
                    begin.begin1();
                    break;
                case 2:
                    begin.begin2();
                    break;
                case 3:
                    begin.begin3();
                    break;
                case 4:
                    begin.begin4();
                    break;
                case 5:
                    begin.begin5();
                    break;
            }
        }
    }
}
