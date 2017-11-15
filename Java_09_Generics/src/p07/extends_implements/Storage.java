package p07.extends_implements;

/* *
 * 제네릭 인터페이스<T>
 * */

public interface Storage<T> {
	public void add(T item, int index); //추가  메소드
	public T get(int index); //출력 메소드

}
