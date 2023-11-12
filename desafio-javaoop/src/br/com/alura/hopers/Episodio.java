package br.com.alura.hopers;

public class Episodio extends Audio{
    private int diaDeLancamento;
    private String mesDeLancamento;


    public void exibeFichaPod(){
        System.out.println("Título: " + getTitulo());
        System.out.println("Lançado em: " + getDiaDeLancamento() + " de " + getMesDeLancamento() );

    }

    public int getDiaDeLancamento() {
        return diaDeLancamento;
    }

    public String getMesDeLancamento() {
        return mesDeLancamento;
    }

    public void setMesDeLancamento(String mesDeLancamento) {
        this.mesDeLancamento = mesDeLancamento;
    }


    public void setDiaDeLancamento(int diaDeLancamento) {
        this.diaDeLancamento = diaDeLancamento;
    }


}
