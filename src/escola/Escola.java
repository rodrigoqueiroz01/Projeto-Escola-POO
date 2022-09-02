package escola;

public class Escola {

    public static void main(String[] args) {
        // Pessoa pessoa = new Pessoa();    // NÃO PODE SER INSTANCIADO PORQUE É UMA CLASSE ABSTRATA.

        var visitante = new Visitante();
        visitante.setNome("Rodrigo");
        visitante.setIdade(23);
        visitante.setSexo("M");

        System.out.println(visitante.toString() + "\n");

        var aluno = new Aluno();
        aluno.setNome("Claudio");
        aluno.setMatricula(1354598794);
        aluno.setCurso("Informatica");
        aluno.setIdade(16);
        aluno.setSexo("Masculino");
        aluno.pagarMensalidade();

        quebraLinha();

        var bolsista = new Bolsista();
        bolsista.setNome("Mariana");
        bolsista.setMatricula(12124785);
        bolsista.setCurso("Sergipe");
        bolsista.setIdade(25);
        bolsista.setSexo("Feminino");
        bolsista.setValorBolsa(1300.0);
        bolsista.pagarMensalidade();

    }

    public static void quebraLinha() {
        System.out.println();
    }

}
