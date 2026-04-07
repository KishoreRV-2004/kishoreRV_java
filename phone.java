import java.util.Scanner;

class phone
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int[] num=new int[5];

    num[0]=scan.nextInt();
    num[1]=scan.nextInt();
    num[2]=scan.nextInt();
    num[3]=scan.nextInt();
    num[4]=scan.nextInt();

    System.out.println(num[0]+num[1]+num[2]+num[3]+num[4]);
    
  }
}