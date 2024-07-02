package dio.lab.padroes.projeto.observer;

public class ExemploUsoPadraoObserver {
    public static void main(String[] args) {

        EstacaoMetereologica estacaoMetereologica = new EstacaoMetereologica();

        ClimaObserver celularObserver = new TelaCelular();
        ClimaObserver computadorObserver = new TelaComputador();

        estacaoMetereologica.adicionarObserver(celularObserver);
        estacaoMetereologica.adicionarObserver(computadorObserver);
        estacaoMetereologica.setTemperatura(60.2);
        estacaoMetereologica.removerObserver(computadorObserver);
        estacaoMetereologica.setTemperatura(10.2);
    }
}
