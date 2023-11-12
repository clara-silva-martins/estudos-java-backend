import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacoes;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracacaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracacaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporadas(10);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração total da série: " + serie.getDuracacaoEmMinutos());

        Filme meuFilmeSegundo = new Filme();
        meuFilmeSegundo.setNome("Barbie");
        meuFilmeSegundo.setAnoDeLancamento(2023);
        meuFilmeSegundo.setDuracacaoEmMinutos(132);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilmeSegundo);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacoes filtro = new FiltroRecomendacoes();
        filtro.filtrar(meuFilmeSegundo);

        Episodio episodio = new Episodio();
        episodio.setSerie(serie);
        episodio.setNumero(5);
        episodio.setTotalVisualizacoes(300);
        filtro.filtrar(episodio);






    }
}