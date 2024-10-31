import models.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProfissionalDaSaude medico = new Medico("Lucas", 1234);
        ProfissionalDaSaude enfermeiro = new Enfermeiro("André", 1235);

        Paciente paciente = new Paciente("Pedro");

        enfermeiro.tratar(paciente);
        medico.tratar(paciente);
        enfermeiro.tratar(paciente);
        enfermeiro.tratar(paciente);

        // cast -> casting

        int a = 1;
        int b = 2;

        double resultado = (double)a / b;
        System.out.println(resultado);

        if (enfermeiro instanceof Enfermeiro) {
            ((Enfermeiro)enfermeiro).pedirInformacao(paciente);
        }

        if (medico instanceof Enfermeiro) {
            ((Enfermeiro)medico).pedirInformacao(paciente);
        }

        for (String acontecimento : paciente.getFichaMedica().getHistorico()) {
            System.out.println(acontecimento);
        }
    }
}