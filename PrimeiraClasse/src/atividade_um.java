import java.util.Random;
import java.util.Scanner;

public class atividade_um {
    public static void main(String[] args) {
        System.out.println("Jogo de adivinhação");
        Scanner numeroDigitado = new Scanner(System.in);

        int vezesDigitadas = 0;

        while(vezesDigitadas < 5){
            Random random = new Random();
            int numero = random.nextInt(100);
            System.out.println("Digite um número: ");
            int digiteUmNumero = numeroDigitado.nextInt();

            vezesDigitadas ++;

            if (digiteUmNumero < numero){
                System.out.println("É menor que o número sorteado");
            } else if(digiteUmNumero > numero) {
                System.out.println("É maior que o número sorteado");
            } else {
                System.out.println("É o número correto!");
            }
        }

        System.out.println("Não foi dessa vez que vc conseguiu adivinhar o número!");
    }
}
