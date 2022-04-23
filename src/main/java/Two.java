public class Two extends One
{
    @Override
    protected void m1() throws Exception
    {
        System.out.println("m1-Two");
    }
    protected static void m2() throws Exception
    {
        System.out.println("m2-Two");
    }
}