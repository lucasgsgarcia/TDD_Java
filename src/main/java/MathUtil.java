import java.util.Objects;

public class MathUtil {
    public static int mdc(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);


        //P6
        final int maior = Math.max(a, b);
        b = Math.min(a, b);
        a = maior;

        //P1
        if (b > 0 && a % b == 0) {
            return b;
        }

        //P3
        if (b == 0){
            return Math.abs(a);
        }

        //P5 e P7
        return mdc( a - b, b);
    }

    public static int mdc(int ...valores){
        Objects.requireNonNull(valores, "O parâmetro não pode ser informado como 'null' para calcular o MDC");
        if(valores.length == 0){
            throw new IllegalArgumentException(
                    "É preciso indicar ao menos um valor para calcular o MDC"
            );
        }
        int a = valores[0];
        for (int b : valores) {
            a = mdc(a,b);
        }
        return a;
    }
}
