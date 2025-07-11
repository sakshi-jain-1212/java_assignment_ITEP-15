class Q30{
    public static void main(String args[])
    {
        int tile_l=5,tile_b=8,bed_l=200,bed_b=400;
        int area_tile=tile_l*tile_b;
        int area_bed=bed_l*bed_b;

        int no_tiles=area_bed/area_tile;
        System.out.println("Number of tiles needed is "+no_tiles);
        
    }
}