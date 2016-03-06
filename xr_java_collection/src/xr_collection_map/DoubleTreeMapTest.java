package xr_collection_map;
/*
 * Map�����е���չʹ��
 * 
 * ���ؼ��ϵ�ʹ�÷���
 * 
 * ע�⣺һ�������� ʹ��List����  �����е�˳��������ġ�
 * */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DoubleTreeMapTest {

	public static void main(String[] args) {
		// ��һ��С����
		HashMap<Integer, String> hm_one = new HashMap<Integer, String>();
		hm_one.put(01, "xia");
		hm_one.put(02, "rui");

		// �ڶ���С����
		HashMap<Integer, String> hm_two = new HashMap<Integer, String>();
		hm_two.put(01, "xiarui");
		hm_two.put(02, "iamxiarui");

		// �������ϵĴ󼯺�
		HashMap<String, HashMap<Integer, String>> hm = new HashMap<String, HashMap<Integer, String>>();
		hm.put("������һ��", hm_one);
		hm.put("����������", hm_two);

		// �����󼯺�
		Set<Map.Entry<String, HashMap<Integer, String>>> entrySet = hm.entrySet();
		Iterator<Map.Entry<String, HashMap<Integer, String>>> it = entrySet.iterator();

		while (it.hasNext()) {
			Map.Entry<String, HashMap<Integer, String>> me = it.next();
			String str = me.getKey();
			HashMap<Integer, String> hmap = me.getValue();
			System.out.println("�༶�� " + str);
			// ѭ���õ�ÿһ��С�����е�Ԫ��
			getHashMap(hmap);
		}

	}

	// ����С���ϵķ���
	public static void getHashMap(HashMap<Integer, String> hashMap) {
		Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, String> me = it.next();
			Integer in = me.getKey();
			String str = me.getValue();
			System.out.println("ѧ�� �� " + in + " ������ " + str);
		}
	}

}
