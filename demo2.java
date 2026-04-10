import java.util.*;

class demo2
{

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter the item:");
        int item=scan.nextInt();
        System.out.print("Enter the quantity:");
        int quantity=scan.nextInt();
        int total=item*quantity;
        System.out.print("total:"+total);
    }
}