class Q12{
    public static void main(String args[])
    {
        // in a right angled triangle 
        int hypo=13,base=12;
        float height=(float)Math.sqrt((hypo*hypo)-(base*base));
        float Area=(base*height)/2;

        System.out.println("The height is "+height+ " cm");
        System.out.println("The area of triangle is "+Area+" square cm");

    }
}