package xr_collection_list;

/*
 * �б������ʹ�÷���
 * ListIterator
 * 
 * */
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		// ����Ԫ��
		al.add("demo1");
		al.add("demo2");
		al.add("demo3");
		al.add("demo4");
		System.out.println("ԭ�����ϣ�" + al);

		System.out.print("�����������޸�Ԫ�أ�");

		// ����ʹ������б������
		ListIterator li = al.listIterator();
		while (li.hasNext()) {
			Object obj = li.next();
			if (obj.equals("demo3")) {
				li.set("demo5");
			}
		}
		System.out.print("  " + al);
	}

}
