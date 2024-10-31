package exercicio;

public class ContaBancaria {
    private int numero;
    private float saldo;

    public ContaBancaria(int numero) {
        this.numero = numero;
        this.saldo = 0;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void sacar(float valor) {
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
            return;
        }

        this.saldo = this.saldo - valor;
    }

    public void depositar(float valor) {
        if (valor < 0) {
            System.out.println("Você não pode depositar um valor negativo");
            return;
        }

        if (valor == 0) {
            System.out.println("Eu sou algum piada pra você?");
            return;
        }

        this.saldo = this.saldo + valor;
    }
}