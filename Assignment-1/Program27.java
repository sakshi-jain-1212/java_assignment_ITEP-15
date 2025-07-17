import java.util.Scanner;
class Program27{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length: ");
       int len=sc.nextInt();
       System.out.println("Enter the breadth: ");
       int bre=sc.nextInt();
       System.out.println("Enter the rate: ");
       int rate=sc.nextInt();

       int Area=len*bre;
        int Cost=Area*rate;
        System.out.println("The cost of tiling is $ "+Cost);
        
    }
}