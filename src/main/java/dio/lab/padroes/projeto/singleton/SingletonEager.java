package dio.lab.padroes.projeto.singleton;

public class SingletonEager {

    private static final SingletonEager singletonEager = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return singletonEager;
    }

    public void nome(){
        System.out.println("SingletonEager");
    }
}
