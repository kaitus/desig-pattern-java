package patterns.SingletonDesignPattern.BasicSingleton;

public class Demo {
    public static void main(String[] args) {
        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(1233333);
        System.out.println(singleton.getValue());
    }
}
