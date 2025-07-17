import java.util.Scanner;
class Program43{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the slant height: ");
       int slant_h=sc.nextInt();
       System.out.println("Enter the height: ");
       int h=sc.nextInt();
       System.out.println("Enter the value of rate: ");
       int rate=sc.nextInt();
       System.out.println("Enter the value of pi: ");
       float pi=sc.nextFloat();

         //  l*l=r*r+h*h l=slant height,r=radius,h=height     l=sq root r2*h2 [r2=radius sq]
        float r=(float)Math.sqrt((slant_h*slant_h)-(h*h));
        // area of circle=pi*r*r
        float area=pi*r*r;
        float total_cost=area*rate;
        System.out.println("The total cost is"+ total_cost);

    }
}
