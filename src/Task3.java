import java.util.Scanner;

public class Task3 {

    private static int winValue = 0;
    private static int drawValue = 0;
    private static int loseValue = 0;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество побед: ");
        winValue = in.nextInt();
        System.out.print("Количество ничьих: ");
        drawValue = in.nextInt();
        System.out.print("Количество поражений: ");
        loseValue = in.nextInt();
        System.out.print("Количество очков набранных футбольной командой: " + (winScore(winValue) + drawScore(drawValue) + loseScore(loseValue)));

    }


    private static int winScore(int winValue)
    {
        return winValue * 3;
    }

    private static int drawScore(int drawValue)
    {
        return drawValue * 1;
    }

    private static int loseScore(int loseValue)
    {
        return 0;
    }
}
