public class Fatorial {

    public RecursaoFinal recursao;

    public Fatorial(RecursaoFinal recursao) {
        this.recursao = recursao;

    }

    public int calcularFatorial(int n) {
        return recursao.fatorialTailRec(n, 1);
    }

}
