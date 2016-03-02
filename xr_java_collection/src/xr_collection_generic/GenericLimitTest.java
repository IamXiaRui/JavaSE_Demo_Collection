package xr_collection_generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * �����޶�������
 * 
 * */
public class GenericLimitTest {

	public static void main(String[] args) {
		// ��һ���Ǹ���
		ArrayList<Book> a1 = new ArrayList<Book>();
		a1.add(new Book(15));
		a1.add(new Book(20));
		a1.add(new Book(30));
		System.out.print("Book --- ");
		getAllSale(a1);

		// �ڶ����Ǽ̳���
		ArrayList<Java> a2 = new ArrayList<Java>();
		a2.add(new Java(15));
		a2.add(new Java(20));
		a2.add(new Java(30));
		System.out.print("\nJava --- ");
		getAllSale(a2);

		// ������Ҳ�Ǽ̳���
		ArrayList<Android> a3 = new ArrayList<Android>();
		a3.add(new Android(15));
		a3.add(new Android(20));
		a3.add(new Android(30));
		System.out.print("\nAndroid --- ");
		getAllSale(a3);
	}

	// �����޶��˼̳�Book�������� ����Book
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

// ���߼̳���Book��
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