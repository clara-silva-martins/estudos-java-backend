public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean inclusoNoPlano = true;
        double nota = 8.0;
        String tipoPlano = "plus";


        if (anoDeLancamento >= 2022){
            System.out.println("É um filme recente!");
        } else {
            System.out.println("É um filme retrô!");
        }

        if (inclusoNoPlano || tipoPlano.equals("plus")){
            System.out.println("Está disponível para a sua conta");
        } else {
            System.out.println("Para acessar o conteúdo assine o canal extra");
        }


    }
}
