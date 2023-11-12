public class numeros_pares {


    public static void main(String[] args) {

        System.out.println("Contador de números pares");


        int numero = 0;

        while ( numero < 100 ){

            numero ++;

            if (numero % 2 == 0){
                System.out.println(numero);
            }

        }
    }
}