import java.util.Scanner;
class Program23{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length: ");
       int l=sc.nextInt();
       System.out.println("Enter the breadth: ");
       int b=sc.nextInt();
       System.out.println("Enter the height: ");
       int h=sc.nextInt();
       System.out.println("Enter the side of cube: ");  
       int side=sc.nextInt();

       int vol_c=side*side*side;
        int vol_cuboid1=l*b*h;
        int total_vol=vol_cuboid1/vol_c;
        System.out.println("Number of cubical boxes"+total_vol);
        
    }
}

