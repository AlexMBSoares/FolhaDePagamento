package programa;

public abstract class Colaborador {
    protected String matricula;
    protected String nome;
    protected static final double salarioBase = 2000.00;

    public Colaborador(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularSalario();
}