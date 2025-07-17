import java.util.Scanner;
class Program1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the perimeter of the rectangle: ");
        int peri = sc.nextInt();
        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();

        int breadth = (peri - (2 * length)) / 2;
        int area = length * breadth;
        System.out.println("The breadth of the rectangle is " + breadth + " centimeter");
        System.out.println("The area of the rectangle is " + area + " square centimeter");
    }
}