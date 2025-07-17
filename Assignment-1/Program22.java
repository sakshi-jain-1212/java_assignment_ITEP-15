import java.util.Scanner;
class Program22{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length: ");
       int l=sc.nextInt();
       System.out.println("Enter the breadth: ");
       int b=sc.nextInt();
       System.out.println("Enter the depth: ");  
       int depth=sc.nextInt();

       int vol=l*b*depth;
        System.out.println("The capacity is "+vol+ "cube cm");

    }
}