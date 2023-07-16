package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme johnWick = new Filme("John Wick", 2014);
        johnWick.avalia(6);

        Serie laCasaDePapel = new Serie("La Casa de Papel", 2017);
        laCasaDePapel.avalia(9);

        Filme theMatrix = new Filme("The Matrix", 1999);
        theMatrix.avalia(7);

        Filme interestellar = new Filme("Interestellar", 2018);




        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(interestellar);
        lista.add(theMatrix);
        lista.add(laCasaDePapel);
        lista.add(johnWick);


        Collections.sort(lista);
        System.out.println(lista);

        /*
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificaçao: " + filme.getClassificacao());
            }
        }

         */

        //lista.forEach(System.out::println);



    }
}
