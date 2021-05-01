package Leson18;

public class Primer2 <T> {
private T instance;

    private Primer2() {


    }

    public static <T> void simpleInit(T instantiator) {
}
public static <T> Primer2<T> init (T instantiator) {
        return new Primer2<T>();
    }
    public void set(T obj) {
    instance=obj;}
    public T get() {
        return instance;
    }
}