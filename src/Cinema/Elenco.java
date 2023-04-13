package Cinema;

public class Elenco {

    private String diretor;

    public Elenco(){

    }

    public Elenco(String diretor) {
        this.diretor = diretor;
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }


    @Override
    public String toString() {
        return "Elenco{" +
                "diretor='" + diretor + '\'' +
                '}';
    }
}
