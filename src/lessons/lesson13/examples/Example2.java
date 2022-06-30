package lessons.lesson13.examples;

public class Example2<T> {
    private T instance;

    private Example2() {

    }

    public static <T> void simpleInit(T instantiator) {

    }

    public static <T> Example2 init(T instantiator) {
        return new Example2<T>();
    }

    public T getInstance() {
        return instance;
    }

    public void setInstance(T instance) {
        this.instance = instance;
    }
}
