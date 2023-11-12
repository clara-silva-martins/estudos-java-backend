
public class Main{
    public static void main(String[] args) {
        System.out.println("Esse é um exercício básico de Java");
        System.out.println("O intuito desse programa é testar alguns conhecimentos");

        System.out.println("Informções Cadastrais");
        String nome;
        nome = "Clara";
        int diaDeNascimento = 7;
        String mes;
        mes = "Setembro";
        int anoDeNascimento = 1998;
        int idade = 24;
        double peso = 77.3;
        double altura = 1.74;
        //boolean estudante = true;
        //String endereco;
        //endereco = "Altiplano Leste";

        System.out.println(String.format("Olá me chamo %s, faço aniversário no dia %d de %s de %d. Tenho %d anos e peso %.3f e tenho %.3f de altura. ", nome, diaDeNascimento, mes, anoDeNascimento, idade, peso, altura));

        int media = ( 8 + 5 + 10) / 3;
        System.out.println(("A média é: ") + media);

        String sobreMim;
                sobreMim = """
                        Sou estudante de Análise e Desenvolvimento de Sistemas do IESB.
                        Estou no segundo semestre da faculdade.
                        Estou aprendendo Java.
                        """;
        System.out.println(sobreMim);

    }
}

