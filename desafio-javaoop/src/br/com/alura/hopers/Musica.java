package br.com.alura.hopers;

public class Musica extends Audio implements Curtir{

    private double curtidas;

    public void fichaMusica (){
        System.out.println("Nome da música: " + getTitulo());
        System.out.println("Duração: " + getDuracao() + "minutos");
    }


    @Override
    public double getNotaAvaliavel() {
        return curtidas++;
    }
}
