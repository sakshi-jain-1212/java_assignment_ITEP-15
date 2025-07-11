class Q34{
    public static void main(String args[]){
        int base1=128,base2=92,h=40,len=4;
        // area of trapezoid=(1/2)*B*H
        float area_t=0.5f*(base1+base2)*h;
        int area_w=len*h;

        float total_area=area_t+area_w;
        System.out.println(area_t);
        System.out.println(area_w);
        System.out.println("Total area "+ total_area+ " sq m");

    }
}