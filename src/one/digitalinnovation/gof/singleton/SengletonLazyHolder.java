package one.digitalinnovation.gof.singleton;

public class SengletonLazyHolder {
    private static class InstanceHolder{
        public static SengletonLazyHolder instancia = new SengletonLazyHolder();
    }

    private SengletonLazyHolder(){
        super();
    }

    public static SengletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
