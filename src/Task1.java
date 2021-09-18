import java.util.Scanner;

public class Task1 {

    private static int timeminute = 0;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество минут: ");
        timeminute = in.nextInt();
        System.out.print("Количество секунд: " + minuteToSecond(timeminute) + " секунд");
    }

    private static int minuteToSecond(int minute)
    {
        return minute * 60;
    }


}
