class Q24{
    public static void main(String args[])
    { // convert m to cm 1m=100cm so change the value and directly put
       int l=2000,b=200,h=75;
       int b_l=25,b_b=10;
       float b_h=7.5f,cost=0.9f;
       int vol_wall=l*b*h;
       float vol_brick=b_l*b_b*b_h;
       float No_of_b=vol_wall/vol_brick;
       float total_cost=No_of_b*cost;

       System.out.println("The cost is"+total_cost);

    }
}