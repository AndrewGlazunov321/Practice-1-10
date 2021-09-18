import java.util.Scanner;

public class Task8 {

    private static float prob = 0;
    private static  float prize = 0;
    private static float pay=0;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Аргумент prob: ");
        prob = ui.nextFloat();
        System.out.print("Аргумент prize: ");
        prize = ui.nextFloat();
        System.out.print("Аргумент pay: ");
        pay = ui.nextFloat();
        System.out.print("Результат: " + profitableGamble(prob,prize,pay));

    }

    private static boolean profitableGamble(float prob,float prize, float pay)
    {
        if (prob * prize > pay)
        {
            return true;
        }
        return false;
    }

}
