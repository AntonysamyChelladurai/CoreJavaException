import java.io.IOException;

public class Three extends Two
{
    @Override
    public final void m1() throws IOException
    {
        System.out.println("m1-Three");
    }
    protected static void m2() throws Exception
    {
        System.out.println("m2-Three");
    }
}