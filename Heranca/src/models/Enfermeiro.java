package models;

public class Enfermeiro extends ProfissionalDaSaude {
    private String turno;

    public Enfermeiro(String nome, int numeroRegistro) {
        super(nome, numeroRegistro);

        this.turno = "noturno";
    }

    public Enfermeiro(String nome, int numeroRegistro, String turno) {
        super(nome, numeroRegistro);

        this.turno = turno;
    }

    @Override
    public String obterIdentificacao() {
        String identificacao = super.obterIdentificacao();

        identificacao += ", Turno: " + this.turno;

        return identificacao;
    }

    @Override
    public void tratar(Paciente paciente) {
        FichaMedica fichaMedica = paciente.getFichaMedica();

        if (!fichaMedica.jahFoiAtendidoPeloMedico()) {
            fichaMedica.adicionarAcontecimento(this, "Tomou uma chamada do enfermeiro por ficar indo lá antes de passar no médico");
            return;
        }

        if (fichaMedica.jahFoiAtendidoPeloEnfermeiro()) {
            fichaMedica.adicionarAcontecimento(this, "Tomou uma chamada do enfermeiro por ficar indo lá mais de uma vez");
            return;
        }

        this.administrarMedicamento(paciente);

        fichaMedica.registrarAtendimento(this);
    }

    private void administrarMedicamento(Paciente paciente) {
        FichaMedica fichaMedica = paciente.getFichaMedica();

        fichaMedica.adicionarAcontecimento(this, "Segurou o paciente pra ele nao correr");
        fichaMedica.adicionarAcontecimento(this, "Preparou a agulha");
        fichaMedica.adicionarAcontecimento(this, "Injetiou o medicamento");
        fichaMedica.adicionarAcontecimento(this, "Deu um pirulito pro paciente");
    }

    public void pedirInformacao(Paciente paciente) {
        FichaMedica fichaMedica = paciente.getFichaMedica();

        fichaMedica.adicionarAcontecimento(this, "Deu informacao pro paciente");
    }
}
