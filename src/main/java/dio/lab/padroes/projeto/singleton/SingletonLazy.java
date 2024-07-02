package dio.lab.padroes.projeto.singleton;

public class SingletonLazy {

    private static SingletonLazy singletonLazy;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance() {
        if (singletonLazy == null){
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }

    public void nome(){
        System.out.println("SingletonLazy");
    }
}
