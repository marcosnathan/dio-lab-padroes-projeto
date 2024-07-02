package dio.lab.padroes.projeto.singleton;

public class SingletonLazyHolder {

    private SingletonLazyHolder() {
        super();
    }

    private final static class InstanceHolder{
        private static SingletonLazyHolder singletonLazyHolder = new SingletonLazyHolder();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.singletonLazyHolder;
    }

    public void nome(){
        System.out.println("SingletonLazyHolder");
    }
}
