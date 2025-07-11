class Q26{
    public static void main(String args[])
    {
        int b_len=24,b_bre=15,p_len=120;
        float p_bre=2.4f;
        int area_b=b_len*b_bre;
        float area_p=p_len*p_bre;
        float No_brick=area_p/area_b;
        System.out.println("Number of bricks for path "+No_brick);
    }
}