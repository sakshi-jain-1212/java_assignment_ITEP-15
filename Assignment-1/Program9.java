import java.util.Scanner;
class Program9{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length: ");
       int length=sc.nextInt();
    
       float area=(float)((1.732*length*length)/4);
       System.out.println("The area of an equilateral traingle is "+area+" square cm");
    }
}