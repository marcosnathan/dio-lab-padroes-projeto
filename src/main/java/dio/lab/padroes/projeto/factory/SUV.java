package dio.lab.padroes.projeto.factory;

/**
 * SUV é a implementação concreta de um Carro
 */
public class SUV implements Carro{
    @Override
    public void inicia() {
        System.out.println("O SUV iniciou.");
    }

    @Override
    public void para() {
        System.out.println("O SUV parou.");
    }
}
