package dio.lab.padroes.projeto.observer;

public class TelaCelular implements ClimaObserver{

    @Override
    public void atualiza(double temperatura) {
        System.out.println("Atualização na tela do celular para temperatura: " + temperatura);
    }
}
