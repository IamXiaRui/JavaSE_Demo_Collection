package xr_collection_generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 泛型限定的问题
 * 
 * */
public class GenericLimitTest {

	public static void main(String[] args) {
		// 第一个是父类
		ArrayList<Book> a1 = new ArrayList<Book>();
		a1.add(new Book(15));
		a1.add(new Book(20));
		a1.add(new Book(30));
		System.out.print("Book --- ");
		getAllSale(a1);

		// 第二个是继承类
		ArrayList<Java> a2 = new ArrayList<Java>();
		a2.add(new Java(15));
		a2.add(new Java(20));
		a2.add(new Java(30));
		System.out.print("\nJava --- ");
		getAllSale(a2);

		// 第三个也是继承类
		ArrayList<Android> a3 = new ArrayList<Android>();
		a3.add(new Android(15));
		a3.add(new Android(20));
		a3.add(new Android(30));
		System.out.print("\nAndroid --- ");
		getAllSale(a3);
	}

	// 泛型限定了继承Book所有子类 包括Book
	public static void getAllSale(ArrayList<? extends Book> list) {
		Iterator<? extends Book> it = list.iterator();
		while (it.hasNext()) {
			System.out.print("  " + it.next().getSale());
		}
	}
}

class Book {
	int sale;

	Book(int sale) {
		this.sale = sale;
	}

	public int getSale() {
		return sale;
	}
}

// 两者继承了Book类
class Java extends Book {
	Java(int sale) {
		super(sale);
	}

	public int getSale() {
		return sale;
	}
}

class Android extends Book {
	Android(int sale) {
		super(sale);
	}

	public int getSale() {
		return sale;
	}
}