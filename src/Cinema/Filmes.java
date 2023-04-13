package Cinema;

public class Filmes {

    private String titulo;
    private int anoEstreia;
    private Elenco elenco;
    private double nota;


    public Filmes(){

    }

    public Filmes(String titulo, int anoEstreia, Elenco elenco, double nota) {
        this.titulo = titulo;
        this.anoEstreia = anoEstreia;
        this.elenco = elenco;
        this.nota = nota;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoEstreia() {
        return anoEstreia;
    }

    public void setAnoEstreia(int anoEstreia) {
        this.anoEstreia = anoEstreia;
    }

    public Elenco getElenco() {
        return elenco;
    }

    public void setElenco(Elenco elenco) {
        this.elenco = elenco;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Filmes{" +
                "titulo='" + titulo + '\'' +
                ", anoEstreia=" + anoEstreia +
                ", elenco=" + elenco +
                ", nota=" + nota +
                '}';
    }
}
