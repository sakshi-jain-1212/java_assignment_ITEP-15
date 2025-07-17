import java.util.Scanner;
class Program32{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the side of square garden: ");
       int square_g=sc.nextInt();
       System.out.println("Enter the side of square path: ");
       int square_p=sc.nextInt();

       int area_g=square_g*square_g;
        int area_p=square_p*square_p;
        int total_area=area_g-area_p;

        System.out.println("The area of garden is "+ total_area+" sq m");

    }
}
      