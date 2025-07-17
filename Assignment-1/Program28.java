import java.util.Scanner;
class Program28{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length: ");
       int l=sc.nextInt();
       System.out.println("Enter the breadth: ");
       int b=sc.nextInt();
       System.out.println("Enter the prices: ");
       int price=sc.nextInt();

       int area=l*b;
        int cost=area*price;
        System.out.println("Cost is $ "+ cost);
        
    }
}