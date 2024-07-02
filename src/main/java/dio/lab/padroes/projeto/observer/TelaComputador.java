package dio.lab.padroes.projeto.observer;

public class TelaComputador implements ClimaObserver{
    @Override
    public void atualiza(double temperatura) {
        System.out.println("Atualização na tela do computador para temperatura: " + temperatura);
    }
}
