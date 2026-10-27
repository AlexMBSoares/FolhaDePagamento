package programa;

public class ColaboradorProducao extends Colaborador {
    private int quantidadeProduzida;
    private double valorPorPeca;

    public ColaboradorProducao(String nome, String matricula, double valorPorPeca, int quantidadeProduzida) {
        super(nome, matricula);
        this.valorPorPeca = valorPorPeca;
        this.quantidadeProduzida = quantidadeProduzida;
    }
    
    @Override 
    public double calcularSalario() {
        return salarioBase + (quantidadeProduzida * valorPorPeca);
    }
}