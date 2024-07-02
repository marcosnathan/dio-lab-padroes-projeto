package dio.lab.padroes.projeto.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * EstacaoMetereologica é classe responsável por fornecer os dados necessários para
 * os observadores
 */
public class EstacaoMetereologica {
    /**
     * Lista de observadores que serão acionados
     */
    private final List<ClimaObserver> observers;
    private double temperatura;

    public EstacaoMetereologica() {
        this.observers = new ArrayList<>();
    }

    /**
     * Adiciona um novo observador
     * @param observer  Observador que será adicionado à lista de observadores
     */
    public void adicionarObserver(ClimaObserver observer){
        this.observers.add(observer);
    }

    /**
     * remove um observador
     * @param observer  Observador que será removido da lista de observadores
     */
    public void removerObserver(ClimaObserver observer){
        this.observers.remove(observer);
    }

    /**
     * Atualiza a temperatura e notifica os observadores
     * @param temperatura   Nova temperatura
     */
    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
        notificaObservadores();
        System.out.println("#######################################################");
    }

    private void notificaObservadores(){
        for (ClimaObserver observer: observers){
            observer.atualiza(temperatura);
        }

    }
}
