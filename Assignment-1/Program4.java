import java.util.Scanner;
class Program4{
    public static void main(String args[]){
      
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int l=sc.nextInt();
        System.out.println("Enter the breadth: ");
        int b=sc.nextInt();
        System.out.println("Enter the cost of One Tile: ");
        int OneTile=sc.nextInt();

        int area=l*b;
        int division=area/100;
        int Cost_Of_Tile=division*OneTile;
        System.out.println("The cost of Tile is $ "+Cost_Of_Tile);
    }
}