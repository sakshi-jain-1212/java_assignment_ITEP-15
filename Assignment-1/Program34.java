import java.util.Scanner;
class Program34{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length: ");
       int len=sc.nextInt();
       System.out.println("Enter the height: ");
       int h=sc.nextInt();
       System.out.println("Enter the value of base1: ");
       int base1=sc.nextInt();
       System.out.println("Enter the value of base2: ");
       int base2=sc.nextInt();

       // area of trapezoid=(1/2)*B*H
        float area_t=0.5f*(base1+base2)*h;
        int area_w=len*h;

        float total_area=area_t+area_w;
        System.out.println(area_t);
        System.out.println(area_w);
        System.out.println("Total area "+ total_area+ " sq m");

    }
}