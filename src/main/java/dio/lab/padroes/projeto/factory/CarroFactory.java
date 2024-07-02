package dio.lab.padroes.projeto.factory;

/**
 * CarroFactory representa o padrão Factory para criar diferentes tipos de carros.
 * Essa classe produz diferentes tipos de carros baseado em seu tipo.
 */
public class CarroFactory {

    private CarroFactory(){

    }

    /**
     * Cria um novo tipo de carro baseado em seu tipo ("SUV", "Hatchback" e "Sedan")
     *
     * @param tipoCarro     Tipo do carro
     * @return Um objeto Carro do tipo especificado
     * @throws IllegalArgumentException Executado quando um tipo não esteja especificado
     */
    public static Carro criaCarro(String tipoCarro) {
        if (tipoCarro.equalsIgnoreCase("suv")){
            return new SUV();
        } else if (tipoCarro.equalsIgnoreCase("hatchback")) {
            return new Hatchback();
        } else if (tipoCarro.equalsIgnoreCase("sedan")) {
            return new Sedan();
        }
        else {
            throw new IllegalArgumentException("Tipo de carro não definido");
        }
    }

}
