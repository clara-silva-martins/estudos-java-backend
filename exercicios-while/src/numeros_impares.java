public class numeros_impares {
    public static void main(String[] args) {

        System.out.println("Exercícios de WHILE");

        System.out.println("Contador números ímpares ");

        int numero = 0;

        while (numero < 100) {
            numero++;

            if (numero % 2 == 1) {
                System.out.println(numero);
            }

        }


    }
}