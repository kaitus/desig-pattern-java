package patterns.FactoryDesignPattern.Factory;

public class Demo {

    public static void main(String[] args) {
        Point point = Point.newCartesianPoint(2, 3);
        System.out.println(point);
    }
}
