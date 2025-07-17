import java.util.Scanner;
class Program39{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the radius: ");
       int r=sc.nextInt();
       System.out.println("Enter the height: ");
       int h=sc.nextInt();
       System.out.println("Enter the value of pi: ");
       float pi=sc.nextFloat();

       // Area of cylinder=2*pi*r(r+h)
       float area=2*pi*r*(r+h);
       System.out.println("The area  of cylinder is "+area);


    }
}