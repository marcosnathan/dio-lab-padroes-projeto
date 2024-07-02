package dio.lab.padroes.projeto.facade;

public class PagamentoService {

    public void processaPagamento(String metodo, double valor){
        System.out.printf("O metodo de pagamento escolho foi %s. Valor total: %.2f\n", metodo, valor);
    }
}
