import java.util.Scanner;
class Program5{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cpst to fence a rectangular park: ");
        int cost=sc.nextInt();
        System.out.println("Enter the rate: ");
        int rate=sc.nextInt();
        System.out.println("Enter the length: ");
        int l=sc.nextInt();

        float area=cost/rate;
        float b=area/l;
        float perimeter=2*(l+b);

        System.out.println("The area is "+area+" square cm");
        System.out.println("The breadth of rectangle is "+b+" cm");
        System.out.println("The perimeter of a rectangle is "+perimeter+" cm");
    }
}