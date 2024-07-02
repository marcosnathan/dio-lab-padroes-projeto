package dio.lab.padroes.projeto.singleton;

public class ExemploUsoPadraoSingleton {
    public static void main(String[] args) {

        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        singletonLazy.nome();

        SingletonEager singletonEager = SingletonEager.getInstance();
        singletonEager.nome();

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        singletonLazyHolder.nome();
    }
}
