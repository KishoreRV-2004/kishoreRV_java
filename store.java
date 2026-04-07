class store
{

    void choclate(int money)
    {
         System.out.println(money);
        System.out.println("choclate");
    }
    void powder(int money)
    {
         System.out.println(money);
         System.out.println("powder");
    }

    public static void main(String args[])
    {
        store obj1=new store();

        obj1.choclate(10);
        obj1.powder(50);
    }
}