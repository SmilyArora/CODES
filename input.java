import java.util.*;
class demo
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num = scanner.nextInt();
        scanner.close();
        System.out.println("The string entered is: " + str);
        System.out.println("The number is: " + num);

    }
}