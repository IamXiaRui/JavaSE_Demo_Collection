package xr_collection_generic;

/*
 * 泛型方法的定义
 * 
 * */
public class GenericMethodTest {

	public static void main(String[] args) {
		GenericMethod<String> gm = new GenericMethod<String>();

		gm.getB("5");

		gm.getC(5);
		gm.getC("5");

		gm.getD(5);
		gm.getD("5");
	}

}

// 类上已经定义了泛型
class GenericMethod<B> {

	// 方法上没有定义泛型 则根据类确定泛型
	public void getB(B b) {
		System.out.println("B --- " + b);
	}

	// 方法上已经定义了泛型 根据方法泛型来
	public <C> void getC(C c) {
		System.out.println("C --- " + c);
	}

	// 静态方法 必须自定义方法泛型 不能根据类上的泛型
	public static <D> void getD(D d) {
		System.out.println("D --- " + d);
	}
}
