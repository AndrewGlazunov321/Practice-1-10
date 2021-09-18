import java.util.Scanner;

public class Task5 {
    private static boolean aSymbol;
    private static boolean bSymbol;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Является ли переменная А true или false ? ");
        aSymbol = in.nextBoolean();
        System.out.print("Является ли переменная B true или false ? ");
        bSymbol = in.nextBoolean();
        System.out.print("Ответ: " + and(aSymbol,bSymbol));

    }

    private static boolean and(boolean aSymbol,boolean bSymbol)
    {
            return aSymbol && bSymbol;

    }
}
