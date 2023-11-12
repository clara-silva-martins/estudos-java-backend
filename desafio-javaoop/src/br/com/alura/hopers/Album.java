package br.com.alura.hopers;

public class Album extends Colecoes {


    private int quantidadeDeMusicas;


    public int getQuantidadeDeMusicas() {
        return quantidadeDeMusicas;
    }

    public void setQuantidadeDeMusicas(int quantidadeDeMusicas) {
        this.quantidadeDeMusicas = quantidadeDeMusicas;
    }

    public void exibeFicha(){
        System.out.println("Título: " + getTituloColecao());
        System.out.println("Nome do Artista: " + getNomeDoArtista());
        System.out.println("Ano de Lançamento: " + getAnoLancamentoColecoes());
        System.out.println("Músicas: " + quantidadeDeMusicas);
        System.out.println("Duração do Album: " + getDuracaoTotalColecoes());
        System.out.println("Total de ouvintes mensais: " + getTotalDeOuvintes());
    }
}
