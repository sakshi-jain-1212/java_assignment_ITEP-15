import java.util.Scanner;
class Program17{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length: ");
       int l=sc.nextInt();
       System.out.println("Enter the breadth: ");
       int b=sc.nextInt();
     
       int perimeter=2*(l+b);
        System.out.println("The length of ribbon needs is"+ perimeter);
    }
}