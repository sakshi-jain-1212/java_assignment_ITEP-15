class Q15{
    public static void main(String args[])
    {
        int L_rec=22,H_Rec=15,side_sq=21;
        int A_rec=L_rec*H_Rec;
        int Area_sq=side_sq*side_sq;
        if (A_rec>Area_sq)
        {    
            int diff1=A_rec-Area_sq;
            System.out.println("Shelly garden is bigger");
            System.out.println("It is "+ diff1+" square meter bigger than Rachel garden");
        }
        else if (Area_sq>A_rec)
        {
            int diff2=Area_sq-A_rec;
            System.out.println("Rachel garden is bigger");
            System.out.println("It is "+ diff2+" square meter bigger than Shelly garden");
        }
        else{
            System.out.println("Both gardens are same in size");

        }
    }
}