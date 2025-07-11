class Q43{
    public static void main(String args[])
    {
        int h=4,slant_h=5,rate=10;
        float pi=3.1415f;
    //  l*l=r*r+h*h l=slant height,r=radius,h=height     l=sq root r2*h2 [r2=radius sq]
        float r=(float)Math.sqrt((slant_h*slant_h)-(h*h));
   // area of circle=pi*r*r
        float area=pi*r*r;
        float total_cost=area*rate;
        System.out.println("The total cost is"+ total_cost);

    }
}