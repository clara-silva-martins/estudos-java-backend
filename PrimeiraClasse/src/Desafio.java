import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("****************** Dados do cliente ******************");

        String dados;
        dados = """
                Nome do cliente: Clara Martins
                Tipo de conta: Corrente
                Saldo em conta: 1750
                """;
        System.out.println(dados);

        int saldo = 1750;
        int digito = 0;

            String menu;
            menu = """
                     Operações
                     
                     1 - Consultar saldos
                     2 - Receber valor
                     3 - Transferir valor
                     4 - Sair
                    """;

            while(digito != 4) {

                System.out.println(menu);

                System.out.println("Digite a opção desejada: ");
                digito = leitura.nextInt();

                if (digito == 1) {
                    System.out.println("Seu saldo atual é: " + saldo);
                }

                if (digito == 2) {
                    System.out.println("Qual o valor que será recebido? ");
                    int valorAreceber = leitura.nextInt();
                    saldo += valorAreceber;
                    System.out.println("Seu saldo atual é: " + saldo);
                }

                if (digito == 3) {
                    System.out.println("Qual o valor será transferido?");
                    int valorAtransferir = leitura.nextInt();

                    if (saldo < valorAtransferir) {
                        System.out.println("Você está sem saldo suficiente! ");
                    } else {
                        saldo -= valorAtransferir;
                        System.out.println("Seu saldo atual é: " + saldo);
                    }
                }

                if (digito == 4) {
                    System.out.println("Você finalizou a operação");
                    break;
                }

                if(digito > 4 || digito < 1){
                    System.out.println("Digito inválido");
                }

            }

    }
}

