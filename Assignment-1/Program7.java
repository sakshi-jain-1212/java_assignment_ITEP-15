import java.util.Scanner;
class Program7{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the breadth: ");
        int b=sc.nextInt();
        System.out.println("Enter the area of rectangle: ");
        int area=sc.nextInt();

        // area of traingle=(B*H)/2;
        int  h=(2*area)/b;
        System.out.println("The height of a triangle is "+h+" cm");
    }
}