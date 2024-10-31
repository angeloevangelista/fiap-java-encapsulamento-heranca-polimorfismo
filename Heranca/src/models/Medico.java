package models;

public class Medico extends ProfissionalDaSaude {
    private String especialidade;

    public Medico(String nome, int numeroRegistro) {
        super(nome, numeroRegistro);

        this.especialidade = "Clínico Geral";
    }

    public Medico(String nome, int numeroRegistro, String especialidade) {
        super(nome, numeroRegistro);

        this.especialidade = especialidade;
    }

    @Override
    public String obterIdentificacao() {
        String identificacao = super.obterIdentificacao();

        identificacao += ", Especialidade: " + this.especialidade;

        return identificacao;
    }

    @Override
    public void tratar(Paciente paciente) {
        FichaMedica fichaMedica = paciente.getFichaMedica();

        if (fichaMedica.jahFoiAtendidoPeloMedico()) {
            fichaMedica.adicionarAcontecimento(this, "Tomou uma chamada do médico por ficar indo lá toda hora");
            return;
        }

        fichaMedica.adicionarAcontecimento(this, "O medico comecou o atendimento");
        fichaMedica.adicionarAcontecimento(this, "O medico receitou um medicamento X");
        fichaMedica.registrarAtendimento(this);
    }
}
