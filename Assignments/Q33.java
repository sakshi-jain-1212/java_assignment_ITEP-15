class Q33{
    public static void main(String args[]){
        int length = 30, breadth = 20, path1 = 3, path2 = 4, usableArea;
         usableArea =((length*breadth)-((path1*length)+(path2*breadth)-(path1*path2)));
         System.out.println("the total cost is "+usableArea+" sq m");
    }
}