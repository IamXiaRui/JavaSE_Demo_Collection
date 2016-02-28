package xr_collection_list;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * List���������з��� ���������нǱ�
 * 
 * 
 * */
public class ListTest {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		// ����Ԫ��
		al.add("demo1");
		al.add("demo2");
		al.add("demo3");
		al.add("demo4");
		al.add("demo5");
		System.out.println("ԭ�����ϣ�" + al);

		// ɾ��Ԫ��
		al.remove(1);
		System.out.println("ɾ����ļ��ϣ�" + al);

		// �޸�Ԫ��
		al.set(2, "demo6");
		System.out.println("������ļ��ϣ�" + al);

		// ���ؼ�����һС�ε�Ԫ��
		System.out.println("���������Ԫ�أ�" + al.subList(1, 3));

		// ����Ԫ��λ��
		System.out.println("����Ԫ��λ�ã�" + al.indexOf("demo3"));

		// ����Ԫ������
		System.out.print("�õ�����Ԫ�أ�");
		for (int x = 0; x < al.size(); x++) {
			System.out.println("size(" + x + ") = " + al.get(x) + " ");
		}

		// �������õ�����Ԫ��
		System.out.print("�������õ�����Ԫ�أ�");
		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.print(" " + it.next());
		}
	}
}
