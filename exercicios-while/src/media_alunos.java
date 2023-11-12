import java.util.Scanner;

public class media_alunos {
    public static void main(String[] args) {
        System.out.println("Média de alunos de uma turma");
        System.out.println("Digite -1 para terminar o programa");
        Scanner MediaDosAlunos = new Scanner(System.in);
        double nota = 0;
        double mediaDeNotas= 0;
        int quantidaDeNotas = 0;

        while(nota != -1){

            System.out.println("Digite a nota: ");
            nota = MediaDosAlunos.nextDouble();

            if(nota != -1){
                mediaDeNotas += nota;
                quantidaDeNotas++;
            }

        }

        System.out.println("Média da nota dos 5 alunos de uma turma é: " + mediaDeNotas/quantidaDeNotas);

    }
}
