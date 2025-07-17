import java.util.Scanner;
class Program44{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the  value of a: ");
       int a=sc.nextInt();
       System.out.println("Enter the number of total values: ");
       int n=sc.nextInt();
       System.out.println("Enter the value of a1: ");
       int a1=sc.nextInt();

       int d=a1-a;
        int no=a+(n-1)*d;

        System.out.println("The 28th term is "+no);

    }
}