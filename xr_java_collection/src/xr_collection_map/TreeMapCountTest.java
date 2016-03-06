package xr_collection_map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * ���ü����ж��ַ�������ĸ���ֵĴ���
 * 
 * */
public class TreeMapCountTest {

	public static void main(String[] args) {
		String s = StringCount("absdbfjbasbf");
		System.out.println(s);
	}

	public static String StringCount(String str) {
		// ���ַ��������ַ�����
		char[] ch = str.toCharArray();

		// ע�⼯���д�����������ͱ���Ϊ�������ͣ�����Ϊ������������
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

		// ��һ�ַ���
		// for (int i = 0; i < ch.length; i++) {
		// Integer value = tm.get(ch[i]);
		// if (value == null) {
		// tm.put(ch[i], 1);
		// } else {
		// value = value + 1;
		// tm.put(ch[i], value);
		// }
		// }

		// �ڶ��ַ���
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			Integer value = tm.get(ch[i]);
			if (value != null) {
				count = value;
			}
			count++;
			tm.put(ch[i], count);
			count = 0;
		}

		StringBuilder sb = new StringBuilder();

		Set<Map.Entry<Character, Integer>> entrySet = tm.entrySet();

		Iterator<Map.Entry<Character, Integer>> it = entrySet.iterator();

		// ��������
		while (it.hasNext()) {
			Map.Entry<Character, Integer> me = it.next();

			Character cha = me.getKey();

			Integer in = me.getValue();

			sb.append(cha + " - " + in + " , ");
		}
		return sb.toString();
	}
}
