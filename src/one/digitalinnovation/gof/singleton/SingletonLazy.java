package one.digitalinnovation.gof.singleton;

public class SingletonLazy {
    private static SingletonLazy instacia;
    public SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstacia(){
        if(instacia == null){
            instacia = new SingletonLazy();
        }
        return instacia;
    }
}
