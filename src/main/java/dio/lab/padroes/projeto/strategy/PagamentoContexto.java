package dio.lab.padroes.projeto.strategy;

public class PagamentoContexto {
    private final PagamentoStrategy pagamentoStrategy;

    public PagamentoContexto(PagamentoStrategy pagamentoStrategy){
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public void executaPagamento(double valor){
        this.pagamentoStrategy.processaPagamento(valor);
    }
}
