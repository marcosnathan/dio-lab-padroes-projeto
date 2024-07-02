package dio.lab.padroes.projeto.factory;

/**
 * Hatchback é a implementação concreta de um Carro
 */
public class Hatchback implements Carro{

    @Override
    public void inicia() {
        System.out.println("O hatchback iniciou.");
    }

    @Override
    public void para() {
        System.out.println("O hatchback parou.");
    }
}
