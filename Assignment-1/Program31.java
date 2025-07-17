import java.util.Scanner;
class Program31{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the value of p: ");
       int p=sc.nextInt();
       
       // perimeter of sq=4a
        int perimeter=p/4;
        // area of sq=side*side
        int area=perimeter*perimeter;

        System.out.println("The area of square is "+ area+" sq m");

    }
}