package dio.lab.padroes.projeto.strategy;

/**
 * A Interface PagamentoStrategy define o método processaPagamento que cada mecanismos de pagamento.
 * deve implementar.
 */
public interface PagamentoStrategy {

    void processaPagamento(double valor);
}
