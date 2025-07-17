import java.util.Scanner;
class Program38{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the volume of cylinder: ");
       int vol=sc.nextInt();
       System.out.println("Enter the radius: ");
       int r=sc.nextInt();
       System.out.println("Enter the value of pi: ");
       float pi=sc.nextFloat();

       // volume of cylinder=pi*r*r*h;
      float h=vol/(pi*r*r);
      System.out.println("The height of cylinder is "+h);

    }
   
}