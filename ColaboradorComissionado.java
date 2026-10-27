package programa;

public class ColaboradorComissionado extends Colaborador {
    private double vendas;
    private double comissao;

    public ColaboradorComissionado(String nome, String matricula, double vendas, double comissao) {
        super(nome, matricula);
        this.vendas = vendas;
        this.comissao = comissao;
    }
    
    @Override 
    public double calcularSalario() {
        return salarioBase + (vendas * comissao / 100);
    }
}
