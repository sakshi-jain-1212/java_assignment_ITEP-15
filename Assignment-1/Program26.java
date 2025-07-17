import java.util.Scanner;
class Program26{
    public static void main(String args[])
       // m to cm
    {  // p_len=120*100=12000
      // p_bre=2.4*100=240
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the brick length: ");
       int b_len=sc.nextInt();
       System.out.println("Enter the brick breadth: ");
       int b_bre=sc.nextInt();
       System.out.println("Enter the path length: ");
       int p_len=sc.nextInt();
       System.out.println("Enter the path breadth: ");
       float p_bre=sc.nextFloat();

     int area_b=b_len*b_bre;
        float area_p=p_len*p_bre;
        float No_brick=area_p/area_b;
        System.out.println("Number of bricks for path "+No_brick);
    }
}
