import sequencias.ProgressaoGeometrica;

public class Main {
    public static void main(String[] args) {
        ProgressaoGeometrica pg = new ProgressaoGeometrica(2);

        System.out.println(pg.obterProximoValor());
        System.out.println(pg.obterProximoValor());

        pg.setValorAtual(-8);

        System.out.println(pg.obterProximoValor());
        System.out.println(pg.obterProximoValor());

        // ContaBancaria
        //   int numero
        //   float saldo
        //
        //   sacar(float valor)
        //   depositar(float valor)
    }
}