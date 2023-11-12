import java.util.Scanner;

public class numero_par_impar {
    public static void main(String[] args) {
        System.out.println("Exercício números pares e ímpares");

        Scanner NumeroDigitado = new Scanner(System.in);

        int contador = 0;

        while(contador != -1) {
            System.out.println("Digite um número: ");
            contador = NumeroDigitado.nextInt();

            if(contador == -1) {
                return;
            }
                if (contador % 2 == 0) {
                    System.out.println(contador + " é um número par");

                } else {
                    System.out.println(contador + " é um número ímpar");
                }


        }
    }
}
