import java.util.Scanner;

public class dois_maiores {
    public static void main(String[] args) {
        System.out.println("Escreva um número e vamos descobrir qual os dois maiores");
        Scanner doisMaioresNumeros = new Scanner(System.in);
        int numeroDigitado = 0;
        int primeiroMaiorNumero = 0;
        int segundoMaiorNumero = 0;
        int quantidadeDeNumeros = 0;

        while(quantidadeDeNumeros < 3) {
            System.out.println("Digite um número: ");
            numeroDigitado = doisMaioresNumeros.nextInt();

           if (numeroDigitado > primeiroMaiorNumero){
               segundoMaiorNumero = primeiroMaiorNumero;
               primeiroMaiorNumero = numeroDigitado;
           } else if (segundoMaiorNumero < numeroDigitado) {
               segundoMaiorNumero = numeroDigitado;
           }

            quantidadeDeNumeros ++;
        }

        System.out.println("O primeiro maior número é o " + primeiroMaiorNumero + " e o segundo maior número é o " + segundoMaiorNumero);
    }
}
