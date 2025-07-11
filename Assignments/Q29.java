class Q29{
    public static void main(String args[])
    {
        int tile_side=10,floor_l=800,floor_b=900;
    
        int area_tile=tile_side*tile_side;
        int area_floor=floor_l*floor_b;
        int n_tiles_sq=area_floor/area_tile;

        System.out.println("Number of square tiles needed for floor "+n_tiles_sq);
           }
}