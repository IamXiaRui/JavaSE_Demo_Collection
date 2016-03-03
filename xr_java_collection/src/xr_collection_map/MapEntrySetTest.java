package xr_collection_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * Map�л�ȡ��ֵ����һ�ַ�ʽ
 * 
 * 
 * */
public class MapEntrySetTest {

	public static void main(String[] args) {
		// new���������
		Map<String, String> map = new HashMap<String, String>();

		// ���Ԫ�� ע�� ����add����
		map.put("1", "xia");
		map.put("22", "rui");
		map.put("333", "xiarui");
		map.put("4444", "iamxiarui");

		// �Ȼ�ȡ���м�ֵӳ��Ĺ�ϵ��Set����
		Set<Map.Entry<String, String>> entrySet = map.entrySet();

		// �õ�Set���ϵĵ�����
		Iterator<Map.Entry<String, String>> it = entrySet.iterator();

		// ͨ�������� ��ȡ�����еļ�ֵ��ϵ
		while (it.hasNext()) {
			Map.Entry<String, String> mapStr = it.next();
			// ͨ����ֵ��ϵ���ϵķ��� ��ȡ�����еļ� �� ֵ
			String numStr = mapStr.getKey();
			String nameStr = mapStr.getValue();
			System.out.println("key --- " + numStr + " name --- " + nameStr);
		}
	}
}

/*// Map.Entry�Ľṹ
interface Map {
	public static interface Entry {
		public abstract Object getKey();

		public abstract Object getValue();
	}
}*/
