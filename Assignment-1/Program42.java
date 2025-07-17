import java.util.Scanner;
class Program42{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the diameter: ");
       float d=sc.nextFloat();
       System.out.println("Enter the height: ");
       float h=sc.nextFloat();
       System.out.println("Enter the value of pi: ");
       float pi=sc.nextFloat();

       // volume of cylinder=pi*r*r*h;
        float vol=pi*(d/2)*(d/2)*h;
        System.out.println("The volume of cylinder is "+vol);

    }
}