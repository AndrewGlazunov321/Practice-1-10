import java.util.Scanner;

public class Task6 {

    private static int n;
    private static int weight;
    private static int high;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество квадратных метров, которые я могу нарисовать: ");
        n = in.nextInt();
        System.out.print("Ширина: ");
        weight = in.nextInt();
        System.out.print("Высота: ");
        high = in.nextInt();
        System.out.print("Количество стен которые я могу закрасить: " + space(n,weight,high));


    }

    private static int space(int n, int weight,int high)
    {
        return n/(weight*high);
    }

}
