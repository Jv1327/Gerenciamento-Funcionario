public class Gerente extends Funcionario{
    private double bonus;

    public void ExibirDetalhes(){
        
    }

    public Gerente (double bonus) {
        super("João victor ", "1234825716", 38980);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void exibirDetalhes() {
        System.out.println("Bonus: " + bonus );
    }
}
