package dio.lab.padroes.projeto.facade;

public class EstoqueService {
    public boolean temNoEstoque(String itemId) {
        System.out.printf("O item %s tem no estoque\n", itemId);
        return true;
    }
}
