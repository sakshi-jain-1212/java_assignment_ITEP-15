import java.util.Scanner;
class Program18{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length: ");
       int l=sc.nextInt();
       System.out.println("Enter the breadth: ");
       int b=sc.nextInt();
       System.out.println("Enter the rounds: ");  
       int rounds=sc.nextInt();

       int perimeter=2*(l+b);
        int dis=perimeter*rounds;
        // conversion in kilometers divide by 1000
        float conversion_km=(float)dis/1000;
        System.out.println("The perimenter of a rectangle is "+perimeter+ " meter");
        System.out.println("Ron jogs "+conversion_km+" km in one day");

    }
}