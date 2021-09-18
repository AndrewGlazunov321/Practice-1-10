import java.util.Scanner;

public class Task9 {

    private static int minuteValue = 0;
    private static  int FPSvalue = 0;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Количество FPS: ");
        FPSvalue = ui.nextInt();
        System.out.print("Количество минут: ");
        minuteValue = ui.nextInt();
        System.out.print("Результат: " + frames(FPSvalue,minuteValue));

    }

    private static int frames(int FPSvalue,int minuteValue)
    {
        return (FPSvalue * (minuteValue * 60));
    }


}
