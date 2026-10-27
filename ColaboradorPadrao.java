package programa;

public class ColaboradorPadrao extends Colaborador {
    public ColaboradorPadrao(String nome, String matricula) {
        super(nome, matricula);
    }
    
    @Override 
    public double calcularSalario() {
        return salarioBase;
    }
}