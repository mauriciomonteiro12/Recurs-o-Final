public class Main {

    public static void main(String[] args) {
        RecursaoFinal recursaoFinal = new RecursaoFinal();
        Fatorial fatorial = new Fatorial(recursaoFinal);

        int numero = 5;
        int resultado = fatorial.calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é: " + resultado);
    }
}