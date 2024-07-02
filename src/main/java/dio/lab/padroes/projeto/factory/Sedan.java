package dio.lab.padroes.projeto.factory;

/**
 * Sedan é a implementação concreta de um Carro
 */
public class Sedan implements Carro{
    @Override
    public void inicia() {
        System.out.println("O Sedan iniciou.");
    }

    @Override
    public void para() {
        System.out.println("O Sedan parou.");
    }
}
