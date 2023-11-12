public class Main {
    public static void main(String[] args) {


      Produto produto = new Produto();
      produto.setNome("Pepsi");
      produto.setValor(6);

      Servico servico = new Servico();
      servico.setDescricao("Pintura");
      servico.setAliquotaISS(2);
      servico.setValor(100);

      CalculadoraImposto calculadoraImposto = new CalculadoraImposto();

      calculadoraImposto.calcularImposto(produto);
      calculadoraImposto.calcularImposto(servico);



    }
}