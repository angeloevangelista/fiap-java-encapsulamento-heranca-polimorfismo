package sequencias;

public class ProgressaoGeometrica {
    private int valorAtual;
    private int fatorIncremental;

    public ProgressaoGeometrica(int fatorIncremental) {
        this.valorAtual = 1;
        this.fatorIncremental = fatorIncremental;
    }

    public int getValorAtual() {
        return this.valorAtual;
    }

    public void setValorAtual(int valorAtual) {
        if (valorAtual < 0) {
            return;
        }

        this.valorAtual = valorAtual;
    }

    public int obterProximoValor() {
        this.valorAtual = this.valorAtual * this.fatorIncremental;

        return this.valorAtual;
    }
}
