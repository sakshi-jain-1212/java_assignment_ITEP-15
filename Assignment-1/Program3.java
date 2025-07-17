import java.util.Scanner;
class Program3{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the tile length: ");
        int TileLen=sc.nextInt();
        System.out.println("Enter the tile breadth: ");
        int TileBre=sc.nextInt();
        System.out.println("Enter the rectangle length: ");
        int RecLen=sc.nextInt();
        System.out.println("Enter the rectangle breadth: ");
        int RecBre=sc.nextInt();

        int  AreaTile=TileLen*TileBre;
        int AreaRec=RecLen*RecBre;
        int No_Of_Tiles=AreaRec/AreaTile;
        System.out.println("The number of tiles required for rectangular region is Rs. "+No_Of_Tiles);
        
    }
}