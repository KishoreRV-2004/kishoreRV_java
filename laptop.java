class laptop
{
    String name="";
    String proc="";
    int ram=0;
    int price=0;

    public static void main(String args[])
    {
        laptop l1=new laptop();
        l1.name="lenvo";
        l1.proc="i5";
        l1.ram=8;
        l1.price=50000;

        laptop l2=new laptop();
        l2.name="hp";
        l2.proc="i6";
        l2.ram=8;
        l2.price=60000;

        System.out.println(l1.name);
         System.out.println(l2.name);
    }
}