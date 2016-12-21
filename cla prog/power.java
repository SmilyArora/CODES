class demo
{
    public static void main(String args[])
    {
        int num=Integer.parseInt(args[0]);
        int pow=Integer.parseInt(args[1]);
        int res=1;
        for(int i=1;i<=pow;i++)
        {
            res=res*num;
        }
        System.out.println("The result is: "+ res);
    }
}