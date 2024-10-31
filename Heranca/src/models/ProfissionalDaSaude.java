package models;

public abstract class ProfissionalDaSaude {
    protected String nome;
    protected int numeroRegistro;

    public ProfissionalDaSaude(String nome, int numeroRegistro) {
        this.nome = nome;
        this.numeroRegistro = numeroRegistro;
    }

    public String obterIdentificacao() {
        String identificacao = "";

        identificacao += "Nome: " + this.nome;
        identificacao += ", Numero Registro: " + this.numeroRegistro;

        return identificacao;
    }

    public abstract void tratar(Paciente paciente);
}
