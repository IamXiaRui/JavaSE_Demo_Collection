package xr__collection_collection;

/*
 * ����Collection�Ĺ��Է���
 * */
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest {

	public static void main(String[] args) {
		// ���Ԫ��
		ArrayList al_one = new ArrayList();
		al_one.add("demo1");
		al_one.add("demo2");
		al_one.add("demo3");
		al_one.add("demo4");
		System.out.println("��һ�����ϣ�" + al_one);

		ArrayList al_two = new ArrayList();
		al_two.add("demo1");
		al_two.add("demo2");
		al_two.add("demo5");
		al_two.add("demo6");
		System.out.println("�ڶ������ϣ�" + al_two);

		// ȡ����
		al_one.retainAll(al_two);
		System.out.println("�ϲ���ļ���" + al_one);

		System.out.print("�������������ϣ�");
		// ������ ʹ��forѭ�� ѭ������ �������������� ��ʡ�ڴ�
		for (Iterator it = al_two.iterator(); it.hasNext();) {
			System.out.print(" " + it.next());
		}

	}

}
