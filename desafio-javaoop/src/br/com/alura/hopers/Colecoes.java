package br.com.alura.hopers;

public class Colecoes {

    private String tituloColecao;
    private double duracaoTotalColecoes;
    private int totalDeOuvintes;
    private int anoLancamentoColecoes;
    private String nomeDoCriador;

    public String getTituloColecao() {
        return tituloColecao;
    }

    public void setTituloColecao(String tituloColecao) {
        this.tituloColecao = tituloColecao;
    }

    public double getDuracaoTotalColecoes() {
        return duracaoTotalColecoes;
    }

    public void setDuracaoTotalColecoes(double duracaoTotalColecoes) {
        this.duracaoTotalColecoes = duracaoTotalColecoes;
    }

    public int getTotalDeOuvintes() {
        return totalDeOuvintes;
    }

    public void setTotalDeOuvintes(int totalDeOuvintes) {
        this.totalDeOuvintes = totalDeOuvintes;
    }

    public int getAnoLancamentoColecoes() {
        return anoLancamentoColecoes;
    }

    public void setAnoLancamentoColecoes(int anoLancamentoColecoes) {
        this.anoLancamentoColecoes = anoLancamentoColecoes;
    }

    public String getNomeDoCriador() {
        return nomeDoCriador;
    }

    public void setNomeDoCriador(String nomeDoCriador) {
        this.nomeDoCriador = nomeDoCriador;
    }

    public String getNomeDoArtista() {
        return nomeDoCriador;
    }

    public void setNomeDoArtista(String nomeDoArtista) {

        this.nomeDoCriador = nomeDoArtista;
    }
}
