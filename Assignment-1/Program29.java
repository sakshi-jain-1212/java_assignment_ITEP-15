import java.util.Scanner;
class Program29{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the side of tile: ");
       int tile_side=sc.nextInt();
       System.out.println("Enter the floor length: ");
       int floor_l=sc.nextInt();
       System.out.println("Enter the floor breadth: ");
       int floor_b=sc.nextInt();

       int area_tile=tile_side*tile_side;
        int area_floor=floor_l*floor_b;
        int n_tiles_sq=area_floor/area_tile;

        System.out.println("Number of square tiles needed for floor "+n_tiles_sq);
           }
}