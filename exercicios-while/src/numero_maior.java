import java.util.Scanner;

public class numero_maior {
    public static void main(String[] args) {
        System.out.println("Descobrir o maior número");
        Scanner numeroMaior = new Scanner(System.in);
        int numeroDigitado = 0;
        int maiorNum = 0;
        int quantidadeNumeros = 0;



        while (quantidadeNumeros <= 10) {

            System.out.println("Digite um número: ");
            numeroDigitado = numeroMaior.nextInt();

            if(numeroDigitado > maiorNum){
                maiorNum = numeroDigitado;
            }

            quantidadeNumeros  ++;

        }

        System.out.println("O maior número digitado é: " + maiorNum);
    }
}
