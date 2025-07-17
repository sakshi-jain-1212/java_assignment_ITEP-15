import java.util.Scanner;
class Program14{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the diagonal: ");
       int d=sc.nextInt();
       System.out.println("Enter the  first height of quadrilateral: ");
       int h1=sc.nextInt();
       System.out.println("Enter the  second height of quadrilateral: ");
       int h2=sc.nextInt();

       int area=(d*(h1+h2))/2;
        System.out.println("The area of a quadrilateral is "+ area+" square m");

    }
}