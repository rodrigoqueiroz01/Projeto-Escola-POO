package escola;

public class Escola {

    public static void main(String[] args) {
        // Pessoa pessoa = new Pessoa();    // NÃO PODE SER INSTANCIADO PORQUE É UMA CLASSE ABSTRATA.
        // --------------------------------------------------------------------
        var visitante = new Visitante();
        System.out.println("===== Visitante =====");

        visitante.setNome("Rodrigo");
        visitante.setIdade(23);
        visitante.setSexo("Masculino");
        System.out.println(visitante.toString() + "\n");

        visitante.fazerAniversario();
        // --------------------------------------------------------------------
        quebraLinha();
        // --------------------------------------------------------------------
        var professor = new Professor();
        System.out.println("===== Professor =====");

        professor.setNome("Wilton");
        professor.setIdade(47);
        professor.setSexo("Masculino");
        System.out.println(professor.toString());

        professor.setEspecialidade("Matemática");
        System.out.println("Especialidade: " + professor.getEspecialidade());

        professor.setSalario(2300.99);
        System.out.println("Salário: R$" + professor.getSalario() + "\n");

        professor.fazerAniversario();
        professor.receberAumento();
        // --------------------------------------------------------------------
        quebraLinha();
        // --------------------------------------------------------------------
        var aluno = new Aluno();
        System.out.println("===== Aluno =====");

        aluno.setNome("Claudio");
        aluno.setIdade(16);
        aluno.setSexo("Masculino");
        System.out.println(aluno.toString());

        aluno.setMatricula(1354598794);
        System.out.println("Matrícula: " + aluno.getMatricula());

        aluno.setCurso("Informatica");
        System.out.println("Curso: " + aluno.getCurso() + "\n");

        aluno.fazerAniversario();
        aluno.pagarMensalidade();
        // --------------------------------------------------------------------
        quebraLinha();
        // --------------------------------------------------------------------
        var bolsista = new Bolsista();
        System.out.println("===== Bolsista =====");

        bolsista.setNome("Mariana");
        bolsista.setIdade(25);
        bolsista.setSexo("Feminino");
        System.out.println(bolsista.toString());

        bolsista.setMatricula(12124785);
        System.out.println("Matrícula: " + bolsista.getMatricula());

        bolsista.setCurso("Administração");
        System.out.println("Curso: " + bolsista.getCurso());

        bolsista.setValorBolsa(1300.0);
        System.out.println("Valor da bolsa: R$" + bolsista.getValorBolsa() + "\n");

        bolsista.fazerAniversario();
        bolsista.renovarBolsa();
        bolsista.pagarMensalidade();
        // --------------------------------------------------------------------
        quebraLinha();
        // --------------------------------------------------------------------
        var tecnico = new Tecnico();
        System.out.println("===== Tecnico =====");

        tecnico.setNome("Fagner");
        tecnico.setIdade(20);
        tecnico.setSexo("Masculino");
        System.out.println(tecnico.toString());

        tecnico.setMatricula(14587203);
        System.out.println("Matrícula: " + tecnico.getMatricula());

        tecnico.setCurso("Mecatrônica");
        System.out.println("Curso: " + tecnico.getCurso());

        tecnico.setRegistroProfissional(14578962);
        System.out.println("Registro profissional: " + tecnico.getRegistroProfissional() + "\n");

        tecnico.fazerAniversario();
        tecnico.pagarMensalidade();
        tecnico.praticar();
        // --------------------------------------------------------------------
    }

    public static void quebraLinha() {
        System.out.println();
    }

}
