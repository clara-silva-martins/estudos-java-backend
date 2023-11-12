public class Main {
    public static void main(String[] args) {

        System.out.println("Conversão de temperatura de graus Celsius para Fahrenheit");

        double temperaturaManhaC = 21.9;
        double temperaturaTardeC = 31.2;
        double temperaturaNoiteC = 18.1;

        int temperaturaManhaF = (int) ((temperaturaManhaC * 1.8) + 32);
        int temperaturaTardeF = (int) ((temperaturaTardeC * 1.8) + 32);
        int temperaturaNoiteF = (int) ((temperaturaNoiteC * 1.8) + 32);

        String frase;
        frase = """
                A temperatura pela manhã de graus Celsius para Fahrenheit é: %d.   
                A tarde a temperatura é %d e a noite a tempetura é %d
                """.formatted(temperaturaManhaF, temperaturaTardeF, temperaturaNoiteF);
        System.out.println(frase);

       }
}