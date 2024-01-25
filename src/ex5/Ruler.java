package ex5;

@FunctionalInterface
public interface Ruler<T> {
    Integer takeLength(T t);
}
