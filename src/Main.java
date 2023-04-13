import Cinema.Filmes;
import Cinema.Elenco;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Filmes filmes;
        Elenco elenco;
        int encerrar = 0;

        String tituloFilme;
        int anoFilme = 0;
        double notaFilme = 0;
        String diretorFilme;

        do{
            var titulo = JOptionPane.showInputDialog("Nome do filme:");
            var anoEstreia = Integer.parseInt(JOptionPane.showInputDialog("Ano de lançamento:"));
            var nota = Double.parseDouble(JOptionPane.showInputDialog("Nota do filme:"));
            var diretor = JOptionPane.showInputDialog("Nome do Diretor:");

            elenco = new Elenco(diretor);
            filmes = new Filmes(titulo, anoEstreia, elenco, nota);

            tituloFilme = filmes.getTitulo();
            anoFilme = filmes.getAnoEstreia();
            notaFilme = filmes.getNota();
            diretorFilme = elenco.getDiretor();


            var pergunta = """
                    Você quer inserir outro filme?
                    
                    [ 0 ] Sim
                    [ 1 ] Não
                    """;

            encerrar = Integer.parseInt(JOptionPane.showInputDialog(pergunta));



        } while(encerrar == 0);


        JOptionPane.showMessageDialog(null, "Titulo do filme: " + tituloFilme + "\nAno de lançamento: " + anoFilme + "\nNota do filme: " + notaFilme + "\nDiretor do filme: " + diretorFilme);

    }
}