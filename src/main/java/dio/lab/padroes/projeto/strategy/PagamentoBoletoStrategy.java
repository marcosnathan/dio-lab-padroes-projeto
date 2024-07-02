package dio.lab.padroes.projeto.strategy;

/**
 * PagamentoBoletoStrategy é a implementação concreta do pagamento via Boleto
 */
public class PagamentoBoletoStrategy implements PagamentoStrategy{
    private static final String NOME = "Boleto";
    @Override
    public void processaPagamento(double valor) {
        System.out.printf("%s no valor de %.2f\n",NOME, valor);
    }
}
