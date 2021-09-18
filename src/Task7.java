import java.util.Scanner;

public class Task7 {


    private static int value = 0;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите переменную: ");
        value = in.nextInt();
        System.out.print("Результат: " + squared(value));
    }

    public static int squared(int b)
    {
        return b * b;
    }

}
