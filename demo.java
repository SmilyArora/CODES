public class demo
{
     public static void main(int a)
    {
        System.out.println("Main function 1");
    }
     public static void main()
    {
        System.out.println("Main function 2");
    }

    public static void main(String args[])
    {
        System.out.println("Main function 3");
        main();
        main(5);
    }
}
