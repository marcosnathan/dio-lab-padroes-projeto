package dio.lab.padroes.projeto.strategy;

public class ExemploUsoPadraoStrategy {
    public static void main(String[] args) {

        // 1. Cria os objetos com as implementações concretas da interface PagamentoStrategy
        PagamentoStrategy pix = new PagamentoPixStrategy();
        PagamentoStrategy boleto = new PagamentoBoletoStrategy();
        PagamentoStrategy cartaoCredito = new PagamentoCartaoCreditoStrategy();
        PagamentoStrategy paypal = new PagamentoPaypalStrategy();


        //2. Cria um contexto de pagamento usando cada uma das implementações concretas

        // Pix
        PagamentoContexto contexto = new PagamentoContexto(pix);
        contexto.executaPagamento(100);

        // Boleto
        contexto = new PagamentoContexto(boleto);
        contexto.executaPagamento(50);

        // Cartão de Crédito
        contexto = new PagamentoContexto(cartaoCredito);
        contexto.executaPagamento(75);

        // PayPal
        contexto = new PagamentoContexto(paypal);
        contexto.executaPagamento(25);
    }
}
