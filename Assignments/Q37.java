class Q37{
    public static void main(String[] args) {
        int surfaceArea = 149; //  cm
        int height = 6; //  cm
        float pi =(float)Math.PI;
        // radius
        float radius = surfaceArea / (2 * pi * height);
        float diameter = 2 * radius;

       System.out.println("Radius : "+ radius+"cm");
        System.out.println("Diameter : "+diameter+"cm");
    }
}