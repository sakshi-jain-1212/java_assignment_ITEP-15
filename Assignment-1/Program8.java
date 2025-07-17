import java.util.Scanner;

class Program8{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the height: ");
        int h=sc.nextInt();
        System.out.println("Enter the area of rectangle: ");
        float area=sc.nextFloat();

        // area of traingle=(B*H)/2;
        float  b=(2*area)/h;
        System.out.println("The base of a triangle is "+ b+" cm");
    }
}