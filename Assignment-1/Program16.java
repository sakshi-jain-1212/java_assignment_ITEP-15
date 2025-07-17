import java.util.Scanner;
class Program16{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length: ");
       int length=sc.nextInt();
       System.out.println("Enter the breadth: ");
       int breadth=sc.nextInt();
      

       int area=length*breadth;
        System.out.println("The area of a rectangle is "+area+ " square meter");
        System.out.println("The "+area +" square meter carpet it is needed to cover");
        

    }
}