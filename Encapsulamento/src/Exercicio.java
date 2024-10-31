import exercicio.ContaBancaria;

public class Exercicio {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria(123456);

        contaBancaria.depositar(100);
        contaBancaria.depositar(200);

        contaBancaria.sacar(70);
        contaBancaria.depositar(0);
        contaBancaria.sacar(8000);

        System.out.printf("Saldo atual: %s\n", contaBancaria.getSaldo());
    }
}
