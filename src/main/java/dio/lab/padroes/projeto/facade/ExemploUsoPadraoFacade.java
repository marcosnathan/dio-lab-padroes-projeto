package dio.lab.padroes.projeto.facade;

public class ExemploUsoPadraoFacade {
    public static void main(String[] args) {
        //1. Cria um objeto do tipo CompraFacade
        CompraFacade compraFacade = new CompraFacade();

        //2. Realiza o processo de compra
        compraFacade.realizaCompra("1", "Cartão de Crédito", 100.0, "cliente@gmail.com");
    }
}
