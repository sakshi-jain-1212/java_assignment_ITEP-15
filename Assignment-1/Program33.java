import java.util.Scanner;
class Program33{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the length: ");
       int length=sc.nextInt();
       System.out.println("Enter the breadth: ");
       int breadth=sc.nextInt();
       System.out.println("Enter the value of path1: ");
       int path1=sc.nextInt();
       System.out.println("Enter the value of path2: ");
       int path2=sc.nextInt();

       int usableArea =((length*breadth)-((path1*length)+(path2*breadth)-(path1*path2)));
         System.out.println("the total cost is "+usableArea+" sq m");
    }
}