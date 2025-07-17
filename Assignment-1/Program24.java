import java.util.Scanner;
class Program24{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length: ");
       int l=sc.nextInt();
       System.out.println("Enter the breadth: ");
       int b=sc.nextInt();
       System.out.println("Enter the height: ");
       int h=sc.nextInt();
       System.out.println("Enter the length of brick: ");  
       int b_l=sc.nextInt();
       System.out.println("Enter the breadth of brick: ");  
       int b_b=sc.nextInt();
       System.out.println("Enter the height of brick: ");  
       float b_h=sc.nextFloat();
       System.out.println("Enter the cost: ");  
       float cost=sc.nextFloat();


       int vol_wall=l*b*h;
       float vol_brick=b_l*b_b*b_h;
       float No_of_b=vol_wall/vol_brick;
       float total_cost=No_of_b*cost;

       System.out.println("The cost is"+total_cost);

    }
}