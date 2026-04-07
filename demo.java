import java.util.*;

class demo
{
  public static void main(String args[])
  {

    Scanner scan=new Scanner(System.in);
    int age=0;

    do{
      System.out.println("enter voter age");
      age=scan.nextInt();
    }while(age<=18);

  }
}
