import br.com.alura.screenmatch.calculos.*;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.io.File;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme favorito = new Filme("The Matrix", 1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme outro = new Filme("John Wick", 2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie("La Casa de Papel", 2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);



        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(serie);
        primeiro.setTotalVisualizacoes(300);



        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(favorito);
        filtro.filtrar(outro);
        filtro.filtrar(primeiro);


        Filme filmeDoIuri = new Filme("Interestellar", 2018);

        filmeDoIuri.setDuracaoEmMinutos(200);
        filmeDoIuri.avalia(10);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoIuri);
        listaDeFilmes.add(favorito);


        System.out.println(listaDeFilmes.size());
        System.out.println(listaDeFilmes.get(0));
        System.out.println(listaDeFilmes);
        System.out.printf("toString do filme: " + listaDeFilmes.get(0).toString());


    }


}
