package br.com.alura.hopers;

import java.util.List;

public class Podcast extends Colecoes{
    private String assuntoPodcast;
    private String temaTagPodcast;


    public String getAssuntoPodcast() {
        return assuntoPodcast;
    }

    public void setAssuntoPodcast(String assuntoPodcast) {
        this.assuntoPodcast = assuntoPodcast;
    }

    public String getTemaTagPodcast() {
        return temaTagPodcast;
    }

    public void setTemaTagPodcast(String temaTagPodcast) {
        this.temaTagPodcast = temaTagPodcast;
    }

    public void exibeFichaPod(){
        System.out.println("Título: " + getTituloColecao());
        System.out.println("Criador: " + getNomeDoCriador());
        System.out.println("Ano de Lançamento: " + getAnoLancamentoColecoes() );
        System.out.println("Sobre: " + getAssuntoPodcast());
        System.out.println("Tema: " + getTemaTagPodcast());
    }
}
