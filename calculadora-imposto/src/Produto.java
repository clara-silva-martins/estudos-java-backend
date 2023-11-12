public class Produto implements Tributavel{

    private String nome;
    private double valor;

    @Override
    public double getValorImposto() {
        return this.valor * 0.1;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


}
