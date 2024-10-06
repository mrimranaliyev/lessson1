import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ikirəqəmli ədəd daxil edin: ");
        int a = scanner.nextInt();
        int tens = a / 10;
        int units = a % 10;
        System.out.println(tens + " " + units);
    }
}