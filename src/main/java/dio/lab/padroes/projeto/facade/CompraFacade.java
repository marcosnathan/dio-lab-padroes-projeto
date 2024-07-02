package dio.lab.padroes.projeto.facade;

/**
 * CompraFacade é uma classe que simplifica o processo de compra dividindo em
 * etapas fornecendo uma interface de alto nível para realizar
 * tarefas relacionada à compra
 */
public class CompraFacade {
    private final EmailService emailService;
    private final EstoqueService estoqueService;
    private final PagamentoService pagamentoService;

    public CompraFacade() {
        this.emailService = new EmailService();
        this.estoqueService = new EstoqueService();
        this.pagamentoService = new PagamentoService();
    }

    /**
     * Para que uma compra possa ser feita é necessário verificar:
     * 1. Se há item está disponível e tem a quantidade no Estoque
     * 2. Qual método de pagamento e o valor da compra
     * 3. Envio de e-mail para o cliente informando o resultado da operação
     *
     * @param itemId          ID do item que está sendo comprado
     * @param valor           Valor total que deve ser pago
     * @param metodoPagamento metodo de pagamento que será usado
     * @param email           email do cliente que está realizando a compra
     */
    public void realizaCompra(
            String itemId,
            String metodoPagamento,
            double valor,
            String email
    ) {
        if (estoqueService.temNoEstoque(itemId)) {
            pagamentoService.processaPagamento(metodoPagamento, valor);
            emailService.enviaEmailConfirmacao(email);
            System.out.println("Compra feita com sucesso!");
        }
        else{
            System.out.println("Falha ao realizar a compra");
        }
    }
}
