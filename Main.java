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
                case 6:
                    begin.begin6();
                    break;
                case 7:
                    begin.begin7();
                    break;
                case 8:
                    begin.begin8();
                    break;
                case 9:
                    begin.begin9();
                    break;
                case 10:
                    begin.begin10();
                    break;
                case 11:
                    begin.begin11();
                    break;
                case 12:
                    begin.begin12();
                    break;
                case 13:
                    begin.begin13();
                    break;
                case 14:
                    begin.begin14();
                    break;
                case 15:
                    begin.begin15();
                    break;
                case 16:
                    begin.begin16();
                    break;
                case 17:
                    begin.begin17();
                    break;
                case 18:
                    begin.begin18();
                    break;
                case 19:
                    begin.begin19();
                    break;
                case 20:
                    begin.begin20();
                    break;
                case 21:
                    begin.begin21();
                    break;
                case 22:
                    begin.begin22();
                    break;
                case 23:
                    begin.begin23();
                    break;
                case 24:
                    begin.begin24();
                    break;
                case 25:
                    begin.begin25();
                    break;
                case 26:
                    begin.begin26();
                    break;
                case 27:
                    begin.begin27();
                    break;
                case 28:
                    begin.begin28();
                    break;
                case 29:
                    begin.begin29();
                    break;
                case 30:
                    begin.begin30();
                    break;
                case 31:
                    begin.begin31();
                    break;
                case 32:
                    begin.begin32();
                    break;
                case 33:
                    begin.begin33();
                    break;
                case 34:
                    begin.begin34();
                    break;
                case 35:
                    begin.begin35();
                    break;
                case 36:
                    begin.begin36();
                    break;
                case 37:
                    begin.begin37();
                    break;
                case 38:
                    begin.begin38();
                    break;
                case 39:
                    begin.begin39();
                    break;
                case 40:
                    begin.begin40();
                    break;
                default:
                    System.out.println("Введите номер задачи 1-40");
                    break;
            }
        }
    }
}
