import java.util.Scanner;
class Program12{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the hypotenuse of right angle triangle: ");
       int hypo=sc.nextInt();
       System.out.println("Enter the base of right angle triangle: ");
       int base=sc.nextInt();

       float height=(float)Math.sqrt((hypo*hypo)-(base*base));
        float Area=(base*height)/2;
       System.out.println("The height is "+height+ " cm");
        System.out.println("The area of triangle is "+Area+" square cm");
    }

}     