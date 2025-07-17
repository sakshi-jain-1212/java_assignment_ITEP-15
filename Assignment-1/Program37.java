import java.util.Scanner;
class Program37{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the height: ");
       int height=sc.nextInt();
       System.out.println("Enter the value of surface area: ");
       int surfaceArea=sc.nextInt();
       System.out.println("Enter the value of pi: ");
       float pi=sc.nextFloat();
        // radius
        float radius = surfaceArea / (2 * pi * height);
        float diameter = 2 * radius;

       System.out.println("Radius : "+ radius+"cm");
        System.out.println("Diameter : "+diameter+"cm");
    }
}