import java.util.Scanner;

public class Task4 {

    private static int Value = 0;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число которое может делится на 5: ");
        Value = in.nextInt();
        boolean checkValue = checkDivisibleByFive(Value);

    }



    private static boolean checkDivisibleByFive(int Value)
    {
        if (Value % 5 == 0) {
            System.out.print("Данное число " + Value + " делится на 5");
            return true;
        }
        System.out.print("Данное число " + Value + " не делится на 5");
        return false;
    }

}
