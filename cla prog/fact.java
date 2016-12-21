class demo
{
    public static void main(String args[])
    {
        int fact=1;
        int num= Integer.parseInt(args[0]);
        for(int i=1;i<=num;i++)
        {
            fact=i*fact;
        }
        System.out.println("The calculated factorial is: "+fact);
    }
}