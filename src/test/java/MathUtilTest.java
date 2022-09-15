import jdk.jfr.Description;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilTest {

    @Test
    @Description("Se b > 0 é um divisor de a, então mdc(a,b)=b.")
    public void testMdcAParP1(){
        final int a = 4;
        final int b = 2;
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

    @Test
    @Description("Se o mdc de A e B é divisível pelo divisor")
    public void testMdcParesP2(){
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        final int obtido = MathUtil.mdc(a, b);
        assertTrue(obtido % divisor == 0);
    }

    @Test
    @Description("Se B = 0, então mdc(a,b) = a")
    public void testMdcAPositivoP3(){
        final int a = 15;
        final int b = 0;
        final int esperado = 15;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);

    }

    @Test
    @Description("Se B = 0, então mdc(a,b) = a (positivo)")
    public void testMdcANegativoP3(){
        final int a = -30;
        final int b = 0;
        final int esperado = 30;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }

    @Test
    @Description("Se m = 0 || m > 0, então mdc(m.a, m.b) = m.mdc(a,b)")
    public void testMdcMParP4(){
        final int a = 9;
        final int b = 3;
        final int m = 2;
        final int esperado = m * MathUtil.mdc(a,b);
        final int obtido = MathUtil.mdc(m * a, m * b);
        assertEquals(esperado, obtido);
    }

    @Test
    @Description("mdc(a.b,c) = mdc(a,c).mdc(b,c)")
    public void testMdcP5(){
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = MathUtil.mdc(a * b, c);
        final int obtido = MathUtil.mdc(b,c);
        assertEquals(esperado, obtido);
    }

    @Test
    @Description("Se mdc(a,b) = 1, então mdc(a.b,c) = mdc(a,c).mdc(b,c)")
    public void testMdcP5Resultado1(){
        final int a = 7;
        final int b = 3;
        final int c = 5;
        final int esperado = MathUtil.mdc(a * b, c);
        final int obtido = MathUtil.mdc(b,c);
        assertEquals(esperado, 1);
    }

    @Test
    @Description("mdc(a,b) = mdc(b,a)")
    public void testMdcP6(){
        final int a = 8;
        final int b = 2;
        final int esperado = MathUtil.mdc(a,b);
        final int obtido = MathUtil.mdc(b,a);
        assertEquals(esperado, obtido);
    }

    @Test
    @Description("Qualquer ou todo valor negativo deve resultar no mesmo que se fosse positivo")
    public void testMdcTudoNegativoP7(){
        final int a = -12;
        final int b = -6;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado, obtido);
    }

    @Test
    @Description("Qualquer ou todo valor negativo deve resultar no mesmo que se fosse positivo")
    public void testMdcTudoPositivoP7(){
        final int a = 12;
        final int b = 6;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado, obtido);
    }

    @Test
    @Description("Qualquer ou todo valor negativo deve resultar no mesmo que se fosse positivo")
    public void testMdcANegativoP7(){
        final int a = -12;
        final int b = 6;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado, obtido);
    }

    @Test
    @Description("Qualquer ou todo valor negativo deve resultar no mesmo que se fosse positivo")
    public void testMdcBNegativoP7(){
        final int a = 12;
        final int b = -6;
        final int esperado = 6;
        final int obtido = MathUtil.mdc(a,b);
        assertEquals(esperado, obtido);
    }
}