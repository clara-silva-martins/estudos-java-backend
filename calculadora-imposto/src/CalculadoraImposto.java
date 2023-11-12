public class CalculadoraImposto {

    private double totalImposto = 0;

    public void calcularImposto(Tributavel item) {
        this.totalImposto += item.getValorImposto();
        System.out.println(getTotalImposto());
    }

    public double getTotalImposto() {
        return this.totalImposto;
    }


}
