class Q6{
    public static void main(String args[])
    {
         int s1=10,s2=9,perimeter=36;
        int s3=perimeter-s1-s2;
        int Semi_peri=perimeter/2;
        float area=(float)Math.sqrt(Semi_peri*(Semi_peri-s1)*(Semi_peri-s2)*(Semi_peri-s3));
        System.out.println("The area of a triangle is "+area+" square cm");
    }
}