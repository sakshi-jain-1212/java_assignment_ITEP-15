import java.util.Scanner;
class Program2{
        public static void main(String args[])
        {

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the area of rectangle: ");
            int area=sc.nextInt();
            System.out.println("Enter the breadth of rectangle: ");
            int b=sc.nextInt();

            int l=area/b; 
            int perimeter=2*(l+b);
            System.out.println("The length of a rectangle is "+l+" cm");
            System.out.println("The perimeter of a rectangle is "+perimeter+" cm");
         }
}