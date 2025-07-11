class Q18{
        public static void main(String args[])
    {
        int l=50,b=30,rounds=10;
        int perimeter=2*(l+b);
        int dis=perimeter*rounds;
        // conversion in kilometers divide by 1000
        float conversion_km=(float)dis/1000;
        System.out.println("The perimenter of a rectangle is "+perimeter+ " meter");
        System.out.println("Ron jogs "+conversion_km+" km in one day");

    }
}