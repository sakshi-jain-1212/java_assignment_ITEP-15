import java.util.Scanner;
class Program19{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length: ");
       int l=sc.nextInt();
       System.out.println("Enter the breadth: ");
       int b=sc.nextInt();
       System.out.println("Enter the height: ");  
       int h=sc.nextInt();
        System.out.println("Enter the cube side: ");  
       int cube_side=sc.nextInt();

       int vol_cube=cube_side*cube_side*cube_side;
    int vol_cuboid=l*b*h;
    if(vol_cube>vol_cuboid)
    {
        System.out.println("The cube has more volume and it have "+(vol_cube-vol_cuboid)+" cube cm more volume than cuboid");
    }
    else if(vol_cuboid>vol_cube)
    {
       System.out.println("The cuboid  has more volume and it have "+(vol_cuboid-vol_cube)+ " cube cm more volume than cube");

    }
    else{
        System.out.println("Both have same volume ");
    }
}
}