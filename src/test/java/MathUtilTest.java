import jdk.jfr.Description;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilTest {

    @Test
    @Description("Se b > 0 é um divisor de a, então mdc(a,b)=b.")
    public void testMdcAParP1(){
        final int a = 6;
        final int b = 3;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(b, obtido);
    }

    @Test
    public void testMdcAImparP1(){
        final int a = 9;
        final int b = 3;
        final int obtido = MathUtil.mdc(a,b);
        assertEquals(b, obtido);
    }

}