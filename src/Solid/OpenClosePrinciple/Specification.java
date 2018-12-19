package OpenClosePrinciple;

public interface Specification<T> {

    boolean isSatisfied(T item);

}
