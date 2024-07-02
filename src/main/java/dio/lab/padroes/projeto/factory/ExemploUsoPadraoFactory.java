package dio.lab.padroes.projeto.factory;

public class ExemploUsoPadraoFactory {
    public static void main(String[] args) {
        // Cria um novo objeto do Tipo SUV
        Carro suv = CarroFactory.criaCarro("SUV");
        // Cria um novo objeto do Tipo Sedan
        Carro sedan = CarroFactory.criaCarro("sedan");

        // Cria um novo objeto do Tipo hatchback
        Carro hatchback = CarroFactory.criaCarro("hatchback");

        suv.inicia();
        suv.para();

        sedan.inicia();
        sedan.para();

        hatchback.inicia();
        hatchback.para();
    }
}
