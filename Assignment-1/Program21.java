import java.util.Scanner;
class Program21{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the  brick length: ");
       int brick_l=sc.nextInt();
       System.out.println("Enter the brick breadth: ");
       int brick_b=sc.nextInt();
       System.out.println("Enter the brick height: ");  
       int brick_h=sc.nextInt();

       System.out.println("Enter the wall length: ");
       int wall_l=sc.nextInt();
       System.out.println("Enter the wall breadth: ");
       int wall_b=sc.nextInt();
       System.out.println("Enter the wall height: ");  
       int wall_h=sc.nextInt();


       int vol_brick=brick_l*brick_b*brick_h;
        int vol_wall=wall_l*wall_b*wall_h;

        int No_of_brick=vol_wall/vol_brick;
    System.out.println("Number of bricks needed for  wall is "+No_of_brick);
    
    }
}