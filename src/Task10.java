import java.util.Scanner;

public class Task10 {


    private static int valueOne = 0;
    private static  int valueTwo = 0;

    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.print("Первое значение: ");
        valueOne = ui.nextInt();
        System.out.print("Второе значение: ");
        valueTwo = ui.nextInt();
        System.out.print("Результат: " + mod(valueOne,valueTwo));

    }

    private static int mod(int valueOne,int valueTwo)
    {
        return (valueOne - (valueTwo*(valueOne/valueTwo)));
    }

}
