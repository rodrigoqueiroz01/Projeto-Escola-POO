package escola;

public class Tecnico extends Aluno {

    private long registroProfissional;

    public long getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(long registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void praticar() {
        System.out.println("Praticando o que aprendeu!");
    }

}
