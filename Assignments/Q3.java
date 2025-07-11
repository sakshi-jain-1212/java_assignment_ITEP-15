class Q3{
    public static void main(String args[])
    {
        int TileLen=13,TileBre=7,RecLen=520,RecBre=140;
        int  AreaTile=TileLen*TileBre;
        int AreaRec=RecLen*RecBre;
        float No_Of_Tiles=AreaRec/AreaTile;
        System.out.println("The number of tiles required for rectangular region is Rs. "+No_Of_Tiles);


    }
}