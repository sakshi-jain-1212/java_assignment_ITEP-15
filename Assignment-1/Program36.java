import java.util.Scanner;
class Program36{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the height: ");
       int h=sc.nextInt();
       System.out.println("Enter the diameter: ");
       int d=sc.nextInt();
       System.out.println("Enter the pi value: ");
       float pi=sc.nextFloat();

       float r=d/2.0f;
       // surface area of cylinder=(2*pi*r*h)+(2*pi*r*r);
        float area_cylinder=(2*pi*r*h)+(2*pi*r*r);

        System.out.println("The area of cylinder is "+ area_cylinder+" sq m");
        
    }
}