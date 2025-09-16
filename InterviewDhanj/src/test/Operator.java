package test;

@FunctionalInterface
public interface Operator<T> {
	
	T process(T a, T b);

}
