import java.io.IOException;

public class ExceptionExamples {

    public static void main(String[] args) throws Throwable
    {
        One o = new Two();
        o.m1();
        Two t = new Three();
        t.m1();
        Two th3 = new Three();
        th3.m2();
    }
}
