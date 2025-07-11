class Q19{
    public static void main(String args[])
{
    int cube_side=7,l=7,b=4,h=8;
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