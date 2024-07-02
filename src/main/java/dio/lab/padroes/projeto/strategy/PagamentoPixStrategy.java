package dio.lab.padroes.projeto.strategy;
/**
 * PagamentoPixStrategy é a implementação concreta do pagamento via Pix
 */
public class PagamentoPixStrategy implements PagamentoStrategy{
    private static final String NOME = "Pix";
    @Override
    public void processaPagamento(double valor) {
        System.out.printf("%s no valor de %.2f\n",NOME, valor);
    }
}
