import java.util.Scanner;
class Program13{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the area of triangle: ");
       int area=sc.nextInt();
       System.out.println("Enter the height of triangle: ");
       int l1=sc.nextInt();
     // area of triangle=1/2 *b*h
       int l2=(2*area)/l1;
       System.out.println("The length of traingle is : "+l2);
    }
}  