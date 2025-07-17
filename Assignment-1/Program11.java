import java.util.Scanner;
class Program11{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the ratio of base: ");
       int base_ratio=sc.nextInt();
       System.out.println("Enter the ratio of height: ");
       int height_ratio=sc.nextInt();
       System.out.println("Enter the area: ");
       int area=sc.nextInt();
  
       float x=(float)Math.sqrt((2*area)/(base_ratio*height_ratio));
       float base=8*x;
       float height=5*x;
       System.out.println("The height is "+height+" cm");
       System.out.println("The base is "+base+" cm");
    }
}      