import java.util.Scanner;
class Program25{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length: ");
       int l=sc.nextInt();
       System.out.println("Enter the breadth: ");
       int bre=sc.nextInt();
       System.out.println("Enter the number of bricks: ");
       int n_brick=sc.nextInt();

       int area=l*bre;
        int No_of_bricks=area*n_brick;
        System.out.println("Area "+area);
        System.out.println("Number of bricks= "+No_of_bricks);

    }
}