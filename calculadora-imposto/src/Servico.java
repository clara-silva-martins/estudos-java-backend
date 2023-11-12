public class Servico implements Tributavel{

    private String descricao;
    private double valor;
    private double aliquotaISS;

    @Override
    public double getValorImposto() {
        return this.valor * this.aliquotaISS / 100;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getAliquotaISS() {
        return aliquotaISS;
    }

    public void setAliquotaISS(double aliquotaISS) {
        this.aliquotaISS = aliquotaISS;
    }


}
