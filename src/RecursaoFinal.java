public class RecursaoFinal {

    public int fatorialTailRec(int n, int acumulador) {
        if (n == 0 || n == 1) {
            return acumulador;
        } else {
            return fatorialTailRec(n - 1, n * acumulador);
        }
    }
}
