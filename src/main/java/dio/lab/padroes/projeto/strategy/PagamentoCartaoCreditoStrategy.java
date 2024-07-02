package dio.lab.padroes.projeto.strategy;

/**
 * PagamentoCartaoCreditoStrategy é a implementação concreta do pagamento via Cartão de Crédito
 */
public class PagamentoCartaoCreditoStrategy implements PagamentoStrategy{
    private static final String NOME = "Cartao Credito";
    @Override
    public void processaPagamento(double valor) {
        System.out.printf("%s no valor de %.2f\n",NOME, valor);
    }
}
