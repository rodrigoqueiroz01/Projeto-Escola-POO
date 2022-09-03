package escola;

public class Aluno extends Pessoa {

    private long matricula;
    private String curso;

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void pagarMensalidade() {
        System.out.println("Efetuando pagamento da mensalidade. " +
                "(Aluno(a): " + this.nome + " | " +
                "Matricula: " + this.getMatricula() + ")");
    }

}
