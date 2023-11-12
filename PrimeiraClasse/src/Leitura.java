import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        //Importa uma classe chamada Scanner que faz parte de um pacote. Para essa classe  declarada é dado um nome e atribuido um new Scanner com um parametro System.in que é responsável por rastrear algo que esta sendo inserido, ou seja, ler a entrada do usuário pelo teclado.

        Scanner leitura = new Scanner(System.in);



        //Declarar uma variável e essa variável vai ler o que for escrito no teclado. E o nextLine() é responsável por ler um texto que for digitado. Ou seja vai ler o que foi digitado e armazenar na variável filme.

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Digite o ano de lançamento: ");
        int anoLancamento = leitura.nextInt();

        System.out.println("Digite uma nota pra o filme: ");
        double notaFilme = leitura.nextDouble();

        String resultado =
                """
                O filme escolhido é: %s
                Lançado em: %d
                Com nota: %.2f
                """.formatted(filme, anoLancamento, notaFilme);
        System.out.println(resultado);




    }
}
