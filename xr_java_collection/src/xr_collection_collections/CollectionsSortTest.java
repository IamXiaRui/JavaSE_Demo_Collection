package xr_collection_collections;

/*
 * �����еĹ�����  Collections��ʹ�÷�ʽ
 * 
 * ��������ʽ ��һ�ּ���Ƚ��� һ��û�м���Ƚ���
 * 
 *���ؼ����е�ָ����������СԪ��
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSortTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("a");
		list.add("bb");
		list.add("abcd");
		list.add("xxx");
		list.add("kkkk");

		sop("����ǰ ��");
		sop(list);

		// ֱ�ӵ����侲̬����
		Collections.sort(list);
		sop("����� ��");
		sop(list);

		// �������Ԫ��
		String max_one = Collections.max(list);
		sop("���Ԫ��Ϊ �� " + max_one);

		// ����Ƚ����ľ�̬����
		Collections.sort(list, new CollectionsCom_one());
		sop("�����ַ������������ ��");
		sop(list);

		// ���ش��Ƚ��������Ԫ��
		String max_two = Collections.max(list, new CollectionsCom_one());
		sop("��󳤶�Ԫ��Ϊ �� " + max_two);

	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}

}

// �����ַ������ȵıȽ���
class CollectionsCom_one implements Comparator<String> {

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