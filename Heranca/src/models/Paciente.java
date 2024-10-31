package models;

public class Paciente {
    private String nome;
    private FichaMedica fichaMedica;

    public Paciente(String nome) {
        this.nome = nome;
        this.fichaMedica = new FichaMedica();
    }

    public FichaMedica getFichaMedica() {
        return this.fichaMedica;
    }
}
