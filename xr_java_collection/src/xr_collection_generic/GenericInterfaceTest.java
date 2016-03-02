package xr_collection_generic;

/*
 * 自定义泛型接口
 * 
 * 
 * */
public class GenericInterfaceTest {

	public static void main(String[] args) {
		// 类可以有多种不同的泛型
		GenericInterface<String> gi_one = new GenericInterface<String>();

		gi_one.show("123");

		GenericInterface<Integer> gi_two = new GenericInterface<Integer>();

		gi_two.show(123);
	}
}

// 定义接口的泛型
interface Intet<T> {
	void show(T t);
}

// 类实现接口 并自定义泛型
class GenericInterface<T> implements Intet<T> {

	@Override
	public void show(T t) {
		System.out.println("show --- " + t);
	}

}
