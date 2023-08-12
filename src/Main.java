import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double a, b, c;
        String act;
        Scanner scan = new Scanner(System.in);
        Scanner math = new Scanner(System.in);

        System.out.println("Калькулятор");
        System.out.println("Введите первое число");
        a = scan.nextDouble();
        System.out.println("Выберите действие +, -, * или /");
        act = math.nextLine();
            if (act != "+" && act != "-" && act != "*" && act != "/"){
                System.out.println("Неверный выбор действия");
                System.exit(0);
            }
        System.out.println("Введите второе число");
        b = scan.nextDouble();
        switch (act){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                if (b == 0){
                    System.out.println("На ноль делить нельзя!");
                } else System.out.println(a/b);
                break;
            default:
                System.out.println("Неверное действие");
        }
    System.out.println("Калькулятор");



    }
}
