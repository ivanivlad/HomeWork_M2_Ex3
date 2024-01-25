package ex2;

@FunctionalInterface
public interface Garden<T extends Fruit> {
    T grow();
}
