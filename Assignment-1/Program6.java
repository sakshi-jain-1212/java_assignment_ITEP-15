import java.util.Scanner;
class Program6{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first side of trianlge: ");
        int s1=sc.nextInt();
        System.out.println("Enter the second sode of triangle : ");
        int s2=sc.nextInt();
        System.out.println("Enter the perimeter: ");
        int perimeter=sc.nextInt();

        int s3=perimeter-s1-s2;
        int Semi_peri=perimeter/2;
        float area=(float)Math.sqrt(Semi_peri*(Semi_peri-s1)*(Semi_peri-s2)*(Semi_peri-s3));
        System.out.println("The area of a triangle is "+area+" square cm");
    }
}