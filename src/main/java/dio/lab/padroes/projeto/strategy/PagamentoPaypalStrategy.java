package dio.lab.padroes.projeto.strategy;
/**
 * PagamentoPaypalStrategy é a implementação concreta do pagamento via PayPal
 */
public class PagamentoPaypalStrategy implements PagamentoStrategy{
    private static final String NOME = "PayPal";
    @Override
    public void processaPagamento(double valor) {
        System.out.printf("%s no valor de %.2f\n",NOME, valor);
    }
}
