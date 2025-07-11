class Q21{
    public static void main(String args[])
    {
        int brick_l=15,brick_b=8,brick_h=5;
        int wall_l=15,wall_b=10,wall_h=8;
        int vol_brick=brick_l*brick_b*brick_h;
        int vol_wall=wall_l*wall_b*wall_h;

        int No_of_brick=vol_wall/vol_brick;
    System.out.println("Number of bricks needed for  wall is "+No_of_brick);
    
    }
}