import java.util.Scanner;

public class Task2 {

    private static int threePointValue = 0;
    private static int twoPointValue = 0;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество забитых 2-х очков: ");
        twoPointValue = in.nextInt();
        System.out.print("Количество забитых 3-х очков: ");
        threePointValue = in.nextInt();
        System.out.print("Количество очков: " + (threePointScore(threePointValue) + twoPointScore(twoPointValue)));
    }

    private static int threePointScore(int pointValue)
    {
        return 3 * pointValue;
    }

    private static int twoPointScore(int pointValue)
    {
        return 2 * pointValue;
    }

}
