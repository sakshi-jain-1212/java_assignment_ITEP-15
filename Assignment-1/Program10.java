import java.util.Scanner;
class Program10{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length: ");
       int length=sc.nextInt();

       int area=(length*length)/2;
       System.out.println("The area of isosceles right angled triangle "+area+" square cm");

    }

}  