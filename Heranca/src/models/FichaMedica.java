package models;

import java.util.ArrayList;
import java.util.List;

public class FichaMedica {
    private List<String> historico;
    private boolean atendidoPeloMedico;
    private boolean atendidoPeloEnfermeiro;

    public FichaMedica() {
        this.historico = new ArrayList<String>();
    }

    public void adicionarAcontecimento(ProfissionalDaSaude profissionalDaSaude, String acontecimento) {
        this.historico.add("[ " +profissionalDaSaude.obterIdentificacao() + " ]: "+ acontecimento);
    }

    public List<String> getHistorico() {
        return this.historico;
    }

    public void registrarAtendimento(ProfissionalDaSaude profissionalDaSaude) {
        if (profissionalDaSaude instanceof Medico) {
            this.adicionarAcontecimento(profissionalDaSaude, "O atendimento do médico foi finalizado");
            this.atendidoPeloMedico = true;
        }

        if (profissionalDaSaude instanceof Enfermeiro) {
            this.adicionarAcontecimento(profissionalDaSaude, "O enfermeiro finalizou a administracao do medicamento");
            this.atendidoPeloEnfermeiro = true;
        }
    }

    public boolean jahFoiAtendidoPeloMedico() {
        return this.atendidoPeloMedico;
    }

    public boolean jahFoiAtendidoPeloEnfermeiro() {
        return this.atendidoPeloEnfermeiro;
    }
}
