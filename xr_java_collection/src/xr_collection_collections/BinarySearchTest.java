package xr_collection_collections;

/*
 * ���ö��ַ�����Ԫ�ص�λ�ýǱ�
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("a");
		list.add("bb");
		list.add("abcd");
		list.add("xxx");
		list.add("kkkk");

		// ����Ƚ����ľ�̬����
		Collections.sort(list, new CollectionsCom_two());
		sop("�����ַ������������ ��");
		sop(list);

		// ���ַ�����Ԫ��
		int index = getBinarySearch(list, "xxx", new CollectionsCom_two());
		sop("����Ԫ�صĽǱ�Ϊ �� ");
		sop(index);

	}

	// ����Ƚ����Ķ��ֲ���
	public static int getBinarySearch(List<String> list, String key, Comparator<String> com) {
		int max, mid, min;
		max = list.size() - 1; // Ԫ�ص���󳤶�
		min = 0;

		while (min <= max) {
			mid = (max + min) >> 1; // >>1 �൱�� /2

			String str = list.get(mid);

			int num = com.compare(str, key);
			if (num > 0) {
				max = mid - 1; // �м�ֵ������Ҫ�ҵ�ֵ �������ֵ
			} else if (num < 0) {
				min = mid + 1; // �м�ֵС����Ҫ�ҵ�ֵ ������Сֵ
			} else
				return mid; // �м�λ��ֱ���ҵ�

		}
		return -min - 1; // ���� (-(�����) - 1)������� ������һ�����ڴ˼���Ԫ��������
	}

	public static void sop(Object obj) {
		System.out.println(obj);
	}

}

// �����ַ������ȵıȽ���
class CollectionsCom_two implements Comparator<String> {

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