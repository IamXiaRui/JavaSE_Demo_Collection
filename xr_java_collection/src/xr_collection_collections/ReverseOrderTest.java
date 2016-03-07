package xr_collection_collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * ��ת������Ԫ�ص�˳��
 * 
 * */
public class ReverseOrderTest {

	public static void main(String[] args) {
		sop("��ת˳��ǰ �� ");

		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("a");
		ts1.add("bb");
		ts1.add("ccc");
		ts1.add("dddd");
		ts1.add("eeeee");

		Iterator it1 = ts1.iterator();
		while (it1.hasNext()) {
			sop(it1.next());
		}

		sop("��ת˳��� �� ");

		// ��ӱȽ�������ת
		TreeSet<String> ts2 = new TreeSet<String>(Collections.reverseOrder(new CollectionsCom_three()));
		ts2.add("a");
		ts2.add("bb");
		ts2.add("ccc");
		ts2.add("dddd");
		ts2.add("eeeee");

		Iterator it2 = ts2.iterator();
		while (it2.hasNext()) {
			sop(it2.next());
		}
	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}

}

// �����ַ������ȵıȽ���
class CollectionsCom_three implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return 1;
		} else if (s1.length() < s2.length()) {
			return -1;
		}
		return s1.compareTo(s2);
	}
}
