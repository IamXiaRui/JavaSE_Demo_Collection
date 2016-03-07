package xr_collection_collections;

/*
 * �����еĹ�����  Collections��ʹ�÷�ʽ
 * 
 * ��������ʽ ��һ�ּ���Ƚ��� һ��û�м���Ƚ���
 * 
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSortTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("asd");
		list.add("fgafg");
		list.add("afvcxzv");
		list.add("sthhgn");
		list.add("ghahfn");

		sop("����ǰ ��");
		sop(list);

		// ֱ�ӵ����侲̬����
		Collections.sort(list);
		sop("����� ��");
		sop(list);

		// ����Ƚ����ľ�̬����
		Collections.sort(list, new CollectionsCom());
		sop("�����ַ������������ ��");
		sop(list);

	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}

}

// �����ַ������ȵıȽ���
class CollectionsCom implements Comparator<String> {

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