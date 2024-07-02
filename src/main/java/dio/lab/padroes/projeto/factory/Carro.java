package dio.lab.padroes.projeto.factory;

/**
 * Carro representa uma interface implementada por diferentes tipos de carros
 * definindo o inicio e a parada para todos que a implementarem.
 */
public interface Carro {

    /**
     * Determina o inicio de um Carro
     */
    void inicia();


    /**
     * Determina a parada de um Carro
     */
    void para();
}
