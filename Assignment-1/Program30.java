import java.util.Scanner;
class Program30{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the tile length: ");
       int tile_l=sc.nextInt();
       System.out.println("Enter the tile breadth: ");
       int tile_b=sc.nextInt();
       System.out.println("Enter the bed length: ");
       int bed_l=sc.nextInt();
        System.out.println("Enter the bed breadth: ");
       int bed_b=sc.nextInt();

       int area_tile=tile_l*tile_b;
        int area_bed=bed_l*bed_b;

        int no_tiles=area_bed/area_tile;
        System.out.println("Number of tiles needed is "+no_tiles);
        
    }
}