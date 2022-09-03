package escola;

public class Professor extends Pessoa {

    private String especialidade;
    private double salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void receberAumento() {
        this.getSalario();
        double aumentoSalario = this.getSalario() + 1000.0;
        System.out.println("Atualizando o aumento de salário: R$" + aumentoSalario);
    }

}
