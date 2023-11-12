import br.com.alura.hopers.*;

public class Main {
    public static void main(String[] args) {

        Album alucinacao = new Album();
        alucinacao.setTituloColecao("Alucinção");
        alucinacao.setNomeDoArtista("Belchior");
        alucinacao.setAnoLancamentoColecoes(1976);
        alucinacao.setQuantidadeDeMusicas(10);
        alucinacao.setDuracaoTotalColecoes(78);
        alucinacao.setTotalDeOuvintes(1186564);
        alucinacao.exibeFicha();


        Musica musicaUm = new Musica();
        musicaUm.setTitulo("Sujeito de Sorte");
        musicaUm.setDuracao(3);
        musicaUm.fichaMusica();

        Podcast gostosasChoram = new Podcast();
        gostosasChoram.setTituloColecao("gostosas também choram");
        gostosasChoram.setNomeDoCriador("lela brandão");
        gostosasChoram.setAnoLancamentoColecoes(2023);
        gostosasChoram.setAssuntoPodcast("vida de uma jovem adulta");
        gostosasChoram.setTemaTagPodcast("histórias pessoais");
        gostosasChoram.exibeFichaPod();


        Episodio episodioUm = new Episodio();
        episodioUm.setTitulo("coisas que amo sobre ser adulta");
        episodioUm.setDiaDeLancamento(22);
        episodioUm.setMesDeLancamento("Agosto");
        episodioUm.exibeFichaPod();


        Audio audio = new Musica();



    }
}